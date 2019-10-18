package dao;

import entities.Event;

import javax.persistence.*;

public class DAO {

	protected static EntityManagerFactory emf = Persistence.createEntityManagerFactory("cormacsPersistenceUnit");

    public Event findEventById(int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Event event = (Event) em.createNamedQuery("Event.findById").setParameter("id", id).getSingleResult();
        return event;
    }

    public Event getAllEvents(){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Event event = (Event) em.createNamedQuery("SELECT * FROM Event").getSingleResult();
		return event;
	}

/*    public Scout findScoutById(int id){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Scout scout = (Scout) em.createNamedQuery("Scout.findById").setParameter("id", id).getSingleResult();
		return scout;
	}*/
	public DAO(){

	}

	public void persistObject(Object o ) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}

	public void mergeObject(Object o ) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(o);
		em.getTransaction().commit();
		em.close();
	}

	public void removeObject(Object o ) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(o));
		em.getTransaction().commit();
		em.close();
	}


}
