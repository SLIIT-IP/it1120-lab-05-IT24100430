import java.util.Scanner;

public class IT24100430Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.00;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;

        int startDay, endDay, noOfDaysReserved;
        double totalAmount;

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("EnterStart Date (1-31): ");
        startDay = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDay = input.nextInt();

        if(startDay < 1 || startDay > 31 || endDay < 1 || endDay > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            System.exit(0);
       }
   
       if(startDay >= endDay) {
           System.out.println("Error: Start Date must be less than End Date.");
           System.exit(0);
       }

       noOfDaysReserved = endDay - startDay;

       if (noOfDaysReserved > 4) {
           totalAmount = ROOM_CHARGE * noOfDaysReserved * (1 - DISCOUNT_5_OR_MORE_DAYS / 100.0);
       } else if (noOfDaysReserved >= 3) {
           totalAmount = ROOM_CHARGE * noOfDaysReserved * (1 - DISCOUNT_3_4_DAYS / 100.0);
       } else {
           totalAmount = ROOM_CHARGE * noOfDaysReserved;
       }
      
       System.out.println("Room Charge Pre Day: Rs. " + ROOM_CHARGE);
       System.out.println("Number Of Days Reserved: " + noOfDaysReserved);
       System.out.println("Total Amount to be Paid: Rs. " + totalAmount);

   }
}