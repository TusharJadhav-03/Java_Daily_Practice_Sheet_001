// GymCopy.java
import java.util.Scanner;
public class GymCopy {
    public static void Operation(String name, int plan){
        if(plan == 1){
            System.out.println("Hello "+name+" you have selected Monthly Plan. \nTotal amount to Pay: $35");
        }else if(plan == 2){
            System.out.println("Hello "+name+" you have selected Quarterly Plan. \nTotal amount to Pay: $80");
        }else if(plan == 3){
            System.out.println("Hello "+name+" you have selected Yearly Plan. \nTotal amount to Pay: $300");
        }else{
            System.out.println("Plese select valid Plan.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        
        System.out.println("Choose your membership plan (1. Monthly 2.Quarterly 3.Yearly)");
        int plan = sc.nextInt();
        
        Operation(name, plan);
    }
}