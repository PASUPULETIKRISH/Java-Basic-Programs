
class BinaryTODecimal {
    public static void main(String[] args) {
        int binary =1010;
        int dec=0;int i=0;
        while(binary>0){
            int last=binary%10;
            dec=dec+last*(int)Math.pow(2,i++);
            binary/=10;
        }
        System.out.println("decimal num is : "+dec);
    }
}