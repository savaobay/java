class Block{
    int a,b,c;
    int volume;

    Block(int i, int j, int k){
        a=i;
        b=j;
        c=k;
        volume=a*b*c;
    }
    boolean sameBlock(Block ob){
        if((ob.a)==a&(ob.b)==b&(ob.c)==c)
        return true;
        else return false;
    }
    boolean sameVolume(Block ob){
        if(ob.volume==volume) return true;
        else return false;
    }
}
class Passob{
    public static void main(String args[]) {
        Block ob1=new Block(10,2,5);
        Block ob2=new Block(10, 2, 5);
        Block ob3=new Block(4, 5, 5);

        System.out.println("ob1 cung kich thuoc ob2" + ob1.sameBlock(ob2)); 
        System.out.println("ob1 cung kich thuoc ob3" + ob1.sameBlock(ob3));
        System.out.println("ob1 cung the tich voi ob3" + ob1.sameVolume(ob3));
    }
}
class Test{
    int a,b;
    Test(int i,int j){
        a=i;
        b=j;
    }
    void change(Test ob){
    ob.a=ob.a+ob.b;
    ob.b=-ob.b;
    }
}
class PassObRef{
    public static void main(String args[]) {
        Test ob=new Test(15,20);
        System.out.println("ob.a va ob.b truoc loi goi phuong thuc:"+ ob.a+ob.b);
        ob.change(ob);
        System.out.println("ob.a va ob.b sau loi goi phuong thuc: "+ ob.a+ob.b);
    }
}
class ErrorMsg{
    String msgs[]={"loi xuat","loi nhap","o dia day","chi so vuot qua gioi han mang"};

    String getErrorMsg(int i){
        if(i>=0 & i<msgs.length)
        return msgs[i];
        else
        return "Ma loi khong hop le";
    }
}
class ErrMsg{
    public static void main(String args[]) {
        ErrorMsg err=new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
class Err{
    String msg;
    int severity;

    Err(String m, int s){
        msg=m;
        severity=s;
    }
    }
class ErrorInfo{
    String msgs[]={"loi xuat","loi xuat","o dia day","chi so vuot qua gioi han mang"};
    int howbad[]={3,3,2,4};
    Err getErrorInfo(int i){
        if(i>=0 & i<msgs.length)
        return new Err(msgs[i], howbad[i]);
        else 
        return new Err("ma loi khong hop le",0);
    }
}
class ErrInfo{
    public static void main(String args[]) {
        ErrorInfo err=new ErrorInfo();
        Err e;
        e=err.getErrorInfo(2);
        System.out.println(e.msg + "muc do nghiem trong:" + e.severity);
        e=err.getErrorInfo(19);
        System.out.println(e.msg + "muc do nghiem trong: "+ e.severity);
    }
}