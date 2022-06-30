package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Organizer;
 
public class OrganizerDAO extends DAO{
     
    public OrganizerDAO() {
        super();
    }
     
    public boolean checkLogin(Organizer organizer) {
        boolean result = false;
        String sql = "SELECT id FROM tblorganizer WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, organizer.getOrganizername());
            ps.setString(2, organizer.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                
                organizer.setId(rs.getInt("id"));              
                result = true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}