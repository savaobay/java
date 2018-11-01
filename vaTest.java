class VarArgs{
    static void vaTest(int ... v){
        System.out.println("so luong doi so: " + v.length);
        System.out.println("noi dung: ");
        for(int i=0;i<v.length;i++)
        System.out.println(" arg" + i + ":" + v[i] );
        System.out.println();
    }
    public static void main(String args[]){
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
class VarArgs2{
    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length);
        System.out.println("noi dung: ");
        for(int i=0;i<v.length;i++)
        System.out.println(" arg " + i + " " + v[i]);
        System.out.println();
    }
    public static void main(String args[]) {
        vaTest("moi doi so vararg: ", 10);
        vaTest("ba doi so: ", 1,2,3);
        vaTest("khong doi so: ");
    }
}
class VarArgs3{
    static void vaTest(int ... v){
        System.out.println("vaTest(int ...): " + "so luong doi so: " +v.length);
        System.out.println("noi dung: ");
        for(int i=0;i<v.length;i++)
        System.out.println("arg" + i + ": " + v[i]);
        System.out.println();
    }
    static void vaTest(boolean ... v){
        System.out.println("vaTest(boolean ...): " + "so luong doi so " + v.length);
        System.out.println("noi dung: ");
        for(int i=0;i<v.length;i++)
        System.out.println("arg " + i + ":" + v[i]);
        System.out.println();
    }
    static void vaTest(String msg, int ... v){
        System.out.println("vaTest(String, int ...): " + msg + v.length );
        System.out.println("noi dung: ");
        for(int i=0;i<v.length;i++)
        System.out.println("arg" + i + ":" + v[i]);
        System.out.println();
    }
    public static void main(String args[]) {
        vaTest(1,2,3);
        vaTest("kiem tra: ",10,20);
        vaTest(true,false,false);
    }
}