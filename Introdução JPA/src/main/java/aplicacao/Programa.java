package aplicacao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(null,"Carlos da Silva", "carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null,"Joaquim Torres", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null,"Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//inserir dados
		//em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit();
		
		//recuperar dados existentes
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
		
		//apagar um dado existente (monitorado)
		//Pessoa p1 = em.find(Pessoa.class, 2);
		//em.getTransaction().begin();
		//em.remove(p1);
		//em.getTransaction().commit();
		
		//atualizar um dado existente
		Pessoa p = em.find(Pessoa.class, 3);
		em.getTransaction().begin();
		p.setNome("Joaquim Torres Atualizado");
		p.setEmail("joaquim.novo@gmail.com");
		em.getTransaction().commit();
		
		
		
		System.out.println("Pronto");
		em.close();
		emf.close();
		
	}

}
