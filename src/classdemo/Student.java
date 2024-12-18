package classdemo;

public class Student {
    // fields
    String id;
    String username;
    String gender;
    float score;

    // No parameter constructor
   /* public Student(){
        System.out.println("This is the default constructor ");
        id="<Unknown>";
        gender="male";
        score = 10;
    }*/
    public Student(){}
    // Parameterized Constructor
    public  Student(String id,
                    String username,
                    String gender,
                    float score ){
        // this keyword represent the current object
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.score = score;
    }
    // methods
    void showInfo(){
        System.out.println("------------------------------");
        System.out.println("ID: "+id);
        System.out.println("Name: "+username);
        System.out.println("Gender: "+gender);
        System.out.println("Score: "+score);
    }

}
