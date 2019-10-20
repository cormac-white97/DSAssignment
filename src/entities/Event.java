package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
@NamedQueries({@NamedQuery(name = "Event.findById", query = "select eventObj from Event eventObj where eventObj.eventId=: id"),
        @NamedQuery(name = "Event.getAllEvents", query = "FROM Event")
})



@Entity
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int eventId;
    @Column(name = "start_date")
    Date startDate;
    @Column(name = "end_date")
    Date endDate;
    @Column(name = "location")
    String location;
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Leader.class)
    Leader leader;
    //Set<Scout> scout;
    @ManyToOne
    GroupList groupEventId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventGearList")
    GearList gearList;

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", location='" + location + '\'' +
                ", leader=" + leader.getLeaderId() +
                ", groupEventId=" + groupEventId.getGroupId() +
                ", gearList=" + gearList.getGearListId() +
                '}';
    }

    public Event(Date startDate, Date endDate, String location, Leader leader, GroupList groupEventId, GearList gearList) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.leader = leader;
        this.groupEventId = groupEventId;
        this.gearList = gearList;
    }
/* @ManyToMany(mappedBy = "event")
   public Set<Scout> getScout() {
        return scout;
    }

    public void setScout(Set<Scout> scout) {
        this.scout = scout;
    }*/

    public Event(){

    }



    // @Access(AccessType.PROPERTY)

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


    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }
}
