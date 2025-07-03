# Strangler Pattern Refactor – Microservices Demo

This repository demonstrates the **Strangler Fig Pattern** for modernizing legacy systems.  
Using Spring Boot, it incrementally refactors a monolithic application into modular microservices: Follow, Tweet, and Login.  
This project shows how legacy functionality can be migrated step by step, minimizing risk and ensuring stability.

---

## 🏗️ Project Structure

- **follow-microservice**: Manages user follow/unfollow functionality.
- **tweet-microservice**: Handles tweet creation and deletion.
- **login-microservice**: Manages user authentication and login.
- **common modules**: Shared domain classes and utilities.

---

## 🚀 Getting Started

Each microservice is a standalone Spring Boot application.

### 1. Clone the repository

```bash
git clone https://github.com/fourat-chaaben/strangler-pattern-refactor.git
```

### 2. Navigate into a microservice folder and run it

```bash
cd follow-microservice
./gradlew bootRun
# Repeat for tweet-microservice and login-microservice
```

### 3. API Endpoints

#### Follow Microservice

- `POST /follow/follow` – Follow a user
- `DELETE /follow/unfollow` – Unfollow a user

#### Tweet Microservice

- `POST /tweet/post` – Create a tweet
- `DELETE /tweet/delete` – Delete a tweet

#### Login Microservice

- `POST /login` – User login

_See each service’s source code for example request payloads._

---

## 🌳 What is the Strangler Pattern?

The **Strangler Fig Pattern** is an evolutionary approach to refactoring legacy systems.  
You build new features and services alongside the legacy codebase, gradually redirecting traffic to the new system.  
Over time, the old code is “strangled” and replaced, reducing migration risk and allowing continuous delivery.

---

## 💡 Why Use This Pattern?

- **Minimize risk:** Gradual migration, no “big bang” rewrite  
- **Continuous delivery:** Deploy new features incrementally  
- **Modular architecture:** Enables microservices adoption  

---

## 🙋‍♂️ Author

**Fourat Chaaben**  
- [GitHub: fourat-chaaben](https://github.com/fourat-chaaben)  
- [LinkedIn: Fourat Chaaben](https://linkedin.com/in/fouratchaaben)  
- Email: chaaben.fourat@gmail.com

---

## 📄 License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
