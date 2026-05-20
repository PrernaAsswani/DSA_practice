public class minimum {
    public static void main(String[] args) {
        int[] arr = {1, 423, 6, 46, 34, 23, 13, 53, 4};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element of array: " + min);
    }    
}
