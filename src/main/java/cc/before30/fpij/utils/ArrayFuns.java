package cc.before30.fpij.utils;

/**
 * Created by before30 on 09/09/2017.
 */
public class ArrayFuns {

    private ArrayFuns() {}

    public static <T> boolean isEmpty(final T[] array) {
        return array == null || array.length == 0;
    }

    public static <T> boolean isNotEmpty(final T[] array) {
        return !isEmpty(array);
    }

    public static boolean isEmpty(final int[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isNotEmpty(final int[] array) {
        return !isEmpty(array);
    }

    public static boolean isEmpty(final long[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isNotEmpty(final long[] array) {
        return !isEmpty(array);
    }

    public static boolean isEmpty(final double[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isNotEmpty(final double[] array) {
        return !isEmpty(array);
    }

}
