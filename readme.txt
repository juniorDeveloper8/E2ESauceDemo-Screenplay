PROYECTO: Automatización del flujo de compra en SauceDemo con Serenity Screenplay

REQUISITOS PREVIOS:
1. Tener instalado Java 21
2. Tener instalado Gradle (versión recomendada: 8.13 o superior)
3. Tener acceso a internet para descargar las dependencias
4. IDE recomendado: IntelliJ IDEA

PASOS DE EJECUCIÓN:

1. Clonar el repositorio o abrir el proyecto en tu IDE
2. Abrir una terminal en la raíz del proyecto
3. Ejecutar el siguiente comando para limpiar y compilar (opcional si se ejecuta desde la terminal del IntelliJ):
   ./gradlew clean test

   Asegúrate de que el path de la terminal esté apuntando correctamente a la raíz del proyecto.

4. Para ejecutar un escenario específico con tag:
   Dirígete al archivo ubicado en:
   src/test/java/org/sofka/runner/SauceRunner.java

   Desde IntelliJ, haz clic derecho sobre la clase SauceRunner y selecciona "Run 'SauceRunner'".

   Verifica que el tag definido en el runner coincida con el tag en el archivo .feature, por ejemplo:
   @E2ECompraExitosa

5. Al finalizar la ejecución, los reportes se generan automáticamente en:
   - target/site/serenity/index.html

6. Abre el reporte en tu navegador para visualizar los resultados de la ejecución 👍
