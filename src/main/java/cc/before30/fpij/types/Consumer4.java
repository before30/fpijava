package cc.before30.fpij.types;

import java.util.Objects;

/**
 * User: before30 
 * Date: 2017. 9. 8.
 * Time: PM 5:32
 */
@FunctionalInterface
public interface Consumer4<T1, T2, T3, T4> {

	void accept(T1 t1, T2 t2, T3 t3, T4 t4);

	default Consumer3<T2, T3, T4> curried(final T1 t1) {
		return (t2, t3, t4) -> accept(t1, t2, t3, t4);
	}

	default Consumer4<T1, T2, T3, T4> andThen(Consumer4<? super T1, ? super T2, ? super T3, ? super T4> after) {

		Objects.requireNonNull(after);
		return (t1, t2, t3, t4) -> {
			accept(t1, t2, t3, t4);
			after.accept(t1, t2, t3, t4);
		};
	}
}
