public class App {
    public static void main(String[] args) throws Exception {
        
    }
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int fib(int n){
        if (n == 1){
            return 1;
        } 
    }
    public static boolean isEqual(string a, string b){
        if (a.lenght() != b.lenght){
            return false;
        }
        isEqual()
    }
    public static int howMany(String str, char c){
        if (str.lenght() == 0)
        if (str.charAt(0) == c){
            return howMany(str.subString(1) , c) + 1;
        }
        return howMany(str.subString(1), c);
    }
}
