public class binarySeaarch4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5};
        int target = 3;
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Last Occurrence: " + result);
    }
}
