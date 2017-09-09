package cc.before30.fpij.utils;

import cc.before30.fpij.types.*;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by before30 on 09/09/2017.
 */
public class Funs {

    private Funs() {}

    public static <T> Predicate<? super T> isNull() {
        return t -> t == null;
    }

    public static <T> Predicate<? super T> isNotNull() {
        return isNull().negate();
    }

    public static <T> Predicate<? super T> not(final Predicate<? super T> p) {
        Objects.requireNonNull(p, "The predicate: Predicate<T> cannot be null.");
        return p.negate();
    }

    public static <T> Comparator<T> reversed(final Comparator<T> c) {
        Objects.requireNonNull(c, "The comparator: Comparator<T> cannot be null.");
        return c.reversed();
    }

//    public static <T, C extends Comparable<? super C>> Comparator<T> comparing(final Function<? super T, ? extends C> toComparable) {
//        Objects.requireNonNull(toComparable, "The toComparable: Function<T, C> cannot be null.");
//        return (t1, t2) -> toComparable.apply(t1)
//                .compareTo(toComparable.apply(t2));
//    }

    public static <T, C extends Comparable<? super C>> Comparator<T> comparing(final Function<? super T, ? extends C> toComparable) {
        Objects.requireNonNull(toComparable, "The toComparable: Function<T, C> cannot be null.");
        return (t1, t2) -> toComparable.apply(t1)
                .compareTo(toComparable.apply(t2));
    }

    public static <T, R> Function<? super T, String> toStringOf(final Function<? super T, ? extends R> f) {
        Objects.requireNonNull(f, "function: Function<? super T, ? extends R> cannot be null.");
        return i -> f.andThen(String::valueOf).apply(i);
    }

    public static <T> Function<T, Boolean> toTrue() {
        return t -> Boolean.TRUE;
    }

    public static <T> Function<T, Boolean> toFalse() {
        return t -> Boolean.FALSE;
    }

    public static<O, T> Predicate<O> satisfying(final Predicate2<? super O, ? super T> p, final T t1) {
        Objects.requireNonNull(p, "The predicate cannot be null");
        return o -> p.test(o, t1);
    }

