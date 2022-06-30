package model;
import java.io.Serializable;
import java.util.Date;
public class Stage implements Serializable{
    private int id;
    private String name;
    private Date raceDate;

    public Stage() {
        
    }

    public Stage(String name, Date raceDate) {
        super();
        this.name = name;
        this.raceDate = raceDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(Date raceDate) {
        this.raceDate = raceDate;
    }
    
    
}
