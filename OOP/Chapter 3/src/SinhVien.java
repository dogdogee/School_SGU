import java.util.Scanner;
public class SinhVien {
    private float diem1, diem2, diem3;
    private String ten,lop;
    private int mssv;
    public SinhVien(){
        diem1=0;
        diem2=0;
        diem3=0;
        ten="";
        lop="";
        mssv=0;
    }
    public SinhVien(float diem1, float diem2, float diem3, String ten, String lop, int mssv){
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
        this.ten=ten;
        this.lop=lop;
        this.mssv=mssv;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap lop: ");
        lop = sc.nextLine();
        System.out.println("Nhap mssv: ");
        mssv = Integer.parseInt((sc.nextLine()));
        System.out.println("Nhap diem1: ");
        diem1 = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap diem2: ");
        diem2 = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap diem3: ");
        diem3 = Float.parseFloat(sc.nextLine());
    }
    public void Output(){
        System.out.println("Ten: "+ten);
        System.out.println("Lop: "+lop);
        System.out.println("Mssv: "+mssv);
        System.out.println("Diem1: "+diem1);
        System.out.println("Diem2: "+diem2);
        System.out.println("Diem3: "+diem3);
        System.out.println("Diem TB: "+DiemTB());
        System.out.print("Xep loai: ");
        XepLoai();
    }
    public float DiemTB(){
        return (diem1+diem2+diem3)/3;
    }
    public void XepLoai(){
        if(DiemTB()<5){
            System.out.println("Yeu");
        }
        else if(DiemTB()<7){
            System.out.println("Trung Binh");
        }
        else if(DiemTB()<8){
            System.out.println("Kha");
        }
        else{
            System.out.println("Gioi");
        }
    }
}
