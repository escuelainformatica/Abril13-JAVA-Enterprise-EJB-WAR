
package cl.cocacola.ejb;

import cl.cocacola.entidades.Pelicula;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/*
    1) Clases EJB tienen que esta en el modulo EJB
    2) Clases EJB tienen que tener la anotacion EJB @Stateless
    3) Clases EJB tienen que tener metodos publicos.
    4) Las clases EJB tienen que ser publicas.
*/


@Stateless
public class PeliculaEJB {
    
    // Spring boot: Creaba una interface y extender la interface usando CrudRepository
    
    // 1) Inyectar Entity Manager (entity manager lo maneja el servidor web, glassfish)
    
    @PersistenceContext(unitName = "mipersistencia-PU")
    private EntityManager em;
    
    
    // 2) Utilizar
    
    
    public List<Pelicula> listar() {
        // import javax.persistence.Query;
        Query query=em.createQuery("select p from Pelicula p");
        
        return query.getResultList();
    }
    
    
    
    
    
    
}
