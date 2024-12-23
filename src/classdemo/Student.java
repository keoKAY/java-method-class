package classdemo;
public class Student {
    // fields
    String id;
    String username;
    String gender;
    float score;

    // No parameter constructor

    // There are three type of constructure in java
    // 1. default constructor
    // 2. No-Args constructor
    // 3. Parameterized constructor
   /* public Student(){
        System.out.println("This is the default constructor ");
        id="<Unknown>";
        gender="male";
        score = 10;
    }*/

    public Student(){
        System.out.println("This is No_args constructor ! ");
        this("ID0001","James bond","male");
    }

    public Student(String id,
                   String username,
                   String gender ){
//        this();
        System.out.println("Params Constructor -> with three params ");
        this.id = id;
        this.username = username;
        this.gender = gender;
    }
    // Parameterized Constructor
    public  Student( String id,
                     String username,
                     String gender,
                     float score ){
        // this keyword represent the current object
        System.out.println("This is Parameterized Constructor ! ");
        this.id = id;
        this.username = username;
//        username = fullname;
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }
}
