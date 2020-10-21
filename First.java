
// import java.util.*;

// public class First {
//     public static void main(final String args[]) {
//         int t;
//         Scanner obj = new Scanner(System.in);
//         t = obj.nextInt();
//         for (int i = 1; i <= t; i++) {
//             Scanner in = new Scanner(System.in);
//             int n = in.nextInt();
//             int x = in.nextInt();
//             int floor = (n - 2) / x + 1;
//             System.out.println(floor);
//         }
//     }
// }
// import java.util.*;

// import jdk.nashorn.api.tree.ForOfLoopTree;

// import java.lang.*;
// import java.io.*;

// class First {
//     public static void main(final String args[]) {
//         int t;
//         Scanner obj = new Scanner(System.in);
//         t = obj.nextInt();
//         for (int i = 1; i <= t; i++) {
//             Scanner in = new Scanner(System.in);
//             int n = in.nextInt();
//             int m = in.nextInt();
//             int a[] = new int[4 * n];
//             int p = 0;
//             for (int j = 1; j <= 2 * n; j++) {
//                 a[p] = in.nextInt();
//                 p = p + 1;
//                 a[p] = in.nextInt();
//                 p = p + 1;
//             }
//             if (m % 2 != 0) {
//                 System.out.println("NO");

//             } else {
//                 int f = 1;
//                 for (int j2 = 1; j2 <= n; j2++) {
//                     if (a[f] == a[f + 1]) {
//                         System.out.println("YES");
//                     } else {
//                         f = f + 4;
//                     }
//                 }
//             }
//         }
//     }
// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class First {
//     public static void main(String z[]) {
//         int n;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();
//         String a[];
//         a = new String[n];
//         for (int i = 0; i < a.length; i++) {
//             a[i] = in.next();

//         }
//         for (int j = 0; j < a.length; j++) {
//             int temp = a[j].length();
//             if (temp <= 10) {
//                 System.out.println(a[j]);
//             } else {
//                 int temp1 = temp - 2;
//                 System.out.print(a[j].charAt(0));
//                 System.out.print(temp1);
//                 System.out.println(a[j].charAt(temp - 1));

//             }
//         }
//     }

// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class First {
// public static void main(String z[]) {

// Scanner in =new Scanner(System.in);
// String s1=new String();
// s1 = in.nextLine();
// String s2=new String();
// s2 = in.nextLine();

