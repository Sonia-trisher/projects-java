import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class marksService {
    public void addMarks(int student_id, int course_id,float marks) {
        String sql = "INSERT INTO marks(student_id,course_id,marks) VALUES(?,?,?,?)";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setInt(1,student_id);
            PS.setInt(2,course_id);
            PS.setFloat(3,marks);

            PS.executeUpdate();
            System.out.println("addMarks:marks added" + "marks added successfully");

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public List<String> getAllMarks(){
        List<String> marks = new ArrayList<>();
        String sql = "SELECT * FROM marks";

        try(Connection conn = DBConnection.getConnection();
            Statement PS = conn.createStatement();
            ResultSet rs = PS.executeQuery(sql)){
            while (rs.next()) {
                marks.add(rs.getInt("student_id") + " " +
                        rs.getInt("course_id") + " " +
                        rs.getString("marks"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return marks;
    }
    public void updateMarks(int student_id, int course_id,float marks) {
        String sql = "UPDATE students SET student_id =?,cources_id =?,marks =? WHERE id =?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql )){
            PS.setInt(1,student_id);
            PS.setInt(2,course_id);
            PS.setFloat(3,marks);
            PS.executeUpdate();
            System.out.println("updateMarks:  marks updated" + "marks updated successfully");

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public void deleteMarks(int id){
        String sql = "DELETE FROM marks WHERE id =?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setInt(1,id);
            PS.executeUpdate();
            System.out.println("deleteMarks:marks deleted" + "marks deleted successfully");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
