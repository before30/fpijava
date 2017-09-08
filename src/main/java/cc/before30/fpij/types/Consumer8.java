package cc.before30.fpij.types;

import java.util.Objects;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 5:38
 */
@FunctionalInterface
public interface Consumer8<T1, T2, T3, T4, T5, T6, T7, T8> {

	void accept(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

	default Consumer7<T2, T3, T4, T5, T6, T7, T8> curried(final T1 t1) {
		return (t2, t3, t4, t5, t6, t7, t8) -> accept(t1, t2, t3, t4, t5, t6, t7, t8);
	}

	default Consumer8<T1, T2, T3, T4, T5, T6, T7, T8> andThen(
		Consumer8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> after) {

		Objects.requireNonNull(after);
		return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
			accept(t1, t2, t3, t4, t5, t6, t7, t8);
			after.accept(t1, t2, t3, t4, t5, t6, t7, t8);
		};
	}
}
