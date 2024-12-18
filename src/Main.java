
//class Utils{
//    // Helpers
//    void greeting(){
//        System.out.println("Hello world!! ");
//    }
//
//    // Functions ( static method )
//    static void sayHello(){
//        System.out.println("THis is method for saying hello !");
//    }
//
//}

import java.util.Scanner;

public class Main{
    static void greeting(String username,
                         String subject){
        System.out.println("Welcome "+username+" to "+subject+" Class ");
    }
    //
    static float moneyExchange(){
        // body , definition
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money in USD: ");
        float usd = input.nextFloat();
        float result = usd * 4000;
        System.out.println("Your money is Riels is:" + result);
        return result;
    }
    static float moneyExchangeV2(float amount,
                                 int rate , boolean isUSDToRiels){
        // Rate -> money exchange rate in Khmer ex.4000
//        float result =0;
        if(isUSDToRiels){
            return  amount * rate;
        }else {
           return amount / rate;
        }

//        System.out.println("Your money is Riels is:"+result);

//        return result;
    }

//    static void recursiveDemo(){
//        System.out.println("Hello Recursion!! ");
//        recursiveDemo();
//    }

    // Fib , Sum, ស្វុីត

    // 1 ,2 , 3, 4, 5, 6, ..., n
    // 0 = 0
    // 1= 1
    // 2 = 3 ( 2 + 1 )
    // 3 = 6 ( 3 + 2  + 1
    static  int sumSequence(int n ){
        // define base
        if (n==0 || n==1) return n;
//        if (n == 1 )
//            return 1;
        return n+ sumSequence(n-1);
    }

    // Fibonacii
    // 0 , 1 , 1 , 2 , 3 , 5
    // Fib(1) = 0
    // Fib(2) = 1
    // Fib(3) = 1
    // fib(4) = 2 ( 1 + 1 )

    static int fibFinder(int digit ){
        if (digit==0) return 0;
        if(digit == 1 || digit == 2 ){
            return digit -1;
        }
        return fibFinder(digit-1) + fibFinder( digit -2 );
    }
    public static void main(String[] args) {

        System.out.println("Fib(4): "+fibFinder(4));
        System.out.println("Fib(5): "+fibFinder(5));
        System.out.println("Fib(0): "+fibFinder(0));
                System.out.println("Result of n=3 is "+sumSequence(3));
        System.out.println("Result of n=2 is "+sumSequence(2));
        System.out.println("Result of n=0 is "+sumSequence(0));

        /*// Params ( variable )  vs Argument ( values)
          greeting("Mr.james bond", "English");
          greeting("Mrs.Susan", "Maths");

//        float riels = moneyExchange();
//        System.out.println("Bonus One: "+(riels+5000));
//        System.out.println("Bonus Two: "+(riels+10000));

        float usdToRiels = moneyExchangeV2(5,4000,true);
        System.out.println("This is value: "+usdToRiels);

        float khmerToUSD = moneyExchangeV2(40000,4000,false);
        System.out.println("Riels to USD is: "+khmerToUSD);*/
    }
}