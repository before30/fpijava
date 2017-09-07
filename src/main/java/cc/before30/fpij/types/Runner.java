package cc.before30.fpij.types;

import java.util.Objects;

/**
 * Created by before30 on 08/09/2017.
 */
@FunctionalInterface
public interface Runner {

    void run();

    default Runner andThen(final Runner after) {
        Objects.requireNonNull(after);
        return () -> {
            run();
            after.run();
        };
    }
}
