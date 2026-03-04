# MovieList

A streamlined REST API for managing a personal movie catalog. This project serves as a practical exercise in building resilient, standard-compliant Spring Boot backends with a focus on clean architecture and data persistence.

### Features
- Full CRUD operations for movie entries (Add, List, Update, Delete).
- Filtering and sorting by genre, release year, and rating.
- Persistence using H2 (for development) and PostgreSQL (for production).

### Tech Stack
- **Java 17+**
- **Spring Boot 3** (Web, Data JPA)
- **Lombok**
- **H2 / PostgreSQL**

### How to Run
1. Clone: `git clone https://github.com/Anayo-Anyafulu/MovieList.git`
2. Run: `./mvnw spring-boot:run`
3. Access API: `http://localhost:8080/api/movies`

### Practise Goals
- **Spring Data JPA:** Mastering repository patterns and custom JPQL queries.
- **REST Best Practices:** Implementing proper HTTP status codes, DTO mapping, and exception handling.
- **Validation:** Using Jakarta Validation to ensure data integrity at the API layer.
