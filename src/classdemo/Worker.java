package classdemo;

import java.util.Scanner;

public class Worker {
    private String id;
    private String username;
    private String gender;
    private float hours;
//    private int age;
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

    // Getter and Setter ( getter -> read, setter -> write )
    // read-only , write-only, read/write

    // Getter for id
    public String getId(){
        return id;
    }
    // Setter for id
    public void setId(String id ) {
        // 1001 -> ID1001
        // customize the logic here !
        this.id = "ID"+id;
    }
   /* public void setAge(int age){
        if(age<=0){
            System.out.println("Age cannot be <= 0 !! ");

        }else {
            this.age = age;
        }

    }
    public int getAge(){ return age; }
*/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(float wages) {
        this.wages = wages;
    }

    private float findTotalIncome(){
        // TC >=1000
        // Tax -> male = 50% = 500
        // Tax -> female = 30% = 700
        float currentTotal = wages * hours;
        if(currentTotal >= 1000){
            int tax ;
            if(gender.equalsIgnoreCase("male")){
                currentTotal = currentTotal / 2 ;
                tax = 50;

            }else {
//                currentTotal = currentTotal - (currentTotal * 0.3f);
                currentTotal = currentTotal * 0.7f;
                tax = 30;
            }
            System.out.println("Tax = "+tax+"%");

        }

        // Adding more conditions here !
        return currentTotal;
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
//        Scanner input = new Scanner(System.in);
        System.out.println("Enter worker ID(String):");
        this.id = input.nextLine();
        System.out.println("Enter worker name :");
        username = input.nextLine();
        System.out.println("Enter gender: ");
        gender = input.nextLine();
        System.out.println("Enter wages ($):");
        wages = input.nextFloat();
        System.out.println("Enter working hours:");
        hours = input.nextFloat();

//        return this;
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
