# Email-Verification-Mini-Project
Java Spring Boot application demonstrating email verification and secure authentication using Spring Security, Java Mail, and Thymeleaf. Ideal for learning user management flows.

## ✨ Features

- **User Registration** – Sign up with email and password.
- **Email Verification** – Automatically sends a unique verification link with a token.
- **Account Activation** – User accounts remain inactive until they click the verification link.
- **Secure Authentication** – Login and session management with **Spring Security**.
- **Password Security** – All passwords stored using **BCrypt hashing**.
- **Error Handling** – Handles invalid/expired verification links gracefully.
- **Responsive Frontend** – Built with **HTML + Thymeleaf** templates.
- **Database Integration** – Store user details and verification tokens in **MySQL**.

---

## 🛠 Tech Stack

| Layer       | Technology |
|-------------|------------|
| **Backend** | Java 17+, Spring Boot 3 |
| **Security** | Spring Security (Authentication & BCrypt password hashing) |
| **Email**   | Spring Mail (JavaMailSender, SMTP) |
| **Frontend** | HTML, CSS, Thymeleaf Templates |
| **Database** | MySQL (JPA/Hibernate for persistence) |
| **Build Tool** | Maven |

---

## 📸 Screenshots (Optional)

- 📝 Registration Page  
- 📩 Verification Email Example  
- ✅ Successful Account Activation  
- 🔐 Login Page  
- 👤 Profile Page (after login)

---

## 🚀 Getting Started

### Prerequisites
- JDK 17 or higher  
- Maven installed  
- MySQL (or compatible SQL DB)   
- SMTP configuration (e.g., Gmail App Password or Mailtrap for testing)  

### Setup Steps
1. Clone the repository
   ```bash
   git clone [Your-Repo-Link]
   cd email-verification-springboot

2. Configure src/main/resources/application.properties
   # Database
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

# Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Email (Gmail SMTP example)
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

3. Run the project
mvn spring-boot:run

4. Access the app
👉 http://localhost:8080/register

5. Contribution
Contributions are welcome! 🎉
Feel free to open issues or submit pull requests.

Author
Anil Kumar Vishwakarma
GitHub: https://github.com/IamAnilVishwakarma
