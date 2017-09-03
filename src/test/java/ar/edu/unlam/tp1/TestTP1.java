package ar.edu.unlam.tp1;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tp1.modelo.Barrio;
import ar.edu.unlam.tp1.modelo.Direccion;
import ar.edu.unlam.tp1.modelo.Farmacia;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestTP1 extends SpringTest {

    @Test
    @Transactional
    @Rollback()
    public void testQueBusqueTodasLasFarmaciasQueAtiendenLosMartes(){//Ejercicio 2
        Farmacia farmaciaLunes = new Farmacia("Farmacia atendemos los Lunes", "Lunes");
        getSession().save(farmaciaLunes);

        Farmacia farmaciaMartes = new Farmacia("Farmacia atendemos los martes", "Martes");
        getSession().save(farmaciaMartes);

        Farmacia farmaciaMiercoles = new Farmacia("Farmacia atendemos los miercoles", "Miercoles");
        getSession().save(farmaciaMiercoles);

        Farmacia farmaciaMartes2 = new Farmacia("Farmacia atendemos los jueves", "Martes");
        getSession().save(farmaciaMartes2);

        List <Farmacia> farmacias = getSession().createCriteria(Farmacia.class)
                .add(Restrictions.eq("diaDeTurno","Martes")).list();

        assertThat(farmacias.size(), is(2));
    }

    @Test
    @Transactional
    @Rollback()
    public void testQueBusqueTodasLasFarmaciasdeUnBarrio(){//Ejercicio 3
        Barrio barrio1 = new Barrio("Constitucion");
        getSession().save(barrio1);

        Barrio barrio2 = new Barrio("Recoleta");
        getSession().save(barrio2);

        Farmacia farmaciaLunes = new Farmacia("Farmacia atendemos los Lunes", "Lunes");
        getSession().save(farmaciaLunes);
        Direccion direccionFarmaciaLunes = new Direccion("Caseros", "100", barrio1);
        getSession().save(direccionFarmaciaLunes);
        farmaciaLunes.setDireccion(direccionFarmaciaLunes);

        Farmacia farmaciaMartes = new Farmacia("Farmacia atendemos los martes", "Martes");
        getSession().save(farmaciaMartes);
        Direccion direccionFarmaciaMartes = new Direccion("Maipu", "123", barrio1);
        getSession().save(direccionFarmaciaMartes);
        farmaciaMartes.setDireccion(direccionFarmaciaMartes);

        Farmacia farmaciaMiercoles = new Farmacia("Farmacia atendemos los miercoles", "Miercoles");
        getSession().save(farmaciaMiercoles);
        Direccion direccionFarmaciaMiercoles = new Direccion("Huergo", "542", barrio1);
        getSession().save(direccionFarmaciaMiercoles);
        farmaciaMiercoles.setDireccion(direccionFarmaciaMiercoles);

        Farmacia farmaciaMartes2 = new Farmacia("Farmacia atendemos los jueves", "Martes");
        getSession().save(farmaciaMartes2);
        Direccion direccionFarmaciaMartes2 = new Direccion("Pepe", "985", barrio2);
        getSession().save(direccionFarmaciaMartes2);
        farmaciaMartes2.setDireccion(direccionFarmaciaMartes2);

        List <Farmacia> farmacias = getSession().createCriteria(Farmacia.class)
                .createAlias("direccion", "dir")
                .createAlias("dir.barrio", "bar")
                .add(Restrictions.eq("bar.nombre","Constitucion")).list();

        assertThat(farmacias.size(), is(3));
        //assertThat(farmacias.get(0).getPrecio(), lessThan(1000f));
    }
}
