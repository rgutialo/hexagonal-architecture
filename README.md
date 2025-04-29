# Hexagonal Architecture Demo (Spring Boot & Quarkus)

This project demonstrates the **Hexagonal Architecture (Ports & Adapters)** pattern in Java, showcasing how to switch 
between different frameworks and persistence mechanisms with minimal changes to the core application logic.

---

## 📁 Project Structure

```
hexagonal-demo/
├── application/        # Use cases (e.g., GetGreeting)
├── domain/             # Domain model and interfaces (e.g., GreetingService)
├── infrastructure/
│   ├── springboot/     # Spring Boot REST adapter
│   ├── quarkus/        # Quarkus REST adapter
│   ├── persistence/
│   │   ├── jpa/        # JPA adapter implementation
│   │   └── csv/        # CSV adapter implementation

```

---

## 📦 How It Works

- **Domain Layer**: Defines the core business logic and interfaces (ports) that represent the application's required operations.
- **Application Layer**: Implements use cases that orchestrate domain logic and interact with ports.
- **Adapters**: Contains adapters that implement the ports using specific technologies (e.g., REST controllers, JPA repositories, CSV file handlers).

---

## 📦 Persistence Adapters Example
This example demonstrates how to implement two different persistence adapters for the same port:

1. JPA Adapter
   Purpose: Persist data using a relational database via JPA. 
   Implementation: Defines a JpaMultiplicationRepository that implements the MultiplicationRepository port. Uses Spring Data JPA to handle database operations.
   Configuration: Requires a database configuration in application.properties or application.yml.

2. CSV Adapter
   Purpose: Persist data to a CSV file. 
   Implementation: Defines a CsvMultiplicationRepository that implements the MultiplicationRepository port. Handles file creation, writes headers if the file doesn't exist, and appends new records with auto-incremented IDs.
   Features: Checks for existing IDs to prevent duplicates. Automatically assigns a new ID based on the highest existing ID in the file.

To use one or the other, just comment and uncomment the corresponding bean definition in SpringBootconfig java file.

---

## ▶️ Run with Spring Boot

1. Run the application:

```bash
mvn spring-boot:run
```

2. Access the greeting endpoint:

```bash
curl http://localhost:8080/spring/greet?name=SpringBoot
```

Expected output:
```
Hello, SpringBoot!
```

---

## ▶️ Run with Quarkus

1. Run the application in dev mode:

```bash
mvn compile quarkus:dev 
```

2. Access the greeting endpoint:

```bash
curl http://localhost:8080/quarkus/greet?name=Quarkus
```

Expected output:
```
Hello, Quarkus!
```

---

## 📜 Notes

- The domain and application layers are **shared** between frameworks.
- Each adapter implements only the framework-specific integration.
- This project demonstrates how hexagonal architecture helps **decouple your business logic from infrastructure**.

---

## 🛠 Requirements

- Java 21
- Maven
- Internet connection to fetch dependencies

---

Made with ☕ and ❤️