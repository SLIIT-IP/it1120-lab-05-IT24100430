import java.util.Scanner;

public class IT24100430Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");

        if (scanner.hasNextInt()) {
            int members = scanner.nextInt();
            if (members >= 0) {
                String prize;
                switch (members) {
                    case 0:
                       prize = "No Prize";
                       break;
                    case 1:
                       prize = "Pen";
                       break;
                    case 2:
                       prize = "Umbrella";
                       break;
                    case 3:
                       prize = "Bag";
                       break;
                    case 4:
                       prize = "Travelling Chair";
                       break;
                    case 5:
                       prize = "Headphone";
                       break;
                    default:
                       prize = "Headphone";
              }
              System.out.println("Prize is a " + prize);
          } else {
              System.out.println("Input must be a number 0 or greater");
          }
      } else {
          System.out.println("Invalid input. Please enter an integer value.");
      }
       
    }
}
        

