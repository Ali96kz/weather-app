import java.nio.charset.StandardCharsets;

public class EncodeAlgos {

    public static void main(String[] args) {
        String s = "ASTANA11" + "asdsadlkmanvlkrn";

        System.out.println(bytesToHex(s.getBytes(StandardCharsets.UTF_8)));
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
