package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by before30 on 08/09/2017.
 */
@FunctionalInterface
public interface Function2<T1, T2, R> extends BiFunction<T1, T2, R> {

    @Override
    R apply(T1 t1, T2 t2);

    default Function<T2, R> curried(final T1 t1) {
        return (t2) -> apply(t1, t2);
    }

    @Override
    default <V> BiFunction<T1, T2, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (input1, input2) -> after.apply(apply(input1, input2));
    }
}
