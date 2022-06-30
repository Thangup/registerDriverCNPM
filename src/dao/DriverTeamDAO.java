package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DriverTeam;

public class DriverTeamDAO extends DAO{

    public DriverTeamDAO() {
        super();
    }
    
    public void getDriverTeamid(DriverTeam dt){
        String sql = "SELECT tbldriverteam.id FROM tbldriverteam, tbldriver, tblteam WHERE tbldriver.id = ? AND tblteam.id = ? AND tbldriver.id = tbldriverteam.driverid AND tblteam.id = tbldriverteam.teamid";
        try {          
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dt.getDriver().getId());
            ps.setInt(2, dt.getTeam().getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dt.setId(rs.getInt("tbldriverteam.id"));
            }
            }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
