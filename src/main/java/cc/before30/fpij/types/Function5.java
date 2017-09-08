package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.Function;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 3:26
 */
@FunctionalInterface
public interface Function5<T1, T2, T3, T4, T5, R> {

	R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

	default Function4<T2, T3, T4, T5, R> curried(final T1 t1) {
		return (t2, t3, t4, t5) -> apply(t1, t2, t3, t4, t5);
	}

	default<V> Function5<T1, T2, T3, T4, T5, V> andThen(final Function<? super R, ? extends V> after) {

		Objects.requireNonNull(after);
		return (t1, t2, t3, t4, t5) -> after.apply(apply(t1, t2, t3, t4, t5));
	}
}