    public static <O, T1, T2> Predicate<O> satisfying(final Predicate3<? super O, ? super T1, ? super T2> p,
                                                      final T1 t1,
                                                      final T2 t2) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2);
    }

    public static <O, T1, T2, T3> Predicate<O> satisfying(final Predicate4<? super O, ? super T1, ? super T2, ? super T3> p,
                                                      final T1 t1,
                                                      final T2 t2,
                                                      final T3 t3) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3);
    }

    public static <O, T1, T2, T3, T4> Predicate<O> satisfying(final Predicate5<? super O, ? super T1, ? super T2, ? super T3, ? super T4> p,
                                                          final T1 t1,
                                                          final T2 t2,
                                                          final T3 t3,
                                                          final T4 t4) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3, t4);
    }

    public static <O, T1, T2, T3, T4, T5> Predicate<O> satisfying(final Predicate6<? super O, ? super T1, ? super T2, ? super T3, ? super T4,
                                                                                    ? super T5> p,
                                                              final T1 t1,
                                                              final T2 t2,
                                                              final T3 t3,
                                                              final T4 t4,
                                                              final T5 t5) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3, t4, t5);
    }

    public static <O, T1, T2, T3, T4, T5, T6> Predicate<O> satisfying(final Predicate7<? super O, ? super T1, ? super T2, ? super T3, ? super T4,
                                                                                    ? super T5, ? super T6> p,
                                                                  final T1 t1,
                                                                  final T2 t2,
                                                                  final T3 t3,
                                                                  final T4 t4,
                                                                  final T5 t5,
                                                                  final T6 t6) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3, t4, t5, t6);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7> Predicate<O> satisfying(final Predicate8<? super O, ? super T1, ? super T2, ? super T3, ? super T4,
                                                                                    ? super T5, ? super T6, ? super T7> p,
                                                                      final T1 t1,
                                                                      final T2 t2,
                                                                      final T3 t3,
                                                                      final T4 t4,
                                                                      final T5 t5,
                                                                      final T6 t6,
                                                                      final T7 t7) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3, t4, t5, t6, t7);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8> Predicate<O> satisfying(final Predicate9<? super O, ? super T1, ? super T2, ? super T3, ? super T4,
                                                                                    ? super T5, ? super T6, ? super T7, ? super T8> p,
                                                                          final T1 t1,
                                                                          final T2 t2,
                                                                          final T3 t3,
                                                                          final T4 t4,
                                                                          final T5 t5,
                                                                          final T6 t6,
                                                                          final T7 t7,
                                                                          final T8 t8) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8, T9> Predicate<O> satisfying(final Predicate10<? super O, ? super T1, ? super T2, ? super T3, ? super T4,
            ? super T5, ? super T6, ? super T7, ? super T8, ? super T9> p,
                                                                              final T1 t1,
                                                                              final T2 t2,
                                                                              final T3 t3,
                                                                              final T4 t4,
                                                                              final T5 t5,
                                                                              final T6 t6,
                                                                              final T7 t7,
                                                                              final T8 t8,
                                                                              final T9 t9) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Predicate<O> satisfying(final Predicate11<? super O, ? super T1, ? super T2, ? super T3, ? super T4,
            ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10> p,
                                                                                  final T1 t1,
                                                                                  final T2 t2,
                                                                                  final T3 t3,
                                                                                  final T4 t4,
                                                                                  final T5 t5,
                                                                                  final T6 t6,
                                                                                  final T7 t7,
                                                                                  final T8 t8,
                                                                                  final T9 t9,
                                                                                  final T10 t10) {
        Objects.requireNonNull(p, "The predicate cannot be null.");
        return o -> p.test(o, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }


    public static <O, T1, R> Function<O, R> applying(final Function2<? super O, ? super T1, ? extends R> f,
                                                     final T1 t1) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1);
    }

    public static <O, T1, T2, R> Function<O, R> applying(final Function3<? super O,
            ? super T1, ? super T2,
            ? extends R> f,
                                                     final T1 t1, final T2 t2) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2);
    }

    public static <O, T1, T2, T3, R> Function<O, R> applying(final Function4<? super O,
            ? super T1, ? super T2, ? super T3,
            ? extends R> f,
                                                         final T1 t1, final T2 t2, final T3 t3) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3);
    }

    public static <O, T1, T2, T3, T4, R> Function<O, R> applying(final Function5<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4,
            ? extends R> f,
                                                             final T1 t1, final T2 t2, final T3 t3, final T4 t4) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3, t4);
    }

    public static <O, T1, T2, T3, T4, T5,  R> Function<O, R> applying(final Function6<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? extends R> f,
                                                                 final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3, t4, t5);
    }

    public static <O, T1, T2, T3, T4, T5, T6, R> Function<O, R> applying(final Function7<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6,
            ? extends R> f,
                                                                      final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                      final T6 t6) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3, t4, t5, t6);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, R> Function<O, R> applying(final Function8<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7,
            ? extends R> f,
                                                                         final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                         final T6 t6, final T7 t7) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3, t4, t5, t6, t7);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8, R> Function<O, R> applying(final Function9<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7, ? super T8,
            ? extends R> f,
                                                                             final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                             final T6 t6, final T7 t7, final T8 t8) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function<O, R> applying(final Function10<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7, ? super T8, ? super T9,
            ? extends R> f,
                                                                                 final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                                 final T6 t6, final T7 t7, final T8 t8, final T9 t9) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> Function<O, R> applying(final Function11<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7, ? super T8, ? super T9, ? super T10,
            ? extends R> f,
                                                                                     final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                                     final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10) {
        Objects.requireNonNull(f, "The function cannot be null.");
        return o -> f.apply(o, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    public static <O, T1> Consumer<O> accepting(final Consumer2<? super O, ? super T1> c, final T1 t1) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1);
    }

    public static <O, T1, T2> Consumer<O> accepting(final Consumer3<? super O, ? super T1, ? super T2> c, final T1 t1, final T2 t2) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2);
    }

    public static <O, T1, T2, T3> Consumer<O> accepting(final Consumer4<? super O, ? super T1, ? super T2, ? super T3> c,
                                                        final T1 t1, final T2 t2, final T3 t3) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3);
    }

    public static <O, T1, T2, T3, T4> Consumer<O> accepting(final Consumer5<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4> c,
                                                        final T1 t1, final T2 t2, final T3 t3, final T4 t4) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3, t4);
    }

    public static <O, T1, T2, T3, T4, T5> Consumer<O> accepting(final Consumer6<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c,
                                                            final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3, t4, t5);
    }

    public static <O, T1, T2, T3, T4, T5, T6> Consumer<O> accepting(final Consumer7<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6> c,
                                                                final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                final T6 t6) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3, t4, t5, t6);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7> Consumer<O> accepting(final Consumer8<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7> c,
                                                                    final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                    final T6 t6, final T7 t7) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3, t4, t5, t6, t7);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8> Consumer<O> accepting(final Consumer9<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7, ? super T8> c,
                                                                        final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                        final T6 t6, final T7 t7, final T8 t8) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8, T9> Consumer<O> accepting(final Consumer10<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7, ? super T8, ? super T9> c,
                                                                            final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                            final T6 t6, final T7 t7, final T8 t8, final T9 t9) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <O, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Consumer<O> accepting(final Consumer11<? super O,
            ? super T1, ? super T2, ? super T3, ? super T4, ? super T5,
            ? super T6, ? super T7, ? super T8, ? super T9, ? super T10> c,
                                                                                final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5,
                                                                                final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10) {
        Objects.requireNonNull(c, "The Consumer cannot be null.");
        return o -> c.accept(o, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }
}
