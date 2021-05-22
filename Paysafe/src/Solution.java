public class Solution {
    public static void main(String[] args) {
        //Имаме масив от числа, съдържащ поне 3 елемента. Да се намери индексът на елемента, който разделя масива на 2 равни суми.
        //[1, 2, 3, 4, 5, 10] -> 4  - 1 + 2 + 3 + 4 = 10 == 10, 5 разделя масива на две равни суми -> индексът на 5 е 4
        //[-10, 0, 0, 0, 0, 0, 0, -10] -> 1
        int[] arr1 = {1, 2, 3, 4, 5, 10};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 2, 2, 2, 2, 2, 2, 2, -5, 16};
        int[] arr4 = {-10, 0, 0, 0, 0, 1, 5, -9};
        int[] arr5 = {-5, 5, 0, 5, -5};
        int[] arr6 = {-10, 0, 0, 0, 0, 0, 0, -10};
        int[] arr7 = {-1, -2, -3, -4, -5, -6};
        int[] arr8 = {-1, -2, -3, -4, -5, -6, 21, 21, -42};

        System.out.println("Result 1: " + findIndex(arr1) + ". Correct: " + (findIndex(arr1) == 4));
        System.out.println("Result 2: " + findIndex(arr2) + ". Correct: " + (findIndex(arr2) == -1));
        System.out.println("Result 3: " + findIndex(arr3) + ". Correct: " + (findIndex(arr3) == 8));
        System.out.println("Result 4: " + findIndex(arr4) + ". Correct: " + (findIndex(arr4) == 6));
        System.out.println("Result 5: " + findIndex(arr5) + ". Correct: " + (findIndex(arr5) == 2));
        System.out.println("Result 6: " + findIndex(arr6) + ". Correct: " + (findIndex(arr6) == 1));
        System.out.println("Result 7: " + findIndex(arr7) + ". Correct: " + (findIndex(arr7) == -1));
        System.out.println("Result 8: " + findIndex(arr8) + ". Correct: " + (findIndex(arr8) == 6));
    }

    private static int findIndex(int[] array) {
        int sum1 = 0;
        int delimiter = array.length - 2;
        for (int i = 0; i < delimiter; i++) {
            sum1 += array[i];
        }
        int sum2 = array[array.length - 1];
        for (int i = array.length - 1; i > 1; i--) {
            if(sum1 == sum2){
                return delimiter;
            }
            sum1 -= array[--delimiter];
            sum2 += array[i-1];

        }
        return -1;
    }
}