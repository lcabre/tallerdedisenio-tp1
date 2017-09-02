package ar.edu.unlam.ejercicio1;

import ar.edu.unlam.ejercicio1.modelo.Producto;
import ar.edu.unlam.tallerweb1.SpringTest;
import org.hibernate.criterion.Restrictions;
import org.hsqldb.Session;
import org.junit.Test;
import org.mockito.internal.matchers.Equals;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Test1 extends SpringTest{
    @Test
    @Transactional
    @Rollback()
    public void productosMenoresAMil(){
        Producto prod1 = new Producto();
        prod1.setCantidad(10);
        prod1.setDescripcion("Zapatos");
        prod1.setTitulo("zapato loco");
        prod1.setPrecio(1000.2f);
        getSession().save(prod1);

        Producto prod2 = new Producto();
        prod2.setCantidad(10);
        prod2.setDescripcion("Zapatos");
        prod2.setTitulo("zapato loco");
        prod2.setPrecio(2000f);
        getSession().save(prod2);

        Producto prod3 = new Producto();
        prod3.setCantidad(10);
        prod3.setDescripcion("Zapatos");
        prod3.setTitulo("zapato loco");
        prod3.setPrecio(1.0f);
        getSession().save(prod3);

        Producto prod4 = new Producto();
        prod4.setCantidad(10);
        prod4.setDescripcion("Zapatos");
        prod4.setTitulo("zapato loco");
        prod4.setPrecio(1.0f);
        getSession().save(prod4);

        List <Producto> productos = getSession().createCriteria(Producto.class)
                .add(Restrictions.lt("precio",1000f)).list();

        assertThat(productos.size(), is(2));
        assertThat(productos.get(0).getPrecio(), lessThan(1000f));
    }
}