import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        coursesService course = new coursesService();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\n STUDENT MANAGEMENT SYSTEM");
            System.out.println("a. Add Student");
            System.out.println("b. View Students");
            System.out.println("c. Update Student");
            System.out.println("d. Delete Student");
            System.out.println("e. Add Course");
            System.out.println("f. Get All Courses");
            System.out.println("g. View Course");
            System.out.println("h. Update Course");
            System.out.println("i. Delete Course");
            System.out.println("j. Add Mark [student_id, course_id, marks]");
            System.out.println("k. View Student Marks [student_id]");
            System.out.println("l. Update Student Mark in a Course");
            System.out.println("m. Delete Student Mark in a Certain Course");
            System.out.println("n. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine().toLowerCase();

            switch (choice) {
                case "e" -> {
                    System.out.print("Enter Course Name: ");
                    String courseName = sc.nextLine();
                    System.out.print("Enter Course Description: ");
                    String courseDescription = sc.nextLine();
                    course.insert(new courses(course_name,courseescription));
                }
                case "f" -> courses.getAllCourses().forEach(System.out::println);
                case "g" -> {
                    System.out.print("Enter Course ID to View: ");
                    int courseId = sc.nextInt();
                    sc.nextLine();
                    System.out.println(coursesDAO.getCourseById(courseId));
                }
                case "h" -> {
                    System.out.print("Enter Course ID to Update: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Course Description: ");
                    String newDescription = scanner.nextLine();
                    coursesDAO.updateCourseDescription(courseId, newDescription);
                }
                case "i" -> {
                    System.out.print("Enter Course ID to Delete: ");
                    int courseId = scanner.nextInt();
                    coursesDAO.deleteCourse(courseId);
                }
            }



//////        course.readAll().forEach(courses -> System.out.println(courses.getCourse_description() + " " + courses.getCourse_name()));
//
//        }
//    }
//}
