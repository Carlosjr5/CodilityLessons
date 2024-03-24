package CodilityLessons;

class MinAbsSum {
	public int solution(int[] A) {
        int N = A.length;
        
        // Initialize the minimum value of val(A, S) as the absolute sum of elements
        int minVal = 0;
        for (int num : A) {
            minVal += Math.abs(num);
        }
        
        // Generate all possible sequences S of N integers from the set {−1, 1}
        // Use binary representation to generate all possible combinations
        for (int i = 0; i < (1 << N); i++) {
            int currentSum = 0;
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) != 0) { // Check if jth bit of i is set
                    currentSum += A[j]; // Add A[j] if the jth bit is set
                } else {
                    currentSum -= A[j]; // Subtract A[j] if the jth bit is not set
                }
            }
            // Update the minimum value of val(A, S)
            minVal = Math.min(minVal, Math.abs(currentSum));
        }
        
        return minVal;
    }
}
