import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=0;

        int p1 = 40; //  Sugar = 40
               
        int p2 = 60; // Rice = 60
        
        int p3 = 120; // Oil = 120

        int p4 = 20; // Soap = 20

        int p5 = 35;  //  Salt = 35

        int p6 = 35;  //  Ghee = 220 per 500g

        int p7 = 35;  //  Milk = 38

        int p8 = 35;  //  Butter = 80

        int bill=0;

        System.out.print("Enter Customer Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter Customer Ph Number: ");
        Double Num= sc.nextDouble();
        do{
            System.err.println("1. Rice = 60" );
            System.err.println("2. Sugar = 40" );
            System.err.println("3. Oil = 120" );
            System.err.println("4. Soap = 20" );
            System.err.println("5. Salt = 35" );
            System.err.println("6. Ghee = 220 per 500g" );
            System.err.println("7. Milk = 38" );
            System.err.println("8. Butter = 80" );
            System.err.println("9. Bill" );

            System.out.print("Enter Item no: ");
            a = sc.nextInt();
            if(a == 1){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p2 *Q;
                System.out.println("Rice added successfully");
            } else if (a == 2){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p1*Q;
                System.out.println("sugar added successfully");
            }else if (a == 3){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p3*Q;
                System.out.println( "Oil added successfully");
            }else if (a == 4){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p4*Q;
                System.out.println( "Soap added successfully");
            }else if (a == 5){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p5*Q;
                System.out.println( "Salt added successfully");
            } else if (a == 6){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p6*Q;
                System.out.println( "Ghee added successfully");
            } else if (a == 7){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p7*Q;
                System.out.println( "Milk added successfully");
            }  else if (a == 8){
                System.out.print("Enter Quantity: ");
                int Q =sc.nextInt();
                bill = bill + p8*Q;
                System.out.println( "Butter added successfully");
            }  
        }while(a != 9);
        System.out.println("      ");
        System.out.println("====Jhonny's Kirana Store====");
        System.out.println("==      Bill Receipt      ==");
        System.out.println("Customer Name: " + Name);
        System.out.println("Customer ph Number: " +Num);
        System.out.println("total bill: " + bill);
        sc.close(); 
    }
}