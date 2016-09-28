import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//    public static int[] findPeakInd() {
//
//    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrSize = -1;
        while(arrSize < 1) {
            System.out.println("How large is the array? ");
            arrSize = in.nextInt();
        }
        
        // create array of size arrSize
        int[] arr = new int[arrSize];
        
        // randomly populate an array of size arrSize
        for (int i = 0; i < arrSize; i++) {
            arr[i] = (int)Math.floor(Math.random() * 1001);
        }
        
        // print out the contents of the array
        System.out.println("This is your randomly generated array:");
        for (int i = 0; i < arrSize; i++) {
            // format the printed array so that large arrays aren't all on one line
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + " ");
        }
    }
}