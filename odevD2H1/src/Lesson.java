public class Lesson {

        int id;
        String name;

        public Lesson(){
            System.out.println("ders bulunamadı.");
        };

        public Lesson(int id, String name){
                this.id=id;
                this.name = name;
        }
}
