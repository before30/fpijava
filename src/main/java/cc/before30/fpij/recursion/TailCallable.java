package cc.before30.fpij.recursion;

/**
 * Created by before30 on 07/09/2017.
 */
@FunctionalInterface
public interface TailCallable<T> {
    TailCallable<T> next();

    default boolean isDone() {
        return false;
    }

    default T result() {
        throw new RuntimeException("It does not have the result yet");
    }
}
