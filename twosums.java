class twosums {
    public static void main(String[] args) {
        int arr[] = {0, 2, 2, 7, 9};
        int target = 4;

        int[] result = ts(arr, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers sum to target");
        }
    }

    public static int[] ts(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[]{i, j};  // return indices
                }
            }
        }
        return null;  // if no pair is found
    }
}
