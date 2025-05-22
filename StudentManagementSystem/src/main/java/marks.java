public class marks {
    private int marks;
    private int course_id;
    private int student_id;
    public marks(int marks, int course_id, int student_id) {
        this.marks = marks;
        this.course_id = course_id;
        this.student_id = student_id;
    }

    public int getMarks() {
        return marks;
    }

    public int getCourse_id() {
        return course_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    @Override
    public String toString() {
        return "Mark{" +
                "studentId=" + student_id +
                ", courseId=" + course_id +
                ", mark=" + marks +
                '}';
    }
}
