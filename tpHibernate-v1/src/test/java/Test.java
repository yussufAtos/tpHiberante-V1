

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bean.Product;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UP_CAT");    
	    EntityManager em = emf.createEntityManager();    
	    EntityTransaction transac = em.getTransaction();
	    transac.begin();
	    Product product = new Product();
	    product.setId(4);
	    product.setNom("ALPHA");
	    product.setPrenom("HELLO");
	   
	    em.merge(product);
	    transac.commit();
	    
	    em.close();    
	    emf.close(); 
	
		
		
	
	
	}

}