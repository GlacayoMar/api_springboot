# Biblioteca API

API REST desarrollada con Spring Boot y PostgreSQL para la gestión de autores y libros.

El proyecto implementa operaciones CRUD completas, relaciones entre entidades utilizando JPA/Hibernate y endpoints preparados para ser consumidos posteriormente por una interfaz gráfica o aplicación frontend.

---

# Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Lombok
- Postman

---

# Funcionalidades implementadas

## Autores
- Crear autores
- Listar autores
- Buscar autor por ID
- Actualizar autores
- Eliminar autores

## Libros
- Crear libros
- Listar libros
- Buscar libro por ID
- Actualizar libros
- Eliminar libros

## Funcionalidades adicionales
- Relación OneToMany y ManyToOne entre Autor y Libro
- Búsqueda de libros por título
- Filtrado de libros disponibles
- Registro automático de fecha de creación
- Persistencia de datos con PostgreSQL
- Endpoints REST probados con Postman

---

# Estructura del proyecto

```text
src/main/java/ni/edu/biblioteca_api
│
├── controllers
├── models
├── repositories
└── services
```

---

# Relación entre entidades

## Autor → Libro

- Un autor puede tener múltiples libros.
- Un libro pertenece a un único autor.

Relación implementada mediante:
- `@OneToMany`
- `@ManyToOne`

---

# Endpoints principales

## Autores

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/autores` | Listar autores |
| GET | `/api/autores/{id}` | Obtener autor por ID |
| POST | `/api/autores` | Crear autor |
| PUT | `/api/autores/{id}` | Actualizar autor |
| DELETE | `/api/autores/{id}` | Eliminar autor |

---

## Libros

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/libros` | Listar libros |
| GET | `/api/libros/{id}` | Obtener libro por ID |
| POST | `/api/libros` | Crear libro |
| PUT | `/api/libros/{id}` | Actualizar libro |
| DELETE | `/api/libros/{id}` | Eliminar libro |
| GET | `/api/libros/buscar?titulo=` | Buscar libros por título |
| GET | `/api/libros/disponibles` | Obtener libros disponibles |

---

# Configuración de la base de datos

Configurar las credenciales de PostgreSQL en:

```properties
src/main/resources/application.properties
```

Ejemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/biblioteca_db
spring.datasource.username=postgres
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Cómo ejecutar el proyecto

## Clonar repositorio

```bash
git clone <URL_DEL_REPOSITORIO>
```

---

## Entrar al proyecto

```bash
cd biblioteca_api
```

---

## Ejecutar aplicación

```bash
mvn spring-boot:run
```

---

# Pruebas de la API

Los endpoints fueron probados utilizando:

- Postman

Las capturas de las pruebas realizadas se incluyen en la documentación del proyecto.

---

# Buenas prácticas implementadas

- Arquitectura por capas
- Separación de responsabilidades
- Uso de servicios y repositorios
- Código modular y organizado
- Control de versiones con Git y GitHub
- Commits semánticos

---

# Autor

Gabriel Lacayo