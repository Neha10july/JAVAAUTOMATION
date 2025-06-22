class Main {
    public static void main(String[] args) {
        String str = "https://www.programiz.com/java-programming/onlin";

        int start = 0;
        int length = 1;  // initial length of substring
        int count = 1;

        while (start < str.length()) {
            int end = start + length;
            if (end > str.length()) {
                end = str.length();
            }

            String extracted = str.substring(start, end);
            System.out.println(count++ + "; " + extracted);

            // move start to the next position after extracted substring
            start = end;
            length++;  // increase length for next substring
        }
    }
}
