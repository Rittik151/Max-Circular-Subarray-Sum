import java.util.*;

class Max_Circular_Subarray_Sum {
    public int maxCircularSum(int[] arr) {
        int totalSum = 0;
        int currMax = 0, globalMax = Integer.MIN_VALUE;
        int currMin = 0, globalMin = Integer.MAX_VALUE;

        for (int x : arr) {
            totalSum += x;

            currMax = Math.max(x, currMax + x);
            globalMax = Math.max(globalMax, currMax);

            currMin = Math.min(x, currMin + x);
            globalMin = Math.min(globalMin, currMin);
        }

        if (globalMax < 0) {
            return globalMax;
        }

        return Math.max(globalMax, totalSum - globalMin);
    }
}