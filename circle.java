class circlea {
    public static void main(String[] args) {
        int n = 4567;
        int copy = n;
        String nn = Integer.toString(n);
        int count = 0;
        int flag = 0;
        System.out.println(isPrime(5));
        if (!isPrime(n)) {
            System.out.println(n + " is a not Circular Number");
        } else {
            while (nn.length() - 1 != count) { 
                int module = n % 10;
                String result = String.valueOf(module);
                String result1 = "";
                String add;
                for (int a = 0; a < nn.length() - 1; a++) {
                    result1 = result1 + Character.toString(nn.charAt(a));
                }
                add = result + result1;
                System.out.println(add);

                nn = add;
                n = Integer.parseInt(add);
                if (!isPrime(n)) {
                    flag = 1;
                }
                count++;
            }
            System.out.println(" ");
            if (flag == 0) {
                System.out.println(copy + " is a Circular Number");
            } else {
                System.out.println(copy + " is a not Circular Number");
            }
      }
    }
    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
