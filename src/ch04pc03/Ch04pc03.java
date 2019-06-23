package ch04pc03;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose to calculate distance traveled and input into a file
 */
public class Ch04pc03 {

    public static void main(String[] args) throws IOException {
        //variables
        double distance, speed, time, j;
        int i;

        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Open output file
        PrintWriter outputFile = new PrintWriter("ch04pc03out.txt");

        //Request input
        System.out.print("Please input the speed (in mph): ");
        speed = keyboard.nextInt();
        System.out.print("Please input the time travelled (in hours): ");
        time = keyboard.nextInt();

        if (speed < 0 || time < 1) {
            System.out.print("You input an incorrect amount.");
            System.exit(0);
        }

        outputFile.println("     Hour     Distance Traveled");
        outputFile.println("-------------------------------");
        for (i = 1; i < time; i++){
            distance = i * speed;
            j = i;
            outputFile.println("      " + j + "          " + distance);
        }
        
        //close the file
        outputFile.close();
        System.out.println("Data written to the file.");

    }
    
}
