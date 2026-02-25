import java.util.*;

class RabinKarp {
    private final long mod = 1_000_000_007L;
    private final long base = 31;
    private long[] prefixHash;
    private long[] power;

    public List<Integer> search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        List<Integer> result = new ArrayList<>();

        if (m > n) return result;

        // 1. Precompute Powers and Prefix Hashes for Text
        precompute(text);

        // 2. Compute Hash of the Pattern
        long patternHash = 0;
        for (int i = 0; i < m; i++) {
            patternHash = (patternHash * base + (pattern.charAt(i) - 'a' + 1)) % mod;
        }

        // 3. Slide over the text and compare substring hashes
        for (int i = 0; i <= n - m; i++) {
            long currentSubHash = getSubHash(i, i + m - 1);

            if (currentSubHash == patternHash) {
                // Potential match found, verify characters to handle collisions
                if (text.substring(i, i + m).equals(pattern)) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private void precompute(String s) {
        int n = s.length();
        prefixHash = new long[n];
        power = new long[n];
        
        power[0] = 1;
        prefixHash[0] = s.charAt(0) - 'a' + 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * base) % mod;
            prefixHash[i] = (prefixHash[i - 1] * base + (s.charAt(i) - 'a' + 1)) % mod;
        }
    }

    private long getSubHash(int l, int r) {
        long res = prefixHash[r];
        if (l > 0) {
            res = (res - (prefixHash[l - 1] * power[r - l + 1]) % mod + mod) % mod;
        }
        return res;
    }

    public static void main(String[] args) {
        RabinKarp rk = new RabinKarp();
        System.out.println(rk.search("geeksforgeeks", "geeks")); // Output: [0, 8]
        System.out.println(rk.search("aabaacaadaabaaba", "aaba")); // Output: [0, 9, 12]
    }
}
