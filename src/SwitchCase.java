import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) throws IOException {

        boolean run = true;

        
        while(run == true) {

            try {

                System.out.println("Please enter a the number of the month 1-12");

                Scanner sr = new Scanner(System.in);


                int num = sr.nextInt();


               
                switch(num) {

                    case 1:
                        System.out.println("The month you chose is: January");
                        run = false;
                        break;

                    case 2:
                        System.out.println("The month you chose is: February");
                        run = false;
                        break;

                    case 3:
                        System.out.println("The month you chose is: March");
                        run = false;
                        break;

                    case 4:
                        System.out.println("The month you chose is: April");
                        run = false;
                        break;

                    case 5:
                        System.out.println("The month you chose is: May");
                        run = false;
                        break;

                    case 6:
                        System.out.println("The month you chose is: June");
                        run = false;
                        break;

                    case 7:
                        System.out.println("The month you chose is: July");
                        run = false;
                        break;

                    case 8:
                        System.out.println("The month you chose is: August");
                        run = false;
                        break;

                    case 9:
                        System.out.println("The month you chose is: September");
                        run = false;
                        break;

                    case 10:
                        System.out.println("The month you chose is: October");
                        run = false;
                        break;

                    case 11:
                        System.out.println("The month you chose is: November");
                        run = false;
                        break;

                    case 12:
                        System.out.println("The month you chose is: December");
                        run = false;
                        break;

                    default:
                        System.err.println("That number isn't valid! \nPlease enter a number 1 - 12! \nPlease Try Again!");
                        run = true;
                        continue;

                }


            }catch(InputMismatchException e) {

                System.err.println("Please enter a number!");
                continue;

            }



        }
    }

}
