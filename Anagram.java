import java.util.Arrays;
class Anagram {
    public static void main(String[] args) {
        String s1="Krishna";
        String s2="maawa";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length!=c2.length){
            System.out.println("NOT ANAGRAM");
            System.exit(0);
        }
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                 System.out.println("NOT ANAGRAM");
                 System.exit(0);
            }
        }
        System.out.println("Anagram");
    }
}
