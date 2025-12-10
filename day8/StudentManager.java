import java.util.Scanner;
public class StudentManager{
    public static void main(String []args){
        System.out.println("EXecution start from main");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name. ");
        String name = sc.nextLine();
        
        System.out.println("Enter your Roll NO. ");
        int rollNo = sc.nextInt();
        
        Student s1 = new Student();
        s1.setName(name);
        s1.setRollNo(rollNo);
        System.out.println("\nStudent Details :");
        System.out.println("Student Name: "+s1.getName());
        System.out.println("Student Roll No: "+s1.getRollNo());
    }
}
class Student{
    private String name;
    private int rollNo;
    public void setName(String name){
        this.name = name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
}
