![Estado](https://img.shields.io/badge/Estado-En%20desarrollo-yellow)

> ⚠️ **Este proyecto está en una fase inicial de desarrollo.**  
> Ninguna funcionalidad está terminada y el repositorio está sujeto a cambios frecuentes.

# 🛒 ecommerce-microservices

**Proyecto personal de e-commerce basado en arquitectura de microservicios.**  
Diseñado con el objetivo de aprender e implementar buenas prácticas modernas en desarrollo backend, despliegue, pruebas y automatización.

---

## 🚧 Objetivo

Desarrollar una plataforma de comercio electrónico distribuida, con enfoque en:
- Arquitectura basada en microservicios
- Comunicación asíncrona con Kafka
- Seguridad con JWT
- Orquestación con Docker y despliegue en GCP

---

## 📦 Microservicios previstos

> ⚠️ **Todos los microservicios están en desarrollo.**

- `auth`: Servicio de autenticación y generación de tokens JWT
- `usuario`: Gestión de usuarios
- `producto`: Catálogo de productos
- `pedido`: Gestión de pedidos
- `notificaciones`: Envío de notificaciones al usuario
- `gateway`: API Gateway (Spring Cloud Gateway)
- `eureka-server`: Registro de servicios (Service Discovery)

---

## 🧱 Tecnologías previstas

- Java + Spring Boot
- Spring Security, Spring Cloud
- Kafka
- Docker + Docker Compose
- JWT
- Eureka (Netflix OSS)
- PostgreSQL / MongoDB (dependiendo del servicio)

---

## 🚀 Roadmap por fases

> 🔨 **Actualmente en Fase 1: Fundamentos (en curso)**

### 🟡 Fase 1: Fundamentos (en curso)
- [ ] Microservicios base
- [ ] Eureka + Gateway
- [ ] Seguridad con JWT
- [ ] Kafka + Docker Compose

### 🔜 Fase 2: Documentación y pruebas
- [ ] Swagger en todos los servicios
- [ ] Colección Postman
- [ ] Tests unitarios con MockMvc
- [ ] Documento técnico PDF

### 🔜 Fase 3: Despliegue en la nube
- [ ] Scripts para GCP Cloud Run
- [ ] CI/CD con GitHub Actions
- [ ] Documentación de despliegue

---

## 📂 Estructura del proyecto

```plaintext
ecommerce-microservices/
├── auth/                  # Microservicio de autenticación
│   ├── src/
│   ├── pom.xml
│   └── ...
├── usuario/               # Microservicio de gestión de usuarios
├── producto/              # Microservicio de productos
├── pedido/                # Microservicio de pedidos
├── notificaciones/        # Microservicio para el envío de notificaciones
├── gateway/               # API Gateway (Spring Cloud Gateway)
├── eureka-server/         # Servicio de descubrimiento (Eureka)
├── docker-compose.yml     # Orquestación de servicios con Docker
├── .gitignore
├── README.md
└── ...

```

---

## ✍️ Autor

Desarrollado por **Javier Cordero** como proyecto de aprendizaje.  
Si tienes sugerencias o ideas, ¡los issues y PRs son bienvenidos!

---

## 📌 Licencia

MIT License - Puedes usar, modificar y compartir este proyecto libremente.

