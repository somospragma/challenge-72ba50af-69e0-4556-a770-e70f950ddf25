# Diseño y aplicación de principios OOP en un sistema de gestión de productos

El sistema de gestión de productos de una tienda en línea necesita ser refactorizado para mejorar su mantenibilidad y escalabilidad. Tu tarea es aplicar los principios de la Programación Orientada a Objetos (OOP) para reorganizar y optimizar el código existente. Los productos tienen atributos como nombre, precio, stock y categoría. El sistema debe asegurar que no se permitan precios negativos ni nombres duplicados.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Orientada a Objetos |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Refactorización inicial

**Objetivo:** Aplicar el principio de encapsulamiento para proteger los atributos de los productos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los atributos de los productos que deben ser encapsulados.
- Crea métodos de acceso (getters y setters) para estos atributos.

**Entregable:** Código refactorizado con encapsulamiento aplicado.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el encapsulamiento protege los datos y provee una interfaz para acceder a ellos.
- Piensa en cómo los métodos de acceso pueden validar los valores antes de asignarlos.

</details>

### Fase 2: Implementación de herencia

**Objetivo:** Aplicar el principio de herencia para crear una jerarquía de productos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica las características comunes y únicas de los productos.
- Crea una clase base y clases derivadas que hereden de ella.

**Entregable:** Código con herencia aplicada en la jerarquía de productos.

<details>
<summary>Pistas de conocimiento</summary>

- La herencia permite reutilizar código y establecer una jerarquía lógica.
- Piensa en cómo las clases derivadas pueden extender o modificar el comportamiento de la clase base.

</details>

### Fase 3: Aplicación de polimorfismo

**Objetivo:** Aplicar el principio de polimorfismo para manejar diferentes tipos de productos de manera uniforme.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica métodos que pueden ser polimórficos.
- Implementa métodos polimórficos en las clases base y derivadas.

**Entregable:** Código con polimorfismo aplicado en los métodos de los productos.

<details>
<summary>Pistas de conocimiento</summary>

- El polimorfismo permite que diferentes clases respondan de manera diferente a la misma acción.
- Piensa en cómo los métodos polimórficos pueden ser llamados de manera uniforme a través de la jerarquía de clases.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el encapsulamiento y por qué es importante en OOP?
- **paraQueSirve**: ¿Para qué sirve la herencia en la jerarquía de productos?
- **comoSeUsa**: ¿Cómo se aplica el polimorfismo en los métodos de los productos?
- **erroresComunes**: ¿Qué errores comunes se pueden cometer al aplicar herencia y polimorfismo?

## Criterios de Evaluacion

- Aplicación correcta del encapsulamiento en los atributos de los productos.
- Implementación de una jerarquía de productos usando herencia.
- Aplicación de polimorfismo en los métodos de los productos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
