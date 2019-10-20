package entities;

import javax.persistence.*;
@NamedQueries({@NamedQuery(name = "GearList.findListById", query = "select gearListObj from GearList gearListObj where gearListObj.gearListId=: id"),
        @NamedQuery(name = "GearList.getAllGear", query = "FROM GearList")
})

@Entity
public class GearList {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int gearListId;
    String gearType;
    @OneToOne(mappedBy = "gearList", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    Event eventGearList = new Event();

    @Override
    public String toString() {
        return "GearList{" +
                "gearListId=" + gearListId +
                ", gearType='" + gearType + '\'' +
                ", eventGearList=" + eventGearList +
                '}';
    }

    public GearList(){

    }

    public GearList(String gearType) {
        this.gearType = gearType;
    }

    public int getGearListId() {
        return gearListId;
    }

    public void setGearListId(int gearListId) {
        this.gearListId = gearListId;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }
}
