package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.Function;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: AM 9:47
 */
@FunctionalInterface
public interface Function4<T1, T2, T3, T4, R> {

	R apply(T1 t1, T2 t2, T3 t3, T4 t4);

	default Function3<T2, T3, T4, R> curried(final T1 t1) {
		return (t2, t3, t4) -> apply(t1, t2, t3, t4);
	}

	default<V> Function4<T1, T2, T3, T4, V> andThen(final Function<? super R, ? extends V> after) {
		Objects.requireNonNull(after);
		return (t1, t2, t3, t4) -> after.apply(apply(t1, t2, t3, t4));
	}
}
