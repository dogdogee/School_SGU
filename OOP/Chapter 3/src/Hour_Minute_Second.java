import java.util.Scanner;
public class Hour_Minute_Second {
    private int hour, minute, second;
    public Hour_Minute_Second(){
        hour=0;
        minute=0;
        second=0;
    }
    public Hour_Minute_Second(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gio: ");
        hour = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phut: ");
        minute = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap giay: ");
        second = Integer.parseInt(sc.nextLine());
    }
    public void Output(){
        System.out.println("Gio: "+hour);
        System.out.println("Phut: "+minute);
        System.out.println("Giay: "+second);
    }
}
