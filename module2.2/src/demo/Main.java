package demo;

public class Main {
    public static void main(String[] args) {


        String s = "CodegymDaNang";
        System.out.println(solution(s));

    }

    static String solution(String s) {
        String array = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                array+= " "+s.toLowerCase().charAt(i);
            }else {
                array+=s.charAt(i);
            }
        }
        return array.trim();
    }

}