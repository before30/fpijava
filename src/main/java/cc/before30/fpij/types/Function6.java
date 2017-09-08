package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.Function;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 3:29
 */
@FunctionalInterface
public interface Function6<T1, T2, T3, T4, T5, T6, R> {

	R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);

	default Function5<T2, T3, T4, T5, T6, R> curried(final T1 t1) {
		return (t2, t3, t4, t5, t6) -> apply(t1, t2, t3, t4, t5, t6);
	}

	default<V> Function6<T1, T2, T3, T4, T5, T6, V> andThen(final Function<? super R, ? extends V> after) {
		Objects.requireNonNull(after);
		return (t1, t2, t3, t4, t5, t6) -> after.apply(apply(t1, t2, t3, t4, t5, t6));
	}
}