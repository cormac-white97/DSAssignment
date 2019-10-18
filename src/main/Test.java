package main;

import dao.DAO;
import entities.Event;
import entities.Leader;
import entities.Scout;

import java.util.Date;

public class Test {
	
	public Test() {
		DAO dao = new DAO();

		Date sDate = new Date(2020, 2, 5);
		Date eDate = new Date(2020, 2, 23);

		Leader leader = new Leader("Cormac", "White", 22, "cormac.white@gmail.com");
		//Event  event = new Event(sDate , eDate, "Kerry", 300, leader);
		//Scout scout = new Scout("John", "Doe", 16, event);


		dao.persistObject(leader);
		//dao.persistObject(event);
		//dao.persistObject(scout);
		//dao.removeObject(dao.findEventById(3));
	}

	public static void main(String[] args) {
		new Test();
	}
}
