package cc.before30.fpij.recursion;

import java.util.stream.Stream;

/**
 * Created by before30 on 07/09/2017.
 */
public final class TailCalls {

    private static class Result<T> implements TailCallable<T> {
        private final T value;

        public Result(final T value) {
            this.value = value;
        }


        @Override
        public TailCallable<T> next() {
            throw new RuntimeException("No more next value. It has the result.");
        }

        @Override
        public boolean isDone() {
            return true;
        }

        @Override
        public T result() {
            return value;
        }
    }

    private TailCalls() throws IllegalAccessException {
        throw new IllegalAccessException(getClass().getName() + " cannot be instantiated.");
    }

    public static<T> T trampoline(final TailCallable<T> firstTailCallable) {
        return Stream.iterate(firstTailCallable, TailCallable::next)
                .filter(TailCallable::isDone)
                .findFirst()
                .get()
                .result();
    }

    public static <T> TailCallable<T> done(final T value) {
        return new Result<>(value);
    }
}
