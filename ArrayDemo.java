class ArrayDemo{
    public static void main(String args[]) {
        int sample[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        sample[i]=i;
        for(i=0;i<10;i++)
        System.out.println("day la phan tu sample["+ i +"]: " + sample[i]);
    }
}
class MinMax{
    public static void main(String args[]) {
        int nums[]=new int[10];
        int min,max;
        nums[0]=1;
        nums[1]=-2;
        nums[2]=1231314;
        nums[3]=-978;
        nums[4]=14;
        nums[5]=5623;
        nums[6]=463;
        nums[7]=-9;
        nums[8]=287;
        nums[9]=49;
        min=max=nums[0];
        for(int i=1;i<10;i++)
        if(nums[i]>max)
        max=nums[i];
        for(int i=1;i<10;i++)
        if(nums[i]<min)
        min=nums[i];
        System.out.println("gia tri nho nhat va lon nhat la :" + min + " va " + max);
    }
}
class MinMax2{
    public static void main(String args[]) {
        int nums[]={99,-10,1101010,18,-978,5623,463,-9,287,39};
        int min,max;
        min=max=nums[0];
        for(int i=1;i<10;i++){
        if(nums[i]<min) min=nums[i];
        if(nums[i]>max) max=nums[i];
        }
        System.out.println("gia tri nho nhat va lon nhat la " + min + "va " + max);
    }
}