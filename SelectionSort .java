class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 4, 7, 2};

        for (int i = 0; i < nums.length; i++) {
            int minpos = i; // Initialize the minimum position
            nums = {5, 3, 8, 4, 7, 2};
            i = 0 {2,3,8,4,7,5}
            i = 2 {2,3,4,8,7,5}
            i = 3 {2,3,4,5,7,8}
            i = 4 {2,3,4,5,7,8} *//*
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minpos]) {
                    minpos = j; // Update the position of the minimum element
                }
            }
            // Swap nums[i] with nums[minpos]
            int temp = nums[i];
            nums[i] = nums[minpos];
            nums[minpos] = temp;
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
