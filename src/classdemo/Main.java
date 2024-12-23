package classdemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Student student1 = new Student();
//        student1.showInfo();
        //new Student("ID001","Mr.Joe","male");

        Scanner input = new Scanner(System.in);
        // Declaration
        Worker worker3 = new Worker(); // Instantiation
//        worker3.id = "10003";
        worker3.setId("1003");
//        worker3.setAge(25);
        System.out.println("ID of worker3 : "+worker3.getId());
//        System.out.println("Age of worker3 : "+worker3.getAge());
        Worker worker2= new Worker("1002","fiona","female", 100,10);
        worker2.showWorkerInfo();


//        Worker worker1 = new Worker();
//        worker1.inputWorkerInfo(input);
//        worker1.showWorkerInfo();

        /*System.out.println("Enter the number of worker: ");
        int n = input.nextInt();
        Worker[] workers = new Worker[n];

        for(int i =0; i < n; i++){
            // input values for all the workers object

            // create another object
            Worker worker = new Worker();
            input.nextLine(); // Clear buffer from int
            worker.inputWorkerInfo(input);

            // assign it to the workers array
            workers[i] = worker;
        }
        // Show all the workers information
        for(int i =0; i < n ; i++){
            workers[i].showWorkerInfo();
        }*/


    }
}
