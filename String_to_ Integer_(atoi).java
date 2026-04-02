class StringToIntegerAtoi {
    public static int myAtoi(String s) {
        int i = 0, n = s.length();

        // skip spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = ('-' == s.charAt(i)) ? -1 : 1;
            i++;
        }

        int result = 0;

        // digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // overflow check
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String s = "   -42";
        System.out.println(myAtoi(s)); // -42
    }
}
