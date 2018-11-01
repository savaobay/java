import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

class MyClass{
    private int alpha;
    public int beta;
    int gamma;
    void setAlpha(int a){
        alpha=a;
    }
    int getalpha(){
        return alpha;
    }
}
class AccessDemo{
    public static void main(String args[]) {
        MyClass x = new MyClass();
        x.setAlpha(-99);
        System.out.println("ob.alpha la "+ x.getalpha());
        x.beta=88;
        x.gamma=-99;
    }
}
class FailSoftArray{
    private int a[];
    private int errval;
    public int length;
    public FailSoftArray(int size, int errv){
        a=new int[size];
        errval=errv;
        length=size;
    }
    public int get(int index){
        if(ok(index)) return a[index];
        return errval;
    }
    public boolean put(int index, int val){
        if(ok(index)){
            a[index]=val; 
            return true;
        }
    return false;
    }
    private boolean ok(int index){
        if(index>=0 & index<length) return true;
        return false;
    }
}
class FSDemo{
    public static void main(String args[]) {
        FailSoftArray fs=new FailSoftArray(5,-1);
        int x;

        System.out.println("loi nhung khong hien thi thong bao");
        for(int i=0;i<(fs.length*2);i++)
        fs.put(i,i*10);
        for(int i=0;i<(fs.length*2);i++){
            x=fs.get(i);
            if(x != -1) System.out.print(x+ " ");
        }
        System.out.println("");
        System.out.println("\n Loi thuc thi that bai kem theo thong bao");
        for(int i=0;i<(fs.length*2);i++)
        if(!fs.put(i,i*10))
        System.out.println("chi so "+i+"nam ngoai gioi han mang");
        for(int i=0;i<(fs.length*2);i++){
            x=fs.get(i);
            if(x!=-1)
            System.out.print(x+ " ");
            else
            System.out.println("chi so "+ i + "nam ngoai gioi han mang");
        }
    }
}
class Myclass{
    int x;
    Myclass(){
        System.out.println("ben trong phuong thuc Myclass() ");
        x=0;
    }
    Myclass(int i){
        System.out.println("ben trong phuong thuc Myclass(int) ");
        x=i;
    }
    Myclass(double d){
        System.out.println("ben trong phuong thuc Myclass(double) ");
        x=(int) d;
    }
    Myclass(int i, int j){
        System.out.println("ben trong phuong thuc Myclass(int, int) ");
        x=i*j;
    }
}
class OverloadConsDemo{
    public static void main(String args[]) {
        Myclass t1=new Myclass();
        Myclass t2=new Myclass(88);
        Myclass t3=new Myclass(17.23);
        Myclass t4=new Myclass(2,4);
        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }

}
class Summation{
    int sum;
    Summation(int num){
        sum=0;
        for(int i=1;i<num;i++)
        sum+=i;
    }
    Summation (Summation ob){
        sum=ob.sum;
    }
}
class SumDemo{
    public static void main(String args[]) {
        Summation s1=new Summation(5);
        Summation s2=new Summation(s1);

        System.out.println("s1.sum = " + s1.sum);
        System.out.println("s2.sum = " + s2.sum);
    }
}