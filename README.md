# My Retro App

## Overview

**My Retro App** is a retrospection tool designed to help users review past events, share thoughts, synthesize group ideas, and discuss important topics. The goal is to facilitate continuous improvement by committing to actionable steps for better future processes.

This project follows a **Spring Boot** architecture and will evolve throughout the book, with each chapter adding new features and functionalities.

## Features

### **Retro Board**
- Each Retro Board contains:
    - **UID**: A unique identifier.
    - **Name**: The name of the Retro Board.
    - **Multiple cards**, grouped by Card Type (Happy, Meh, and Sad).

### **Card**
- Each Card represents a user’s input and contains:
    - A **comment box** for expressing thoughts based on the **Card Type**.

### **Card Type**
- **Happy Card**: Represents positive thoughts, actions, or events.
- **Meh Card**: Represents questionable ideas or thoughts that require discussion.
- **Sad Card**: Represents negative feedback, issues, or undesirable events.

### **User Management**
- **Admin and User roles**.
- **Admins** can manage Users and multiple Retro Boards.
- **Users** can be assigned to a Retro Board.

### **Web API & UI**
- **Exposes a RESTful API** for managing Retro Boards, Cards, and Users.
- **UI Features**:
    - Login/Logout functionality.
    - A Retro Board UI with three columns (**HAPPY, MEH, SAD**).
    - Users can add Cards to the relevant column.

## Tech Stack

- **Backend**: Java, Spring Boot
- **Frontend**: (To be added later)
- **Database**: PostgreSQL / MySQL
- **Security**: Spring Security for authentication & authorization
- **API Documentation**: Swagger / OpenAPI

## Installation & Setup

### **Prerequisites**
- Java 17+
- Maven
- PostgreSQL/MySQL (or any preferred relational database)
- Docker (optional)

### **Clone the Repository**
```bash
git clone https://github.com/yourusername/my-retro-app.git
cd my-retro-app
```

### **Configure Database**
Edit `application.properties` or `application.yml` to set up database configurations:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/retro_db
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
```

### **Run the Application**
```bash
mvn spring-boot:run
```

### **Access the Application**
- API: `http://localhost:8080/api`
- UI: `http://localhost:8080`

## API Endpoints

| Endpoint                  | Method | Description                          |
|---------------------------|--------|--------------------------------------|
| `/api/retro-boards`       | GET    | Retrieve all Retro Boards           |
| `/api/retro-boards/{id}`  | GET    | Retrieve a specific Retro Board     |
| `/api/retro-boards`       | POST   | Create a new Retro Board            |
| `/api/cards`              | POST   | Add a new Card to a Retro Board     |
| `/api/users`              | POST   | Register a new User                 |
| `/api/auth/login`         | POST   | User authentication (JWT)           |

## Contributing

1. Fork the repository
2. Create a new branch (`feature/my-new-feature`)
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## License

This project is licensed under the [MIT License](LICENSE).

---

Stay tuned as we build this project chapter by chapter! 🚀

