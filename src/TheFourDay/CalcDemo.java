package TheFourDay;

/**
 * Created by MKD on 2017/3/12.
 */
public class CalcDemo {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        int e = 0;
        //算术运算
        System.out.println("*********算术运算**********"  );
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
        //关系运算
        System.out.println("*********关系运算**********"  );
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
        //位运算
        System.out.println("*********位运算**********"  );
        e = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + e );

        e = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + e );

        e = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + e );

        e = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + e );

        e = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + e );

        e = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + e );

        e = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + e );
        //逻辑运算
        boolean f = true;
        boolean g = false;
        System.out.println("*********逻辑运算**********"  );
        System.out.println("f & g = " + (f&g));
        System.out.println("f | g = " + (f|g) );
        System.out.println("f ^ g = " + !(f ^ g));
        System.out.println("f && g = " + (f&&g));
        System.out.println("f || g = " + (f||g) );
        System.out.println("!(f && g) = " + !(f && g));
        //赋值运算
        System.out.println("*********赋值运算**********"  );
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;c = 15;c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;c = 15;c %= a ;
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= a = " + c );
        c &= a ;
        System.out.println("c &= 2  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );
    }
}
