# Hexagonal Architecture Demo (Spring Boot & Quarkus)

This is a simple Java project demonstrating **Hexagonal Architecture (Ports & Adapters)** and how easily you can switch between frameworks like **Spring Boot** and **Quarkus**.

The application exposes a simple REST API that returns a greeting message based on a name.

---

## 📁 Project Structure

```
hexagonal-demo/
├── domain/             # Domain model: GreetingService
├── application/        # Use case: GetGreeting
├── adapters/
│   ├── springboot/     # Spring Boot REST adapter
│   └── quarkus/        # Quarkus REST adapter
```

---

## 📦 How It Works

- **Domain Layer** defines the `GreetingService` interface.
- **Application Layer** uses this service in a use case called `GetGreeting`.
- **Adapters** implement the interface and expose REST endpoints.

---

## ▶️ Run with Spring Boot

1. Go to the Spring Boot adapter:

```bash
cd adapters/springboot
```

2. Run the application:

```bash
./gradlew bootRun
```

3. Access the greeting endpoint:

```bash
http://localhost:8080/greet?name=John
```

Expected output:
```
Hello, John!
```

---

## ▶️ Run with Quarkus

1. Go to the Quarkus adapter:

```bash
cd adapters/quarkus
```

2. Run the application in dev mode:

```bash
./gradlew quarkusDev
```

3. Access the greeting endpoint:

```bash
http://localhost:8080/greet?name=John
```

Expected output:
```
Hello, John!
```

---

## 📜 Notes

- The domain and application layers are **shared** between frameworks.
- Each adapter implements only the framework-specific integration.
- This project demonstrates how hexagonal architecture helps **decouple your business logic from infrastructure**.

---

## 🛠 Requirements

- Java 17+
- Gradle
- Internet connection to fetch dependencies

---

## ✅ Next Steps

You could expand this project by:
- Adding a persistence layer (JPA or JDBC)
- Adding integration tests
- Using Docker for consistent environment setup

---

Made with ☕ and ❤️