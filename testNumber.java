import java.util.Scanner;
class testNumber{
public static boolean isEven(int number){
    if(number%2==0){
        return true;
    }else {
        return false;
    }
}
public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt(); 
        boolean result = isEven(number);
        System.out.println(number+" is even. "+result);
    
}
}