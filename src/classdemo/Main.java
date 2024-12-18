package classdemo;



public class Main {
    public static void main(String[] args) {

        Student student3 = new Student();
//        student3.input();
//        student3.showInfo();
        // Create obj from student class
        Student student2 = new Student("ID0002","Bona liza","female",60); // default constructor
//            student2.username="bona";

        Student student1 = new Student("ID0001","Kok Bona","male",90);
//            student1.username="james";
//            student1.gender = "male";
//            student1.score = 100;
//            student1.id="ID0001";

        student1.showInfo(); // show info of obj student 1
        student2.showInfo();

        System.out.println("This is the value of student1 ");
        System.out.println(student1);
    }
}
