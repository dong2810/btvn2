package simple1;

public class Main {

    public static void main(String[] args) {
        System.out.println("My name is Dong");
        float dt=dientich(7,6,5);
        System.out.println("Dien tich hình thang: "+dt);
        float dtht1=dtht(3.14f,3);
        System.out.println("Dien tich hình tron: "+dtht1);
        double dttg1=dttg(5,6,7);
        System.out.println("Dien tich hình tam giac: "+dttg1);
        double sum=b5(1234,4321);
        System.out.println("Ket qua bai 5: "+sum);
        double result=b6(3);
        System.out.println("Ket qua bai 6: "+result);
        System.out.println("Ket qua bai 8: \n");
        b8( 543200);
        System.out.println("Ket qua bai 7: "+b7(6));

    }
    public static float dientich(int dl,int dn,int cc){
        float dt=(dl+dn)*cc/2;
        return dt;
    }
    public static float dtht(float pi, int r){
        float dt1=r*r*pi;
        return dt1;
    }
    public static double dttg(int a, int b, int c){
        float p=(a+b+c)/2;
        double dt2=Math.ceil(Math.sqrt(p*(p-a)*(p-b)*(p-c))*100)/100;
        return dt2;
    }
    public static double b5(int x, int y){
        double result=Math.ceil((double)(x+y)/(x-y)*100)/100;
        return result;
    }
    public static double b6(int x){
        double result=Math.ceil((double)Math.sqrt(x+Math.sqrt(x+Math.sqrt(x)))*100)/100;
        return result;
    }
    public static void b8(int t){
        int x,y,z;
        z=t;
        x=t/3600;
        t=t-x*3600;
        y=t/60;
        t=t-y*60;
        System.out.println(z +" giay: "+x+" gio "+y+" phut "+t+" giay");
    }
    public static double b7(double t){
        return Math.pow(t,3)+Math.log(Math.pow(t,4)+2)/Math.log(2.0)-Math.cbrt(t-4);
    }
}
