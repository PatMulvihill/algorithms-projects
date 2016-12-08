public class Solution {

    public static int findPeakElement (int[] arr, int low, int high, int arrLength) {
        int mid = (low + high) / 2;
        // if the midpoint is 0 then there is only 1 element in the array so return that element
        // if the element one left to the midpoint is smaller than the midpoint
        // AND if the element one index to the right of the midpoint is greater than the midpoint
        // then return the middle index
        if ((mid == 0 || mid == arr.length - 1 || arr[mid] >= arr[mid - 1]) && (arr[mid] >= arr[mid + 1] || mid == arrLength - 1)) {
            return mid;
        }
        else if (mid > 0 && arr[mid] < arr[mid - 1]) {
            return findPeakElement (arr, low, mid - 1, arrLength);
        }
        else {
            return findPeakElement (arr, mid + 1, high, arrLength);
        }
    }
    
    public static void printArray(int[] arr, int arrLength) {
        // print out the contents of the array being tested
        System.out.println("\nThis is the array being tested:");
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
        int[] arr1 = new int[]{1, 3, 4, 5, 6, 7, 8, 5, 2}; //peak = 8
        int[] arr2 = new int[]{0, 2, 4, 6, 8, 5, 3}; //peak = 8
        // edge cases
        // descending array
        int[] arr3 = new int[]{20, 19, 18, 17, 16, 15}; //peak = 20
        // repeating array (technically the array shouldn't repeat anything for
        // this problem but my program handles it anyway
        int[] arr4 = new int[]{4, 4, 4, 4}; //peak = 4
        // negative array
        int[] arr6 = new int[]{-5, -4, -2, -3}; // peak -2
        
        printArray(arr1, arr1.length);
        int peakNum1 = findPeakElement(arr1, 0, arr1.length - 1, arr1.length);
        System.out.println("\nThe peak entry is " + peakNum1 + " which contains element " + arr1[peakNum1]);
        printArray(arr2, arr2.length);
        int peakNum2 = findPeakElement(arr2, 0, arr2.length - 1, arr2.length);
        System.out.println("\nThe peak entry is " + peakNum2 + " which contains element " + arr2[peakNum2]);
        printArray(arr3, arr3.length);
        int peakNum3 = findPeakElement(arr3, 0, arr3.length - 1, arr3.length);
        System.out.println("\nThe peak entry is " + peakNum3 + " which contains element " + arr3[peakNum3]);
        printArray(arr4, arr4.length);
        int peakNum4 = findPeakElement(arr4, 0, arr4.length - 1, arr4.length);
        System.out.println("\nThe peak entry is " + peakNum4 + " which contains element " + arr4[peakNum4]);
        printArray(arr6, arr6.length);
        int peakNum6 = findPeakElement(arr6, 0, arr6.length - 1, arr6.length);
        System.out.println("\nThe peak entry is " + peakNum6 + " which contains element " + arr6[peakNum6]);
    }
}