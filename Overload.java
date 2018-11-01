class Overload{
    void ovlDemo(){
        System.out.println("khong co tham so");
    }
    void ovlDemo(int a){
        System.out.println("co mot tham so:"+ a);
    }
    int ovlDemo(int a, int b){
        System.out.println("co hai tham so: " + a + " " + b);
        return a+b;
    }
    double ovlDemo(double a, double b){
        System.out.println("co hai tham so kieu double: " + a + " " + b);
        return a+b;
    }
}
class OverloadDemo{
    public static void main(String args[]) {
        Overload ob=new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();
        resI=ob.ovlDemo(4, 6);
        System.out.println("ket qua cua ob.ovlDemo(4,6) la:" + resI);
        resD=ob.ovlDemo(1.1, 2.32);
        System.out.println("ket qua cua ob.ovlDemo(1.1,2.32) la" + resD);
    }
}
class Overload2{
    void f(int x){
        System.out.println("ben trong phuong thuc f(int):"+x);
    }
    void f(double x){
        System.out.println("ben trong phuong thuc f(double):"+x);
    }
    void f(byte x){
        System.out.println("ben trong phuong thuc f(byte):"+x);
    }
}
class TypeConv{
    public static void main(String args[]) {
        Overload2 ob= new Overload2();
        int i=10;
        double d=10.1;
        byte b=99;
        short s=10;
        float f=11.5F;
        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
}