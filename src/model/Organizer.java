package model;
import java.io.Serializable;
public class Organizer  implements Serializable{
    private int id;
    private String username;
    private String password; 
    public Organizer() {
        
    } 
    public Organizer(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganizername() {
        return username;
    }

    public void setOrganizername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

