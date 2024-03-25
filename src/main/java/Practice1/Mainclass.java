package Practice1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Need");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Chandru chandru = new Chandru();
		chandru.setId(8);
		chandru.setName("garudaaaa");
		chandru.setSal(14000.0);
		entityTransaction.begin();
		entityManager.persist(chandru);
		entityTransaction.commit();
//		
//		Chandru chandru=entityManager.find(Chandru.class,5);
//		chandru.setName("Rocky Tamma");
//         entityTransaction.begin();
//         entityManager.merge(chandru);
//         entityTransaction.commit();

//		Chandru chandru=entityManager.find(Chandru.class,6);
//		entityTransaction.begin();
//		entityManager.remove(chandru);
//		entityTransaction.commit();

//		Query query = entityManager.createQuery("select r from Chadru r");
//		List<Chandru> a = query.getResultList();
//		for (Object z : a) {
//            System.out.println(z);
//		}
	}
}
