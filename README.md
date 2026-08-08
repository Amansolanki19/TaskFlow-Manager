# 📝 Todo List REST API

A simple and efficient **Todo List REST API** built with **Spring Boot 3**, **Java 21**, **Spring Data JPA**, and **MySQL**. This application provides CRUD operations for managing tasks, including filtering tasks by their completion status.

## 🚀 Features

- ✅ Create a new task
- 📋 Retrieve all tasks
- 🔍 Get a task by ID
- ✏️ Update existing tasks
- ❌ Delete tasks
- ✔️ View completed tasks
- ⏳ View incomplete tasks
- 🔎 Search tasks by name

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Lombok

## 📂 Project Structure

```
src
├── controller
├── model
├── repository
├── services
└── resources
```

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/tasks` | Get all tasks |
| GET | `/tasks/{id}` | Get task by ID |
| GET | `/tasks/completed` | Get completed tasks |
| GET | `/tasks/incomplete` | Get incomplete tasks |
| GET | `/tasks/byTask/{task}` | Search tasks by name |
| POST | `/tasks` | Create a new task |
| PUT | `/tasks/{id}` | Update a task |
| DELETE | `/tasks/{id}` | Delete a task |

## ⚙️ Getting Started

### Prerequisites

- Java 21+
- Maven
- MySQL

### Clone the Repository

```bash
git clone https://github.com/your-username/todo-list-api.git
cd todo-list-api
```

### Configure MySQL

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todoapplication
spring.datasource.username=root
spring.datasource.password=your_password
```

### Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or:

```bash
./mvnw spring-boot:run
```

The API will be available at:

```
http://localhost:8080/tasks
```

## 📌 Example Task JSON

```json
{
  "task": "Complete Spring Boot project",
  "completed": false
}
```

## 📈 Future Improvements

- JWT Authentication
- Swagger/OpenAPI Documentation
- Task Due Dates
- Task Priorities
- Pagination & Sorting
- Unit and Integration Tests


