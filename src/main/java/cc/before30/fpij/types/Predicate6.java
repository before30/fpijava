package cc.before30.fpij.types;

import java.util.Objects;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 6:31
 */
@FunctionalInterface
public interface Predicate6<T1, T2, T3, T4, T5, T6> {

	boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);

	default Predicate5<T2, T3, T4, T5, T6> curried(T1 t1) {
		return (t2, t3, t4, t5, t6) -> test(t1, t2, t3, t4, t5, t6);
	}

	default Predicate6<T1, T2, T3, T4, T5, T6> and(final Predicate6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
		? super T6> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) ->
			test(t1, t2, t3, t4, t5, t6) &&
				other.test(t1, t2, t3, t4, t5, t6);
	}

	default Predicate6<T1, T2, T3, T4, T5, T6> negate() {
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6)
			-> !test(t1, t2, t3, t4, t5, t6);
	}

	default Predicate6<T1, T2, T3, T4, T5, T6> or(final Predicate6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
		? super T6> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) ->
			test(t1, t2, t3, t4, t5, t6) ||
				other.test(t1, t2, t3, t4, t5, t6);
	}
}
