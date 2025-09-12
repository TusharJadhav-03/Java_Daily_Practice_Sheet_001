import java.util.Scanner;
class sumCalculator{
    public static int findSum(int a, int b){
    int sum = a+b;
    return sum;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        
        System.out.println("Enter second number");
        int b = sc.nextInt();
        // int b = sc.nextInt();
        int result = findSum(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+result);
    }
}
