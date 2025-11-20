public class First_appear {
    public  static int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        if(!(haystack.contains(needle))){
            return -1;
        }
        int pos=-1;
        for(int i=0;i<haystack.length()-needle.length();i++){
            boolean flag=true;
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                pos=i;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        System.out.println(strStr("abc","c"));
    }
}

