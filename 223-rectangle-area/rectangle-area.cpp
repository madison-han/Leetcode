class Solution {
public:
    int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int ans = ((ax2 - ax1)*(ay2-ay1)) + ((bx2 - bx1)*(by2 - by1));
        if (ay1 >= by2 || ay2 <= by1 || ax2 <= bx1 || ax1 >= bx2) { 
            return ans; 
        }
        return (ans-  ((min(ax2, bx2) - max(ax1, bx1)) * (min(ay2, by2) - max(ay1, by1))));
    }
};