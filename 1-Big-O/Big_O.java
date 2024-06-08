public class Big_O {
    public static void main(String[] args) {
        /*
         * What is Big-O?
         * Big-O is the language and metric we use to describe the efficiency of algorithms.
         * e.g sending file to your friend via internet it depends on file of size if this file size is larger then it will take longer time to be send and if smaller then it will take lesser time to complete That's the Time Complexity comes in picture
         * Time Complexity -> A way of showing how the runtime of a function increases as the size of input increases.
         * space complexity -> space complexity is the amount of the memory that some code used
         * 
         * Big-O Notations
         * -Big O -> It is a complexity that is going to be less or equal to the worst case
         * -Big Omega -> It is a complexity that is going to be at least more than the best case.
         * -Big Theta -> It is a complexity that is within bounds of the worst and the best cases
         * 
         * RUNTIME COMPLEXITIES
         * O(1) -> A simple add numbers function
         * O(N) -> Linear -> Loop through numbers from 1 to n
         * O(Log N) -> Logarithmic -> Find an element in sorted array
         * O(n square) -> Quadratic -> Nested Loops
         * 
         * Why we drop constants.?
         * - It is very possible that O(N) code is faster than O(1) code for specific inputs
         * - Different computer with different architectures have different constant factors
         * -> Fast Computer Fast memory access Lower constant
         * -> Slow computer Slow memory access Higher constant
         * -> Different algorithms with the same basic idea and computational complexity might have slightly different constants
         * e.g -> a * (b - c) vs a * b = a * c
         * As n -> infinite, constant factors are not really a big deal
         * 
         * Droping the non dominant terms -> O(n2 + n) -> here n Square is dominant term and n is non-dominant term here we can drop n as non-dominant term
         * 
         * O(Log N) --> Here we divide by 2 with each iteration
         * 2 rase to 3 = 8 -> here 2 is that we divide the list in 2 part in each iteration and here 3 is how many time we divide the list 
         * log 8 base 2 = 3
         * Here we are looking for what power is equal to 8
         * The real power of logarithms is the list as very large number
         * 
         * Add and two parameter with two loops -> Add the Runtimes: O(A + B) -> If your algorithm is in the form "do this, then when you are all done, do that" then you add the runtimes 
         * 
         * Multiply and two parameter with two nested loops -> multiply the Runtimes: O(A * B) -> If your algorithm is in the form "do this for each time you do that" then you multiply the runtimes
         * 
         * 
         * Space Complexity
         * 
         * 
         * How to measure the code using big-O
         * Rule-1 => Any assignment statements and if statements that are executed once regardless of the size of the problem -Complexity-> O(1)
         * Rule-2 => A simple "for" loop from 0 to n (with no internal loops) -Complexity-> O(n)
         * Rule-3 => A nested loop of the same type takes quadratic time complexity -Complexity-> O(n square)
         * Rule-4 => A loop, in which the controlling parameter is divided by two at each step -Complexity-> O(log n)
         * Rule-5 => When dealing with multiple statements, just add them up -Complexity-> this is to get the final time complexity
         * 
         * 
         * int sum = 0;
         * for (int i = 0; i < n;i++) {
         *      sum += i;
         * }
         * TC -> The loop iterates 'n' times, performing a constant amount of work during each iteration, Therefore, the time complexity is O(n);
         * 
         *  for (int i = 1; i <= n;i *= 2) {
         *       print(i);
         * }
         * TC -> The loop iterates 'log n' times as the value of 'i' doubles in each iteration. Therefore, the time complexity is O(log n).
         * 
         * int sum = 0;
         * for (int i = 0;i < n; i++) {
         * for(int j = 0;i < n;j++) {
         * sum += i * j;
         * }
         * }
         */
    }
}
