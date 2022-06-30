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
import model.Team;

/**
 *
 * @author long
 */
public class TeamDAO extends DAO{
    public TeamDAO() {
        super();
    }
    
    public ArrayList<Team> getTeamList(){
        ArrayList<Team> result = new ArrayList<Team>();
        String sql = "SELECT id, name FROM tblteam";        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Team s = new Team();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                result.add(s);
            }           
        }catch(Exception e) {
            e.printStackTrace();
        }       
        return result;
    }
}
