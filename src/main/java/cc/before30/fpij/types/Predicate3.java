package cc.before30.fpij.types;

import java.util.Objects;

/**
 * Created by before30 on 08/09/2017.
 */
@FunctionalInterface
public interface Predicate3<T1, T2, T3> {

    boolean test(T1 t1, T2 t2, T3 t3);

    default Predicate2<T2, T3> curried(T1 t1) {
        return (t2, t3) -> test(t1, t2, t3);
    }

    default Predicate3<T1, T2, T3> and(final Predicate3<? super T1, ? super T2, ? super T3> other) {
        Objects.requireNonNull(other);
        return (T1 t1, T2 t2, T3 t3) ->
                test(t1, t2, t3) &&
                    other.test(t1, t2, t3);
    }

    default Predicate3<T1, T2, T3> negate() {
        return (T1 t1, T2 t2, T3 t3) -> !test(t1, t2, t3);
    }

    default Predicate3<T1, T2, T3> or(final Predicate3<? super T1, ? super T2, ? super T3> other) {
        Objects.requireNonNull(other);
        return (T1 t1, T2 t2, T3 t3) ->
                test(t1, t2, t3) ||
                        other.test(t1, t2, t3);
    }

}
