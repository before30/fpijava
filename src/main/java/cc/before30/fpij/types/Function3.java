package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.Function;

/**
 * Created by before30 on 08/09/2017.
 */
@FunctionalInterface
public interface Function3<T1, T2, T3, R> {
    R apply(T1 t1, T2 t2, T3 t3);

    default Function2<T2, T3, R> curried(final T1 t1) {
        return (t2, t3) -> apply(t1, t2, t3);
    }

    default <V> Function3<T1, T2, T3, V> andThen(final Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (t1, t2, t3) -> after.apply(apply(t1, t2, t3));
    }
}
