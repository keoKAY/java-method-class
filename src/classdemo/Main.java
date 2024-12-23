package classdemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Student student1 = new Student();
//        student1.showInfo();
        //new Student("ID001","Mr.Joe","male");
        Scanner input = new Scanner(System.in);
        Worker worker1 = new Worker();
        worker1.inputWorkerInfo(input);
        worker1.showWorkerInfo();

    }
}
