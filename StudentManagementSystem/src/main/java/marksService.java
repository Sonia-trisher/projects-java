import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class marksService implements menuService<marks> {



    @Override
    public void insert(marks item) {
        String sql = "INSERT INTO marks(student_id,course_id,marks) VALUES(?,?,?)";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setInt(1,item.getStudent_id());
            PS.setInt(2,item.getCourse_id());
            PS.setFloat(3,item.getMarks());

            PS.executeUpdate();
            System.out.println("addMarks:marks added" + "marks added successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void read(int id) {
        String query = "select * from marks where student_id = ?";
        try(Connection conn =DBConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt("marks") + " " +
                        rs.getString("courses_id") + " " +
                        rs.getString("students_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public List<marks> readAll() {
        List<marks> marks = new ArrayList<>();
        String sql = "SELECT * FROM marks";

        try(Connection conn = DBConnection.getConnection();
            Statement PS = conn.createStatement();
            ResultSet rs = PS.executeQuery(sql)){
            while (rs.next()) {
                marks.add(new marks(rs.getInt("marks"),
                        rs.getInt("course_id"),
                        rs.getInt("student_id")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return marks;
    }

    @Override
    public void update(marks item) {

        String sql = "UPDATE students SET student_id =?,cources_id =?,marks =? WHERE id =?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql )){
            PS.setInt(1,item.getStudent_id());
            PS.setInt(2,item.getCourse_id());
            PS.setFloat(3,item.getMarks());
            PS.executeUpdate();
            System.out.println("updateMarks:  marks updated" + "marks updated successfully");

        }catch(SQLException e){
            System.out.println("updateMarks:  marks update failed");
        }

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM marks WHERE id =?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setInt(1,id);
            PS.executeUpdate();
            System.out.println("deleteMarks:marks deleted" + "marks deleted successfully");

        }catch (SQLException e){
            System.out.println("deleteMarks:delete failed");
        }

    }
}
