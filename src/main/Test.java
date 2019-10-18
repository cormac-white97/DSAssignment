package main;

import dao.DAO;
import entities.Event;
import entities.GearList;
import entities.GroupList;
import entities.Leader;
//import entities.Scout;
import org.hibernate.Session;

import java.util.Date;

public class Test {
	
	public Test() {
		DAO dao = new DAO();

		Date sDate = new Date(2020, 2, 5);
		Date eDate = new Date(2020, 2, 23);






		//Scout scout = new Scout("John", "Doe", 16, event);

		Leader leader = new Leader("Robbie", "O'Gara", 22, "ROB@gmail.com");
		dao.persistObject(leader);

		GearList gearList = new GearList("Camping");
		dao.persistObject(gearList);

		GroupList groupList = new GroupList("5th Wicklow, Bray");
		dao.persistObject(groupList);

		Event event = new Event(sDate,eDate,"Dublin",leader, groupList, gearList);
		dao.persistObject(event);

		//dao.persistObject(scout);
		//System.out.println(dao.getAllEvents());
	}

	public static void main(String[] args) {
		new Test();
	}
}
