
import java.util.*;

public class Main {

    static Map<Character, int[]> seg = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // LED segment setup
        seg.put('0', new int[]{1, 1, 1, 1, 1, 1, 0});
        seg.put('1', new int[]{0, 1, 1, 0, 0, 0, 0});
        seg.put('2', new int[]{1, 1, 0, 1, 1, 0, 1});
        seg.put('3', new int[]{1, 1, 1, 1, 0, 0, 1});
        seg.put('4', new int[]{0, 1, 1, 0, 0, 1, 1});
        seg.put('5', new int[]{1, 0, 1, 1, 0, 1, 1});
        seg.put('6', new int[]{1, 0, 1, 1, 1, 1, 1});
        seg.put('7', new int[]{1, 1, 1, 0, 0, 0, 0});
        seg.put('8', new int[]{1, 1, 1, 1, 1, 1, 1});
        seg.put('9', new int[]{1, 1, 1, 1, 0, 1, 1});

        String ans = findClosest(time, X, Y);
        System.out.println(ans);
    }

    static String findClosest(String t, int X, int Y) {
        int h = Integer.parseInt(t.substring(0, 2));
        int m = Integer.parseInt(t.substring(3, 5));

        String res = "No closest valid time possible";
        int best = Integer.MAX_VALUE;

        for (int hh = 1; hh <= 12; hh++) {
            for (int mm = 0; mm < 60; mm++) {
                String nh = (hh < 10 ? "0" + hh : "" + hh);
                String nm = (mm < 10 ? "0" + mm : "" + mm);
                String newTime = nh + ":" + nm;

                if (diffByOneLED(t, newTime)) {
                    int cost = costToMove(h, hh, m, mm, X, Y);
                    if (cost < best) {
                        best = cost;
                        res = newTime;
                    }
                }
            }
        }
        return res;
    }

    static boolean diffByOneLED(String a, String b) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (a.charAt(i) == ':') {
                continue;
            }
            int[] x = seg.get(a.charAt(i));
            int[] y = seg.get(b.charAt(i));
            int c = 0;
            for (int j = 0; j < 7; j++) {
                if (x[j] != y[j]) {
                    c++;
                }
            }
            count += c;
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }

    static int costToMove(int h1, int h2, int m1, int m2, int X, int Y) {
        int dh = Math.abs((h1 - h2) * 5); // each hour = 5-minute marks on clock
        if (dh > 30) {
            dh = 60 - dh;        // can move both ways

                }int dm = Math.abs(m1 - m2);
        if (dm > 30) {
            dm = 60 - dm;
        }
        return dh * X + dm * Y;
    }
}
