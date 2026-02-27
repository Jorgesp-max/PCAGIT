# Práctica 3 - Semaphores - Guía de uso para el alumnado (PCA)

## 1. ¿Qué es este proyecto y para qué sirve?

Este repositorio es el **entorno de trabajo** para la práctica 3 de *Programación Concurrente y Avanzada*.

Aquí tenéis:

- Un proyecto Maven ya configurado.
- Una implementación base con clases de ejemplo (`Semaforo1`, `Semaforo2`, `Semaforo3`, `ProductorConsumidor`, `Main`).
- El objetivo es que implementéis y entendáis **mecanismos de sincronización** usando semáforos y gestionando correctamente productores y consumidores.

---

## 2. Cómo empezar (clonar y abrir en IntelliJ)

### 2.1. Clonar el repositorio

**Opción A — Desde IntelliJ (recomendado)**

1. Abrir IntelliJ IDEA.
2. En la pantalla inicial: **Get from VCS**.
3. En **Version control** elegir **Git**.
4. Pegar la URL del repositorio de GitLab (la que os da la escuela).
5. Elegir una carpeta de destino y pulsar **Clone**.

**Opción B — Con Git en terminal**

```bash
git clone <URL_DEL_REPOSITORIO_GITLAB>
cd <carpeta-del-repo>
```
> Nota: si GitLab os pide credenciales, usad el método indicado por la escuela (token, SSO, etc.).

### 2.2. Abrir el proyecto como proyecto Maven

1. En IntelliJ: **File → Open…** y seleccionar la carpeta del repositorio clonado.
2. Aseguraos de que IntelliJ detecta el fichero `pom.xml`.
3. Si aparece un aviso para **Load Maven project**, aceptadlo.

### 2.3. Configurar el JDK del proyecto

El proyecto está configurado con un nivel de Java alto (ver `pom.xml`). Para evitar errores:
1. Ir a **File → Project Structure → Project**.
2. Seleccionar un **Project SDK** compatible (por ejemplo, el JDK instalado en vuestro equipo).
3. Si IntelliJ indica problemas de lenguaje/bytecode, revisad:
   - `Project language level`
   - `Maven` → `Importer` (si aplica)

> Si vuestra máquina no tiene el JDK requerido, instalad uno compatible y seleccionadlo en IntelliJ.

### 2.4. Comprobar que todo compila antes de tocar nada

Antes de implementar nada, comprobad que el proyecto abre y compila:

- Desde IntelliJ: usar **Build → Build Project**.
- Desde el panel **Maven** de IntelliJ (recomendado):
  1. Abrir la ventana: **View → Tool Windows → Maven**.
  2. En **Lifecycle**, ejecutar **`package`** (o **`compile`** si solo queréis compilar).

> Nota: en esta asignatura priorizamos el uso de IntelliJ para ejecutar Maven. Si en tu máquina tienes Maven instalado y en PATH, también podrías compilar desde terminal, pero no es el flujo recomendado.

Si esto falla, no sigáis con la práctica hasta resolverlo (JDK, Maven/IntelliJ, o rutas del proyecto).

---

## 3. Estructura del proyecto

- `src/main/java/`
  - `Main.java`: punto de entrada para lanzar pruebas.
  - `Semaforo1.java`: clase que permite familiarizarse con la prioridad de hilos.
  - `Semaforo2.java`: clase que permite familiarizarse con el acceso a recursos.
  - `Semaforo3.java`: clase que permite familiarizarse con la ejecución ordenada.
  - `ProductorConsumidor.java`: clase que implementa el paradigma de productor consumidor con semáforos.
> Nota: se han incluido los archivos de las clases en inglés. Estos archivos pueden ser eliminados o ignorados para el desarrollo de la práctica.
---



## 4. Lo que tenéis que implementar

En esta práctica se deben seguir las indicaciones recogidas en la presentación asociada.

### 4.1. Modificación de parámetros de las clases
Algunas de las clases proporcionadas son completamente funcionales. Aún así, en la presentación se plantean pequeñas modificaciones que permitirán entender mejor el funcionamiento de los semáforos.

### 4.2. Implementación de las clases

Algunas de las funciones están sin completar. Será necesario rellear el código que falta según se indica en el propio código y en la presentación.

---

## 5. Cómo compilar y ejecutar

### Compilar con Maven (desde IntelliJ)

1. Abrir la ventana: **View → Tool Windows → Maven**.
2. En el árbol Maven, abrir **Lifecycle**.
3. Ejecutar **`package`** (también vale **`compile`**).

### Ejecutar `Main`

- En IntelliJ, ejecutar directamente `Main` como aplicación Java, indicando qué clase se quiere crear y probar.

> Alternativa (solo si la necesitáis): ejecución por consola con `java -cp ...`.

