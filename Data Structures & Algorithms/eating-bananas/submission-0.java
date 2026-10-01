class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        int result = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            long k = 0;
            for (int pile : piles) {
                k += (pile + mid - 1) / mid;

                if (k > h) {
                    break;
                }
            }

            if (k <= h) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }
}
