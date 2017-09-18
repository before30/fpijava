package cc.before30.fpij;

import cc.before30.fpij.recursion.TailCall;

import java.util.Arrays;

import static cc.before30.fpij.recursion.TailCall.ret;
import static cc.before30.fpij.recursion.TailCall.sus;

/**
 * Created by before30 on 18/09/2017.
 */
public abstract class List<T> {
    public abstract T head();
    public abstract List<T> tail();
    public abstract boolean isEmpty();
    @SuppressWarnings("rawtypes")
    public static final List NIL = new Nil();

    private List() {}

    private static class Nil<T> extends List<T> {

        private Nil() {}

        public T head() {
            throw new IllegalStateException("head called an empty list");
        }

        public List<T> tail() {
            throw new IllegalStateException("tail called an empty list");
        }

        public boolean isEmpty() {
            return true;
        }
    }

    private static class Cons<T> extends List<T> {

        private final T head;
        private final List<T> tail;

        private Cons(T head, List<T> tail) {
            this.head = head;
            this.tail = tail;
        }

        public T head() {
            return head;
        }

        public List<T> tail() {
            return tail;
        }

        public boolean isEmpty() {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> list() {
        return NIL;
    }

    @SafeVarargs
    public static <T> List<T> list(T... ts) {
//        List<T> n = list();
//        for (int i=t.length - 1; i >=0; i--) {
//            n = new Cons<>(t[i], n);
//        }
//
//        return n;
        return list_(list(), ts).eval();
    }

    public static <T>TailCall<List<T>> list_(List<T> acc, T[] ts) {
        return ts.length == 0
                ? ret(acc)
                : sus(() -> list_(new Cons<>(ts[ts.length-1], acc),
                Arrays.copyOfRange(ts, 0, ts.length -1)));

    }
}
