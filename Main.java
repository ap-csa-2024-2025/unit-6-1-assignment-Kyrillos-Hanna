import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 - Create a scanner and an array of size 3
    Scanner sc = new Scanner(System.in);
    double[] doubleList = new double[3];
    System.out.println("Enter first term of list: ");
    doubleList[0] = sc.nextDouble();
    System.out.println("Enter the second term of the list: ");
    doubleList[1] = sc.nextDouble();
    System.out.println("Enter the third term of the list: ");
    doubleList[2] = sc.nextDouble();

    double doubleSum = doubleList[0] + doubleList[1] + doubleList[2];

    System.out.println("\n1st term of list: " + doubleList[0] + "\n2nd term of list: " + doubleList[1] + "\n3rd term of list: " + doubleList[2] + "\nSum of list terms: " + doubleSum + "\n");



    // Problem 2
    // Use the scanner to get user input and give it to the method
    int N = -1;
    while (N < 0) {
      System.out.println("Type in a positive integer: ");
      N = sc.nextInt();
    }
   
    int[] output = sumsOfNums(N);
    for (int i = 0; i <= N - 1; i++) {
      System.out.println("Term #" + (i + 1) + ": " + output[i]);
    }

    sc.close();
  }

  public static int[] sumsOfNums(int input)
  {
    int[] numList = new int[input];
    for(int i = 0; i <= input - 1; i++) {
      int currentNum = 0;
      for (int k = 0; k <= i; k++) {
        currentNum+=k;
      }
      numList[i] = currentNum;
    }
    return numList;
  }
}
