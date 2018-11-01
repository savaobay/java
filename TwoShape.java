import com.sun.prism.paint.Color;

abstract class TwoShape{
    private double width;
    private double height;
    private String name;
    TwoShape(){
        width=height=0.0;
        name="khong xac dinh";
    }
    TwoShape(double x, String n){
        width=height=x;
        name=n;
    }
    TwoShape(double w, double h, String n){
        width=w;
        height=h;
        name=n;
    }
    TwoShape (TwoShape ob){
        width=ob.width;
        height=ob.height;
        name=ob.name;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width=w;
    }
    void setHeight(double h){
        height=h;
    }
    String getName(){
        return name;
    }
    void showDim(){
        System.out.println("chieu dai canh day va chieu cao la: " + width + height);
    }
    abstract double area();
}
class Triangle extends TwoShape{
    private String style;
    Triangle(){
        super();
        style="khong xac dinh";
    }
    Triangle(double x){
        super(x,"hinh tam giac");
        style="dac";
    }
    Triangle(String s, double w, double h){
        super(w, h, "hinh tam giac");
        style=s;
    }
    Triangle(Triangle ob){
        super(ob);
        style=ob.style;
    }
    double area(){
        return getHeight()*getWidth()/2;
    }
    void showStyle(){
        System.out.println("Tam giac " + style);
    }
}
// class Shapes{
//     public static void main(String args[]) {
//         Triangle t1=new Triangle("dac",4.0,4.0);
//         Triangle t2=new Triangle("rong",8.0,12.0);

//         System.out.println("thong tin ve doi tuong t1: ");
//         t1.showStyle();
//         t1.showDim();
//         System.out.println("dien tich bang " + t1.area());
//         System.out.println();
//         System.out.println("thong tin ve doi tuong t2: ");
//         t2.showStyle();
//         t2.showDim();
//         System.out.println("dien tich bang "+ t2.area());
//     }
// }
class Rectangle extends TwoShape{
    Rectangle(){
        super();
    }
    Rectangle(double w, double h){
        super(w, h,"hinh chu nhat");
    }
    Rectangle(double x){
        super(x,"hinh chu nhat");
    }
    Rectangle(Rectangle ob){
        super(ob);

    }
    boolean isSquare(){
        if(getHeight()==getWidth())
        return true;
        return false;
    }
    double area(){
        return getHeight()*getWidth();
    }
}
class ColorTriangle extends Triangle{
    private String color;
    ColorTriangle(String c, String s, double w, double h){
        super(s,w,h);
        color=c;
    }
        String getColor(){
            return color;
        }
        void showColor(){
            System.out.println("mau " + color);
        }
    }
// class Shape6{
//     public static void main(String args[]) {
//         ColorTriangle t1= new ColorTriangle("Xanh","Rong",8.0,12.0);
//         ColorTriangle t2= new ColorTriangle("Do", "dac", 2.0, 2.0);
//         System.out.println("thong tin ve doi tuong t1: ");
//         t1.showStyle();
//         t1.showDim();
//         t1.showColor();
//         System.out.println("dien tich bang: "+ t1.area());
//         System.out.println("thong tin ve doi tuong t2: ");
//         t2.showStyle();
//         t2.showDim();
//         t2.showColor();
//         System.out.println("dien tich bang " + t2.area());
//     }
// }
// class DynShapes{
//     public static void main(String args[]) {
//         TwoShape shapes[] = new TwoShape[5];
//         shapes[0] = new Triangle("rong", 8.0, 12.0);
//         shapes[1] = new Rectangle(10);
//         shapes[2] = new Rectangle(10,4);
//         shapes[3] = new Triangle(7.0);
//         shapes[4] = new TwoShape(10,20,"hinh dang chung");
//         for (int i=0;i< shapes.length;i++){
//             System.out.println("doi tuong la " + shapes[i].getName());
//             System.out.println("dien tich bang: " + shapes[i].area());
//             System.out.println();
//         }
//     }
// }
class AbsShape{
    public static void main(String args[]) {
        TwoShape shapes[] = new TwoShape[4];

        shapes[0]= new Triangle("rong",8.0,12.0);
        shapes[1]= new Rectangle(10);
        shapes[2]= new Rectangle(10,4);
        shapes[3]= new Triangle(7.0);

        for (int i=0; i<shapes.length;i++){
            System.out.println("doi tuong la " + shapes[i].getName());
            System.out.println("dien tich bang " + shapes[i].area());
            System.out.println();
        // TwoShape test = new TwoShape(12.0,8.0,"khong xac dinh");
        // System.out.println("doi tuong la " + test.getName());
        // System.out.println("dien tich bang " + test.area());
        }
    }
}