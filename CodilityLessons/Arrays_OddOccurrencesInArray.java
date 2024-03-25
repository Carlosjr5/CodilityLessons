package CodilityLessons;

class SolutionOddOccurrencesInArray {
    public int solution(int[] A) {
        if(A.length == 0)
            return 0;
        int unmatched;
        unmatched = A[0];
        for(int i=1; i< A.length; i++){    
            unmatched = unmatched ^ A[i]; // xor    
        }
        return unmatched;
    }
}
