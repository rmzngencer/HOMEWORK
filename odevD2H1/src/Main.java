public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(1,"C#",0,"Engin Demirog");
        Course course2 = new Course(2,"Java",25,"Engin Demirog");
        Course course3 = new Course(3,"Temel",98,"Engin Demirog");

        Course[] courses ={course1,course2,course3};

        for (Course course : courses) {
            System.out.println("Kurs ismi:  "+course.name);
            System.out.println("Tamamlandı: "+course.perCompletion);
            System.out.println("Eğitmen:    "+course.teacherName);
            System.out.println("----------------------------");
        }

        Lesson lesson1 = new Lesson(1,"1. ders");
        Lesson lesson2 = new Lesson(1,"2. ders");
        Lesson lesson3 = new Lesson(1,"3. ders");

        Lesson[] lessons ={lesson1,lesson2,lesson3};
        for (Lesson lesson : lessons) {
            System.out.println("ders adı:  "+lesson.name);
            System.out.println("----------------------------");
        }

        LessonManager lessonManager = new LessonManager();
        lessonManager.endAndGo(lessons);
        lessonManager.goBack(lesson1);

    }
}
