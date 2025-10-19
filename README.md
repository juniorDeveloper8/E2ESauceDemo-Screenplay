# 🛒 Ejercicio de Automatización E2E con Serenity BDD

Este proyecto automatiza el flujo completo de compra en la página [SauceDemo](https://www.saucedemo.com/) utilizando **Serenity BDD** con el patrón **Screenplay** en **Java** y **Gradle**. El objetivo es validar el comportamiento funcional del sistema desde el inicio de sesión hasta la confirmación del pedido.

---

## ⚙️ Requisitos previos

Antes de ejecutar las pruebas, asegúrate de tener lo siguiente configurado en tu entorno local:

| [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows) | [Java 21](https://www.oracle.com/java/technologies/downloads/) | [Gradle 8.13+](https://gradle.org/releases/) |
|:--:|:--:|:--:|
| ![IntelliJ](https://cdn.iconscout.com/icon/free/png-128/intellij-idea-569199.png) | ![Java](https://www.oracle.com/a/ocom/img/cb71-java-logo.png) | ![Gradle](https://gradle.org/images/gradle-knowledge-graph-logo.png?20170228) |

> **Notas adicionales:**
> - Sistema operativo recomendado: **Windows 11**
> - IDE recomendado: **IntelliJ IDEA Community 2025**
> - Asegúrate de tener el **JDK 21** configurado en la variable de entorno `JAVA_HOME`.
> - Instala los plugins **Gherkin** y **Cucumber for Java** en IntelliJ.  
    >   [Guía de instalación de plugins](https://www.jetbrains.com/help/idea/managing-plugins.html)

---

## 📁 Estructura del proyecto

```plaintext
E2E-SauceDemo
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── src/
│   ├── main/java/sofka/
│   │   ├── page/               
│   │   ├── question/           
│   │   ├── task/               
│   │   └── Main                
│   └── test/java/sofka/
│       ├── glue/
│       │   └── SuccessPurchaseStepDef.java  
│       ├── runner/
│       │   └── SauceRunner.java                 # Clase para ejecutar las pruebas
│       └── resources/
│           └── features/
│               └── successful-purchase.feature  # Escenario de compra exitosa       
├── target/
│   └── site/
│       └── serenity/  
│           └── index.html                           # Reporte de la ejecución de las pruebas
├── .gitignore
├── build.gradle
├── gradlew / gradlew.bat
├── serenity.properties
├── settings.gradle
├── readme.txt                                   # Instrucciones de instalación y ejecución
├── README.md
├── conclusiones.txt                             # Análisis técnico de los resultados obtenidos  

```

## Comandos de instalación

- Clona el repositorio

```markdown
git clone https://github.com/juniorDeveloper8/E2ESauceDemo-Screenplay.git
```

## Ejecutar las pruebas

- Abre el proyecto en IntelliJ IDEA.
- Dirígete al archivo SauceRunner.java ubicado en:

```
src/test/java/sofka/runner/SauceRunner.java
```
- Haz clic derecho sobre la clase y selecciona "Run 'SauceRunner'" y ejecutar.
- Asegúrate de que el tag definido en el runner coincida con el del archivo .feature, por ejemplo: @E2ECompraExitosa.

## 📊 Visualización de reportes

- Revisa la URL del reporte al final de la consola de IntelliJ.
- También puedes abrir manualmente el reporte en:
```
# Al ejecutar el proyecto se genera un reporte en la siguiente ruta.

target/site/serenity/index.html
```

# Nota:

## Configuración del Proyecto

### En el archivo de serenity.conf tomar en cuenta las siguientes indicaciones

- En webDrive esta configurado para que funcione con el navegador brave

```
 webdriver {
    driver = chrome
    autodownload = false
    capabilities {
        "goog:chromeOptions" {
        #usar el binario si no tiene instalado chorme
            binary = "C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe"
            args = [
                "--remote-allow-origins=*", "--xheadless"
            ]
        }
    }

}
```

- Si usan otro navegador como Chrome, entonces deben comentar el binario o eliminarlo. Les dejo el código:

```
webdriver {
    driver = chrome
    autodownload = false
    capabilities {
        "goog:chromeOptions" {
            args = [
                "--remote-allow-origins=*", "--xheadless"
            ]
        }
    }
}
```

1. **Configurar el entorno:**
    - El archivo `serenity.conf` debe estar configurado correctamente. Asegúrate de que la siguiente configuración
      esté presente ante de realizar las pruebas:
      ```
         environments {
             default{
                webdriver.base.url = "https://www.saucedemo.com/"
            }
        }

        webdriver {
            driver = chrome
            autodownload = false
            capabilities {
                "goog:chromeOptions" {
                    args = [
                        "--remote-allow-origins=*", "--xheadless"
                    ]
                }
            }
        }
               
      ```

## 🛒 Flujo de compra automatizado

- **Inicio de sesión:**  
  Se accede con el usuario `standard_user` y la contraseña `secret_sauce`.

- **Agregar productos al carrito:**  
  Se seleccionan dos productos distintos.

- **Verificación del carrito:**  
  Se valida que los productos añadidos estén correctamente listados.

- **Formulario de compra:**  
  Se completan los campos requeridos con datos ficticios (nombre, apellido, código postal).

- **Finalización del pedido:**  
  Se confirma la compra y se valida el mensaje final:  
  **“THANK YOU FOR YOUR ORDER”**
