public class binarySearch3 {
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 5, 5, 8, 9};
        int target = 5;
        
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low<=high){
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {   
            result = mid;
            high = mid - 1; // Continue searching in the left half
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;    
        }
    }
     System.out.println("First Occurrence: " + result);
    }
}