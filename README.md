# 📚 Library Management System (DAO-Based)

This is a **Java-based Library Management System** that follows the **Data Access Object (DAO) pattern** to interact with a database.  
It provides functionality for managing books, authors, members, checkouts, and publishers.  

---

## 📂 Project Structure

The project includes **DAO classes** to handle different entities:

- **`AuthorDao.java`** - Manages CRUD operations for authors.  
- **`BooksDao.java`** - Handles book-related operations.  
- **`CheckoutsDao.java`** - Manages book checkouts and returns.  
- **`HoldsDao.java`** - Handles book hold requests.  
- **`MemberDao.java`** - Manages library members.  
- **`PublishersDao.java`** - Manages publisher details.  

---

## 🛠️ Technologies Used

- **Java** (JDK 8+)  
- **JDBC** for database connectivity  
- **MySQL / PostgreSQL** (Database)  
- **DAO Pattern** for structured database interaction  
- **Maven** (For dependency management, if applicable)  

---

## ⚙️ Installation & Setup

### ⬇️ Clone the Repository  
```sh
git clone <repository-url>
cd library-management-system
```

### 📌 Configure the Database

`Install MySQL/PostgreSQL (or your preferred database).
`Create a new database and update the DAO classes with the database credentials.
`Import the provided SQL script (if available).

### 📦 Install Dependencies (If Using Maven)
```sh
mvn clean install
```

### 🚀 Run the Application

## ▶️ Using JAR file
```sh
java -jar target/library-management-system.jar
```
### ▶️ Using an IDE (Eclipse/IntelliJ IDEA)

`Open the project in your IDE.
`Run the main() method from the entry point class.

### 🚀 Features

`📖 Book Management - Add, update, delete, and view books.
`👤 Member Management - Register and manage library members.
`📚 Checkouts & Holds - Borrow books, return books, and place holds.
`🏢 Publisher & Author Management - Keep track of book publishers and authors.
