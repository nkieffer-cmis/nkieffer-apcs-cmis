public class QuizSol
{
    public static long recursions = 0;
    public static void main(String[] args){
        for(int i = 10; i < 11; i++){
            System.out.println(factorial(i));
        }
        for(int i = 0; i < 100; i++){
            int[] array = Util.getArray(i, ArrayType.RANDOM);
            Util.print(array);
            long start = System.nanoTime();
            recursions = 0;
            kiefferSort(array);
            Util.print(array);
            System.out.format("%d: %d %d\n",i, recursions, System.nanoTime() - start);
        }
    }

    public static int factorial(int n){
        // 2pts (1 for each base case)
        if(n == 0 || n == 1){
            return 1;
        }else{
            //1 point for recursive call
            //1 point for decrementation
            //1 point for multiplication
            return n * factorial(n-1);
        }
    }

    public static int[] kiefferSort(int[] array){
        boolean sorted = true;
        //2 pts for correctly determining if array is sorted.
        for(int i = 0; sorted == true && i < array.length - 1; i++){
            sorted = array[i] <= array[i + 1];
        }
        
        if(sorted){
        //1 pt for base case
            return array;
        }else{
            //2 pts for correctly swapping first value with 1 at random
            int tmp = array[0];
            int swapIdx = (int)(Math.random() * array.length);
            array[0] = array[swapIdx];
            array[swapIdx] = tmp;
            //2 pts for returning recursive call.
            return kiefferSort(array);
        }
    }
}
