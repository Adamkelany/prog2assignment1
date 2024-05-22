import java.util.Scanner;

public class Prog2assignment1_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Number of elements? ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        readArray(arr);

        System.out.print("position you want to delete : ");
        int position = scanner.nextInt();

        if (position < 1 || position > size) {
            System.out.println("Invalid position! Please enter position between 1 and " + size);
            printArray(arr);
        } else {
            arr = delete(arr, position);
            printArray(arr);
        }
    }

    public static void readArray(int[] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element [" + (i + 1) + "]= ");
            a[i] = scanner.nextInt();
        }
    }

    public static int[] delete(int[] a, int pos) {
        int[] newArray = new int[a.length - 1];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != pos - 1) {
                newArray[index++] = a[i];
            }
        }
        return newArray;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}