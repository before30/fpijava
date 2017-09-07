package cc.before30.fpij.utils;

import cc.before30.fpij.recursion.TailCall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static cc.before30.fpij.recursion.TailCall.ret;
import static cc.before30.fpij.recursion.TailCall.sus;

/**
 * Created by before30 on 08/09/2017.
 */
public class CollectionUtilities {

    public static <T> List<T> list() {
        return Collections.emptyList();
    }

    public static <T> List<T> list(T t) {
        return Collections.singletonList(t);
    }

    public static <T> List<T> list(List<T> ts) {
        return Collections.unmodifiableList(new ArrayList<>(ts));
    }

    @SafeVarargs
    public static <T> List<T> list(T... t) {
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t, t.length)));
    }

    public static <T> T head(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalStateException("head of empty list");
        }

        return list.get(0);
    }

    private static <T> List<T> copy(List<T> ts) {
        return new ArrayList<>(ts);
    }

    public static <T> List<T> tail(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalStateException("tail of empty list");
        }

        List<T> workList = copy(list);
        workList.remove(0);
        return Collections.unmodifiableList(workList);
    }

    public static <T> List<T> append(List<T> list, T t) {
        List<T> ts = copy(list);
        ts.add(t);
        return Collections.unmodifiableList(ts);
    }

    public static <T> List<T> prepend(T t, List<T> list) {
        return foldLeft(list, list(t), a -> b -> append(a, b));
    }

    public static <T> List<T> reverse(List<T> list) {
//        return foldLeft(list, list(), x -> y -> foldLeft(x, list(y), a -> b -> append(a,b)));

        return foldLeft(list, list(), x -> y -> prepend(y, x));
//        List<T> result = new ArrayList<T>();
//        for (int i=list.size() - 1; i >=0; i--) {
//            result.add(list.get(i));
//        }
//
//        return Collections.unmodifiableList(result);
    }

    private static <T, U> TailCall<U> foldLeft_(List<T> ts, U identity, Function<U, Function<T, U>> f) {
        return ts.isEmpty()
                ? ret(identity)
                : sus(() -> foldLeft_(tail(ts),
                f.apply(identity).apply(head(ts)), f));
    }

    public static <T, U> U foldLeft(List<T> ts, U identity,
                                    Function<U, Function<T, U>> f) {
        return foldLeft_(ts, identity, f).eval();
//        U result = identity;
//        for (T t : ts) {
//            result = f.apply(result).apply(t);
//        }
//        return result;
    }

    private static <T, U> TailCall<U> foldRight_(U acc, List<T> ts,
                                                 Function<T, Function<U, U>> f) {
        return ts.isEmpty()
                ? ret(acc)
                : sus(() -> foldRight_(f.apply(head(ts)).apply(acc), tail(ts), f));
    }

    public static <T, U> U foldRight(List<T> ts, U identity,
                                     Function<T, Function<U, U>> f) {
        return foldRight_(identity, reverse(ts), f).eval();
//        return ts.isEmpty()
//                ? identity
//                : f.apply(head(ts)).apply(foldRight(tail(ts), identity, f));
    }

    public static <T, U> List<U> mapViaFoldLeft(List<T> list,
                                                Function<T, U> f) {
        return foldLeft(list, list(), x -> y -> append(x, f.apply(y)));
    }

    public static <T, U> List<U> mapViaFoldRight(List<T> list,
                                                 Function<T, U> f) {
        return foldRight(list, list(), x -> y -> prepend(f.apply(x), y));
    }

    private static TailCall<List<Integer>> range_(List<Integer> acc,
                                                  Integer start, Integer end) {
        return end <= start
                ?ret(acc)
                : sus(() -> range_(append(acc, start), start + 1, end));
    }

    public static List<Integer> range(int start, int end) {

        return range_(list(), start, end).eval();

//        return unfold(start, x -> x + 1, x -> x < end);
//        List<Integer> result = new ArrayList<>();
//        int temp = start;
//        while (temp < end) {
//            result = CollectionUtilities.append(result, temp);
//            temp = temp + 1;
//        }
//        return result;
    }

    public static <T> List<T> unfold(T seed,
                                     Function<T, T> f,
                                     Function<T, Boolean> p) {
        List<T> result = new ArrayList<>();
        T temp = seed;
        while (p.apply(temp)) {
            result = append(result, temp);
            temp = f.apply(temp);
        }

        return result;
    }

    public static <T> String makeString(List<T> list, String separator) {
        return list.isEmpty()
                ? ""
                : tail(list).isEmpty()
                    ? head(list).toString()
                    : head(list) + foldLeft(tail(list), "", x -> y -> x + separator + y);
    }

}
