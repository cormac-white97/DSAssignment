package entities;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Leader {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int leaderId = 0;
    String leaderFirstName;
    String leaderLastName;
    int leaderAge;
    String email;

    public Leader(String leaderFirstName, String leaderLastName, int leaderAge, String email) {
        this.leaderFirstName = leaderFirstName;
        this.leaderLastName = leaderLastName;
        this.leaderAge = leaderAge;
        this.email = email;
    }
    public int getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(int leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderFirstName() {
        return leaderFirstName;
    }

    public void setLeaderFirstName(String leaderFirstName) {
        this.leaderFirstName = leaderFirstName;
    }

    public String getLeaderLastName() {
        return leaderLastName;
    }

    public void setLeaderLastName(String leaderLastName) {
        this.leaderLastName = leaderLastName;
    }

    public int getLeaderAge() {
        return leaderAge;
    }

    public void setLeaderAge(int leaderAge) {
        this.leaderAge = leaderAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
