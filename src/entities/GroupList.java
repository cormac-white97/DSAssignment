package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@NamedQueries({@NamedQuery(name = "GroupList.findGroupById", query = "select groupObj from GroupList groupObj where groupObj.groupId=: id"),
        @NamedQuery(name = "GroupList.getAllGroups", query = "FROM GroupList")
})

@Entity
public class GroupList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private String groupName;


    @OneToMany(mappedBy = "groupEventId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Event> event;

    public GroupList() {

    }

    @Override
    public String toString() {
        return "GroupList{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", event=" + event +
                '}';
    }

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
