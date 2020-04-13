# Abril13
Clase de Abril 13

![](https://github.com/jorgecc/Abril3/raw/master/form1.jpg)

Vamos a crear una aplicacion empresarial.

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


​        

   
