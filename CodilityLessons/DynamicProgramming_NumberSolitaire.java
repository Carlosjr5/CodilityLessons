package CodilityLessons;

class SolutionNumberSolitaire {
    public int solution(int[] A) {

        // main idea:
        // using "dynamic programming" to build up the solution
        // (bottom up)
        
        int[] dynamProg = new int[A.length];
        dynamProg[0] = A[0];

        // build up from "dynamProg[1], dynamProg[2], ..., dynamProg[A.length-1]"
        for(int i=1; i<A.length; i++){
            
            // keep the biggest one 
            // be very careful: could be negtive (so use Integer.MIN_VALUE)
            int max = Integer.MIN_VALUE;
            
            // a dead could be "1 to 6" 
            for(int dead=1; dead<=6; dead++){
                if( i-dead >= 0){
                    // very important: not "A[i-dead]+A[i]"
                    // instead, have to use "dynamProg[i-dead]+A[i]"
                    max = Math.max( dynamProg[i-dead]+A[i], max );
                    // dynamic programming:
                    // take the best:
                    // takeBest( dynamProg[i-j] + value[j], curBest )
                }
            }    
            dynamProg[i] = max; // keep the best one as the dynamProg value    
        }
        
        return dynamProg[A.length-1];
    }
}
