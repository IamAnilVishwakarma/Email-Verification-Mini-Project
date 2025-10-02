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

<img width="1366" height="726" alt="Registration page" src="https://github.com/user-attachments/assets/0f8bf0ca-0e34-4d86-9e1c-e0ce741e91f5" />
<img width="1104" height="529" alt="Email Verification" src="https://github.com/user-attachments/assets/8945f740-a42b-43f1-b280-ea23997df2ca" />
<img width="1244" height="320" alt="Email_Verification_Configuration" src="https://github.com/user-attachments/assets/9920351b-0277-44d4-99b1-236a4bc1554c" />
<img width="1366" height="685" alt="Login_Page" src="https://github.com/user-attachments/assets/61c30149-5de7-443b-b25d-69620176c039" />
<img width="1364" height="419" alt="Login_Details" src="https://github.com/user-attachments/assets/5ae24ef2-891e-4a7a-b4de-006fdf0f859c" />
<img width="1060" height="144" alt="Database" src="https://github.com/user-attachments/assets/c903d813-06e3-4652-8157-af01763d0bc5" />





