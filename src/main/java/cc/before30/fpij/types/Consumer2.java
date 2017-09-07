package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by before30 on 08/09/2017.
 */
public interface Consumer2<T1, T2> extends BiConsumer<T1, T2> {
    @Override
    void accept(T1 t1, T2 t2);

    default Consumer<T2> curried(final T1 t1) {
        return (t2) -> accept(t1, t2);
    }

    @Override
    default BiConsumer<T1, T2> andThen(BiConsumer<? super T1, ? super T2> after) {
        Objects.requireNonNull(after);
        return (input1, input2) -> {
            accept(input1, input2);
            after.accept(input1, input2);
        };
    }
}
