package classdemo;



public class Main {
    public static void main(String[] args) {
        // Create obj from student class
        Student student2 = new Student();
            student2.username="bona";

        Student student1 = new Student();
            student1.username="james";
            student1.gender = "male";
            student1.score = 100;
            student1.id="ID0001";

        student1.showInfo(); // show info of obj student 1
        student2.showInfo();
    }
}
