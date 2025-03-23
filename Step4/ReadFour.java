package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            try{
                int sum = 0;
                System.out.println("Reading file...");

                Scanner fileIn = new Scanner(new File("Step4/input4.txt"));

                while (fileIn.hasNext()) {
                    String nextNumber = fileIn.nextLine();
                    String[] numbers = nextNumber.split("\n");

                    for (int i = 0; i < numbers.length; i++) {
                        sum += Integer.parseInt(numbers[i]);
                        System.out.println("Running total: " + sum);
                    }
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }

        }
}