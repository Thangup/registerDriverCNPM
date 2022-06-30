package model;
import java.io.Serializable;
import java.util.Date;
import java.sql.Time;
public class Registered implements Serializable{
    private int id;
    private Date dayRegistered;
    private Time totalTime;
    private int completedLaps;
    private DriverTeam driverteam;
    private Stage stage;
    public Registered() {
        
    }

    public Registered(Date dayRegistered, Time totalTime, int completedLaps,DriverTeam driverteam, Stage stage) {
        super();
        this.dayRegistered = dayRegistered;
        this.totalTime = totalTime;
        this.completedLaps = completedLaps;
        this.driverteam = driverteam;
        this.stage = stage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDayRegistered() {
        return dayRegistered;
    }

    public void setDayRegistered(Date dayRegistered) {
        this.dayRegistered = dayRegistered;
    }

    public Time getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Time totalTime) {
        this.totalTime = totalTime;
    }

    public int getCompletedLaps() {
        return completedLaps;
    }

    public void setCompletedLaps(int completedLaps) {
        this.completedLaps = completedLaps;
    }

    public DriverTeam getDriverteam() {
        return driverteam;
    }
    
    public void setDriverteam(DriverTeam driverteam) {
        this.driverteam = driverteam;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    
}
