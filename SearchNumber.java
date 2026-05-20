class SearchNumber {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 35};
        int target = 25;
        int found = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == target) {
                found = 1;
                break;
            }
        }

        if(found == 1) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}