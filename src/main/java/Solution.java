public class Solution {
    public int[] plusOne(int[] digits) {
        int lengthOfArray = digits.length;

        // iterate from the back of the array to the front
        for (int i = lengthOfArray - 1; i >= 0; i--) {

            // this is the "easy" case.
            // if the number at the index is NOT a 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // if the number is a 9, you need to change it to 0
            digits[i] = 0;
        }

        // in the case all the numbers are 9
        // example: [9, 9, 9]
        // you need to declare a new array
        int[] newArray = new int[lengthOfArray + 1];

        // make the first number (front) of the array a 1
        // all remaining elements that are not index 0 will be zero by default
        newArray[0] = 1;

        // return new array
        return newArray;
    }
}
