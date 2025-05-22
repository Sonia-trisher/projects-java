import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        StudentService studentsTable = new StudentService();
        coursesService coursesTable = new coursesService();
        marksService marksTable = new marksService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcame to the students Management System");
        Thread.sleep(2500);
        System.out.println("press n so that you can continue");
        char input = scanner.next().charAt(0);
        if(input == 'n'){
            Thread.sleep(2500);
            System.out.println("""
                     1.Create a new item within our database (students/courses/marks)
                     2.View the details of the item in the database
                     3.Update the details of the item in the database
                     4.Delete the details of the item in the database
                     5.Exit
                    """);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("now you can chose with (students/courses/marks)? ");
                    String table_name = scanner.nextLine();
                    switch (table_name) {
                        case "students": {
                            System.out.println("How many students will you like to proceed? ");
                            int numOfstudents = scanner.nextInt();
                            for(int i = 0; i < numOfstudents; i++){
                                System.out.println("Student # " + (i + 1));
                                scanner.nextLine();
                                System.out.println("Enter the first name: ");
                                String first_name = scanner.nextLine();
                                System.out.println("Enter the last name: ");
                                String last_name = scanner.nextLine();
                                System.out.println("Enter the email: ");
                                String email = scanner.nextLine();
                                System.out.println("Enter the date of birth: ");
                                String date_of_birth = scanner.nextLine();
                                studentsTable.insert(new students(first_name, last_name, email, date_of_birth));
                            }
                            System.out.println("The student(s) record has been created successfully!");
                            break;
                        }
                        case "courses": {
                            System.out.println("How many courses will you like to proceed? ");
                            int numOfcourses = scanner.nextInt();
                            for(int i = 0; i < numOfcourses; i++){
                                System.out.println("Course # " + (i + 1));
                                scanner.nextLine();
                                System.out.println("Enter the course name: ");
                                String course_name = scanner.nextLine();
                                System.out.println("Enter the course description: ");
                                String course_description = scanner.nextLine();
                                coursesTable.insert(new courses(course_name,course_description));
                            }
                            System.out.println("The course(s) record has been created successfully!");
                            break;
                        }
                        case "marks": {
                            System.out.println("How many marks will you like to record? ");
                            int numOfmarks = scanner.nextInt();
                            for(int i = 0; i < numOfmarks; i++){
                                System.out.println("Mark # " + (i + 1));
                                scanner.nextLine();
                                System.out.println("enter the student id: ");
                                int student_id = scanner.nextInt();
                                System.out.println("enter the course_id");
                                int course_id = scanner.nextInt();
                                System.out.println("enter the marks: ");
                                int marks = Integer.parseInt(scanner.nextLine());
                                marksTable.insert(new marks(marks,course_id,student_id));
                            }
                            System.out.println("The mark(s) record has been created successfully!");
                            break;
                        }
                        default:
                            System.out.println("Please enter a valid choice");

                    }
                    break;

                }
                case 2:{
                    System.out.println("Do you want to proceed with the the details in entities (students/courses/marks) with id (y/n)?");
                    char option = scanner.next().charAt(0);
                    scanner.nextLine();
                    if(option == 'y'){
                        System.out.println("which table you want to proceed? ");
                        String entity = scanner.next();

                       switch (entity){
                           case "student": {
                               System.out.print("Enter student id: ");
                               int student_id = scanner.nextInt();
                               studentsTable.read(student_id);
                               break;
                           }
                           case "courses": {
                               System.out.print("Enter course id: ");
                               int course_id = scanner.nextInt();
                               coursesTable.read(course_id);
                               break;
                           }
                           case "marks": {
                               System.out.print("Enter either student id or course id: ");
                               int id = scanner.nextInt();
                               marksTable.read(id);
                               break;
                           }


                           }
                       }
                    else if (option == 'n') {
                        System.out.print("you want to read all data from an entity in our database. which table do we go with: ");
                        String table = scanner.nextLine();
                        switch (table) {
                            case "students": {
                                studentsTable.readAll().forEach(stud -> System.out.println(stud.toString()));
                                break;
                            }
                            case "courses": {
                                coursesTable.readAll().forEach(course -> System.out.println(course.toString()));
                                break;

                            }
                            case "marks": {
                                marksTable.readAll().forEach(mark -> System.out.println(mark.toString()));
                                break;

                            }
                        }

                    }
                    else {
                        System.out.println("invalid option");
                    }
                    break;

                }
                case 3:{

                }
                case 4: {
                    System.out.println("you are no longer in need of some data ? let's help to delete the unwanted ones");
                    Thread.sleep(1000);
                    System.out.print("which entity do we go with: ");
                    String entity = scanner.next();
                    scanner.nextLine();
                    switch (entity) {
                        case "students": {
                            System.out.print("Enter student id: ");
                            int student_id = scanner.nextInt();
                            studentsTable.delete(student_id);
                            System.out.println("The student has been deleted successfully!");
                            break;
                        }
                        case "courses": {
                            System.out.print("Enter course id: ");
                            int course_id = scanner.nextInt();
                            coursesTable.delete(course_id);
                            System.out.println("The course has been deleted successfully!");
                            break;

                        }
                        case "marks": {
                            System.out.print("Enter either student_id ,course_id or marks: ");
                            int deleted = scanner.nextInt();
                            marksTable.delete(deleted);
                            System.out.println("The marks has been deleted successfully!");
                            break;
                        }
                    }
                    break;
                }
                case 5:
                    System.out.println("Thank you for using our system");
                    return;
                default: {
                    System.out.println("Please enter a valid choice");
                }
            }

        }
        else {
            System.out.println("Please enter a valid choice");
        }
        scanner.close();
    }

}







//        course.readAll().forEach(courses -> System.out.println(courses.getCourse_description() + " " + courses.getCourse_name()));

