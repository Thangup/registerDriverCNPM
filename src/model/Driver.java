package model;
import java.io.Serializable;
import java.util.Date;
public class Driver implements Serializable{
    private int id;
    private String name;
    private String nationality;
    private Date dateOfBirth;

    public Driver() {
        
    }
     
    public Driver(String name, String nationality, Date dateOfBirth) {
        super();
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
}