```powershell
java -cp "target/classes" Main
```

---

## 6. Cómo se evalúa la práctica (criterios)

Esta práctica **NO ES EVALUABLE** pero te ayudará a preparar la siguiente práctica que sí lo es. Además, los resultados obtenidos pueden ser objeto de evaluación en el test de la semana siguiente.

---

¡Buena suerte con la práctica!
___

[ENGLISH]

# Practice 3 - Semaphores - Student User Guide (PCA)

## 1. What is this project and what is it for?

This repository is the **working environment** for Practice 3 of
*Concurrent and Advanced Programming*.

Here you will find:

-   A preconfigured Maven project.
-   A base implementation with example classes (`Semaphore1`,
    `Semaphore2`, `Semaphore3`, `ProducerrConsumer`, `Main`).
-   The objective is to implement and understand **synchronization
    mechanisms** using semaphores and correctly managing producers and
    consumers.

------------------------------------------------------------------------

## 2. Getting started (clone and open in IntelliJ)

### 2.1. Clone the repository

**Option A --- From IntelliJ (recommended)**

1.  Open IntelliJ IDEA.
2.  On the initial screen: **Get from VCS**.
3.  In **Version control**, choose **Git**.
4.  Paste the GitLab repository URL (the one provided by the school).
5.  Choose a destination folder and click **Clone**.

**Option B --- Using Git in the terminal**

``` bash
git clone <GITLAB_REPOSITORY_URL>
cd <repository-folder>
```

Note: If GitLab asks for credentials, use the method specified by the
school (token, SSO, etc.).

------------------------------------------------------------------------

### 2.2. Open the project as a Maven project

1.  In IntelliJ: **File → Open...** and select the cloned repository
    folder.
2.  Make sure IntelliJ detects the `pom.xml` file.
3.  If prompted to **Load Maven project**, accept it.

------------------------------------------------------------------------

### 2.3. Configure the project JDK

The project is configured with a relatively recent Java level (see
`pom.xml`). To avoid errors:

1.  Go to **File → Project Structure → Project**.
2.  Select a compatible **Project SDK** (for example, the JDK installed
    on your machine).
3.  If IntelliJ reports language/bytecode issues, check:
    -   Project language level
    -   Maven → Importer (if applicable)

If your machine does not have the required JDK installed, install a
compatible version and select it in IntelliJ.

------------------------------------------------------------------------

### 2.4. Make sure everything compiles before modifying anything

Before implementing anything, verify that the project opens and compiles
correctly:

-   From IntelliJ: use **Build → Build Project**.
-   From the IntelliJ Maven panel (recommended):
    1.  Open: **View → Tool Windows → Maven**.
    2.  Under **Lifecycle**, run **package** (or **compile** if you only
        want to compile).

Note: In this course, we prioritize using IntelliJ to run Maven. If you
have Maven installed and configured in your PATH, you could also compile
from the terminal, but this is not the recommended workflow.

If compilation fails, do not continue with the practice until the issue
is resolved (JDK, Maven/IntelliJ configuration, or project paths).

------------------------------------------------------------------------

## 3. Project structure

-   `src/main/java/`

    -   `Main.java`: entry point to run tests.
    -   `Semaphor21.java`: class to become familiar with thread priority.
    -   `Semaphore2.java`: class to become familiar with resource access.
    -   `Semaphore3.java`: class to become familiar with in order execution.
    -   `ProducerConsumer.java`: class implementing the
        producer-consumer paradigm using semaphores.

Note: Spanish versions of some classes have been included. These files
may be removed or ignored during the development of the practice.

------------------------------------------------------------------------

## 8. What you need to implement

In this practice, you must follow the instructions provided in the
associated presentation.

### 8.1. Modifying class parameters

Some of the provided classes are fully functional. However, the
presentation proposes small modifications that will help you better
understand how semaphores work.

### 8.2. Implementing the classes

Some functions are incomplete. You will need to complete the missing
code according to the comments in the source files and the presentation
guidelines.

------------------------------------------------------------------------

## 10. How to compile and run

### Compile with Maven (from IntelliJ)

1.  Open: **View → Tool Windows → Maven**.
2.  In the Maven tree, expand **Lifecycle**.
3.  Run **package** (or **compile**).

### Run Main

-   In IntelliJ, run `Main` directly as a Java application, specifying
    which class you want to create and test.

Alternative (only if needed): run from the console using:

``` powershell
java -cp "target/classes" Main
```

------------------------------------------------------------------------

## 11. How this practice is evaluated (criteria)

This practice **IS NOT GRADED**, but it will help you prepare for the
next practice, which will be graded. Additionally, the results obtained
may be subject to evaluation in the test the following week.

------------------------------------------------------------------------

Good luck with the practice!
