
# Fitness-App 🏋️‍♀️

The **Fitness-App** is a microservices-based web application designed to manage user activities, generate AI-driven recommendations, and secure communication using Keycloak and OAuth 2.0. The application leverages modern solutions like RabbitMQ, Eureka, API Gateway, and centralized configuration.

---

## 📦 Modules

### 1. User Service 👤
- Creating user entities and database.
- Implementing REST API endpoints for user management.

### 2. Activity Service 🏃‍♂️
- Registering user activities.
- Handling activity database.
- Building endpoints for activity management.

### 3. AI Service 🤖
- Generating recommendations based on activity data.
- Integration with RabbitMQ for asynchronous data processing.
- Providing endpoints for AI-driven recommendations.

### 4. Interservice Communication 🔗
- Eureka Server for service discovery and registration.
- Internal communication between services using Eureka and RabbitMQ.

### 5. Config Server ⚙️
- Centralized configuration management for all microservices.

### 6. API Gateway 🌐
- API Gateway for routing and securing communication.
- Integration with Keycloak for authentication and authorization.

---

## 🔒 Security & Authentication
- Integration with Keycloak (OAuth 2.0, PKCE flow).
- Securing the API Gateway.
- Supporting various OAuth 2.0 flows.

---

## 🐇 RabbitMQ Messaging
- Asynchronous communication between services.
- Sending and receiving activity data via RabbitMQ.

---

## 🧠 AI Recommendations
- Generating personalized workout recommendations.
- Background processing of activity data.

---

## 🛠️ Tech Stack
- Java / Spring Boot
- Spring Cloud (Eureka, Config Server, Gateway)
- RabbitMQ
- Keycloak (OAuth 2.0)
- PostgreSQL
- Docker

---

## 🚀 Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/rlNkoo/Fitness-App.git
   ```

2. Configure databases and RabbitMQ (e.g., using docker-compose).

3. Start the Config Server, Eureka Server, and then the microservices.

4. Run the API Gateway and configure Keycloak.

5. Test the endpoints using Postman or Swagger.

---

## 📂 Project Structure
```
fitness-app/
├── user-service/
├── activity-service/
├── ai-service/
├── config-server/
├── eureka-server/
├── api-gateway/
├── common-lib/
└── README.md
