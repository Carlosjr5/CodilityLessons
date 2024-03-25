package CodilityLessons;

class SolutionBinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        
        int gapMax = 0;
        int actualGap =0;
        boolean count = false; 
        
        // Using the "concept of bit manipulation" and "& operation"
        
        while( N !=0 ){
        
            if(count == false){    // for the first "1"   
                if( (N&1) == 1){      // note: cannot use n&1 withoug "()"
                    count = true;  // start to count
                }
            }
            else{                    // count = true
                if( (N&1) ==0){      // note: cannot use n&1 withoug "()"
                    actualGap ++;  
                }
                else{ // N & 1 == 1
                    gapMax = Math.max(gapMax, actualGap);
                    actualGap = 0; // reset
                }
            }
            
            N = N >> 1; // shift by one (right side) 
                        // note: cannot just write "N >> 1"
        }
        
        return gapMax;
    }
}
