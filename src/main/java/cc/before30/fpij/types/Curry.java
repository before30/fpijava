package cc.before30.fpij.types;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by before30 on 09/09/2017.
 */
public class Curry {

    private Curry() {}

    public static <T1, T2, R> Function<T2, R> currying(final Function2<T1, T2, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, R> Function2<T2, T3, R> currying(final Function3<T1, T2, T3, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, R> Function3<T2, T3, T4, R> currying(final Function4<T1, T2, T3, T4, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, R> Function4<T2, T3, T4, T5, R> currying(final Function5<T1, T2, T3, T4, T5, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Function5<T2, T3, T4, T5, T6, R> currying(
            final Function6<T1, T2, T3, T4, T5, T6, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Function6<T2, T3, T4, T5, T6, T7, R> currying(
            final Function7<T1, T2, T3, T4, T5, T6, T7, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function7<T2, T3, T4, T5, T6, T7, T8, R> currying(
            final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function8<T2, T3, T4, T5, T6, T7, T8, T9, R> currying(
            final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> Function9<T2, T3, T4, T5, T6, T7, T8, T9, T10, R> currying(
            final Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> Function10<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> currying(
            final Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> f, final T1 t1) {
        Objects.requireNonNull(f);
        return f.curried(t1);
    }

    public static <T1, T2> Predicate<T2> currying(final Predicate2<T1, T2> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3> Predicate2<T2, T3> currying(final Predicate3<T1, T2, T3> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4> Predicate3<T2, T3, T4> currying(final Predicate4<T1, T2, T3, T4> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4, T5> Predicate4<T2, T3, T4, T5> currying(final Predicate5<T1, T2, T3, T4, T5> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6> Predicate5<T2, T3, T4, T5, T6> currying(
            final Predicate6<T1, T2, T3, T4, T5, T6> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Predicate6<T2, T3, T4, T5, T6, T7> currying(
            final Predicate7<T1, T2, T3, T4, T5, T6, T7> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Predicate7<T2, T3, T4, T5, T6, T7, T8> currying(
            final Predicate8<T1, T2, T3, T4, T5, T6, T7, T8> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Predicate8<T2, T3, T4, T5, T6, T7, T8, T9> currying(
            final Predicate9<T1, T2, T3, T4, T5, T6, T7, T8, T9> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Predicate9<T2, T3, T4, T5, T6, T7, T8, T9, T10> currying(
            final Predicate10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Predicate10<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> currying(
            final Predicate11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> p, final T1 t1) {
        Objects.requireNonNull(p);
        return p.curried(t1);
    }

    public static <T1, T2> Consumer<T2> currying(final Consumer2<T1, T2> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3> Consumer2<T2, T3> currying(final Consumer3<T1, T2, T3> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4> Consumer3<T2, T3, T4> currying(final Consumer4<T1, T2, T3, T4> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4, T5> Consumer4<T2, T3, T4, T5> currying(final Consumer5<T1, T2, T3, T4, T5> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6> Consumer5<T2, T3, T4, T5, T6> currying(
            final Consumer6<T1, T2, T3, T4, T5, T6> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Consumer6<T2, T3, T4, T5, T6, T7> currying(
            final Consumer7<T1, T2, T3, T4, T5, T6, T7> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Consumer7<T2, T3, T4, T5, T6, T7, T8> currying(
            final Consumer8<T1, T2, T3, T4, T5, T6, T7, T8> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Consumer8<T2, T3, T4, T5, T6, T7, T8, T9> currying(
            final Consumer9<T1, T2, T3, T4, T5, T6, T7, T8, T9> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Consumer9<T2, T3, T4, T5, T6, T7, T8, T9, T10> currying(
            final Consumer10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Consumer10<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> currying(
            final Consumer11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> c, final T1 t1) {
        Objects.requireNonNull(c);
        return c.curried(t1);
    }
}
