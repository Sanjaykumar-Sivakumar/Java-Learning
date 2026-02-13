import java.util.*;

class Main {
    static Map<Character, int[]> seg = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input: time then X and Y
        String time = sc.next().trim();   // e.g. "02:38"
        int X = sc.nextInt();             // cost per minute for hour hand
        int Y = sc.nextInt();             // cost per minute for minute hand

        // populate 7-segment patterns
        seg.put('0', new int[]{1,1,1,1,1,1,0});
        seg.put('1', new int[]{0,1,1,0,0,0,0});
        seg.put('2', new int[]{1,1,0,1,1,0,1});
        seg.put('3', new int[]{1,1,1,1,0,0,1});
        seg.put('4', new int[]{0,1,1,0,0,1,1});
        seg.put('5', new int[]{1,0,1,1,0,1,1});
        seg.put('6', new int[]{1,0,1,1,1,1,1});
        seg.put('7', new int[]{1,1,1,0,0,0,0});
        seg.put('8', new int[]{1,1,1,1,1,1,1});
        seg.put('9', new int[]{1,1,1,1,0,1,1});

        String ans = fiClose(time, X, Y);
        System.out.println(ans);

        sc.close();
    }

    // find the closest valid time (differs by exactly one LED segment)
    static String fiClose(String t, int X, int Y) {
        int h = Integer.parseInt(t.substring(0, 2));
        int m = Integer.parseInt(t.substring(3, 5));

        String res = "No closest valid time possible";
        int best = Integer.MAX_VALUE;

        for (int hh = 1; hh <= 12; hh++) {
            for (int mm = 0; mm < 60; mm++) {
                String nh = (hh < 10 ? "0" + hh : "" + hh);
                String nm = (mm < 10 ? "0" + mm : "" + mm);
                String cand = nh + ":" + nm;

                if (diffByOneLED(t, cand)) {
                    int cost = costToMov(h, hh, m, mm, X, Y);
                    if (cost < best) {
                        best = cost;
                        res = cand;
                    }
                }
            }
        }
        return res;
    }

    // return true if the whole 4-digit display differs by exactly one LED segment
    static boolean diffByOneLED(String a, String b) {
        int diffCount = 0;
        // iterate all characters and skip the colon
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ':') continue;

            char ca = a.charAt(i);
            char cb = b.charAt(i);

            int[] sa = seg.get(ca);
            int[] sb = seg.get(cb);
            if (sa == null || sb == null) return false; // safety

            for (int s = 0; s < 7; s++) {
                if (sa[s] != sb[s]) {
                    diffCount++;
                    if (diffCount > 1) return false; // early exit
                }
            }
        }
        return diffCount == 1;
    }

    // compute movement cost (hour hand moves only to whole hours -> each hour = 5 minute marks)
    static int costToMov(int fromH, int toH, int fromM, int toM, int X, int Y) {
        int dh = Math.abs((fromH - toH) * 5);  // convert hour difference to minute-marks
        if (dh > 30) dh = 60 - dh;             // go the shorter way around the clock

        int dm = Math.abs(fromM - toM);
        if (dm > 30) dm = 60 - dm;

        return dh * X + dm * Y;
    }
}
