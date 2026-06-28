// Modified from NoException: https://noexception.machinezoo.com
package cn.chloeprime.kubejs_csv.common.mc26_1.machinezoo;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class MachineZooDebris {
    public static <V> Consumer<V> consumer(ThrowingConsumer<V> code) {
        return input -> {
            try {
                code.accept(input);
            } catch (Exception ex) {
                throw sneak(ex);
            }
        };
    }

    public static <V> Supplier<V> supplier(Callable<V> code) {
        return () -> {
            try {
                return code.call();
            } catch (Exception ex) {
                throw sneak(ex);
            }
        };
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException sneak(Throwable exception) throws T {
        throw (T) exception;
    }

    private MachineZooDebris() {
    }
}
