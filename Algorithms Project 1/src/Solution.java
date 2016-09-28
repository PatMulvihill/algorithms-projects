public class Solution {

    public static int findPeakElement(int[] arr, int arrLength) {
        int peakElement = arr[0];
        for (int i = 0; i < arrLength; i++) {
            if (i == arrLength - 1) {
                peakElement = arr[arrLength - 1];
            } else if (arr[i] >= arr[i + 1]) {
                peakElement = arr[i];
                break;
            }
        }
        return peakElement;
    }
    
    public static void printArray(int[] arr, int arrLength) {
        // print out the contents of the array
        System.out.println("This is the array being tested:");
        for (int i = 0; i < arr.length; i++) {
            // format the printed array so that large arrays aren't all on one line
            if (i % 10 == 0 && i != 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {        
        // hardcoded test arrays
        int[] arr1 = new int[]{0, 2, 5, 8, 15}; //peak = 15
        int[] arr2 = new int[]{20, 19, 18, 17, 16, 15}; //peak = 20
        int[] arr3 = new int[]{0, 2, 4, 6, 8, 5, 3}; //peak = 8
        int[] arr4 = new int[]{5, 5, 5}; //peak = 5
        
        printArray(arr1, arr1.length);
        int peakNum1 = findPeakElement(arr1, arr1.length);
        System.out.println("\nThe peak entry is " + peakNum1);
        printArray(arr2, arr2.length);
        int peakNum2 = findPeakElement(arr2, arr2.length);
        System.out.println("\nThe peak entry is " + peakNum2);
        printArray(arr3, arr3.length);
        int peakNum3 = findPeakElement(arr3, arr3.length);
        System.out.println("\nThe peak entry is " + peakNum3);
        printArray(arr4, arr4.length);
        int peakNum4 = findPeakElement(arr4, arr4.length);
        System.out.println("\nThe peak entry is " + peakNum4);
    }
}