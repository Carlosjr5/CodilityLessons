package CodilityLessons;

import java.util.Arrays;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
        	System.out.println("\n" 
                    + "		+--------------------------------------------+" + "\n" 
                    + "		|         CJR Codility Lessons Menu          |"  + "\n" 
                    + "		+--------------------------------------------+"+ "\n" );

   System.out.println("	+--------------------------------------------------------------+");
   System.out.println("	|  1.  Calculate the number of distinct absolute values        |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  2.  Calculate the maximum binary gap                        |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  3.  Check if brackets are balanced                          |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  4.  Calculate the number of chocolates eaten                |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  5.  Calculate the number of chocolates eaten                |");
   System.out.println("	|      Euclidean Algorithm                                     |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  6.  Calculate the number of distinct slices eaten           |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  7.  Calculate the number of distinct slices eaten           |");
   System.out.println("	|      (alternative)                                           |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  8.  Calculate the number of integers divisible by K         |");
   System.out.println("	|      within a range                                          |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  9.  Calculate the number of factors of an integer           |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 10.  Calculate the number of non-divisors for each element   |");
   System.out.println("	|      in an array                                             |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 11.  Count the number of semiprimes within a given range     |");
   System.out.println("	|      for each query                                          |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 12.  Count the number of triangles that can be formed        |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 13.  Perform cyclic rotation of an array                     |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 14.  Calculate the number of distinct elements in an array   |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 15.  Find the dominator index in an array                    |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 16.  Calculate the number of equi leaders in an array        |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 17.  Find the minimum number of jumps needed (Fibonacci)     |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 18.  Calculate the number of fish alive after encounters     |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 19.  Calculate the number of jumps needed for a frog to      |");
   System.out.println("	|      cross a river                                           |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 20.  Calculate the earliest time when the frog can jump to   |");
   System.out.println("	|      the other side of the river                             |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 21.  Calculate the minimal impact factors of given DNA       |");
   System.out.println("	|      sequences within specified query ranges                 |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 22.  Calculate the number of different ways of climbing to   |");
   System.out.println("	|      the top of a ladder.                                    |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 23.  Calculate the values of counters after applying all     |");
   System.out.println("	|      alternating operations: increase counter by 1; set      |");
   System.out.println("	|      value of all counters to current maximum.               |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 24.  Find the maxLeft and maxRight based on the middle (Y)   |");
   System.out.println("	|      value                                                   |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 25.  Find a maximal set of non-overlapping segments.         |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 26.  Find the maximal product of any triplet. (P,Q,R)        |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 27.  Inputed a log of stock prices compute the maximum       |");
   System.out.println("	|      possible earning.                                       |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 28.  Find a maximum sum of a compact subsequence of array    |");
   System.out.println("	|      elements.                                               |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 29.  Find the minimal average of any slice containing at     |");
   System.out.println("	|      least two elements.                                     |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 30.  Divide array A into K blocks and minimize the largest   |");
   System.out.println("	|      sum of any block.                                       |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 31.  Find the minimal perimeter of any rectangle whose       |");
   System.out.println("	|      area equals N.                                          |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 32.  Find the smallest positive integer that does not occur  |");
   System.out.println("	|      in a given sequence.                                    |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 33.  Determine whether a given string of parentheses (single |");
   System.out.println("	|      type) is properly nested.                               |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 34.  Compute the number of intersections in a sequence of    |");
   System.out.println("	|      discs.                                                  |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 35.  In a given array, find the subset of maximal sum in     |");
   System.out.println("	|      which the distance between consecutive elements is at   |");
   System.out.println("	|      most 6.                                                 |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 36.  Find value that occurs in odd number of elements.       |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 37.  Count the number of passing cars on the road.           |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 38.  Divide an array into the maximum number of same-sized   |");
   System.out.println("	|      blocks, each of which should contain an index P such    |");
   System.out.println("	|      that A[P - 1] < A[P] > A[P + 1].                        |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 39.  Check whether array A inputed is a permutation.         |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 40.  Find the missing element in a given permutation.        |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 41.  Cover \"Manhattan skyline\" using the minimum number of |");
   System.out.println("	|      rectangles.                                             |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 42.  Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... |");
   System.out.println("	|      + A[N-1])|.                                             |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 43.  Tie adjacent ropes to achieve the maximum number of     |");
   System.out.println("	|      ropes of length >= K.                                   |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 44.  Determine whether a triangle can be built from a given  |");
   System.out.println("	|      set of edges.                                           |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	| 45.  Inputed an array of integers, find the lowest absolute  |");
   System.out.println("	|      sum of elements inside the array.                       |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  0.  Exit                                                    |");
   System.out.println("	|  ----------------------------------------------------------  |");
   System.out.println("	|  Choose an option:                                           |");
   System.out.println("	+--------------------------------------------------------------+");



          
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    calculateDistinctAbsoluteValues();
                    break;
                case 2:
                    calculateMaximumBinaryGap();
                    break;
                case 3:
                    checkBalancedBrackets();
                    break;
                case 4:
                    calculateChocolatesEaten();
                    break;
                case 5:
                    calculateChocolatesEatenEuclidean();
                    break;
                case 6:
                    calculateDistinctSlices();
                    break;
                case 7:
                    calculateDistinctSlicesAlternative();
                    break;
                case 8:
                    calculateIntegersDivisibleByK();
                    break;
                case 9:
                    calculateFactorsOfInteger();
                    break;
                case 10:
                    calculateNonDivisors();
                    break;
                case 11:
                    countSemiprimes();
                    break;
                case 12:
                    countTriangles();
                    break;
                case 13:
                    performCyclicRotation();
                    break;
                case 14:
                    calculateDistinctElements();
                    break;
                case 15:
                    findDominatorIndex();
                    break;
                case 16:
                    calculateEquiLeaders();
                    break;
                case 17:
                    calculateMinimumJumps();
                    break;
                case 18:
                    calculateFishAlive();
                    break;
                case 19:
                    calculateJumpsNeededForFrog();
                    break;
                case 20:
                    calculateEarliestFrogJumpTime();
                    break;
                case 21:
                    calculateMinimalImpactFactors();
                    break;
                case 22:
                	calculateWaysToClimbLadder();
                	break;
                case 23:
                	calculateMaxCounters();
                	break;
                case 24:
                	calculateMaxDoubleSliceSum();
                	break;
                case 25:
                	calculateMaxNonoverlappingSegments();
                	break;
                case 26:
                	calculateMaxProductOfThree();
                	break;
                case 27:
                	calculateMaxProfit();
                	break;
                case 28:
                	calculateMaxSliceSum();
                	break;
                case 29:
                	calculateMinAvgTwoSlice();
                	break;
                case 30:
                	calculateMinMaxDivision();
                	break;
                case 31:
                	calculateMinPerimeterRectangle();
                	break;
                case 32:
                     // Prompt the user to enter the size of the array
                     System.out.print("Enter the size of the array: ");
                     int size = scanner.nextInt();

                     // Prompt the user to enter the elements of the array
                     System.out.println("Enter the elements of the array:");
                     int[] A = new int[size];
                     for (int i = 0; i < size; i++) {
                         A[i] = scanner.nextInt();
                     }
                     // Calculate the smallest positive integer missing from the array
                     int missingInteger = findMissingInteger(A);
                     System.out.println("The smallest positive integer missing from the array is: " + missingInteger);
              
                    System.out.println("The smallest positive integer missing from the array is: " + missingInteger);
                	break;
                case 33:
                	 System.out.print("Enter a string of parentheses to check if they are nested. (e.g., '(()())'): ");
                     String parenthesesString = scanner.nextLine();
                     int result = checkIfProperlyNested(parenthesesString);
                     if (result == 1) {
                         System.out.println("The string is properly nested.");
                     } else {
                         System.out.println("The string is not properly nested.");
                     }
                    break;
                case 34:
                	 System.out.print("Enter the number of discs: ");
                     int N = scanner.nextInt();
                     int[] discs = new int[N];
                     System.out.println("Enter the radii of the discs:");
                     for (int i = 0; i < N; i++) {
                         discs[i] = scanner.nextInt();
                     }
                     int resultfindNumberOfIntersections = findNumberOfIntersections(discs);
                     if (resultfindNumberOfIntersections == -1) {
                         System.out.println("The number of intersections is too large.");
                     } else {
                         System.out.println("The number of intersections is: " + resultfindNumberOfIntersections);
                     }
                     break;
                case 35:
                	 System.out.print("Enter the number of elements in the array: ");
                     int N1 = scanner.nextInt();
                     int[] array = new int[N1];
                     System.out.println("Enter the elements of the array:");
                     for (int i = 0; i < N1; i++) {
                         array[i] = scanner.nextInt();
                     }
                     int resultfindMaximumScore = findMaximumScore(array);
                     System.out.println("The maximum score is: " + resultfindMaximumScore);
                     scanner.close();
                	break;
                case 36:
                	   System.out.print("Enter the number of elements in the array: ");
                       int N2 = scanner.nextInt();
                       int[] array1 = new int[N2];
                       System.out.println("Enter the elements of the array:");
                       for (int i = 0; i < N2; i++) {
                           array1[i] = scanner.nextInt();
                       }
                       int resultfindUnpairedElement = findUnpairedElement(array1);
                       System.out.println("The unpaired element in the array is: " + resultfindUnpairedElement);
                	break;
                case 37:
                	 System.out.print("Enter the number of elements in the array: ");
                     int N3 = scanner.nextInt();
                     int[] array3 = new int[N3];
                     System.out.println("Enter the elements of the array (0 for east, 1 for west):");
                     for (int i = 0; i < N3; i++) {
                         array3[i] = scanner.nextInt();
                     }
                     int resultcountPassingCars = countPassingCars(array3);
                     System.out.println("The number of pairs of passing cars is: " + resultcountPassingCars);
                	break;
                case 39:
                	 System.out.print("Enter the number of elements in the array: ");
                	 int N4 = scanner.nextInt();
                     int[] array4 = new int[N4];
                     System.out.println("Enter the elements of the array:");
                     for (int i = 0; i < N4; i++) {
                         array4[i] = scanner.nextInt();
                     }
                     int resultfindMaxNumberOfBlocks = findMaxNumberOfBlocks(array4);
                     System.out.println("The maximum number of blocks that can have peaks is: " + resultfindMaxNumberOfBlocks);
                	break;
                case 40:
                	 System.out.print("Enter the number of elements in the array: ");
                     int N5 = scanner.nextInt();
                     int[] array5 = new int[N5];
                     System.out.println("Enter the elements of the array:");
                     for (int i = 0; i < N5; i++) {
                         array5[i] = scanner.nextInt();
                     }
                     String resultcheckPermutation = checkPermutation(array5);
                     System.out.println("Is the array a permutation? " + resultcheckPermutation);
                	break;
                case 41:
                    System.out.print("Enter the number of heights in the wall: ");
                    int N6 = scanner.nextInt();
                    int[] heights = new int[N6];
                    System.out.println("Enter the heights of the wall:");
                    for (int i = 0; i < N6; i++) {
                        heights[i] = scanner.nextInt();
                    }
                    int numBlocks = countBlocks(heights);
                    System.out.println("The number of blocks needed: " + numBlocks);
                	break;
                case 42:
                	System.out.print("Enter the number of elements in the array: ");
                    int N7 = scanner.nextInt();
                    int[] array6 = new int[N7];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < N7; i++) {
                        array6[i] = scanner.nextInt();
                    }
                    int minDifference = findMinimumDifference(array6);
                    System.out.println("The minimum difference is: " + minDifference);
                	break;
                case 43:
                	System.out.print("Enter the maximum length of tied ropes (K): ");
                    int K = scanner.nextInt();
                    System.out.print("Enter the number of ropes (N): ");
                    int N8 = scanner.nextInt();
                    int[] ropes = new int[N8];
                    System.out.println("Enter the lengths of the ropes:");
                    for (int i = 0; i < N8; i++) {
                        ropes[i] = scanner.nextInt();
                    }
                    int totalRopes = countTiedRopes(K, ropes);
                    System.out.println("The maximum number of tied ropes is: " + totalRopes);
                	break;
                case 44:
                	 System.out.println("Enter the length of the array:");
                     int length = scanner.nextInt();
                     int[] A1 = new int[length];
                     System.out.println("Enter the elements of the array:");
                     for (int i = 0; i < length; i++) {
                         A1[i] = scanner.nextInt();
                     }
                     SolutionTriangle solution = new SolutionTriangle();
                     int resultTriangle = solution.solution(A1);
                     System.out.println("Result: " + resultTriangle);
                	break;
                case 45:
                	// Read the size of the array from the user
                	System.out.print("Enter the size of the array: ");
                	int size1 = scanner.nextInt();
                	// Read the elements of the array from the user
                	int[] array9 = new int[size1];
                	System.out.println("Enter the elements of the array:");
                	for (int i = 0; i < size1; i++) {
                	    array9[i] = scanner.nextInt();
                	}
                	// Calculate the result using the solutionMinAbsSum method
                	int resultcalculateMinAbsSum = solutionMinAbsSum(array9);
                	// Print the result
                	System.out.println("Result: " + resultcalculateMinAbsSum);
                	break;
                 case 0:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }

    static Scanner scanner = new Scanner(System.in);
    
    private static void calculateDistinctAbsoluteValues() {
        System.out.print("Enter the array size { }: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array {1,2,3... }:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
       

        SolutionAbsDistint solutionAbsDistinct = new SolutionAbsDistint();
        int resultSolutionAbsDistinct = solutionAbsDistinct.solution(A);
        System.out.println("Number of distinct absolute values: " + resultSolutionAbsDistinct);
        
    }

    private static void calculateMaximumBinaryGap() {
        System.out.print("Enter a number to calculate binary gap: ");
        int number = scanner.nextInt();
        scanner.close();

        SolutionBinaryGap solutionBinaryGap = new SolutionBinaryGap();
        int resultSolutionBinaryGap = solutionBinaryGap.solution(number);
        System.out.println("Max binary gap: " + resultSolutionBinaryGap);
    }

    private static void checkBalancedBrackets() {
        System.out.print("Enter a string with brackets: ");
        String S = scanner.nextLine();
        SolutionBrackets solutionBrackets = new SolutionBrackets();
        int result = solutionBrackets.solution(S);
        System.out.println("The string is " + (result == 1 ? "balanced" : "not balanced"));
    }

    private static void calculateChocolatesEaten() {
        System.out.print("Enter the total number of chocolates: ");
        int TotalNumberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of chocolates eaten: ");
        int Munched = scanner.nextInt();

        SolutionChocolatesByNumbers solutionChocolatesByNumbers = new SolutionChocolatesByNumbers();
        int result = solutionChocolatesByNumbers.solution(TotalNumberOfChocolates, Munched);
        System.out.println("Number of chocolates eaten: " + result);
    }

    private static void calculateChocolatesEatenEuclidean() {
        System.out.print("Enter the total number of chocolates: ");
        int TotalNumberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of chocolates eaten: ");
        int Munched = scanner.nextInt();

        SolutionChocolateByNumbers solutionChocolateByNumbers = new SolutionChocolateByNumbers();
        int resultEuclideanAlgorithm = solutionChocolateByNumbers.solution(TotalNumberOfChocolates, Munched);
        System.out.println("Number of chocolates eaten using Euclidean Algorithm: " + resultEuclideanAlgorithm);
    }

    private static void calculateDistinctSlices() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter M: ");
        int M = scanner.nextInt();

        SolutionDinstinctSlices solutionDinstinctSlices = new SolutionDinstinctSlices();
        int resultSolutionDinstinctSlices = solutionDinstinctSlices.solution(M, A);
        System.out.println("Number of distinct slices eaten: " + resultSolutionDinstinctSlices);
    }

    private static void calculateDistinctSlicesAlternative() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter M: ");
        int M = scanner.nextInt();

        SolutionCountDistinctSlices solutionCountDistinctSlices = new SolutionCountDistinctSlices();
        int resultSolutionCountDistinctSlices = solutionCountDistinctSlices.solution(M, A);
        System.out.println("Number of distinct slices eaten (alternative): " + resultSolutionCountDistinctSlices);
    }

    private static void calculateIntegersDivisibleByK() {
        System.out.print("Enter Av: ");
        int Av = scanner.nextInt();
        System.out.print("Enter B: ");
        int B = scanner.nextInt();
        System.out.print("Enter K: ");
        int K = scanner.nextInt();

        SolutionCountDiv solutionCountDiv = new SolutionCountDiv();
        int resultSolutionCountDiv = solutionCountDiv.solution(Av, B, K);
        System.out.println("Number of integers divisible by " + K + " between " + Av + " and " + B + ": " + resultSolutionCountDiv);
    }

    private static void calculateFactorsOfInteger() {
        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        SolutionCountFactors solutionCountFactors = new SolutionCountFactors();
        int resultSolutionCountFactors = solutionCountFactors.solution(N);
        System.out.println("Number of factors of " + N + ": " + resultSolutionCountFactors);
    }

    private static void calculateNonDivisors() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        SolutionCountNonDivisible solutionCountNonDivisible = new SolutionCountNonDivisible();
        int[] resultSolutionCountNonDivisible = solutionCountNonDivisible.solution(A);
        System.out.println("Number of non-divisors for each element: " + Arrays.toString(resultSolutionCountNonDivisible));
    }

    private static void countSemiprimes() {
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        System.out.print("Enter the array size (P and Q): ");
        int size = scanner.nextInt();
        int[] P = new int[size];
        int[] Q = new int[size];
        System.out.println("Enter P elements:");
        for (int i = 0; i < size; i++) {
            P[i] = scanner.nextInt();
        }
        System.out.println("Enter Q elements:");
        for (int i = 0; i < size; i++) {
            Q[i] = scanner.nextInt();
        }
        SolutionCountSemiprimes solutionCountSemiprimes = new SolutionCountSemiprimes();
        int[] resultSolutionCountSemiprimes = solutionCountSemiprimes.solution(N, P, Q);
        System.out.println("Count of semiprimes within each query range: " + Arrays.toString(resultSolutionCountSemiprimes)); 		
    }	
    
    
    private static void countTriangles() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        SolutionCountTriangles solutionCountTriangles = new SolutionCountTriangles();
        int resultSolutionCountTriangles = solutionCountTriangles.solution(A);
        System.out.println("Number of triangles that can be formed: " + resultSolutionCountTriangles);
    }

    private static void performCyclicRotation() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter number of clyclic rotation u prefer: ");
        int K = scanner.nextInt();

        SolutionCyclicRotation solutionCyclicRotation = new SolutionCyclicRotation();
        int[] resultSolutionCyclicRotation = solutionCyclicRotation.solution(A, K);
        System.out.println("Array after cyclic rotation: " + Arrays.toString(resultSolutionCyclicRotation));
    }

    private static void calculateDistinctElements() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        SolutionDistinct solutionDistinct = new SolutionDistinct();
        int resultSolutionDistinct = solutionDistinct.solution(A);
        System.out.println("Number of distinct elements: " + resultSolutionDistinct);
    }

    private static void findDominatorIndex() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        SolutionDominator solutionDominator = new SolutionDominator();
        int dominatorIndex = solutionDominator.solution(A);
        if (dominatorIndex != -1) {
            System.out.println("The dominator index is: " + dominatorIndex);
        } else {
            System.out.println("There is no dominator in the array.");
        }
    }

    private static void calculateEquiLeaders() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        SolutionEquiLeader solutionEquiLeader = new SolutionEquiLeader();
        int equiLeaders = solutionEquiLeader.solution(A);
        System.out.println("Number of equi leaders: " + equiLeaders);
    }

    private static void calculateMinimumJumps() {
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] A1 = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A1[i] = scanner.nextInt();
        }

        SolutionFibFrog solutionFibFrog = new SolutionFibFrog();
        int minJumps = solutionFibFrog.solution(A1);
        System.out.println("Minimum number of jumps needed: " + minJumps);
    }

    private static void calculateFishAlive() {
        System.out.print("Enter the array size (FishSize and FishDirection): ");
        int size = scanner.nextInt();
        int[] FishSize = new int[size];
        int[] FishDirection = new int[size];
        System.out.println("Enter FishSize elements:");
        for (int i = 0; i < size; i++) {
            FishSize[i] = scanner.nextInt();
        }
        System.out.println("Enter FishDirection elements:");
        for (int i = 0; i < size; i++) {
            FishDirection[i] = scanner.nextInt();
        }
        SolutionFish solutionFish = new SolutionFish();
        int numAlive = solutionFish.solution(FishSize, FishDirection);
        System.out.println("Number of fish alive after encounters: " + numAlive);
    }

    private static void calculateJumpsNeededForFrog() {
        System.out.print("Enter X: ");
        int X = scanner.nextInt();
        System.out.print("Enter Y: ");
        int Y = scanner.nextInt();
        System.out.print("Enter D: ");
        int D = scanner.nextInt();

        SolutionFrogJmp solutionFrogJmp = new SolutionFrogJmp();
        int numJumps = solutionFrogJmp.solution(X, Y, D);
        System.out.println("Number of jumps needed for the frog to cross the river: " + numJumps);
    }

    private static void calculateEarliestFrogJumpTime() {
        System.out.print("Enter the number of leaves: ");
        int leaves = scanner.nextInt();
        System.out.print("Enter the array size (fallingLeaves): ");
        int size = scanner.nextInt();
        int[] fallingLeaves = new int[size];
        System.out.println("Enter fallingLeaves elements:");
        for (int i = 0; i < size; i++) {
            fallingLeaves[i] = scanner.nextInt();
        }

        SolutionFrogRiverOne solutionFrogRiverOne = new SolutionFrogRiverOne();
        int earliestTime = solutionFrogRiverOne.solution(leaves, fallingLeaves);
        if (earliestTime == -1) {
            System.out.println("The frog is unable to cross the river.");
        } else {
            System.out.println("The frog can cross the river at time: " + earliestTime);
        }
    }

    private static void calculateMinimalImpactFactors() {
        System.out.print("Enter a DNA sequence (String S): ");
        String S = scanner.nextLine();
        System.out.print("Enter the array size (P1 and Q1): ");
        int size = scanner.nextInt();
        int[] P1 = new int[size];
        int[] Q1 = new int[size];
        System.out.println("Enter P1 elements:");
        for (int i = 0; i < size; i++) {
            P1[i] = scanner.nextInt();
        }
        System.out.println("Enter Q1 elements:");
        for (int i = 0; i < size; i++) {
            Q1[i] = scanner.nextInt();
        }

        SolutionGenomicRangeQuery solutionSolutionGenomicRangeQuery = new SolutionGenomicRangeQuery();
        int[] resultSolutionGenomicRangeQuery = solutionSolutionGenomicRangeQuery.solution(S, P1, Q1);
        System.out.println("Minimal impact factors of each query: " + Arrays.toString(resultSolutionGenomicRangeQuery));
    }

    
    private static void calculateWaysToClimbLadder() {
        System.out.print("Enter the number of rungs in the ladder: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("Enter the rungs and their modulo values (comma-separated):");
        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split(",");
            A[i] = Integer.parseInt(input[0]);
            B[i] = Integer.parseInt(input[1]);
        }

        SolutionLadder solutionLadder = new SolutionLadder();
        int[] results = solutionLadder.solution(A, B);

        System.out.println("Number of ways to climb the ladder with respective modulo values:");
        for (int i = 0; i < n; i++) {
            System.out.println("For rungs=" + A[i] + ", modulo=" + B[i] + ", ways=" + results[i]);
        }
    }
    
    
    private static void calculateMaxCounters() {
        System.out.print("Enter the value of N (number of counters): ");
        int N = scanner.nextInt();
        System.out.print("Enter the size of the array A: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array A:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        SolutionMaxCounters solutionMaxCounters = new SolutionMaxCounters();
        int[] result = solutionMaxCounters.solution(N, A);

        System.out.println("Max counters after operations: " + Arrays.toString(result));
    }
    
    
    private static void calculateMaxDoubleSliceSum() {
        System.out.print("Enter the size of the array A: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array A:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        SolutionMaxDoubleSliceSum solutionMaxDoubleSliceSum = new SolutionMaxDoubleSliceSum();
        int result = solutionMaxDoubleSliceSum.solution(A);
        System.out.println("Max double slice sum: " + result);
    }
    
    private static void calculateMaxNonoverlappingSegments() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the arrays A and B: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        int[] B = new int[size];
        System.out.println("Enter the elements of the array A (left ends):");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of the array B (right ends):");
        for (int i = 0; i < size; i++) {
            B[i] = scanner.nextInt();
        }
        scanner.close();

        SolutionMaxNonoverlappingSegments solutionMaxNonoverlappingSegments = new SolutionMaxNonoverlappingSegments();
        int result = solutionMaxNonoverlappingSegments.solution(A, B);

        System.out.println("Max number of non-overlapping segments: " + result);
    }
    
    
    private static void calculateMaxProductOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array A: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array A:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        SolutionMaxProductOfThree solutionMaxProductOfThree = new SolutionMaxProductOfThree();
        int result = solutionMaxProductOfThree.solution(A);

        System.out.println("Max product of three elements: " + result);
    }
    
    
    private static void calculateMaxProfit() {
        System.out.print("Enter the size of the array A: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array A:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        SolutionMaxProfit solutionMaxProfit = new SolutionMaxProfit();
        int result = solutionMaxProfit.solution(A);

        System.out.println("Max profit: " + result);
    }
    
    
    private static void calculateMaxSliceSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array A: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array A:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        SolutionMaxSliceSuma solutionMaxSliceSuma = new SolutionMaxSliceSuma();
        int result = solutionMaxSliceSuma.solution(A);

        System.out.println("Max slice sum: " + result);
    }
    
    
    private static void calculateMinAvgTwoSlice() {
        System.out.print("Enter the size of the array A: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array A:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        SolutionMinAvgTwoSlice solutionMinAvgTwoSlice = new SolutionMinAvgTwoSlice();
        int result = solutionMinAvgTwoSlice.solution(A);

        System.out.println("Start position of the minimum average two slice: " + result);
    }
   
    
    private static void calculateMinMaxDivision() {
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();
        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();
        System.out.print("Enter the size of the array A: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter the elements of the array A:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        SolutionMinMaxDivision solutionMinMaxDivision = new SolutionMinMaxDivision();
        int result = solutionMinMaxDivision.solution(K, M, A);

        System.out.println("The minimal large sum is: " + result);
    }
    
    private static void calculateMinPerimeterRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        SolutionMinPerimeterRectangle solutionMinPerimeterRectangle = new SolutionMinPerimeterRectangle();
        int result = solutionMinPerimeterRectangle.solution(N);

        System.out.println("The minimal perimeter of the rectangle is: " + result);
    }
    
    
    private static int findMissingInteger(int[] A) {
        SolutionMissingInteger solutionMissingInteger = new SolutionMissingInteger();
        return solutionMissingInteger.solution(A);
    }
    
    private static int checkIfProperlyNested(String S) {
        SolutionNesting solutionNesting = new SolutionNesting();
        return solutionNesting.solution(S);
    }
    
    
    private static int findNumberOfIntersections(int[] discs) {
        SolutionNumberOfDiscIntersections solution = new SolutionNumberOfDiscIntersections();
        return solution.solution(discs);
    }
    
    private static int findMaximumScore(int[] array) {
        SolutionNumberSolitaire solution = new SolutionNumberSolitaire();
        return solution.solution(array);
    }
    
    private static int findUnpairedElement(int[] array) {
        SolutionOddOccurrencesInArray solution = new SolutionOddOccurrencesInArray();
        return solution.solution(array);
    }
    
    private static int countPassingCars(int[] array) {
        SolutionPassingCars solution = new SolutionPassingCars();
        return solution.solution(array);
    }

    
    private static int findMaxNumberOfBlocks(int[] array) {
        SolutionPeaks solution = new SolutionPeaks();
        return solution.solution(array);
    }
    
    private static String checkPermutation(int[] array) {
        SolutionPermCheck solution = new SolutionPermCheck();
        int permCheck = solution.solution(array);
        return permCheck == 1 ? "Yes" : "No";
    }
    
    private static int countBlocks(int[] heights) {
        SolutionStoneWall solution = new SolutionStoneWall();
        return solution.solution(heights);
    }
    
    private static int findMinimumDifference(int[] array) {
        SolutionTapeEquilibrium solution = new SolutionTapeEquilibrium();
        return solution.solution(array);
    }
    
    private static int countTiedRopes(int K, int[] ropes) {
        SolutionTieRopes solution = new SolutionTieRopes();
        return solution.solution(K, ropes);
    }
    
    private static int solutionTriangle(int[] A) {
        Arrays.sort(A);
        for (int i = 2; i < A.length; i++) {
            if ((long) A[i - 2] + (long) A[i - 1] > (long) A[i])
                return 1;
        }
        return 0;
    }
    
    private static int solutionMinAbsSum(int[] A) {
    	 // Create an instance of the class containing the solution method
        MinAbsSum solutionClass = new MinAbsSum();


        // Call the solution method and print the result
        int result = solutionClass.solution(A);
        System.out.println("Result: " + result);
		return result;
    }
    
    
    
    
    
}
