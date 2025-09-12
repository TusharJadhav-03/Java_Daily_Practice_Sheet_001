Q 1.

class asciiGenerator{
    public static int generateAscii(char ch){
    return ch;
    }
    public static void main(String []args){
        System.out.println(generateAscii('A'));
    }
}

Q 2.

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
        int result = findSum(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+result);
    }
}



Q 3.

import java.util.Scanner;
class largeNumberReturn{
    public static int findLargestNumber( int a, int b){
        if(a>b){
            return a+"largest number is";
        }else if(b>a) {
            return b+"largest number is";
        }else {
            return "both number are equal";
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        
        String result = findLargestNumber(a,b);
        System.out.println(result);
    }
}




Q 4.

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

Q 5. 

class HealthTracker{
   public static void main(String[] args){
  
          long c1, c2, c3; //represent contact numbers
          c1 = 9090099898L;
          c1 = 6790099898L;
          c1 = 3390095398L;
// send notification only when HBPM below 60
   int hbpm=70;
   
      if (hbpm<60){
         System.out.println("Call to emergency number ");
         System.out.println("Go to nearest medical ");
} 
}
}

Q 6.

import java.util.Scanner;
class ECommerceDiscount{
   public static void main(String[] args){

Scanner sc=new Scanner(System.in);
      double purchaseAmount= sc.nextDouble();
   double result = (purchaseAmount>=2000)?purchaseAmount-purchaseAmount*0.2:purchaseAmount-purchaseAmount*0.1;
  System.out.println(result);
}
}
       
    

    
       
