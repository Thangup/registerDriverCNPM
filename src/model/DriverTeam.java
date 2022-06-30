package model;
import java.io.Serializable;
import java.util.Date;
public class DriverTeam implements Serializable{
    private int id;
    private Date joinTime;
    private Date leaveTime;
    private Driver driver;
    private Team team;
    public DriverTeam() {
        
    }

    public DriverTeam(Date joinTime, Date leaveTime, Driver driver, Team team) {
        super();
        this.driver = driver;
        this.team = team;
        this.joinTime = joinTime;
        this.leaveTime = leaveTime;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    
}
