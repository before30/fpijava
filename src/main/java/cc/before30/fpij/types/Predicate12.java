package cc.before30.fpij.types;

import java.util.Objects;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 6:43
 */
@FunctionalInterface
public interface Predicate12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {

	boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12);

	default Predicate11<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> curried(T1 t1) {
		return (t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)
			-> test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
	}

	default Predicate12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Predicate12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
		? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12) ->
			test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12) &&
				other.test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
	}

	default Predicate12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> negate() {
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12)
			-> !test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
	}

	default Predicate12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> or(final Predicate12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
		? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12> other) {
		Objects.requireNonNull(other);
		return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12) ->
			test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12) ||
				other.test(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
	}
}
