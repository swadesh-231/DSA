package RecursionTwo;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "bcabcabac";
        SkipChar(str,0,"");
    }
    static void SkipChar(String s, int idx, String ans){
        if (idx==s.length()){
            System.out.println(ans);
            return;
        }
        if (s.charAt(idx)!='a'){
            ans += s.charAt(idx);
        }
        SkipChar(s,idx+1,ans);
    }
}
