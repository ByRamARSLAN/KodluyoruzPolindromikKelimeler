public class Main {

    static boolean isPolindrome(String str){
        int i = 0, j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("\"" + str + "\"" + " kelimesi polindromik kelime değildir.");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("\"" + str + "\"" + " kelimesi polindromik kelimedir");
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isPolindrome("arabara"));

    }
}