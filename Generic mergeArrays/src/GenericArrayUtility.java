import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] a, T[] b) {
        T[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
//
////      This is nomal way
//    public static int[] mergeArrays(int[] a,int[] b){
//        int[] combinedNumbers = new int[a.length + b.length];
//        System.arraycopy(a,0,combinedNumbers,0,a.length);
//        System.arraycopy(b,0,combinedNumbers,a.length,b.length);
//
//        return combinedNumbers;

//    }

}















