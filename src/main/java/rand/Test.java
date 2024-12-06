package rand;
//class Test {
//    public static void main(String[] args) {
//        int a = 5, b = 0;
//        System.out.println(a / b);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        String str1 = "Java";
//        String str2 = "Java";
//        System.out.println(str1 == str2);
//    }
//}

public class Test {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
