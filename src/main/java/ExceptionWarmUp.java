
import java.util.Scanner;

public class ExceptionWarmUp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while (!valid)
        {
            System.out.println("Enter a number ");
            String text = scan.nextLine();

            try
            {
                int PageCount = Integer.parseInt(text);
                System.out.println("You entered: " + PageCount);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("You entered invalid number");
            }
        }
    }
}
