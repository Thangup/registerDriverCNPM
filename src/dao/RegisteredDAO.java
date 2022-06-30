package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Registered;
public class RegisteredDAO extends DAO{

    public RegisteredDAO() {
        super();
    }
    
    public void registerDriver(Registered r){
        String sql = "INSERT INTO tblRegistered(registeredDate, driverteamid, stageid) VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, new java.sql.Date(System.currentTimeMillis()));
            ps.setInt(2, r.getDriverteam().getId());
            ps.setInt(3, r.getStage().getId());
            ps.executeUpdate();
            ResultSet generatedKeys= ps.getGeneratedKeys();
            if(generatedKeys.next()){
                r.setId(generatedKeys.getInt(1)); 
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
