public class Store{
   public static void totalCalculation(long monthlySalary){

       if(monthlySalary >0 && monthlySalary<=20000){
           double rate = monthlySalary *3.0/100;
           System.out.println(" Monthly Comission Rate. "+rate);
       }
       else if(monthlySalary >= 20001 && monthlySalary <= 50000){
           double rate = monthlySalary *12/100;
            System.out.println("Monthly Comission Rate. "+rate);
       }
       else if(monthlySalary > 50001){
           double rate = monthlySalary *31/100;
           System.out.println("Monthly Commission Rate. "+rate);
       }
   }
        public static void main(String []args){
        totalCalculation(70000);
   }
}