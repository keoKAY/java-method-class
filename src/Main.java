
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
    static void greeting(String username, String subject){
        System.out.println("Welcome "+username+" to "+subject+" Class ");
    }
    //
    static float moneyExchange(){
        // body , definition
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money in USD: ");
        float usd = input.nextFloat();

        float result = usd * 4000;
        System.out.println("Your money is Riels is:"+result);

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
    public static void main(String[] args) {

        // Params ( variable )  vs Argument ( values)
          greeting("Mr.james bond", "English");
          greeting("Mrs.Susan", "Maths");

//        float riels = moneyExchange();
//        System.out.println("Bonus One: "+(riels+5000));
//        System.out.println("Bonus Two: "+(riels+10000));

        float usdToRiels = moneyExchangeV2(5,4000,true);
        System.out.println("This is value: "+usdToRiels);

        float khmerToUSD = moneyExchangeV2(40000,4000,false);
        System.out.println("Riels to USD is: "+khmerToUSD);
    }
}