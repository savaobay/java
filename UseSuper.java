class A{
    int i;
}
class B extends A{
    int i;
    B(int a, int b){
        super.i=a;
        i=b;
    }
    void show(){
        System.out.println("thanh vien i cua lop cha: " + super.i);
        System.out.println("thanh vien i cua lop con: " + i);
    }
}
class UserSuper{
    public static void main(String args[]) {
        B subOb =new B(1,2);
        subOb.show();
    }
}