package cc.before30.fpij.types;

import java.util.Objects;

/**
 * Created by before30 on 08/09/2017.
 */
@FunctionalInterface
public interface Consumer3<T1, T2, T3> {

    void accept(T1 t1, T2 t2, T3 t3);

    default Consumer2<T2, T3> curried(final T1 t1) {
        return (t2, t3) -> accept(t1, t2, t3);
    }

    default Consumer3<T1, T2, T3> andThen(Consumer3<? super T1, ?super T2, ? super T3> after) {
        Objects.requireNonNull(after);
        return (t1, t2, t3) -> {
            accept(t1, t2, t3);
            after.accept(t1, t2, t3);
        };
    }
}
