package cc.before30.fpij.types;

import java.util.Objects;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 6:27
 */
@FunctionalInterface
public interface Predicate4<T1, T2, T3, T4> {

	boolean test(T1 t1, T2 t2, T3 t3, T4 t4);

	default Predicate3<T2, T3, T4> curried(T1 t1) {
		return (t2, t3, t4) -> test(t1, t2, t3, t4);
	}

	default Predicate4<T1, T2, T3, T4> and(final Predicate4<? super T1, ? super T2, ? super T3, ? super T4> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4) ->
			test(t1, t2, t3, t4) &&
				other.test(t1, t2, t3, t4);
	}

	default Predicate4<T1, T2, T3, T4> negate() {
		return (T1 t1, T2 t2, T3 t3, T4 t4) -> !test(t1, t2, t3, t4);
	}

	default Predicate4<T1, T2, T3, T4> or(final Predicate4<? super T1, ? super T2, ? super T3, ? super T4> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4) ->
			test(t1, t2, t3, t4) ||
				other.test(t1, t2, t3, t4);
	}
}
