import java.sql.*;
import java.util.List;



public class StudentService implements menuService<students {
//    public void addStudent(String first_name, String last_name, String email, String date_of_birth) {
//     String sql = "INSERT INTO students(first_name,last_name,email,date_of_birth) VALUES(?,?,?,?)";
//
//     try(Connection conn = DBConnection.getConnection();
//     PreparedStatement PS = conn.prepareStatement(sql)){
//         PS.setString(1,first_name);
//         PS.setString(2,last_name);
//         PS.setString(3,email);
//         PS.setString(4,date_of_birth);
//         PS.executeUpdate();
//         System.out.println("addStudent:student added" + "student added successfully");
//
//     }catch(SQLException e){
//         e.printStackTrace();
//     }
//
//    }
//    public List<String>  getAllStudents(){
//        List<String> students = new ArrayList<>();
//        String sql = "SELECT * FROM students";
//
//        try(Connection conn = DBConnection.getConnection();
//            Statement PS = conn.createStatement();
//            ResultSet rs = PS.executeQuery(sql)){
//                while (rs.next()) {
//                    students.add(rs.getInt("id") + " " +
//                            rs.getString("first_name") + " " +
//                            rs.getString("last_name") + " " +
//                            rs.getString("email") + " " +
//                            rs.getString("date_of_birth"));
//
//                }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        return students;
//    }
//    public void updateStudent(int id, String first_name, String last_name, String email, String date_of_birth) {
//        String sql = "UPDATE students SET first_name =?,last_name =?,email =?,date_of_birth =? WHERE id =?";
//        try(Connection conn = DBConnection.getConnection();
//        PreparedStatement PS = conn.prepareStatement(sql )){
//            PS.setInt(5,id);
//            PS.setString(1,first_name);
//            PS.setString(2,last_name);
//            PS.setString(3,email);
//            PS.setString(4,date_of_birth);
//            PS.executeUpdate();
//            System.out.println("updateStudent:student updated" + "student updated successfully");
//
//        }catch(SQLException e){
//            e.printStackTrace();
//    }
//
//        }
//    public void deleteStudent(int id){
//        String sql = "DELETE FROM students WHERE id =?";
//        try(Connection conn = DBConnection.getConnection();
//        PreparedStatement PS = conn.prepareStatement(sql)){
//            PS.setInt(1,id);
//            PS.executeUpdate();
//            System.out.println("deleteStudent:student deleted" + "student deleted successfully");
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }

    @Override
    public void read(int id) {


    }

    @Override
    public List<students> readAll() {
        return List.of();
    }

    @Override
    public void insert(students item) {
            String sql = "INSERT INTO students(first_name,last_name,email,date_of_birth) VALUES(?,?,?,?)";

            try(Connection conn = DBConnection.getConnection();
                PreparedStatement PS = conn.prepareStatement(sql)){
                PS.setString(1, item.getFirst_name());
                PS.setString(2, item.getLast_name());
                PS.setString(3, item.getEmail());
                PS.setString(4, item.getDate_of_birth());
                PS.executeUpdate();
                System.out.println("addStudent:student added" + "student added successfully");

            }catch(SQLException e){
                e.printStackTrace();
            }

//    }

    }

    @Override
    public void update(students item) {

    }

    @Override
    public void delete(int id) {

    }
}
