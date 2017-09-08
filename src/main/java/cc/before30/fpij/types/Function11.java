package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.Function;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 3:35
 */
@FunctionalInterface
public interface Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> {

	R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

	default Function10<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> curried(final T1 t1) {
		return (t2, t3, t4, t5, t6, t7, t8, t9, t10, t11) -> apply(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11);
	}

	default<V> Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, V> andThen(final Function<? super R, ? extends V> after) {
		Objects.requireNonNull(after);
		return (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11) -> after.apply(apply(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11));
	}
}
