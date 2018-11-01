class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
    void range(){
        System.out.println("Quang duong di duoc la " + fuelcap*mpg +"dam");
    }
    int rangever_2(){
        return mpg*fuelcap;
    }
    double fuelneeded(int miles){
        return (double) miles/mpg;
    }
    Vehicle (int p, int f, int m){
        passengers=p;
        fuelcap=f;
        mpg=m;
    }
}
class AddMeth{
    public static void main(String args[]) {
        Vehicle minivan =new Vehicle();
        Vehicle sportcar=new Vehicle();
        minivan.fuelcap=16;
        minivan.passengers=7;
        minivan.mpg=21;

        sportcar.passengers=2;
        sportcar.fuelcap=14;
        sportcar.mpg=12;
        minivan.range();
        sportcar.range();
    }
}
class Vehicle_demo{
    public static void main(String args[]) {
        Vehicle minivan=new Vehicle();
        int range;
        minivan.fuelcap=16;
        minivan.passengers=7;
        minivan.mpg=21;
        range=minivan.mpg*minivan.fuelcap;
        System.out.println("Minivan co the cho" +minivan.passengers+ "hanh khach trong quang duong dai"+range+ "dam" );
    }
}
class RetMeth{
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar=new Vehicle();
        int range1,range2;
        minivan.fuelcap=16;
        minivan.mpg=21;
        minivan.passengers=7;

        sportcar.fuelcap=14;
        sportcar.mpg=12;
        sportcar.passengers=2;

        range1=minivan.rangever_2();
        range2=sportcar.rangever_2();

        System.out.println(range1);
        System.out.println(range2);
    }
}
class CompFuel{
    public static void main(String args[]) {
        Vehicle minivan =new Vehicle();
        Vehicle sportcar=new Vehicle();
        double gallons;
        int dist=252;
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        sportcar.passengers=2;
        sportcar.fuelcap=14;
        sportcar.mpg=12;

        gallons=minivan.fuelneeded(dist);
        System.out.println(gallons);
        gallons=sportcar.fuelneeded(dist);
        System.out.println(gallons);
        
    }
}
class VehConsDemo{
    public static void main(String args[]) {
        Vehicle minivan =new Vehicle(7, 16, 21);
        Vehicle sportcar= new Vehicle(2, 14, 12);
        double gallons;
        int dist=252;
        gallons=minivan.fuelneeded(dist);
        System.out.println(gallons);
        gallons=sportcar.fuelneeded(dist);
        System.out.println(gallons);
    }
}
class Truck extends Vehicle{
    private int cargocap;
    Truck(int p, int f, int m, int c){
        super(p, f, m);
        cargocap=c;
    }
    int getCargo(){
        return cargocap;
    }
    void putCargo(int c){
        cargocap=c;
    }
}
    class TruckDemo{
        public static void main(String args[]) {
            Truck semi=new Truck(2, 200, 7, 44000);
            Truck pickup=new Truck(3, 28, 15, 2000);
            double gallons;
            int dist=252;
            gallons=semi.fuelneeded(dist);
            System.out.println("Semi co the cho duoc: " + semi.getCargo() + "pound");
            System.out.println("de di duoc" + dist + "dam semi can " + gallons + "gallons nhien lieu");
            gallons=pickup.fuelneeded(dist);
            System.out.println("Pickup co the cho duoc: " + pickup.getCargo() + "pound");
            System.out.println("de di duoc " + dist + "dam pickup can " + gallons + "gallons nhien lieu");
        }
    }