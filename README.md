# ToDo Application

A simple web-based ToDo application built using Spring Boot, Thymeleaf, and Bootstrap.  
Users can add tasks, toggle task completion status, and delete tasks with a clean, responsive UI.

## Features
- Add new tasks
- Toggle task completion (mark as done/undone)
- Delete tasks
- Responsive and user-friendly interface with Bootstrap
- Dark theme support

## Tech Stack
- Java 17 (or your Java version)
- Spring Boot
- Spring Data JPA (with any database like H2/MySQL)
- Thymeleaf (for server-side rendering)
- Bootstrap 5 (for styling)

## How to Run Locally
1. Clone the repository:  
   `git clone https://github.com/your-username/todo-app.git`

2. Navigate to the project folder:  
   `cd todo-app`

3. Build and run the Spring Boot application:  
   `./mvnw spring-boot:run` (Linux/Mac)  
   or  
   `mvnw.cmd spring-boot:run` (Windows)

4. Open your browser and visit `http://localhost:8080` to use the app.

## Folder Structure
- `src/main/java` - Java source code (controllers, services, models)
- `src/main/resources/templates` - Thymeleaf HTML templates
- `src/main/resources/static` - Static files like CSS and JS

## Contribution
Feel free to fork this project, make improvements, and submit pull requests!

## License
This project is licensed under the MIT License.

