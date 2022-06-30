package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Stage;

public class StageDAO extends DAO{

    public StageDAO() {
        super();
    }
    
    public ArrayList<Stage> getStageList(){
        ArrayList<Stage> result = new ArrayList<Stage>();
        String sql = "SELECT id, name FROM tblstage";        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Stage s = new Stage();
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
