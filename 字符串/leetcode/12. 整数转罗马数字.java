class Solution {
    StringBuilder sb = new StringBuilder();

    // 从大到小一次判断 优先选择大的字母
    public String intToRoman(int num) {
        num = run(num, "M", 1000);
        num = run(num, "CM", 900);
        num = run(num, "D", 500);
        num = run(num, "CD", 400);
        num = run(num, "C", 100);
        num = run(num, "XC", 90);
        num = run(num, "L", 50);
        num = run(num, "XL", 40);
        num = run(num, "X", 10);
        num = run(num, "IX", 9);
        num = run(num, "V", 5);
        num = run(num, "IV", 4);
        run(num, "I", 1);
        return sb.toString();
    }

    public int run(int num, String str, int number) {
        int count = num / number;
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        num = num - count * number;
        return num;
    }
}