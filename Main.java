import java.util.Scanner; 
 class Main {
  public static void main (String[] args) {
            Scanner scan=new Scanner(System.in);  
    
       //when entering your phone number plaese do not use dshes(-) just the number.  
       System.out.println("Enter your phonenumber");  
       double phonenumber = scan.nextDouble();  
       System.out.println("Enter your username");  
       String username = scan.next();
       System.out.println("Please Enter your pin number");
       double pinNumber = scan.nextDouble();
       System.out.println("Enter your cash amount");
       double amount = scan.nextDouble();
       System.out.println("Thank you " + username + " your cash transfer was $" + amount + ".");
     } // at the end of the the code simulation it will print thank you "username" your cash tranfer was "amount".
    }  