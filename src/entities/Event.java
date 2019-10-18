package entities;

import javax.persistence.*;
import java.util.Date;
import javax.persistence.Id;

@NamedQueries({@NamedQuery(name = "Event.findById", query = "select eventObj from Event eventObj where eventObj.eventId=: id" )})
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int eventId;
    @Column(name ="start_date")
    Date startDate;
    @Column(name = "end_date")
    Date endDate;
    @Column(name = "location")
    String location;
    @Column(name = "group_list_id")
    int groupListId;
    Scout scoutId;
    //@Column(name = "organized_by")
    //@JoinColumn(name="leaderId")
    //Leader leaderId;

    public Event(Date startDate, Date endDate, String location, int groupListId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.groupListId = groupListId;
        //this.leaderId = leaderId;
    }
   // @Access(AccessType.PROPERTY)
    @OneToMany(mappedBy = "eventId")


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

    //public Leader getLeaderId() {
    //    return leaderId;
   // }

    //public void setLeaderId(Leader leaderId) {
    //    this.leaderId = leaderId;
   // }
}
