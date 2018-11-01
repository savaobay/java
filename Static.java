class StaticDemo{
    int x;
    static int y;
    int sum(){
        return x+y;
    }
}
class SDemo{
    public static void main(String args[]) {
        StaticDemo.y=5;
        StaticDemo ob1=new StaticDemo();
        StaticDemo ob2=new StaticDemo();
        ob1.x=20;
        ob2.x=50;
        
        System.out.println("tong cua ob1: " + ob1.sum());
        System.out.println("tong cua ob2: " + ob2.sum());
    }
}
class StaticMeth{
    static int val=1024;
    static int valDiv2(){
        return val/2;
    }
}
class SDemo2{
    public static void main(String args[]) {
        System.out.println("val bang" + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
class StaticBlock{
    static double rootOf2;
    static double rootOf3;
    static{
        System.out.println("Ben trong khoi tinh. ");
        rootOf2=Math.sqrt(2.0);
        rootOf3=Math.sqrt(3.0);
    }
    StaticBlock(String msg){
        System.out.println(msg);
    }
}
class SDemo3{
    public static void main(String args[]) {
        StaticBlock ob=new StaticBlock("Ben trong phuong thuc khoi tao");
        System.out.println("can bac 2 cua 2 bang " + StaticBlock.rootOf2);
        System.out.println("can bac 2 cua 3 bang " + StaticBlock.rootOf3);
    }
}