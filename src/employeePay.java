import hsa.*;
public class employeePay {

    
    public static void main(String[] args) {
         Console c = new Console();
         
         double hours=0, rate=15.00,regpay,totalpay,overpay=0, grandtotal=0, totalreg=0, totalover=0;
         String employee[]=new String[5];
         
         for(int x=1;x<=5;x++){
          
             do{
                 c.print("Enter the number of hours for employee "+x+" --> ");
                 hours=c.readDouble();
                 
             }while(hours<0||hours>70);
             if(hours<40){
                 regpay=rate*hours;   
             }
             else {
              regpay=rate*40;
              overpay=rate*(hours-40);
             }
             c.println("Regular pay= $"+regpay);
             c.println("Overtime pay= $"+overpay);
             totalpay=regpay+overpay;
             c.println("Total Pay= $"+totalpay);
             
             totalreg=+regpay;
             totalover=+overpay;
             
             }
         grandtotal=totalreg+totalover;
         c.println("Regular Pay total -->  $"+totalover); 
         c.println("Overtime Pay total -->  $"+totalover);
         c.println("Grand Total --> $"+grandtotal);
         }
             
        
         } 
    
    

