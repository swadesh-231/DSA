package RecursionTwo;

public class SubSets {
    public static void main(String[] args) {
        String str = "abcd";
        Subsets(str,0,"");
    }
    static void Subsets(String str,int idx,String ans){
        if(idx==str.length()){
            System.out.print(ans+" ");
            return;
        }
        Subsets(str,idx+1,ans+str.charAt(idx)); //take
        Subsets(str,idx+1,ans); //not take
    }
}
