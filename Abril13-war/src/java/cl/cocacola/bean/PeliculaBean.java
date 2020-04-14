
package cl.cocacola.bean;

import cl.cocacola.ejb.PeliculaEJB;
import cl.cocacola.entidades.Pelicula;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
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

    @EJB // inyectado el ejb (@Autowired)
    private PeliculaEJB peliculaEJB;
    
    private List<Pelicula> peliculas;
    
    
    @PostConstruct // <-- cuando se crea el bean, se carga esta funcion
    public void inicio() {
        // todo lo que tengo que cargar cuando se carga esta clase
        peliculas=peliculaEJB.listar();
    }
    
    
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

    /**
     * @return the peliculas
     */
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    /**
     * @param peliculas the peliculas to set
     */
    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    
    
}
