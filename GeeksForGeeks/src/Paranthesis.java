class Paranthesis {
    public static void main(String[] args) {
        int number = 3;
        StringBuilder sb = new StringBuilder();
        printRecur(0, 0, number, "");
    }

    private static void printRecur(int open, int close, int number, String sb) {
        if (close > open || open > number) {
            return;
        } else {
            if (close == number) {
                System.out.println(sb.toString());
            } else {
                sb = sb + "{";
                printRecur(open + 1, close, number, sb);

                sb = sb + "}";
                printRecur(open, close + 1, number, sb);
            }
        }
    }
}