//PRINT NUMBERS FROM 5 TO 1

//public class Recursion1 {
//    public static void printNumbers(int n) {
//        if (n == 0) {
//            return;
//        }
//
//        System.out.println(n);
//        printNumbers(n-1);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        printNumbers(n);
//    }
//}
//---------------------------------------------------------

//PRINT NUMBERS FROM 1 TO 5

//public class Recursion1 {
//    public static void printNumbers(int n) {
//        if (n == 6) {
//            return;
//        }
//
//        System.out.println(n);
//        printNumbers(n+1);
//    }
//
//    public static void main(String[] args) {
//        int n = 1;
//        printNumbers(n);
//    }
//}

//---------------------------------------------------------
//public class Recursion1 {
//    public static void printNatural (int n, int sum) {
//        if (n == 0) {
//            System.out.println(sum);
//            return;
//        }
//        //our logic here is that we are starting from the very top from a direct number instead of starting it from the down
//        sum = sum + n;
//        printNatural(n-1, sum);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        printNatural(5, 0);  //sum is 0 because we are starting from 5
//    }
//}

//---------------------------------------------------------
//public class Recursion1 {
//    public static void printFactorial(int n, int fact) {
//        if (n == 0) {
//            System.out.println(fact);
//            return;
//        }
//
//        fact = fact * n;
//        printFactorial(n-1, fact);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        printFactorial(5, 1);
//    }
//}

//---------------------------------------------------------
//public class Recursion1 {
//    public static void printFibonnaci(int a , int b, int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(a);
//        printFibonnaci(b, a+b, n-1);
//    }
//
//    public static void main(String[] args) {
//        printFibonnaci(0, 1, 10);
//    }
//}
//---------------------------------------------------------

//---------------------------------------------------------
//public class Recursion1 {
//    public static int printStack(int x, int n) { //we are using the values later as well
//        if (n == 0) {
//            return 1;
//        }
//        if (x == 0) {
//            return 0;
//        }
//
//        int x_ = printStack(x , n-1); //RECURSION
//        int xn = x * x_;
//        return xn;
//    }
//
//    public static void main(String[] args) {
//        int output = printStack (3 , 4);
//        System.out.println(output);
//    }
//}
//---------------------------------------------------------

//---------------------------------------------------------
public class Recursion1 {
    public static int printStack(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n%2 == 0) {
            return printStack(x, n/2) * printStack(x, n/2);
        }

        else {
            return x * printStack(x, n/2) * printStack(x, n/2);
        }
    }

    public static void main(String[] args) {
        int output = printStack(3, 4);
        System.out.println(output);

    }
}

//---------------------------------------------------------


