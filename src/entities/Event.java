package entities;

import org.hibernate.Session;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@NamedQueries({@NamedQuery(name = "Event.findById", query = "select eventObj from Event eventObj where eventObj.eventId=: id" )})
@Entity
public class Event implements Serializable {

    @OneToMany
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int eventId;
    private Date startDate;
    private Date endDate;
    private String location;
    private int groupListId;
    private Leader leaderId;

    public Event(Date startDate, Date endDate, String location, int groupListId, Leader leaderId ) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.groupListId = groupListId;
        this.leaderId = leaderId;
    }


    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(int groupListId) {
        this.groupListId = groupListId;
    }

    public Leader getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Leader leaderId) {
        this.leaderId = leaderId;
    }

    public Event() {

    }


}
