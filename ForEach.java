class ForEach{
    public static void main(String args[]) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int x: nums){
            System.out.println("gia tri la "+x);
            sum+=x;
        }
        System.out.println(sum);
}
}
class NoChange{
    public static void main(String args[]) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        for(int x:nums){
            System.out.print(x+" ");
            x=x*10;
        }
        System.out.println();
        for(int x: nums)
        System.out.print(x+ " ");
        System.out.println();
    }
}
class Search{
    public static void main(String args[]) {
        int nums[]={6,8,3,7,5,6,1,4};
        int val=0;
        boolean found=false;
        for(int x: nums){
            if(x==val){
                found=true;
                break;
            }
        }
        if(found)
        System.out.println("da tim thay gia tri");
        else System.out.println("khong tim thay gia tri");
    }
}