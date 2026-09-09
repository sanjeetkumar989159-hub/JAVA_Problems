class Q13_Reverse_Number {
    public static void main(String[] args) {
        int n = 12345;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}
