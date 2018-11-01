import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

class Factorial{
    int factR(int n){
        int result;
        if(n==1) return 1;
        result=n*factR(n-1);
        return result;
    }
    int factI(int n){
        int t, result;
        result=1;
        for(t=1;t<=n;t++)
        result*=t;
        return result;
    }
}
class Recursion{
    public static void main(String args[]) {
        Factorial f= new Factorial();
        System.out.println("tinh giai thua su dung de quy:");
        System.out.print(f.factR(4));
        System.out.println("tinh giai thua su dung vong lap: ");
        System.out.print(f.factI(4));
    }
}