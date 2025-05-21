public class students {
    private String first_name;
    private String last_name;
    private String email;
    private String date_of_birth;

    public students(String first_name, String last_name, String email, String date_of_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }


}
