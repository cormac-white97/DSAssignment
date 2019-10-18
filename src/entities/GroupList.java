package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class GroupList implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int groupId;
    private String groupName;


    @OneToMany(mappedBy = "groupEventId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Event> event;

    public GroupList(String s) {
        this.groupName = s;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
