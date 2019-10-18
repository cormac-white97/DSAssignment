package entities;

import javax.persistence.*;

@Entity
public class GearList {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int gearListId;
    String gearType;
    @OneToOne(mappedBy = "gearList", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    Event eventGearList = new Event();

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
