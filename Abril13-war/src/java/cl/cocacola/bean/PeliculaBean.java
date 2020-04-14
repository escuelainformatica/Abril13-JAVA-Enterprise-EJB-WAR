
package cl.cocacola.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

// Bean Manejado usando tecnologia CDI

// 1) En el modulo WAR.
// 2) Tienen la anotacion @Named
// 3) Tienen que tener un scope o alcance.

@Named
@RequestScoped // <-- esto es importante, es la vida util de esta clase
public class PeliculaBean {
    
    private String ejemplo="hola mundo";

    
    
    /**
     * @return the ejemplo
     */
    public String getEjemplo() {
        return ejemplo;
    }

    /**
     * @param ejemplo the ejemplo to set
     */
    public void setEjemplo(String ejemplo) {
        this.ejemplo = ejemplo;
    }
    
    
    
    
}
