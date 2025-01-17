package classification;

public class javalong {
    public static void main(String[] args) {
    	 // 初始化字串
        String greeting = "Hello, Java!";
        System.out.println("Original String: " + greeting);

        // 基本操作
        System.out.println("String Length: " + greeting.length());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Substring: " + greeting.substring(7, 11)); // 顯示 "Java"
        System.out.println("Replaced String: " + greeting.replace("Java", "World"));
        
        int a = 5;
        int b = 3;

        // 數學運算
        System.out.println("Maximum of " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Power (2^3): " + Math.pow(2, 3));
        System.out.println("Random number (0 to 1): " + Math.random());
        
        
    }
}
