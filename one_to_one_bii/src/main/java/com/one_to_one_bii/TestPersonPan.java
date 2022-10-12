package com.one_to_one_bii;



	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;



	public class TestPersonPan
	{
		public static void main(String[] args)
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("deepika");
			EntityManager entityManager =entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			Pan pan=new Pan();
			pan.setPname("suma shetty");
			
			
			
			Person p=new Person();
			p.setAge(21);
			p.setName("suma");
			p.setPhone(63773738l);
			p.setPhone(6786679l);
			p.setAge(56);
			p.setPan(pan);
			pan.setPerson(p);
			
			
			
			
			entityTransaction.begin();
			entityManager.persist(pan);
			entityManager.persist(p);
			entityTransaction.commit();
		}

	
	}


