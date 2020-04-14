
package cl.cocacola.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped // <-- la vida util de este objeto va a durar mientras se llame a si mismo
public class BeanRequerimiento {
    
    private String texto;

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
