package cc.before30.fpij.types;

/**
 * Created by before30 on 07/09/2017.
 */
public class Tuple<T, U> {

    public final T _1;
    public final U _2;

    public Tuple(T t, U u) {
        this._1 = t;
        this._2 = u;
    }
}
