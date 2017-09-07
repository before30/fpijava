package cc.before30.fpij.types;

import java.util.Objects;

/**
 * Created by before30 on 08/09/2017.
 */
public class Tuple3<T, U, V> {

    public final T _1;
    public final U _2;
    public final V _3;

    public Tuple3(T t, U u, V v) {
        _1 = Objects.requireNonNull(t);
        _2 = Objects.requireNonNull(u);
        _3 = Objects.requireNonNull(v);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tuple3)) return false;
        else {
            Tuple3 that = (Tuple3) obj;
            return _1.equals(that._1) &&
                    _2.equals(that._2) &&
                    _3.equals(that._3);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + _1.hashCode();
        result = prime * result + _2.hashCode();
        result = prime * result + _3.hashCode();
        return result;
    }
}
