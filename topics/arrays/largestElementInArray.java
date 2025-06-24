class Solution{
    public int maxElement(int[] arr) {
        // Initialize the maximum element to the first element of the array
        int max = arr[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update max if the current element is greater than max
            if (arr[i] > max) {
                max = arr[i];//Used Swapping as sorting leads to too much time, exceeding the time limit
            }
        }
        
        // Return the maximum element found in the array
        return max;
    }
}