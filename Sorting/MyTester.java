public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 10000;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }   
        long start, stop, btime, itime, stime, mtime;
        long btotalTime = 0;
        long btotalSteps = 0;
        long mtotalTime = 0;
        long mtotalSteps = 0;
        int runs;
        System.out.format("%d Unsorted Integers\n", n);

        for(runs = 0; runs < 10; runs++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            btotalTime+=btime;
            btotalSteps += BubbleSort.steps;
            BubbleSort.steps = 0;
            //             
            for(int i = 0; i < array.length; i++){
                array[i] = tmp[i];
            }
            start = System.nanoTime(); 
            InsertionSort.sort(array);
            mtime = System.nanoTime() - start;
            mtotalTime+=mtime;
            mtotalSteps += InsertionSort.steps;
            InsertionSort.steps = 0;

            array = Util.getArray(n, at);
            for(int i = 0; i < array.length; i++){
                tmp[i] = array[i];
            } 
        }

        long bavgTime = (long)(btotalTime/(double)runs);
        long bavgSteps = (long)(btotalSteps/(double)runs);
        System.out.println("BubbleSort Avg Runtime: " + bavgTime);
        System.out.println("BubbleSort Avg Steps: " + bavgSteps);

        long mavgTime = (long)(mtotalTime/(double)runs);
        long mavgSteps = (long)(mtotalSteps/(double)runs);
        System.out.println("InsertionSort Avg Runtime: " + mavgTime);
        System.out.println("InsertionSort Avg Steps: " + mavgSteps);
        System.out.println();

    }
}
