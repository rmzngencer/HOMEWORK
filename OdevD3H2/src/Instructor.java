public class Instructor extends User {
    private String course;

    public Instructor(int id, String name, String Email, String course) {
        super(id, name, Email);
        this.course = course;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
