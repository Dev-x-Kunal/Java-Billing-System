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

        int bill=0;
        System.out.print("Enter Customer Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter Customer Ph Number: ");
        int Num= sc.nextInt();
        do{
            System.err.println("1. Rice = 60" );
            System.err.println("2. Sugar = 40" );
            System.err.println("3. Oil = 120" );
            System.err.println("4. Soap = 20" );
            System.err.println("5. Salt = 35" );
            System.err.println("6. Bill" );

            System.out.print("Enter Item no: ");
            a = sc.nextInt();
            if(a == 1){
                bill = bill + p2;
                System.out.println("Rice added successfully");
            } else if (a == 2){
                bill = bill + p1;
                System.out.println("sugar added successfully");
            }else if (a == 3){
                bill = bill + p3;
                System.out.println( "Oil added successfully");
            }else if (a == 4){
                bill = bill + p4;
                System.out.println( "Soap added successfully");
            }else if (a == 5){
                bill = bill + p5;
                System.out.println( "Salt added successfully");
            }
        }while(a != 6);
        System.out.println("      ");
        System.out.println("====Jhonny's Kirana Store====");
        System.out.println("==      Bill Receipt      ==");
        System.out.println("Customer Name: " + Name);
        System.out.println("Customer ph Number: " +Num);
        System.out.println("total bill: " + bill);
        sc.close(); 
    }
}