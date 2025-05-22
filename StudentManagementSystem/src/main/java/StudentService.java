import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class StudentService implements menuService<students> {
    @Override
    public void insert(students item) {
        String sql = "INSERT INTO students(first_name,last_name,email,date_of_birth) VALUES(?,?,?,CAST(? AS DATE))";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setString(1, item.getFirst_name());
            PS.setString(2, item.getLast_name());
            PS.setString(3, item.getEmail());
            PS.setString(4, item.getDate_of_birth());
            PS.executeUpdate();
            System.out.println("addStudent:student added" + "student added successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void read(int id) {
        String sql = "select * from students where id = ?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement PS = conn.prepareStatement(sql)){
           PS.setInt(1, id);
           ResultSet rs = PS.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " " +
                        rs.getString("last_name") + " " +
                        rs.getString("email"));


            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }


    }

    @Override
    public List<students> readAll() {
        List<students> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try(Connection conn = DBConnection.getConnection();
            Statement PS = conn.createStatement();
            ResultSet rs = PS.executeQuery(sql)){
                while (rs.next()) {
                    students.add(new students(rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("email"),
                            rs.getString("date_of_birth")));


                }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return students;
//
    }


    @Override
    public void update(students item) {
        String sql = "UPDATE students SET first_name =?,last_name =?,email =?,date_of_birth =? WHERE id =?";
        try(Connection conn = DBConnection.getConnection();
        PreparedStatement PS = conn.prepareStatement(sql )){
            PS.setString(1, item.getFirst_name());
            PS.setString(2, item.getLast_name());
            PS.setString(3, item.getEmail());
            PS.setString(4, item.getDate_of_birth());
            PS.executeUpdate();
            System.out.println("updateStudent:student updated" + "student updated successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
    }

    }

    @Override
    public void delete(int id) {
                String sql = "DELETE FROM students WHERE id =?";
        try(Connection conn = DBConnection.getConnection();
        PreparedStatement PS = conn.prepareStatement(sql)){
            PS.setInt(1,id);
            PS.executeUpdate();
            System.out.println("deleteStudent:student deleted" + "student deleted successfully");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
