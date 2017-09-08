package cc.before30.fpij.types;

import java.util.Objects;

/**
 * Created by before30 on 08/09/2017.
 */
@FunctionalInterface
public interface Predicate13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {

    boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13);

    default Predicate12<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> curried(T1 t1) {
        return (t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)
                -> test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
    }

    default Predicate13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(
            final Predicate13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
                    ? super T6, ? super T7, ? super T8, ? super T9, ? super T10,
                    ? super T11, ? super T12, ? super T13> other) {
        Objects.requireNonNull(other);
        return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13) ->
                test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) &&
                        other.test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
    }

    default Predicate13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> negate() {
        return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13)
                -> !test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
    }

    default Predicate13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> or(
            final Predicate13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
                    ? super T6, ? super T7, ? super T8, ? super T9, ? super T10,
                    ? super T11, ? super T12, ? super T13> other) {
        Objects.requireNonNull(other);
        return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13) ->
                test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) ||
                        other.test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
    }
}