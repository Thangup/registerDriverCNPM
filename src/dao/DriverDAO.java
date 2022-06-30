/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Driver;
/**
 *
 * @author long
 */
public class DriverDAO extends DAO{
    public DriverDAO() {
        super();
    }
    
    public ArrayList<Driver> getDriverList(String teamName){
        ArrayList<Driver> result = new ArrayList<Driver>();
        String sql = "SELECT tbldriver.id, tbldriver.name FROM tbldriver INNER JOIN tbldriverteam ON tbldriver.id = tbldriverteam.driverid INNER JOIN tblteam ON tbldriverteam.teamid = tblteam.id WHERE tblteam.name LIKE ?";  
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, teamName);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Driver d = new Driver();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                result.add(d);
            }           
        }catch(Exception e){
            e.printStackTrace();
        }       
        return result;
    }
}
