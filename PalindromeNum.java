class PalindromeNum {
    static boolean isPalindrome(int x) {
        boolean isNeg = false;
        int reverse = 0;
        int num = x;
        if(num < 0) {
            num = -num;
            isNeg = true;
        }
        while(num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num/10;
        }
        if(x == reverse) {
            if(isNeg) {
                return false;
            }
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(4567843);
    }
}