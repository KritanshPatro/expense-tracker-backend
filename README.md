# SpendSmart 💰

> An AI-powered expense tracker that automatically captures your expenses — no manual entry needed!

---

## About The Project

**SpendSmart** is an AI-powered expense tracker app designed to simplify your financial management by automatically capturing your expenses from incoming SMS messages.

### How it works:
- The app listens for incoming SMS on your phone, such as bank transaction alerts or payment notifications.
- Each SMS is sent securely to the backend server.
- The backend uses the **Mistral AI LLM** to extract important details like the transaction amount, currency, and merchant name.
- Extracted expenses are then displayed in an organized, user-friendly interface — no manual entry required!

---

## Project Structure

```
SpendSmart/
├── AuthService/          # JWT Authentication & Refresh Token Service
├── Userservice/          # User Management Service
├── Expense-service/      # Expense CRUD Service
├── Datascience-service/  # AI/LLM Integration via Mistral API
├── config/               # Kong API Gateway Configuration
├── custom-plugins/       # Custom Kong Auth Plugin
└── docker-compose.yml    # Docker Compose for all services
```

---

## Built With

| Technology | Purpose |
|------------|---------|
| Java | Core language |
| Spring Boot | Backend framework |
| Apache Kafka | Event streaming between services |
| MySQL | Database |
| Docker | Containerization |
| Kong | API Gateway |
| React Native | Mobile frontend |
| Mistral AI | LLM for SMS parsing |

---

## Getting Started

### Prerequisites
- Docker & Docker Compose
- Git
- Mistral API Key — Get it from [mistral.ai](https://mistral.ai)

### Installation

1. Clone the repo
```bash
git clone https://github.com/KritanshPatro/expense-tracker-backend.git
```

2. Navigate to the project folder and create a `.env` file:
```env
MYSQL_USER=YOUR_USERNAME
MYSQL_PASSWORD=YOUR_PASSWORD
MYSQL_ROOT_USER=root
MYSQL_ROOT_PASSWORD=password
SPRING_AI_MISTRALAI_API_KEY=YOUR_API_KEY
```

3. Start all services:
```bash
docker compose up -d
```

---

## Features

- ✅ Auto-capture expenses from incoming SMS
- ✅ JWT Authentication with Refresh Tokens
- ✅ Microservices Architecture
- ✅ AI/LLM powered expense extraction
- ✅ API Gateway with Kong
- ✅ Fully Dockerized

---

## Roadmap

- [x] Listen for incoming SMS and generate expense automatically
- [x] JWT Authentication & Authorization
- [ ] Add category level expenses
- [ ] Deploy on AWS
- [ ] Add spending analytics dashboard

---

## Contact

**Kritansh Patro**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kritansh-patro-932257335/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/KritanshPatro)

---

## Acknowledgements

- [Mistral AI](https://mistral.ai)
- [Gluestack UI](https://gluestack.io)
- [Spring Boot](https://spring.io/projects/spring-boot)
