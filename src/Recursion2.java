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
//public class Recursion2 {
//    public static void printReverse(int indx, String str) {
//
//        if (indx == 0) {
//            System.out.println(str.charAt(indx));
//            return;
//        }
//
//        System.out.print(str.charAt(indx));
//        printReverse(indx-1, str);
//    }
//
//    public static void main(String[] args) {
//        String str = "ABCDEFG";
//        printReverse(str.length()-1, str); //str.length basically means the length of the entire string and -1 means we are fully printing it
//    }
//}

//---------------------------------------------------------

//------------------------------------------------------------
//FIND OCCURENCE OF FIRST AND LAST OCCURENCE OF ELEMENT USING RECURSION

//public class Recursion2 {
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void findOccurence (String str, char element, int indx) {
//        if(indx == str.length()) {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//
//        char currChar = str.charAt(indx); //This grabs one letter at position index
//        if (currChar == element) {
//            if(first == -1) {
//                first = indx;
//            } else {
//                last = indx;
//            }
//        }
//        findOccurence(str, element, indx+1);
//    }
//
//    public static void main(String[] args) {
//        String str = "abcdefgh";
//        findOccurence(str, 'a', 0);
//    }
//}
//------------------------------------------------------------
//CHECK IF AN ARRAY IS SORTED (STRICTLY INCREASING) -

//public class Recursion2 {
//    public static boolean checkArray(int indx, int arr[]) {
//
//        if(indx == arr.length-1) {  //This means we are already at last element of array because of arr.length-1
//            return true;
//        }
//
//        if (arr[indx] < arr[indx+1]) {
//            return checkArray(indx+1, arr);
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2 , 3 , 4 , 10};
//        System.out.println(checkArray(0, arr));
//    }
//}

//------------------------------------------------------------
//MOVE ALL 'X' TO THE END OF THE STRING
//public class Recursion2 {
//    public static void moveAllX (String str, int indx, int count, String newString) {
//
//        if(indx == str.length()) {
//            for(int i=0; i<count; i++) {
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        } //NEWSTRING holds all non-x char in order & count holds how many 'x' we skipped. Now we finally append that many 'x' characters to end & print
//
//        char currChar = str.charAt(indx); //GRABS THE CURRENT CHARACTER
//
//        if(currChar == 'x') {
//            count++;
//            moveAllX(str, indx+1, count, newString);
//        } else {
//            newString += currChar;
//            moveAllX(str, indx+1, count, newString);
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "axbdxccxxddnj";
//        moveAllX(str, 0, 0, "");
//    }
//}
//------------------------------------------------------------

//------------------------------------------------------------
//REMOVE ALL THE DUPLICATES
//public class Recursion2 {
//    public static boolean[] map = new boolean[26];
//
//    public static void removeDuplicates(String str, int indx, String newString) {
//        if (indx == str.length()) {
//            System.out.println(newString);
//            return;
//        }
//
//        char currChar = str.charAt(indx);
//        if(map[currChar - 'a']) {
//            removeDuplicates(str, indx+1, newString);
//        } else {
//            newString += currChar;
//            map[currChar - 'a'] = true;
//            removeDuplicates(str, indx+1, newString);
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "raunak";
//        removeDuplicates(str, 0, "");
//    }
//}

//------------------------------------------------------------

//------------------------------------------------------------
//PRINT ALL SUBSEQUENCES
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
//
//public class Recursion2 {
//    public static void printSubsequence(String str, int indx, String newString, HashSet<String>Set) {
//
//        if (indx == str.length()) {
//            if(Set.contains(newString)) {
//                return;
//            } else {
//                System.out.println(newString);
//                Set.add(newString);
//                return;
//            }
//        }
//
//        char currChar = str.charAt(indx);
//
//        //to be
//        printSubsequence(str, indx+1, newString+currChar, Set);
//
//        //not to be
//        printSubsequence(str, indx+1, newString, Set);
//    }
//
//    public static void main(String[] args) {
//        String str = "aaa";
//        HashSet<String>Set = new HashSet<>();
//        printSubsequence(str, 0, "", Set);
//    }
//}
//------------------------------------------------------------

//------------------------------------------------------------
//public class Recursion2 {
//    public static String[] keyword = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
//
//    public static void printComb(String str, int indx, String Combination) {
//
//        if(indx == str.length()) {
//            System.out.println(Combination);
//            return;
//        }
//
//        char currChar = str.charAt(indx);
//        String mapping = keyword[currChar - '0'];
//        for(int i=0; i<mapping.length(); i++) {
//            printComb(str, indx+1, Combination+mapping.charAt(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "123";
//        printComb(str, 0, "");
//    }
//}
//------------------------------------------------------------
public class Recursion2 {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombination(String str, int indx, String Combination) {

        if(indx == str.length()) {
            System.out.println(Combination);
            return;
        }

        char currChar = str.charAt(indx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            printCombination(str, indx+1, Combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "123";
        printCombination(str, 0, "");
    }
}














