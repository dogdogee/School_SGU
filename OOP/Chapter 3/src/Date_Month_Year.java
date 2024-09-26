import java.util.Scanner;
public class Date_Month_Year {
    private int date, month, year;
    public Date_Month_Year(){
        date=1;
        month=1;
        year=1;
    }
    public Date_Month_Year(int date, int month, int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        date = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang: ");
        month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam: ");
        year = Integer.parseInt(sc.nextLine());
    }
    public void Output(){
        System.out.println("Ngay: "+date);
        System.out.println("Thang: "+month);
        System.out.println("Nam: "+year);
    }

}
