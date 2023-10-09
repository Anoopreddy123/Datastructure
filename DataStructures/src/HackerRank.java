import java.util.Arrays;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        /*
        5
        2 4 6 8 3
         */
        Scanner scanner = new Scanner(System.in);
       // int size = scanner.nextInt();
        int[] arr = {2,3,4,5,6,7,8,9,10,1};
        int size = arr.length - 1;
        boolean flag = true;
        int tempNbr = arr[size];
        System.out.println(tempNbr);
        System.out.println(arr[size-2]);
        for (int i = size - 1 ; i >= 0; i--) {
            if (arr[i] > tempNbr) {
                arr[i + 1] = arr[i];
            } else {
                arr[i + 1] = tempNbr;
               flag = false;
            }
            printArray(arr);
            if(!flag){
                break;
            }
        }
        if(flag == true){
            arr[0] = tempNbr;
        }
        printArray(arr);
    }
        public  static void printArray(int[] arr){
            System.out.println(Arrays.toString(arr));
        }

}
