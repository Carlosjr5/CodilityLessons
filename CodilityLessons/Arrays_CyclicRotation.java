package CodilityLessons ;

class SolutionCyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
  
        int[] tempArray = new int[A.length]; // a new array
        
        for(int i=0; i< A.length; i++){
            int actualPosition = (i + K) % A.length; // using "mod" to do Cyclic Rotation           
            tempArray[actualPosition] = A[i]; // put A[i] to the new position
        }
        
        return tempArray; // return new array
    }
}
