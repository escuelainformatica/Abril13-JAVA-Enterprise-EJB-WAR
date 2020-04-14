# Abril13
Clase de Abril 13

![](https://github.com/jorgecc/Abril3/raw/master/form1.jpg)

Vamos a crear una aplicación empresarial.

Para ello necesitamos Glassfish instalado.

Vamos a configurar lo siguiente:

Web.xml 3.1   Como se muestra las pagina web. JSF (Java Service Face), CDI 

ejb.xml 3.2   Configurar la versión correcto.

persistence.xml 2.1  Conecta a la base de datos. Spring boot, el equivalente es **application. properties**


* EAR = Enterprise Archiver.   
   * EAR = Une el proyecto EJB y el proyecto WAR.  

* EJB (tiene extension JAR).  Aqui van las clases llamadas EJB.
   * Las clases EJB tambien se llaman Enterprise Java Bean.
   * EJB = Singleton, Stateful, Stateless, WebService, etc.
   * EJB = Stateless (no mantiene estado).   
   * El equivalente de EJB en spring boot son los Crud, service, component, etc.

* WAR
   * Tiene el codigo de JAVA que se conecta a las paginas web.
        * Servlet (tecnologia vieja)
        * Bean Manejado (ManagedBean Tecnologia vieja)
        * Bean Manejado (CDI)
   * Tiene las paginas web.
        * HTML
        * JSP (anticuado)
        * JSF Java Service Face.
   

![](https://www.arquitecturajava.com/wp-content/uploads/EJBinWAR.jpg)

## Configurar Glassfish

En la carpeta C:\glassfish5\glassfish\domains\domain1\lib

copiar el jdbc del driver que necesitamos usar mysql-connector-java-8.0.19.jar

 Ir a la pagina de administracion de glassfish

http://localhost:4848/

## Tecnologia JSF Java Service Faces y CDI

Cliente -> JSF (xhtml) -> Bean Manejado (Class)

MVC (Spring Boot)

Cliente -> Clase -> html.

* CDI Scope (alcance)

  * RequestScoped (dura mientras se mantenga el navegador en su misma pagina)

    * Formulario!

  * ViewScoped (mantiene los datos, mientras se estan viendo)

    * Paginas de solo visualizacion, datos que solo quiero mostrar y no mantener datos.

  * SessionScoped (Se mantiene vivo mientras se mantiene la sesion)

    * Utilizado para paginas login

  * ApplicationScoped (Se mantiene vivo los datos mientras la aplicacion este viva. Estos datos los ven todos los usuarios y solo se pierde cuando se reiniciar el servidor)

    * 

    



 