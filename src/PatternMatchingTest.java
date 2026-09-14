public class PatternMatchingTest {

    public static void main(String[] args) {
        System.out.println(matchPattern(10));
        System.out.println(matchPattern("Amit"));
        System.out.println(matchPattern(false));
        System.out.println(matchPattern(10l));
        System.out.println(matchPattern('C'));
    }
     static String matchPattern(Object obj){
       return switch (obj){
            case Integer i -> "int :"+i;
            case String s -> "String :"+s;
            case Boolean b -> "Boolean value is :"+b;
            case Long l -> "Long value is :"+l;
            case Character c -> "Character value is :"+c;
            default  -> "default";
        };
    }
}
