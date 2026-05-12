package com.kritansh.Datascience_service.controller;

import com.kritansh.Datascience_service.entities.Expense;
import com.kritansh.Datascience_service.entities.MessageRequestDto;
import com.kritansh.Datascience_service.eventProducer.ExpenseProducer;
import com.kritansh.Datascience_service.service.MessageService;
import jakarta.annotation.Nonnull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class MessageController {

    private final MessageService messageService;
    private final ExpenseProducer expenseProducer;

    @Autowired
    public MessageController(MessageService messageService, ExpenseProducer expenseProducer) {
        this.messageService = messageService;
        this.expenseProducer = expenseProducer;
    }

    @PostMapping("/v1/ds/message")
    public Expense handleMessage(@RequestHeader(value = "user-id") @Nonnull String userId, @RequestBody MessageRequestDto request) throws IOException {
        Expense result = messageService.processMessage(request.getMessage());
        result.setUserId(userId);
        try {
            expenseProducer.sendEventToKafka(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @GetMapping("/")
    public String handleGet() {
        return "Hello world";
    }
}

