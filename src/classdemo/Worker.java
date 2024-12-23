package classdemo;

import java.util.Scanner;

public class Worker {
    private String id;
    private String username;
    private String gender;
    private float hours;
    private float wages;

    public Worker(){}
    public Worker(String id ,
                  String username,
                  String gender,
                  float hours,
                  float wages){
        this.id = id;
        this.username = username;
        this.hours = hours;
        this.gender = gender;
        this.wages = wages;

    }

    private float findTotalIncome(){
        return wages * hours;
    }
    public void showWorkerInfo(){
        System.out.println("--------------------------------");
        System.out.println("Worker ID : "+id);
        System.out.println("Worker Name : "+username);
        System.out.println("Worker Gender : "+gender);
        System.out.println("Worker Wage/1hr : "+wages);
        System.out.println("Worker's working hour: "+hours);
        System.out.println("Worker Total income: "+findTotalIncome()+"$");
    }
    public void inputWorkerInfo(Scanner input){
        // create scanner
        System.out.println("Enter worker ID(String):  ");
        this.id = input.nextLine();
        System.out.println("Enter worker name : ");
        username = input.nextLine();
        System.out.println("Enter gender: ");
        gender = input.nextLine();
        System.out.println("Enter wages ($): ");
        wages = input.nextFloat();
        System.out.println("Enter working hours: ");
        hours = input.nextFloat();

    }
    /*@Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", hours=" + hours +
                ", wages=" + wages +
                '}';
    }*/
    // toString -> return String show all the values of object's fields
}
