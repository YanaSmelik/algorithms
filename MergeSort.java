import java.util.Arrays;

public class MergeSort {

    private static void mergeSort(int[] input) {
        int arrayLength = input.length;
        if (arrayLength < 2) {
            return; //array which has less than 2 elements is already sorted
        }
        int middleIndex = arrayLength / 2;
        //create 2 sub-arrays
        int[] leftSubArray = new int[middleIndex];
        int[] rightSubArray = new int[arrayLength - middleIndex];
        //initialize sub-arrays with right values
        for (int i = 0; i < middleIndex; i++) {
            leftSubArray[i] = input[i];
        }
        for (int i = middleIndex; i < arrayLength; i++) {
            rightSubArray[i - middleIndex] = input[i];
        }
        //recursion
        mergeSort(leftSubArray);
        mergeSort(rightSubArray);
        merge(input, leftSubArray, rightSubArray);
    }


    private static void merge(int[] input, int[] leftSubArray, int[] rightSubArray) {
        int l = 0; // left sub-array index
        int r = 0; // right sub-array index
        int i = 0; // input array index
        //select the smaller element and put it into input array
        while (l < leftSubArray.length && r < rightSubArray.length) {
            if (leftSubArray[l] <= rightSubArray[r]) {
                input[i++] = leftSubArray[l++];
            } else {
                input[i++] = rightSubArray[r++];
            }
        }
        // when either of sub-arrays ended
        while (l < leftSubArray.length) {
            input[i++] = leftSubArray[l++];
        }
        while (r < rightSubArray.length) {
            input[i++] = rightSubArray[r++];
        }
    }
}
