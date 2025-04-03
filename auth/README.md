# 🛒 ecommerce-microservices

**Proyecto personal de e-commerce basado en arquitectura de microservicios.**  
Diseñado con el objetivo de aprender e implementar buenas prácticas modernas en desarrollo backend, despliegue, pruebas y automatización.

> ⚠️ Este proyecto se encuentra actualmente **en construcción**. Las funcionalidades, estructura y documentación están en constante evolución.

---

## 🚧 Objetivo

Desarrollar una plataforma de comercio electrónico distribuida, con enfoque en:
- Arquitectura basada en microservicios
- Comunicación asíncrona con Kafka
- Seguridad con JWT
- Orquestación con Docker y despliegue en GCP

---

## 📦 Microservicios actuales (Fase 1 - Fundamentos)

- `auth`: Servicio de autenticación y generación de tokens JWT
- `usuario`: Gestión de usuarios
- `producto`: Catálogo de productos
- `pedido`: Gestión de pedidos
- `notificaciones`: Envío de mensajes/notificaciones al usuario

También incluye:
- `gateway`: API Gateway (Spring Cloud Gateway)
- `eureka-server`: Registro de servicios (Service Discovery)

---

## 🧱 Tecnologías utilizadas

- Java + Spring Boot
- Spring Security, Spring Cloud
- Kafka
- Docker + Docker Compose
- JWT
- Eureka (Netflix OSS)
- PostgreSQL / MongoDB (dependiendo del servicio)

---

## 🚀 Roadmap por fases

### ✅ Fase 1: Fundamentos (completada)
- [x] Microservicios base
- [x] Eureka + Gateway
- [x] Seguridad con JWT
- [x] Kafka + Docker Compose

### 🛠️ Fase 2: Documentación y pruebas (en desarrollo)
- [ ] Swagger en todos los servicios
- [ ] Colección Postman
- [ ] Tests unitarios con MockMvc
- [ ] Documento técnico PDF

### ☁️ Fase 3: Despliegue en la nube
- [ ] Scripts para GCP Cloud Run
- [ ] CI/CD con GitHub Actions
- [ ] Documentación de despliegue

---

## 📂 Estructura del repositorio

