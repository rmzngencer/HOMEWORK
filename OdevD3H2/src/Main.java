public class Main {

    public static void main(String[] args) {
        //öğrenci veya eğitimci bilgileri giriliyor..
        Student student1 = new Student(1001, "ramazan", "mail1", "ramazanads");
        Student student2 = new Student(1012, "ali", "mail2", "aliasd");
        Student student3 = new Student(1123, "ayşe", "mail3,", "ayşeads");
        Student student4 = new Student(1234, "osman", "mail4,", "osmanads");
        Student student5 = new Student(2345, "buse", "mail5,", "buseads");

        Instructor instructor1 = new Instructor(101010, "engin", "mailofengin", "java");
        Instructor instructor2 = new Instructor(101222, "meltem", "mailofmeltem", "C#");

        // toplu kayıt test ediliyor.
        System.out.println("****************toplu kayıt testi ******************************************************");
        UserManager userManager = new UserManager();
        User[] users = {student1, student2, student3, student4, instructor1};
        userManager.addMultiple(users);

        // bireysel kayıt test ediliyor.
        System.out.println("\n****************bireysel kayıt testi ******************************************************");
        userManager.add(student5);
        userManager.add(instructor2);

        // silme kayıt test ediliyor.
        System.out.println("\n****************silme testi ******************************************************");
        userManager.delete(student1);

        // yoklama kayıt test ediliyor.
        System.out.println("\n****************yoklama testi ******************************************************");
        userManager.studentManager.attendance(student1);
        userManager.instructorManager.attendance(instructor1);


    }
}
