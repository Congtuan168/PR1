package tut06;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] array1 = {5};
        System.out.println("The largest number in the array is: " + findLargest(array1, 0));

        int[] array2 = {0, -1, -2, -3};
        System.out.println("The largest number in the array is: " + findLargest(array2, 0));

        int[] array3 = {-5, 0, -2, -7};
        System.out.println("The largest number in the array is: " + findLargest(array3, 0));

        int[] array4 = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        System.out.println("The largest number in the array is: " + findLargest(array4, 0));

        int[] array5 = {Integer.MIN_VALUE, 999999, 6, -999999, Integer.MAX_VALUE};
        System.out.println("The largest number in the array is: " + findLargest(array5, 0));

        int[] array6 = {};
        System.out.println("The largest number in the array is: " + findLargest(array6, 0));
    }

    public static int findLargest(int[] arr, int index) {
        // Base case: if the array is empty, return the minimum integer value
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        // Base case: if we've reached the last element
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursive case: find the largest in the rest of the array
        int maxInRest = findLargest(arr, index + 1);

        // Compare current element with the maximum found in the rest of the array
        return Math.max(arr[index], maxInRest);
    }
}
