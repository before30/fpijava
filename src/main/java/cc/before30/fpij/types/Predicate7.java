package cc.before30.fpij.types;

import java.util.Objects;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 6:34
 */
@FunctionalInterface
public interface Predicate7<T1, T2, T3, T4, T5, T6, T7> {

	boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7);

	default Predicate6<T2, T3, T4, T5, T6, T7> curried(T1 t1) {
		return (t2, t3, t4, t5, t6, t7)
			-> test(t1, t2, t3, t4, t5, t6, t7);
	}

	default Predicate7<T1, T2, T3, T4, T5, T6, T7> and(final Predicate7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
		? super T6, ? super T7> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) ->
			test(t1, t2, t3, t4, t5, t6, t7) &&
				other.test(t1, t2, t3, t4, t5, t6, t7);
	}

	default Predicate7<T1, T2, T3, T4, T5, T6, T7> negate() {
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7)
			-> !test(t1, t2, t3, t4, t5, t6, t7);
	}

	default Predicate7<T1, T2, T3, T4, T5, T6, T7> or(final Predicate7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
		? super T6, ? super T7> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) ->
			test(t1, t2, t3, t4, t5, t6, t7) ||
				other.test(t1, t2, t3, t4, t5, t6, t7);
	}
}
