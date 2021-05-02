public class UserManager {
    public void add(User user) {
        System.out.println("eklendi:" + user.getName());
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user);
        }
    }

    public void delete(User user) {
        System.out.println("silindi:" + user.getName());
    }

    StudentManager studentManager = new StudentManager();
    InstructorManager instructorManager = new InstructorManager();
}
