class Queue{
    private char q[];
    private int putloc,getloc;
    Queue(int size){
        q=new char[size+1];
        putloc=getloc=0;
    }
    void put(char ch){
        if(putloc==q.length-1){
        System.out.println("Hang doi da day");
        return;
        }
        putloc++;
        q[putloc]=ch;
    }
    char get(){
        if(getloc==putloc){
            System.out.println("Hang doi rong ");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
class QDemo{
    public static void main(String args[]) {
        Queue bigQ=new Queue(100);
        Queue smallQ=new Queue(4);
        char ch;
        int i;
        System.out.println("Su dung bigQ de luu tru bang chu cai");
        for(i=0;i<26;i++)
        bigQ.put((char)('A'+i));
        System.out.println("noi dung cua bigQ:");
        for(i=0;i<26;i++){
        ch=bigQ.get();
        if(ch !=(char)0) System.out.print(ch);
        }
    System.out.println("\n");
    for(i=0;i<5;i++){
        System.out.print("co gang luu tru" +(char)('Z'-i));
        smallQ.put((char)('Z'-i));
        System.out.println();
    }
    System.out.print("noi dung cua smallQ: ");
    for(i=0;i<5;i++){
    ch=smallQ.get();
    if(ch != (char)0) System.out.println(ch);
        }
    }
}
class Queue2{
    private char q[];
    private int putloc, getloc;
    Queue2(int size){
        q=new char[size+1];
        putloc=getloc=0;

    }

    Queue2(Queue2 ob){
        putloc=ob.putloc;
        getloc=ob.getloc;
        q=new char [ob.q.length];
        
        for(int i=getloc+1;i<=putloc;i++)
        q[i]=ob.q[i];
    }
    Queue2(char a[]){
        putloc=0;
        getloc=0;
        q=new char[a.length+1];
        for(int i=0; i<a.length;i++) put(a[i]);
    }
    void put(char ch){
        if(putloc==q.length-1){
        System.out.println("hang doi da day");
        return;
        }
        putloc++;
        q[putloc]=ch;
    }
    char get(){
        if(getloc==putloc){
            System.out.println("hang doi rong");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
        }
}
class QDemp2{
    public static void main(String args[]) {
        Queue2 q1=new Queue2(10);
        char name[]= {'T','o','m'};
        Queue2 q2= new Queue2(name);
        char ch;
        int i;
        for(i=0;i<10;i++)
        q1.put((char)('A'+i));
        Queue2 q3=new Queue2(q1);
        System.out.print("noi dung cua hang doi q1: " );
        for(i=0;i<10;i++){
            ch=q1.get();
            System.out.println(ch);
        }

        System.out.println("\n");
        System.out.print("noi dung cua hang doi q2: ");
        for(i=0;i<3;i++){
            ch=q2.get();
            System.out.println(ch);
        }

        System.out.println("\n");
        System.out.print("noi dung cua hang doi q3: ");
        for(i=0;i<10;i++){
            ch=q3.get();
            System.out.println(ch);
        }
    }
}