public class binarySearch2 {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int target = 89;

        int low = 0;
        int high = arr.length - 1;

        boolean found = false;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] == target){
                found = true;
                break;
            }

            else if(arr[mid] < target){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }
    }
}