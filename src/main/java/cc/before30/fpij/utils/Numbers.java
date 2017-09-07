package cc.before30.fpij.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Predicate;

/**
 * Created by before30 on 07/09/2017.
 */
public final class Numbers {

    public static final Predicate<Integer> ODD_INTEGER = Numbers::isOdd;

    private Numbers() {

    }

    public static boolean isOdd(final int number) {
        return (number & 1) != 0;
    }

    public static boolean isEven(final int number) {
        return !isOdd(number);
    }

    public static boolean isOdd(final long number) {
        return (number & 1) != 0;
    }

    public static boolean isEven(final long number) {
        return !isOdd(number);
    }

    public static boolean isOdd(final BigInteger number) {
        return number.and(BigInteger.ONE)
                .compareTo(BigInteger.ZERO) != 0;
    }

    public static boolean isEven(final BigInteger number) {
        return !isOdd(number);
    }

    public static boolean isNegative(final int number) {
        return number < 0;
    }

    public static boolean isZero(final int number) {
        return number == 0;
    }

    public static boolean isPositive(final int number) {
        return number > 0;
    }

    public static boolean isNegative(final long number) {
        return number < 0;
    }

    public static boolean isZero(final long number) {
        return number == 0;
    }

    public static boolean isPositive(final long number) {
        return number > 0;
    }

    public static boolean isNegative(final double number) {
        return number < 0;
    }

    public static boolean isZero(final double number) {
        return number == 0;
    }

    public static boolean isPositive(final double number) {
        return number > 0;
    }

    public static boolean isNegative(final float number) {
        return number < 0;
    }

    public static boolean isZero(final float number) {
        return number == 0;
    }

    public static boolean isPositive(final float number) {
        return number > 0;
    }


    public static boolean isNegative(final BigInteger number) {
        return number.compareTo(BigInteger.ZERO) < 0;
    }

    public static boolean isZero(final BigInteger number) {
        return number.compareTo(BigInteger.ZERO) == 0;
    }

    public static boolean isPositive(final BigInteger number) {
        return number.compareTo(BigInteger.ZERO) > 0;
    }

    public static boolean isNegative(final BigDecimal number) {
        return number.compareTo(BigDecimal.ZERO) < 0;
    }

    public static boolean isZero(final BigDecimal number) {
        return number.compareTo(BigDecimal.ZERO) == 0;
    }

    public static boolean isPositive(final BigDecimal number) {
        return number.compareTo(BigDecimal.ZERO) > 0;
    }
}
