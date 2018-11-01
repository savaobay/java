class StringDemo{
    public static void main(String args[]) {
        String str1=new String("Trong Java, chuoi chinh la doi tuong");
        String str2=new String("Chung duoc khoi tao theo nhieu cach");
        String str3=new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
class StrOps{
    public static void main(String args[]) {
        String str1="Tring lap trinh Web Java la so 1";
        String str2=new String(str1);
        String str3=new String("Trong Java chuoi rat manh");
        int result,idx;
        char ch;
        System.out.println("Chieu dai cua str1: " + str1.length());
        for(int i=0; i<str1.length();i++)
        System.out.print(str1.charAt(i));
        System.out.println();
        if(str1.equals(str2))
        System.out.println("str1 bang str2");
        else System.out.println("str1 khong bang str2");
        result=str1.compareTo(str3);
        if(result==0)
        System.out.println("str1 va str3 bang nhau");
        str2="One Two Three One";
        idx=str2.indexOf("One");
        System.out.println("chi so cua chuoi con turng khop dau tien voi chuoi One" + idx);
        idx=str2.lastIndexOf("One");
        System.out.println("chi so cua chuoi con trung khop cuoi cung voi chuoi One"+ idx);
        String str4=str1 + str2;
        System.out.println(str4);
    }
}
class StringArrays{
    public static void main(String args[]) {
        String strs[]={"This","is","a","test"};
        System.out.println("Mang ban dau: ");
        for(String s: strs)
        System.out.print(s+ " ");
        System.out.println();
        strs[1]="was";
        strs[3]="test, too";
        System.out.println("Mang da qua chinh sua: ");
        for(String s: strs)
        System.out.print(s+ " ");
        System.out.println();
    }
}
class SubStr{
    public static void main(String args[]) {
        String orgstr="Java thuc day Web phat trien";
        String substr=orgstr.substring(5,18);
        System.out.println("orgstr: "+ orgstr);
        System.out.println("substr" + substr);
    }
}