class HelloWorld {
    public static void main(String[] args) {
        int n=552;
        int temp=0;
        int sum=0;
        while(n>0){
            temp=n%10;
            sum+=temp;
            n=n/10;
        }
       System.out.print(sum);
    }
}
