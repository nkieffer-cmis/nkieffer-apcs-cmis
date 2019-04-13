public class RecursionSortingQuiz
{
    public static void main(String[] args){
        System.out.println("Let's recurse!");
        System.out.println(factorial(12));
        int[] array = Util.getArray(10, ArrayType.RANDOM);
        Util.print(array);
        array = kiefferSort(array);
        Util.print(array);
    }

    /**
     * @param n the value
     * @return n!
     * 
     * Factorials
     * n! => n * n-1 * n-2 * ... * n -(n-1)
     * 10! => 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 3628800
     * 5! => 5 * 4 * 3 * 2 * 1 => 120
     * 0! => 1
     */
    public static int factorial(int n){
        //base case
        if(n == 0){
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    /**
     * @param array the array to be sorted
     * @return a sorted array
     */
    public static int[] kiefferSort(int[] array){
        boolean sorted = true;
        for(int i = 0; sorted && i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                sorted = false;
            }
        }

        if(sorted){
            return array;
        }else{
            int ri = (int)(Math.random() * (array.length - 1)) + 1;
            int temp = array[0];
            array[0] = array[ri];
            array[ri] = temp;
            return kiefferSort(array);
        }
    }
}
