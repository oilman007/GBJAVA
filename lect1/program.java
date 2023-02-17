package lect1;
import java.util.List;
import java.util.Arrays;
/**
 * program
 */
public class program {

    public static void main(String[] args)   {
        
        int size = 10;
        Integer[] ra = RandomArray(size, 1, 100);

        java.util.ArrayList<Integer> myList = new java.util.ArrayList<Integer>();
        
        for(int i=0; i<size; ++i){
            if(ra[i]%2==0)
                myList.add(ra[i]);
        }

        System.out.println(Arrays.toString(ra));
        System.out.println(myList.toString());

    }


    public static Integer[] RandomArray(int size, int min, int max) {
        Integer[] result = new Integer[size];
        for(int i=0; i < size; ++i)
            result[i] = new java.util.Random().nextInt(min, max);
        return result;
    }


}