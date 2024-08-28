package tr.gov.gib.gibcore.util;

public class OIDGenerator {
    private static final int ENCODING_BASE = 36;
    private static final int TIME_LENGTH = 8;
    private static final long COUNTER_RESET = getPower(ENCODING_BASE, 3);
    private static String hexTime = getHexTime();
    private static long counter = 0;

    /* calculate pth power of n */
    private static long getPower(int n, int p) {
        long result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }

    private static String getHexTime() {
        /*
         * 2059'da 8 haneyi asacak ve 1980'den sonra 8 haneden eksik olmayacak
         */
        String s = Long.toString(System.currentTimeMillis(), ENCODING_BASE);
        int l = s.length();
        if (l > TIME_LENGTH) {
            return s.substring(l - TIME_LENGTH);
        } else {
            return s;
        }
    }

    private synchronized String getOID() {
        String oid = hexTime + Long.toString(counter + COUNTER_RESET, ENCODING_BASE);

        counter = (counter + 1) % COUNTER_RESET;

        if (counter == 0) {
            String tempTime = getHexTime();
            while (hexTime.equalsIgnoreCase(tempTime)) {
                tempTime = getHexTime();
            }
            hexTime = tempTime;
        }

        return oid;
    }

    public static String getSposOID() {
        return "s" + new OIDGenerator().getOID();
    }

    public static String getFposOID() {
        return "f" + new OIDGenerator().getOID();
    }

    public static String getNakitOID() {
        return "n" + new OIDGenerator().getOID();
    }
}