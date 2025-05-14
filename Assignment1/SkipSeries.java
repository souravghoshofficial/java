import java.util.Scanner;

public class SkipSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int length = n;

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int skip = 2;

        while (skip-1 <= length) {
            int index = 0;
            int k = 0;
            while(index < length){
                System.out.print(arr[index] + " ");
                arr[k] = arr[index];
                k++;
                index += skip;
            }
            System.out.println();
            length = (int) Math.ceil(length / skip);
            skip++;
        }
    }
}
