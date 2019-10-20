package dao;

import entities.Event;
import entities.GearList;
import entities.GroupList;
import entities.Leader;
import javafx.scene.Group;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {

	protected static EntityManagerFactory emf = Persistence.createEntityManagerFactory("cormacsPersistenceUnit");

    public Event findEventById(int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Event event = (Event) em.createNamedQuery("Event.findById").setParameter("id", id).getSingleResult();
        return event;
    }

    public GearList findGearById(int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        GearList gearList = (GearList) em.createNamedQuery("GearList.findListById").setParameter("id", id).getSingleResult();
        return gearList;
    }

    public GroupList findGroupListById(int id){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		GroupList group = (GroupList) em.createNamedQuery("GroupList.findGroupById").setParameter("id", id).getSingleResult();
		return group;
	}

    public Leader findLeaderById(int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Leader leader = (Leader) em.createNamedQuery("Leader.findLeaderById").setParameter("id", id).getSingleResult();
        return leader;
    }

    public List<Event> getAllEvents(){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query qry=em.createQuery("from  Event");
		List<Event> user=(List<Event>) qry.getResultList();
		em.getTransaction().commit();

		List<Event> list = qry.getResultList();
		for(Event event: list) {
			System.out.println(event.toString());
		}
		em.close();
		return list;
	}

	public List<Leader> getAllLeaders(){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query qry=em.createQuery("from  Leader");
		List<Leader> user=(List<Leader>) qry.getResultList();
		em.getTransaction().commit();

		List<Leader> list = qry.getResultList();
		for(Leader leader: list) {
			System.out.println(leader.toString());
		}
		em.close();
		return list;
	}

	public List<GroupList> getAllGroups(){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query qry=em.createQuery("from groupList");
		List<GroupList> user=(List<GroupList>) qry.getResultList();
		em.getTransaction().commit();

		List<GroupList> list = qry.getResultList();
		for(GroupList group: list) {
			System.out.println(group.toString());
		}
		em.close();
		return list;

	}

	public List<GearList> getAllGear(){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query qry=em.createQuery("from gearList");
		List<GearList> user=(List<GearList>) qry.getResultList();
		em.getTransaction().commit();

		List<GearList> list = qry.getResultList();
		for(GearList gear: list) {
			System.out.println(gear.toString());
		}
		em.close();
		return list;
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
