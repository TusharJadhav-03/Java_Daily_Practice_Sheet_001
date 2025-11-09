public class Library{
    public static void libraryFineSystem(int day){
        double fine = day *0.40;
        if(day<=5){
            System.out.println(fine);
        }else if (day >= 6 && day<=10){
            fine = day * 0.65;
            System.out.println(fine);
        }else{
            fine = day * 0.80;
            System.out.println(fine);
        }
    }
    public static void main(String []args){
        libraryFineSystem(12);
    }
}