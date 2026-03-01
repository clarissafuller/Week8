/*
Project: Locate Largest Element in 2D Array

Goal:
- Prompt user for number of rows and columns
- Create 2D double array
- Read user input into array
- Find largest value in array
- If multiple max values:
    -> choose smallest row index
    -> then smallest column index
- Return a Location object containing:
    - maxValue
    - row index (x)
    - column index (y)
*/
import java.util.Scanner;

public class Chapter9Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location result = locateLargest(array);

        System.out.println("The largest element is " + result.maxValue +
                ", located at (" + result.x + "," + result.y + ")");
    }

    public static Location locateLargest(double[][] a) {

        double m = a[0][0];
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] > m) {
                    m = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        Location location = new Location();
        location.maxValue = m;
        location.x = x;
        location.y = y;

        return location;
    }
}

class Location {
    double maxValue;
    int x;
    int y;
}