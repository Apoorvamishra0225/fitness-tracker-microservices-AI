# 🏋️‍♀️ Fitness App Microservices Architecture

[![Java](https://img.shields.io/badge/Java-17-orange?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)
[![RabbitMQ](https://img.shields.io/badge/RabbitMQ-Message%20Broker-orange?logo=rabbitmq)](https://www.rabbitmq.com/)
[![MySQL](https://img.shields.io/badge/MySQL-Database-blue?logo=mysql)](https://www.mysql.com/)
[![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-green?logo=mongodb)](https://www.mongodb.com/)
[![Keycloak](https://img.shields.io/badge/Keycloak-Authentication-blueviolet?logo=keycloak)](https://www.keycloak.org/)
[![Google Gemini](https://img.shields.io/badge/Google-Gemini%20AI-lightgrey?logo=google)](https://deepmind.google/technologies/gemini/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

---

## 📘 Overview

The **Fitness App Microservices** project is a **distributed, cloud-native fitness tracking platform** built using a **microservices architecture**. It is designed to support both web and mobile clients for a seamless user experience across devices.

The platform leverages modern technologies such as **Spring Boot**, **RabbitMQ**, **MySQL**, **MongoDB**, **Keycloak**, and **Google’s Gemini AI** to provide **secure, scalable, and intelligent** fitness data management and insights.

This repository demonstrates how to design and integrate multiple independent services through message queues, REST APIs, and service discovery—creating a robust ecosystem that supports authentication, activity tracking, and AI-driven insights.

---

## 🧩 Architecture Overview

### 🖥️ Client Layer
- **Web and Mobile Applications**
  - Users interact with the system via web clients.
  - Clients communicate with the backend through an **API Gateway**.
  - Authentication and authorization are handled securely using **Keycloak**.

---

### 🔐 Gateway & Authentication

- **API Gateway**
  - Acts as a single entry point for all client requests.
  - Routes traffic to appropriate backend microservices.
  - Manages rate limiting, load balancing, and request validation.

- **Auth Server (Keycloak)**
  - Handles user authentication and identity management.
  - Issues JWT tokens for secure, stateless communication.
  - Integrates with the API Gateway for access control.

---

### ⚙️ Core Microservices

#### 👤 USER Service
- Manages user registration, authentication, and profiles.
- Persists user data in **MySQL**.
- Connects with the ACTIVITY service for linking fitness activities with users.

#### 🏃 ACTIVITY Service
- Handles all activity-related data (workouts, steps, calories, etc.).
- Uses **MongoDB** for efficient storage of large unstructured data sets.
- Publishes data to **RabbitMQ** for asynchronous processing by the AI service.

#### 🤖 AI Service
- Consumes events from the message queue and processes activity data.
- Stores AI-generated insights in **MongoDB**.
- Integrates with **Google’s Gemini Server** for advanced ML and predictive analytics.

---

### 📨 Communication Layer

- **RabbitMQ (Message Queue)**
  - Enables asynchronous, event-driven communication between services.
  - Improves scalability and reliability.
  - Ensures non-blocking processing of activity events.

---

### 🧭 Service Management

- **Config Server**
  - Centralized configuration management for all microservices.
  - Uses **Spring Cloud Config** to maintain consistency across environments.

- **Eureka Server**
  - Implements **service discovery**.
  - Allows microservices to register themselves dynamically.
  - Enables load balancing and fault-tolerant routing.

---

### 🌐 External Integration

- **Google’s Gemini Server**
  - Integrated with the AI Service for enhanced analytics and intelligent predictions.
  - Provides context-aware insights and recommendations for users based on fitness data.

---

## 🧠 Key Features

✅ Microservice-based, modular architecture  
✅ Secure authentication & authorization using Keycloak  
✅ Event-driven communication with RabbitMQ  
✅ Polyglot persistence using MySQL + MongoDB  
✅ Dynamic configuration and service discovery  
✅ AI-driven analytics powered by Google Gemini  
✅ Scalable and fault-tolerant design  
✅ Works seamlessly across web and mobile clients  

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|-------------|
| **Frontend** | React |
| **Gateway** | Spring Cloud Gateway |
| **Authentication** | Keycloak |
| **Microservices** | Spring Boot (Java 17) |
| **Message Broker** | RabbitMQ |
| **Databases** | MySQL, MongoDB |
| **Service Registry** | Eureka Server |
| **Configuration** | Spring Cloud Config |
| **AI Integration** | Google Gemini |

---

## 🚀 System Workflow

1. The user logs in through **Keycloak** using web or mobile app.  
2. The **API Gateway** routes authenticated requests to backend services.  
3. **USER Service** manages user accounts and persists them in MySQL.  
4. **ACTIVITY Service** records and stores workout data in MongoDB.  
5. Activity data is pushed to **RabbitMQ** for async processing.  
6. **AI Service** consumes messages, processes activity data, and interacts with **Google’s Gemini Server** for predictions.  
7. All services are registered under **Eureka Server** and configured through the **Config Server**.

---

## 📈 Architecture Diagram

> 🖼️ Below is the high-level architecture of the Fitness App Microservices:

![Architecture Diagram](./97054669-af22-445c-b7cf-a9d1795871b6.png)

---

## 💬 Contact

**Author:** [EmbarkXOfficial](https://github.com/EmbarkXOfficial)  
**Repository:** [fitness-app-microservices](https://github.com/EmbarkXOfficial/fitness-app-microservices)  
For questions or collaborations, feel free to reach out via GitHub Discussions or Issues.
