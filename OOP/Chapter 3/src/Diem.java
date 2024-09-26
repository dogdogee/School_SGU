import java.util.Scanner;
class Diem {
    private float x,y;
    public Diem(){
        x=0;
        y=0;
    }
    public Diem(float  x, float y){
        this.x=x;
        this.y=y;
    }
    public void GetPoint(){
        Scanner sc = new Scanner(System.in);    
        System.out.println("Nhap x: ");
        x = sc.nextFloat();
        System.out.println("Nhap y: ");
        y = sc.nextFloat();
    }
    public void setx(float newx){
        x+=newx;
    }
    public float getx(){
        return x;
    }
    public void sety(float newy){
        y+=newy;
    }
    public float gety(){
        return y;
    }
    public float Arae(){
        return x*y;
    }
    public float Perimeter(){
        return (x+y)*2;
    }
    public void show(float x){
        System.out.println("show: "+x);
    }

}
