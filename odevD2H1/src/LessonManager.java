public class LessonManager {
    public void endAndGo(Lesson[] lessons){
        for (int i = 0; i < lessons.length-1; i++) {
        System.out.println(lessons[i].name+ "tamamlandı "+ lessons[i+1].name +"geçildi.");
        }
    }
    public void goBack(Lesson lesson){
        System.out.println(lesson.name+ "e geri dönüldü.");
    }
}
