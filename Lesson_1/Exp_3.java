package Lesson_1;

public   class Exp_3 {
    public static void main(String[] args) {
        int result =  Solution("Hello","He");
        System.out.println(result);
    }
   static int Solution(String str, String startStr){
    char [] newStr =str.toCharArray();
    char[] newStartStr =startStr.toCharArray();
    int result = 0;
    if (str == null || startStr == null || startStr.length() > str.length() || startStr.length()==1){
        return 0;
    }
    for (int i = 0; i < startStr.length(); i++) {
        if (newStr[i] == newStartStr[i]) {
            result = result+1;
        }
    }
    if (result == startStr.length())
    {
        return result;
    }
    else{
        return 0;
    }
    }
}
   
    
    
