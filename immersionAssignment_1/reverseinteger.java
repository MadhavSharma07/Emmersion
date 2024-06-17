import java.lang.Math;

public class reverseinteger {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            if (rev> Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                return 0;
            }
            int rem=x%10;
            rev=rev*10+rem;

            x=x/10;
        }
        return rev;
    }
}
