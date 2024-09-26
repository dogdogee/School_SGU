



public class Test {
public static void main(String[] args) {
    // test1();//Done
    //test2();//Done
    // test3();//Done
    // test4();//Done
    // test5();//Done
    // test6();//DOne
    
}
static  void test1(){
    Diem d = new Diem();
    d.GetPoint();
}
static void test2() {
    hcn d = new hcn(1, 2);
    d.getPoint();
    d.setx(3);
    d.sety(4);
    d.show(d.getx());
    d.show(d.gety());
    System.out.println("Area: "+d.Area());
    System.out.println("Perimeter: "+d.Perimeter());
    }
static void test3(){
    ht d = new ht(1);
    System.out.println("Area: "+d.Area());
    System.out.println("Perimeter: "+d.Perimeter());
    d.getPoint();
    System.out.println("Area: "+d.Area());
    System.out.println("Perimeter: "+d.Perimeter());
    d.setr(3);
    d.show(d.getr());
    System.out.println("Area: "+d.Area());
    System.out.println("Perimeter: "+d.Perimeter());
}
static void test4(){
    SinhVien d1 = new SinhVien(10, 9, 8,"Nguyen Van A", "CNTT",3123);
    d1.Output();
    d1.Input();
    d1.Output();
} 
static  void test5(){
    Date_Month_Year d = new Date_Month_Year(1, 2, 3);
    d.Output();
    d.Input();
    d.Output();
    Hour_Minute_Second d1 = new Hour_Minute_Second(1, 2, 3);
    d1.Output();
    d1.Input();
    d1.Output();
}
static void test6(){
    Fraction d = new Fraction(1,2);
    Fraction d1 = new Fraction(1,2);
    d.show();
    d.SumFraction(d1);
    d.rotate();
    d.setDenominator(3);d.getDenominator();
    d.setNumerator(4);d.getNumerator();
    d.show();
    d.SumFraction(d1);
    d.rotate();

}
}
