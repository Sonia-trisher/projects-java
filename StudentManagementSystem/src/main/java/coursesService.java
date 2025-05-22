import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class coursesService implements menuService<courses>{

    @Override
    public  void insert(courses item) {
        String sql = "INSERT INTO courses(course_name,course_description) VALUES(?,?)";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setString(1,item.getCourse_name());
            PS.setString(2,item.getCourse_description());
            PS.executeUpdate();
            System.out.println("Course added successfully" + item.getCourse_name());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void read(int id) {
        String sql = "select * from courses where id = ?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setInt(1, id);
            ResultSet rs = PS.executeQuery();
            while(rs.next()) {
                System.out.println( rs.getString("course_name") + " " + rs.getString("course_description"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<courses> readAll() {
        List<courses> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses";

        try(Connection conn = DBConnection.getConnection();
            Statement PS = conn.createStatement();
            ResultSet rs = PS.executeQuery(sql)){
            while (rs.next()) {
                courses.add(new courses( rs.getString("course_name"), rs.getString("course_description")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return courses;


    }

    @Override
    public void update(courses item) {
        String sql = "UPDATE courses SET course_name = ?,course_description = ? WHERE id = ?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql )){
            PS.setString(1,item.getCourse_name());
            PS.setString(2, item.getCourse_description());
            PS.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM courses WHERE id =?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setInt(1,id);
            PS.executeUpdate();
            System.out.println("Course deleted successfully" + id);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
