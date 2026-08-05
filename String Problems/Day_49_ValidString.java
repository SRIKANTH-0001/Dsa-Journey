public class Day_49_ValidString {
    public static void main(String[] args) {
        String s="([{}])";

        boolean result=isValid(s);
        System.out.println(result);
    }

    public static boolean isValid(String s){
        while (true) {
            if(s.contains("[]")){
                s=s.replace("[]", "");
            }else if(s.contains("{}")){
                s=s.replace("{}", "");
            }else if(s.contains("()")){
                s=s.replace("()", "");
            }else{
                return s.isEmpty();
            }
        }
    }
}
