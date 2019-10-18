package entities;

import org.jetbrains.annotations.Contract;

import javax.persistence.*;

@Entity
public class Leader {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int leaderId;
    private String leaderFirstName;
    private String leaderLastName;
    private int leaderAge;
    private String email;

    @Contract(pure = true)
    public Leader(String leaderFirstName, String leaderLastName, int leaderAge, String email) {
        this.leaderFirstName = leaderFirstName;
        this.leaderLastName = leaderLastName;
        this.leaderAge = leaderAge;
        this.email = email;
    }
    @OneToMany
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
