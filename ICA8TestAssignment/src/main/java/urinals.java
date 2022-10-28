import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
* @Author
* Vishwanath Reddy Yasa
**/

public class urinals {
    public static void main(String args[]) throws IOException {
        System.out.println("Hi");
        vacantUrinalsCount v = new vacantUrinalsCount();

        while (true) {
            System.out.println("\n----- Please select from the given Options -----");
            System.out.println("1. To Read from the console");
            System.out.println("2. Read from input");
            System.out.println("3. Exit from the application");
            System.out.print("Please select an option: ");
            Scanner sc = new Scanner(System.in);
            String next = sc.nextLine();

            if (next.equals("1")) {
                System.out.print("Enter the string: ");
                String uriString = sc.nextLine();

                if (!v.goodString(uriString)) {
                    System.out.println("Please enter valid input");
                    continue;
                }

                int count = v.vacantUrinals(uriString);
                System.out.print("No of urinals available are: " + count + "\n");
            } else if (next.equals("2")) {
                String[] paths = v.readFile("./src/main/resources/urinal.dat");
                String out = v.writeToFile(paths);
                System.out.println("Output is written to " + out);

            } else if (next.equals("3")) {
                System.out.println("Exit...");
                System.exit(1);
            }
        }
        }
    }
