Proyecto Centro Educativo

Este proyecto es una aplicación desarrollada en Java que utiliza JPA (Java Persistence API) para gestionar la información de un centro educativo.

Requisitos previos

Antes de comenzar, asegúrese de tener instalado:

Java Development Kit (JDK) versión 11 o superior.

Apache Maven para la gestión de dependencias y construcción del proyecto.

Un entorno de desarrollo integrado (IDE) compatible con proyectos Maven, como Eclipse o IntelliJ IDEA.

Instalación

Clonar el repositorio:

git clone https://github.com/arroyosergi3/20240418-JPA-CentroEducativo.git

Importar el proyecto en su IDE:

Si utiliza Eclipse:

Seleccione File > Import > Existing Maven Projects.

Navegue hasta el directorio del proyecto clonado y haga clic en Finish.

Si utiliza IntelliJ IDEA:

Seleccione File > Open.

Navegue hasta el archivo pom.xml en el directorio del proyecto clonado y haga clic en Open as Project.

Construir el proyecto con Maven:

mvn clean install

Ejecución

Para ejecutar la aplicación desde su IDE:

Localice la clase principal que contiene el método main.

Ejecute esta clase como una aplicación Java.

Estructura del Proyecto

La estructura básica del proyecto es la siguiente:

20240418-JPA-CentroEducativo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ejemplo/
│   │   │           └── centroeducativo/
│   │   │               ├── MainApplication.java
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               └── service/
│   │   └── resources/
│   │       ├── META-INF/
│   │       │   └── persistence.xml
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── ejemplo/
│                   └── centroeducativo/
├── .gitignore
├── .project
├── .classpath
├── pom.xml
└── README.md

model/: Contiene las clases que representan las entidades del dominio.

repository/: Incluye las interfaces para la interacción con la base de datos utilizando JPA.

service/: Contiene la lógica de negocio de la aplicación.

resources/: Contiene archivos de configuración, como persistence.xml para la configuración de JPA y application.properties para otras configuraciones.

Configuración de la Base de Datos

Asegúrese de configurar correctamente la conexión a la base de datos en el archivo persistence.xml, ubicado en src/main/resources/META-INF/. Actualice las propiedades javax.persistence.jdbc.url, javax.persistence.jdbc.user, y javax.persistence.jdbc.password con los valores correspondientes a su entorno de base de datos.

Contribuciones

Las contribuciones son bienvenidas. Para ello:

Haga un fork del proyecto.

Cree una nueva rama (git checkout -b feature/nueva-funcionalidad).

Realice sus cambios y haga commit de los mismos (git commit -am 'Añadir nueva funcionalidad').

Empuje su rama al repositorio remoto (git push origin feature/nueva-funcionalidad).

Cree un Pull Request.

Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulte el archivo LICENSE para más detalles.