// if(s1.compareToIgnoreCase(s2)<0)
// {
// System.out.println("-1");
// }
// else if(s1.compareToIgnoreCase(s2)>0){
// System.out.println("1");
// }
// else if(s1.compareToIgnoreCase(s2)==0){
// System.out.println("0");
// }
// }}
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class First {

//     public static void main(String z[]) {
//         int n, m, a;
//         int b = 1;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();
//         m = in.nextInt();
//         a = in.nextInt();
//         int x, y;

//         if (m <= a || n <= a) {
//             if (m >= a && n <= a) {
//                 if (m % a == 0) {
//                     x = m / a;
//                 } else {
//                     x = m / a + 1;
//                 }
//                 System.out.println(x);
//             } else if (m <= a && n >= a) {
//                 if (n % a == 0) {
//                     y = n / a;
//                 } else {
//                     y = n / a + 1;
//                 }
//                 System.out.println(y);
//             } else if (m < a && n < a) {
//                 System.out.println(b);
//             } else if (m == 0 || n == 0) {
//                 System.out.println(0);
//             }
//         } else if (n >= a && m >= a) {
//             if (n % a == 0) {
//                 y = n / a;
//             } else {
//                 y = n / a + 1;
//             }
//             if (m % a == 0) {
//                 x = m / a;
//             } else {
//                 x = m / a + 1;
//             }
//             System.out.println(x * y);
//         }
//     }

// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class First {
// public static void main(final String args[]) {
// int n;
// Scanner obj = new Scanner(System.in);
// n = obj.nextInt();
// int t = 0;
// for (int i = 1; i <= n; i++) {
//
// int a = obj.nextInt();
// int b = obj.nextInt();
// int c = obj.nextInt();
// if (a + b + c >= 2) {
// t = t + 1;
// }
// }
// System.out.println(t);

// }
// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class First {
// public static void main(final String args[]) {
// int n, k;
// Scanner in = new Scanner(System.in);
// n = in.nextInt();
// k = in.nextInt();
// int t = 0;
// for (int i = 1; i <= n; i++) {
// int a = in.nextInt();
// if (a >= k) {
// t = t + 1;
// }
// }
// System.out.println(t);

// }
// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class First {
// public static void main(final String args[]) {
// int M, N;
// Scanner in = new Scanner(System.in);
// M = in.nextInt();
// N = in.nextInt();
// int t = (M * N) / 2;

// System.out.println(t);

// }
// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class First {
// public static void main(final String args[]) {
// int t;
// Scanner in = new Scanner(System.in);
// t = in.nextInt();
// long long a, b, c;
// for (int i = 1; i <= t; i++) {
// a = in.nextInt();
// b = in.nextInt();
// c = in.nextInt();
// long long d = (int) Math.sqrt((c - a) * (c - a) + b * b);
// System.out.println(d);
// }

// }
// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class First {
// public static void main(final String args[]) {
// int n;
// Scanner in = new Scanner(System.in);
// n = in.nextInt();
// int X = 0;
// for (int i = 0; i < n; i++) {
// String a = new String();
// a = in.next();
// String s1 = "X++";
// String s2 = "++X";
// if (s1.equals(a) || s2.equals(a)) {
// X = X + 1;
// } else {
// X = X - 1;
// }
// }
// System.out.println(X);
// }
// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class First {
//     public static void main(final String args[]) {
//         int n, a, b;
//         ;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();
//         a = in.nextInt();
//         b = in.nextInt();
//         int t = n - a;

//         System.out.println(Math.min(t, b + 1));

//     }
// }
// import java.util.*;
// import java.lang.*;
// import java.text.BreakIterator;
// import java.io.*;

// class First {
//     public static void main(String z[]) {
//         int n, i;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();
//         int a[];
//         a = new int[n];
//         for (i = 0; i < n; i++) {
//             a[i] = in.nextInt();

//         }
//         int t = 0;

//         if (a[0] != 25) {
//             System.out.println("NO");
//         } else {
//             if (n > 3 && a[n - 1] == 100 && a[n - 2] == 100) {
//                 System.out.println("NO");
//                 break;
//             }
//             for (int j = 0; j < n; j++) {
//                 if (a[j] - 25 <= 25 * j) {
//                     t = t + 1;
//                 }
//             }
//             if (t == n) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }

//     }

// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class First {
//     public static void main(final String args[]) {
//         int t;
//         Scanner in = new Scanner(System.in);
//         t = in.nextInt();
//         int n, k;
//         for (int i = 1; i <= t; i++) {
//             n = in.nextInt();
//             k = in.nextInt();
//             if (n < k * k) {
//                 System.out.println("NO");

//             } else {

//                 if (n - k >= 0 && (n - k) % 2 == 0) {
//                     System.out.println("YES");
//                 } else {
//                     System.out.println("NO");
//                 }

//             }
//         }

//     }
// }
// import java.util.*;
// import java.lang.*;
// import java.text.BreakIterator;
// import java.io.*;

// class First {
//     public static void main(String z[]) {
//         int n;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();

//         int a1, a2, a3;
//         int b1, b2, b3;

//         a1 = in.nextInt();
//         a2 = in.nextInt();
//         a3 = in.nextInt();
//         b1 = in.nextInt();
//         b2 = in.nextInt();
//         b3 = in.nextInt();
//         int t = 0;
//         if (b1 > a2) {
//             t = t + a2;
//         } else {
//             t = t + b1;
//         }
//         if (b2 > a3) {
//             t = t + a3;
//         } else {
//             t = t + b2;
//         }
//         if (b3 > a1) {
//             t = t + a1;
//         } else {
//             t = t + b3;
//         }
//         int t1 = n - t;
//         System.out.print(t1 + " ");
//         t = 0;
//         if (a1 > b2) {
//             t = t + b2;
//         } else {
//             t = t + a1;
//         }
//         if (a2 > b3) {
//             t = t + b3;
//         } else {
//             t = t + a2;
//         }
//         if (a3 > b1) {
//             t = t + b1;
//         } else {
//             t = t + a3;
//         }
//         System.out.println(t);

//     }

// }
import java.util.*;
import java.lang.*;
import java.io.*;

public class First {
    public static void main(final String args[]) {
        int t;

        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        int arr[] = new int[t];
        int x;
        for (int i = 1; i <= t; i++) {
            x = in.nextInt();
            int y = x % 10;
            int z = (y - 1) * 10;
            int j = 0;
            int a = 1;
            int f = 0;
            while (a != 0) {
                x = x / 10;
                a = x;
                j = j + 1;
                f = f + j;
            }

            arr[i - 1] = f + z;
        }
        for (int i = 1; i <= t; i++) {
            System.out.println(arr[i - 1]);
        }
    }
}