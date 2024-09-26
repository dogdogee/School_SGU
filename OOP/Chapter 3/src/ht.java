
import java.util.Scanner;

public class ht {
    private float r;
    public ht(){
        r=0;
    }
    public ht(float  r){
        this.r=r;
    }
    Scanner  sc = new Scanner(System.in);
    public void getPoint(){
        System.out.println("Nhap r: ");
        r = sc.nextFloat();
    }
    
    public void setr(float newr){
        r=newr;
    }
    public float getr(){
        return r;
    }
    public float Area(){
        return ((float)Math.pow(r,2))*((float)Math.PI);
    }
    public float Perimeter(){
        return 2*r*((float)Math.PI);
    }
    public void show(float x){
        System.out.println("show: "+x);
    }
}
