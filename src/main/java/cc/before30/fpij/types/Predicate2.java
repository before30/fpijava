package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by before30 on 08/09/2017.
 */
public interface Predicate2<T1, T2> extends BiPredicate<T1, T2> {

    @Override
    boolean test(T1 t1, T2 t2);

    default Predicate<T2> curried(final T1 t1) {
        return (t2) -> test(t1, t2);
    }

    @Override
    default BiPredicate<T1, T2> and(BiPredicate<? super T1, ? super T2> other) {
        Objects.requireNonNull(other);
        return (T1 t1, T2 t2) -> test(t1, t2) && other.test(t1, t2);
    }

    @Override
    default BiPredicate<T1, T2> or(BiPredicate<? super T1, ? super T2> other) {
        Objects.requireNonNull(other);
        return (T1 t1, T2 t2) ->
                test(t1, t2) ||
                        other.test(t1, t2);
    }
}