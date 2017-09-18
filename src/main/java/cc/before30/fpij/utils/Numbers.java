package cc.before30.fpij.utils;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Function;
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


    public static class BigIntegerNumber {

        private final BigInteger number;

        public BigIntegerNumber(final BigInteger number) {
            this.number = number;
        }

        public BigInteger getNumber() {
            return number;
        }

        public BigInteger number() {
            return getNumber();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (!(obj instanceof BigIntegerNumber)) {
                return false;
            }

            return eq(((BigIntegerNumber)obj).number());
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }

        public boolean lt(final BigInteger another) {
            return number.compareTo(another) < 0;
        }

        public boolean lt(final BigIntegerNumber another) {
            return lt(another.number());
        }

        public boolean le(final BigInteger another) {
            return number.compareTo(another) <= 0;
        }

        public boolean le(final BigIntegerNumber another) {
            return le(another.number());
        }

        public boolean eq(final BigInteger another) {
            return number.compareTo(another) == 0;
        }

        public boolean eq(final BigIntegerNumber another) {
            return eq(another.number());
        }

        public boolean gt(final BigInteger another) {
            return number.compareTo(another) > 0;
        }

        public boolean gt(final BigIntegerNumber another) {
            return gt(another.number());
        }

        public boolean ge(final BigInteger another) {
            return number.compareTo(another) >= 0;
        }

        public boolean ge(final BigIntegerNumber another) {
            return ge(another.number());
        }

        public boolean isOdd() {
            return Numbers.isOdd(number);
        }

        public boolean isEven() {
            return Numbers.isOdd(number);
        }

    }

    public static BigIntegerNumber bigInt(final BigInteger number) {
        return new BigIntegerNumber(number);
    }

    public static BigIntegerNumber bigInt(final String number) {
        return bigInt(new BigInteger(number));
    }

    public static class BigDecimalNumber {
        private final BigDecimal number;

        public BigDecimalNumber(final BigDecimal number) {
            this.number = number;
        }

        public BigDecimal getNumber() {
            return number;
        }

        public BigDecimal number() {
            return number;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (!(obj instanceof BigDecimalNumber)) {
                return false;
            }

            return eq(((BigDecimalNumber) obj).number());
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }

        public boolean lt(final BigDecimal another) {
            return number().compareTo(another) < 0;
        }

        public boolean lt(final BigDecimalNumber another) {
            return lt(another.number());
        }

        public boolean le(final BigDecimal another) {
            return number().compareTo(another) <= 0;
        }

        public boolean le(final BigDecimalNumber another) {
            return le(another.number);
        }

        public boolean eq(final BigDecimal another) {
            return number().compareTo(another) == 0;
        }

        public boolean eq(final BigDecimalNumber another) {
            return eq(another.number());
        }

        public boolean gt(final BigDecimal another) {
            return number().compareTo(another) > 0;
        }
        public boolean gt(final BigDecimalNumber another) {
            return gt(another.number());
        }

        public boolean ge(final BigDecimal another) {
            return number().compareTo(another) >= 0;
        }

        public boolean ge(final BigDecimalNumber another) {
            return ge(another.number());
        }
    }

    public static BigDecimalNumber decimal(final BigDecimal number) {
        return new BigDecimalNumber(number);
    }

    public static BigDecimalNumber decimal(final String number) {
        return decimal(new BigDecimal(number));
    }


//    public static BigInteger total(final Collection<BigInteger> bigIntegers) {
//        return bigIntegers.stream()
//                .reduce(BigInteger.ZERO, BigInteger::add);
//    }

    public static <T> BigInteger total(final Collection<T> list, final Function<T, BigInteger> toBigIntegerMapper) {
        return list.stream()
                .map(toBigIntegerMapper)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }

    public static BigDecimal total(final Collection<BigDecimal> bigDecimals) {
        return bigDecimals.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

//    public static <T>
}
