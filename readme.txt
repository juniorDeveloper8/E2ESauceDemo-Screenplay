README - Automatización del flujo de compra en SauceDemo con Serenity Screenplay

📌 Descripción del proyecto:
Este proyecto automatiza el flujo completo de compra en la plataforma SauceDemo utilizando el patrón de diseño Serenity Screenplay.
El objetivo es validar el comportamiento del sistema ante distintas acciones del usuario, desde el inicio de sesión hasta la confirmación del pedido.

🛠 Requisitos previos:
1. Java 21 instalado y configurado
3. Conexión a internet para descargar dependencias
4. IDE recomendado: IntelliJ IDEA

🚀 Pasos para ejecutar las pruebas:

1. Clonar el repositorio o abrir el proyecto en tu IDE.
2. Abrir una terminal ubicada en la raíz del proyecto.
3. Ejecutar el siguiente comando para limpiar y compilar el proyecto:
   ./gradlew clean test

   (Este paso es opcional si se ejecuta directamente desde la terminal integrada de IntelliJ IDEA).

4. Para ejecutar un escenario específico mediante etiquetas:
   - Dirígete al archivo `SauceRunner.java` ubicado en:
     src/test/java/org/sofka/runner/SauceRunner.java
   - Desde IntelliJ, haz clic derecho sobre la clase y selecciona "Run 'SauceRunner'".
   - Verifica que el tag definido en el runner coincida con el tag en el archivo `.feature`, por ejemplo: `@E2ECompraExitosa`.

5. Al finalizar la ejecución, los reportes se generan automáticamente en:
   target/site/serenity/index.html

6. Abre el reporte en tu navegador para visualizar los resultados de la ejecución.

📄 Notas adicionales:
- Los escenarios están definidos en archivos `.feature` y estructurados para facilitar su mantenimiento y extensión.
- El patrón Screenplay permite una organización modular, reutilizable y clara de las tareas y preguntas.
- Los reportes Serenity ofrecen trazabilidad visual completa de cada paso ejecutado.
