import java.io.PrintStream;

public class FuzzerUtils {
    public static final PrintStream out = System.out;
    public static final PrintStream err = System.err;

    public static long checkSum(boolean[] arr) {
        long s = 0;
        for (boolean b : arr) s += (b ? 1 : 0);
        return s;
    }

    public static long checkSum(Object o) {
        // Any deterministic value is fine; this is only to keep the original structure.
        return (o == null) ? 0 : System.identityHashCode(o);
    }
}