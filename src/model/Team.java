package model;
import java.io.Serializable;
public class Team implements Serializable{
    private int id;
    private String name;
    private int numberOff;

    public Team() {
        
    }

    public Team(String name, int numberOff) {
        super();
        this.name = name;
        this.numberOff = numberOff;
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

    public int getNumberOff() {
        return numberOff;
    }

    public void setNumberOff(int numberOff) {
        this.numberOff = numberOff;
    }
    
    
}
