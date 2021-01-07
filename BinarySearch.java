public class BinarySearch {


    public static int binarySearch(int[] input, int target) {
        int min = 0;
        int max = input.length - 1;
        while (max >= min) {
            int middle = (min + max) / 2;
            if (input[middle] == target) {
                return middle;
            } else if (input[middle] > target) {
                max = middle - 1;
            } else if (input[middle] < target) {
                min = middle + 1;
            }
        }
        return -1;
    }
}
