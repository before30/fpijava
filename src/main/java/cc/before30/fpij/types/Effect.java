package cc.before30.fpij.types;

/**
 * Created by before30 on 07/09/2017.
 */
public interface Effect<T> {
    void apply(T t);
}
