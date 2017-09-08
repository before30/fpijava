package cc.before30.fpij.types;

import java.util.Objects;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 6:29
 */
@FunctionalInterface
public interface Predicate5<T1, T2, T3, T4, T5> {

	boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

	default Predicate4<T2, T3, T4, T5> curried(T1 t1) {
		return (t2, t3, t4, t5) -> test(t1, t2, t3, t4, t5);
	}

	default Predicate5<T1, T2, T3, T4, T5> and(final Predicate5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) ->
			test(t1, t2, t3, t4, t5) &&
				other.test(t1, t2, t3, t4, t5);
	}

	default Predicate5<T1, T2, T3, T4, T5> negate() {
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) -> !test(t1, t2, t3, t4, t5);
	}

	default Predicate5<T1, T2, T3, T4, T5> or(final Predicate5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) ->
			test(t1, t2, t3, t4, t5) ||
				other.test(t1, t2, t3, t4, t5);
	}
}
