package com.one_to_one_bii;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPerson 
{
	public static void main(String[] args) 
	{

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("deepika");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, 1);
		
		if(person!=null)
		{
			System.out.println("Person id:"+person.getId());
			System.out.println("Person name:"+person.getName());
			System.out.println("Person age:"+person.getAge());
			System.out.println("Person phone:"+person.getPhone());
			Pan pan=person.getPan();
			if(pan!=null)
			{
				System.out.println("Pan Id :"+pan.getPid());
				System.out.println("Pan Name :"+pan.getPname());
				
			}
		else
			{
			System.out.println("no pan found this prson");
			}
		}
		else
		{
			System.out.println("no person found with given id");
		}
	}
}
