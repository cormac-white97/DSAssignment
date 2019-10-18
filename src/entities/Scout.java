package entities;

import javax.persistence.*;

@Entity
@NamedQueries({@NamedQuery(name = "Scout.findById", query = "select scoutObj from Event scoutObj where scoutObj.scoutId=: id" )})
public class Scout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "scout_Id",insertable = false, updatable = false)
    private int scoutId;
    String scoutFirstname;
    String scoutLastName;
    int age;
    @Column(name = "event_id")
    Event eventId;

    public Scout(String scoutFirstname, String scoutLastName, int age, Event eventId) {
        this.scoutFirstname = scoutFirstname;
        this.scoutLastName = scoutLastName;
        this.age = age;
        this.eventId = eventId;
    }

    //@Access(AccessType.PROPERTY)
    @ManyToMany(mappedBy = "scoutId")
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

    public Event getEventId() {
        return eventId;
    }

    public void setEventId(Event eventId) {
        this.eventId = eventId;
    }
}
