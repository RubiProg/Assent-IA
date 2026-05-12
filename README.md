# Assent-IA 🤝

> App Android para la coordinación de cuidadores y familiares en servicios de ayuda a domicilio, con IA como capa de asistencia en la toma de decisiones.

---

## ¿Qué es Assent-IA?

Assent-IA nace de observar de cerca los problemas reales de coordinación en el cuidado domiciliario de personas dependientes: información dispersa, falta de comunicación entre el equipo cuidador y la familia, e incidencias que no se gestionan con la agilidad que requieren.

La app centraliza la operativa del cuidado en un único lugar, conectando tres perfiles de usuario con necesidades distintas:

- **Admin** — gestión global de pacientes, visitas y equipo
- **Cuidador** — agenda diaria, registro de visitas, medicación e incidencias
- **Familiar** — seguimiento en tiempo real del estado de su familiar y comunicación directa con el equipo

La IA (integración con API de Claude de Anthropic) actúa como asistente contextual para la toma de decisiones clínicas y la comunicación entre perfiles.

---

## Funcionalidades implementadas

### Autenticación y roles
- Login con validación por email/contraseña
- Navegación diferenciada según rol (Admin / Cuidador / Familiar)
- Gestión de sesión con Hilt + Flow

### Gestión de pacientes
- Ficha completa: datos personales, condiciones médicas, alergias, notas clínicas
- Asignación de cuidador y familiares vinculados
- Detalle de paciente con historial de visitas e incidencias

### Visitas
- Agenda diaria del cuidador con visitas del día
- Inicio y cierre de visita con firma digital (base64)
- Checklist de tareas por visita (medicación, higiene, alimentación, ejercicio, compañía)
- Estados: Pendiente → En curso → Completada / Cancelada

### Medicación
- Registro de medicamentos por paciente con dosis y frecuencia
- Control de administración en cada visita con observaciones
- Frecuencias: diaria, cada 8h, cada 12h, semanal, mensual

### Incidencias
- Registro de incidencias con nivel de gravedad: Leve / Moderada / Grave / Urgente
- Estados: Abierta → En revisión → Resuelta
- Historial de incidencias por paciente
- Posibilidad de adjuntar foto

### Comunicación
- Chat contextualizado por paciente entre cuidador y familiar
- Contador de mensajes no leídos
- Valoración de visitas (puntuación 1-5 con comentario)

### Dashboard Admin
- Vista global de incidencias abiertas
- Gestión del equipo y asignaciones

---

## Arquitectura

```
app/
└── src/main/java/com/assentia/app/
    ├── data/
    │   ├── datasource/       # MockDataSource (en migración a backend real)
    │   └── repository/       # Implementaciones de repositorios
    ├── di/                   # Módulos de inyección de dependencias (Hilt)
    ├── domain/
    │   ├── model/            # Entidades del dominio
    │   ├── repository/       # Interfaces de repositorio
    │   └── usecase/          # Casos de uso (Clean Architecture)
    └── presentation/
        ├── fragment/         # Fragments de UI
        ├── state/            # Estados de UI
        └── viewmodel/        # ViewModels (MVVM)
```

**Patrón:** Clean Architecture + MVVM  
**Inyección de dependencias:** Hilt  
**Navegación:** Navigation Component + Safe Args  
**Asincronía:** Kotlin Coroutines + Flow  
**UI:** ViewBinding + Material Design 3

---

## Stack tecnológico

| Capa | Tecnología |
|------|-----------|
| Lenguaje | Kotlin |
| UI | Android Views + ViewBinding + Material 3 |
| Arquitectura | Clean Architecture + MVVM |
| DI | Hilt 2.52 |
| Navegación | Navigation Component 2.8.5 |
| Asincronía | Coroutines + Flow |
| IA | API de Claude (Anthropic) |
| Min SDK | Android 8.0 (API 26) |
| Target SDK | Android 14 (API 34) |

---

## Modelo de dominio

```
Paciente ──────< Visita >────── Cuidador
    │               │
    │           TareaVisita
    │
    ├──────< Medicacion
    │           │
    │       RegistroMedicacion
    │
    ├──────< Incidencia
    │
    └──────< Mensaje >────── Familiar
```

### Entidades principales

- **User** — roles: `ADMIN`, `CUIDADOR`, `FAMILIAR`
- **Paciente** — perfil clínico completo con condiciones médicas y alergias
- **Visita** — con checklist de tareas y firma digital
- **Medicacion** — con control de administración por visita
- **Incidencia** — graduada por gravedad con seguimiento de estado
- **Mensaje** — chat contextualizado por paciente
- **Valoracion** — feedback de familiares sobre cuidadores

---

## Estado del proyecto

> En desarrollo activo. Los commits reflejan la evolución real del proyecto.

- [x] Arquitectura y estructura base
- [x] Autenticación y gestión de roles
- [x] CRUD de pacientes y visitas
- [x] Gestión de medicación e incidencias
- [x] Chat entre cuidador y familiar
- [x] Dashboard admin
- [ ] Integración con backend real (actualmente MockDataSource)
- [ ] IA conversacional integrada en flujo de incidencias
- [ ] Notificaciones push para incidencias urgentes
- [ ] Exportación de informes de visita en PDF

---

## Cómo ejecutar el proyecto

1. Clona el repositorio
2. Abre con **Android Studio Hedgehog** o superior
3. Deja que Gradle sincronice las dependencias
4. Ejecuta en emulador o dispositivo físico (Android 8.0+)

**Credenciales de prueba (MockDataSource):**

| Email | Contraseña | Rol |
|-------|-----------|-----|
| `admin@assent-ia.com` | `admin123` | Admin |
| `maria@assent-ia.com` | `cuidador123` | Cuidadora |
| `ana@gmail.com` | `familiar123` | Familiar |

---

## Contexto y motivación

Este proyecto surge de observar de cerca los retos del cuidado domiciliario de personas en situación de dependencia. Las soluciones existentes están fragmentadas, son difíciles de usar para perfiles no técnicos y no están diseñadas para la coordinación en tiempo real entre el equipo cuidador y la familia.

Assent-IA intenta resolver eso poniendo la tecnología al servicio de las personas que cuidan y de las que son cuidadas.

---

## Autora

**Jenifer González**  
Estudiante de 2º DAM · Barcelona  
[github.com/RubiProg](https://github.com/RubiProg)
