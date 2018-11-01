import com.sun.org.apache.bcel.internal.generic.SWAP;

class Bubble{
    public static void main(String agrs[]) {
        int nums[]={1,52,-123,432,543,-5,-6,-3,13,49};
        int a,b,t;
        int size;
        size=10;
        System.out.println("Mang ban dau la: ");
        for(int i=0;i<size;i++)
        System.out.print(" "+ nums[i]);
        System.out.println();
        for(a=1;a<size;a++)
            for(b=size-1;b>=a;b--)
                if(nums[b-1]>nums[b]){
                    t=nums[b-1];
                    nums[b-1]=nums[b];
                    nums[b]=t;
                }
        for(int i=0;i<10;i++)
        System.out.print(" "+ nums[i]);
        System.out.println();
    }
}