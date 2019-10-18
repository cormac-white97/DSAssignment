/*
package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
//@NamedQueries({@NamedQuery(name = "Scout.findById", query = "select scoutObj from Event scoutObj where scoutObj.scoutId=: id" )})
public class Scout {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int scoutId;
    String scoutFirstname;
    String scoutLastName;
    int age;
    @JoinTable(name="CUSTOMER_SALE",joinColumns=@JoinColumn( name="event",referencedColumnName="eventId"),inverseJoinColumns=@JoinColumn(name="eventId", referencedColumnName="event"))
    Event event;
    //Set<Event> e;
   // @ManyToMany(targetEntity = Event.class)
    //public Collection<Event> getE() {
    //    return e;
    //}

    //public void setE(Set<Event> e) {
    //    this.e = e;
    //}

    public Scout(String scoutFirstname, String scoutLastName, int age, Event event) {
        this.scoutFirstname = scoutFirstname;
        this.scoutLastName = scoutLastName;
        this.age = age;
        this.event = event;
    }


//@Access(AccessType.PROPERTY)

    public int getScoutId() {
        return scoutId;
    }

    public void setScoutId(int scoutId) {
        this.scoutId = scoutId;
    }

    public String getScoutFirstname() {
        return scoutFirstname;
    }

    public void setScoutFirstname(String scoutFirstname) {
        this.scoutFirstname = scoutFirstname;
    }

    public String getScoutLastName() {
        return scoutLastName;
    }

    public void setScoutLastName(String scoutLastName) {
        this.scoutLastName = scoutLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}*/
