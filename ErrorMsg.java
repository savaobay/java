class ErrorMsg{
    final int OUTERR=0;
    final int INERR=1;
    final int DISKERR=2;
    final int INDEXERR=3;
    String msgs[]={"Loi xuat", "Loi nhap", "O dia day", "Chi so vuot ra ngoai gioi han mang"};
    String getErrorMsg(int i){
        if(i>=0 & i< msgs.length)
            return msgs[i];
        else
        return "ma loi khong hop le";
    }
}
class FinalD{
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}