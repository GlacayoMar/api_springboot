# Biblioteca API

API REST desarrollada con Spring Boot y PostgreSQL para la gestión de autores y libros.

## Tecnologías utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Hibernate
- Postman

## Funcionalidades

- CRUD de autores
- CRUD de libros
- Relaciones entre entidades
- Persistencia con PostgreSQL

## Endpoints principales

### Autores
- GET /api/autores
- POST /api/autores
- PUT /api/autores/{id}
- DELETE /api/autores/{id}

### Libros
- GET /api/libros
- POST /api/libros
- PUT /api/libros/{id}
- DELETE /api/libros/{id}

## Cómo ejecutar

1. Configurar PostgreSQL
2. Editar `application.properties`
3. Ejecutar:

```bash
mvn spring-boot:run
```

## Autor

Gabriel Lacayo