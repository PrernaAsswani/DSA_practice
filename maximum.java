public class maximum {
    public static void main(String[] args) {
        int[] arr = {1, 40, 58, 16, 99, 29,69};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element of array: " + max);
    }
    }

