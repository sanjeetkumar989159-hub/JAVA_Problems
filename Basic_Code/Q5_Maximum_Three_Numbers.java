class Q5_Maximum_Three_Numbers {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;
        int c = 30;

        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println("Maximum = " + max);
    }
}
