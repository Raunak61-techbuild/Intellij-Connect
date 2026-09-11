//---------------------------------------------------------

//TOWER OF HANOI
//public class Recursion2 {
//    public static void towerOfHanoi(int n, String src, String help, String dest) {
//        if (n == 1) {
//            System.out.println("Transfer Discs from " + src + " to " + dest);
//            return;
//        }
//
//        towerOfHanoi(n-1, src, dest, help);
//        System.out.println("Transfer Discs from " + src + " to " + dest);
//        towerOfHanoi(n-1, help , src, dest);
//    }
//
//    public static void main(String[] args) {
//        int n = 3;
//        towerOfHanoi(n, "S", "H", "D");
//    }
//}

//---------------------------------------------------------

//---------------------------------------------------------
//public class Recursion2 {
//    public static void printReverse(int indx, String str) {
//        if (indx == 0) {
//            System.out.print(str.charAt(indx));
//            return;
//        }
//        System.out.println(str.charAt(indx));
//        printReverse(indx - 1, str);
//    }
//
//    public static void main(String[] args) {
//        String str = "abcd";
//        printReverse(str.length() - 1, str);
//    }
//}
//------------------------------------------------------------

//public class Recursion2 {
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void findOccurence(String str, int indx, char element) {
//        if(indx == str.length()) {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//
//        char currChar = str.charAt(indx);
//        if(currChar == element) {
//            if(first == -1) {
//                first = indx;
//            } else {
//                last = indx;
//            }
//        }
//        findOccurence(str, indx+1, element);
//    }
//
//    public static void main(String[] args) {
//        String str = "Raunak";
//        findOccurence(str, 2, 'a');
//    }
//}
//------------------------------------------------------------
//CHECK IF AN ARRAY IS SORTED (STRICTLY INCREASING) -

//public class Recursion2 {
//    public static boolean checkIfIncreasing(int arr[] , int indx) {
//        if (indx == arr.length-1) {
//            return true;
//        }
//
//        if(arr[indx] < arr[indx+1]) {
//            return checkIfIncreasing(arr, indx+1);
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {3 , 4 , 5};
//        System.out.println(checkIfIncreasing(arr, 0));
//    }
//}
//------------------------------------------------------------

//------------------------------------------------------------
//MOVE ALL 'X' TO THE END OF THE STRING
//public class Recursion2 {
//    public static void MoveX (String str, int indx, int count, String newString) {
//
//        if (indx == str.length()) {
//            for(int i = 0; i < count; i++) {
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//
//        char currChar = str.charAt(indx);
//        if (currChar == 'x') {
//            count++; //we just move the element forward in the string
//            MoveX(str, indx+1, count, newString);
//        }
//        else {
//            newString = currChar + newString; //We will modify the string
//            MoveX(str, indx+1, count, newString);
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "abxxdpdffxx";
//        MoveX(str, 0, 0, "");
//    }
//}
//------------------------------------------------------------

//------------------------------------------------------------
public class Recursion2 {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int indx, String newString) {

        //BASE CASE =>
        if (indx == str.length()) {
            System.out.println(newString);
            return;
        }

        //PRINTING CHARACTERS
        char currChar = str.charAt(indx);
        if (map[currChar - 'a']) {
            removeDuplicates (str, indx+1, newString);
        }
        else {
            newString = newString + currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, indx+1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abhdjkdjk";
        removeDuplicates (str, 0, "");
    }
}
//------------------------------------------------------------

//------------------------------------------------------------
//public class Recursion2 {
//    public static void subsequences(String str, int indx, String newString) {
//        if (indx == str.length()) {
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(indx);
//
//        //to be
//        subsequences(str, indx+1, newString+currChar);
//
//        //or not to be
//        subsequences(str, indx+1, newString);
//    }
//
//    public static void main(String args[]) {
//        String str = "abc";
//        subsequences(str, 0, "");
//    }
//}
//------------------------------------------------------------

//import java.util.HashSet;
//public class Recursion2 {
//    public static void subsequences(String str, int indx, String newString, HashSet<String>Set) {
//        if (indx == str.length()) {
//            if (Set.contains(newString)) {
//                return;
//            } else {
//                System.out.println(newString);
//                Set.add(newString);
//                return;
//            }
//        }
//        char currChar = str.charAt(indx);
//
//        //to be
//        subsequences(str, indx+1, newString+currChar, Set);
//
//        //or not to be
//        subsequences(str, indx+1, newString, Set);
//    }
//
//    public static void main(String args[]) {
//        String str = "aaa";
//        HashSet<String>Set = new HashSet<>();
//        subsequences(str, 0, "", Set);
//    }
//}
//------------------------------------------------------------

//------------------------------------------------------------
//import java.util.HashSet;

//public class Recursion2 {
//    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
//
//    public static void printComb(String str, int indx, String Combination) {
//        if(indx == str.length()) {
//            System.out.println(Combination);
//            return;
//        }
//
//        char currChar = str.charAt(indx);
//        String mapping = keypad[currChar - '0'];
//
//        for(int i=0; i<mapping.length(); i++) {
//            printComb(str, indx+1, Combination+mapping.charAt(i));
//        }
//    }
//
//    public static void main(String args[]) {
//        String str = "23";
//        printComb(str, 0, "");
//    }
//}
//------------------------------------------------------------
