

import models.City;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Ronja on 2018-11-30.
 */
public class Main {


    public static void main(String[] args) {

        findCity("Los Angeles");

    }

    public static void findCity(String name) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("world");
        EntityManager em = factory.createEntityManager();
        Query query =
                em.createQuery("SELECT c from City c where c.name = :name");
        query.setParameter("name", name);
        List<City> cities = query.getResultList();
        System.out.printf("Found %d matches for %s\n", cities.size(), name);
        for (City c : cities) System.out.println(c);
    }
}
