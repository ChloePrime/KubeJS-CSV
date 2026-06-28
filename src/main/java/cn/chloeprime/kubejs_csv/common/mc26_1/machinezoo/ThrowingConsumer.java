// Modified from NoException: https://noexception.machinezoo.com
// Not a generated code anymore. Edit generate.py won't change anything to this.
package cn.chloeprime.kubejs_csv.common.mc26_1.machinezoo;

import java.util.function.*;

/**
 * Variation of {@link Consumer} that allows throwing checked exceptions.
 * {@code ThrowingConsumer} is usually implemented by a lambda
 * and passed to {@code CLASS NOT FOUND LOL}.
 * See <a href="https://noexception.machinezoo.com/">noexception tutorial</a>.
 *
 * @param <T>
 *          see {@link Consumer}
 * @see Consumer
 */
@FunctionalInterface
public interface ThrowingConsumer<T> {
    /**
     * Variation of {@link Consumer#accept(Object)} that allows throwing checked exceptions.
     *
     * @param t
     *            see {@link Consumer#accept(Object)}
     * @throws Exception
     *             if unable to complete
     * @see Consumer#accept(Object)
     */
    void accept(T t) throws Exception;
}
