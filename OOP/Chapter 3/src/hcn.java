
public class hcn {
    private float x,y;
    public hcn(){
        x=0;
        y=0;
    }
    public hcn(float  x, float y){
        this.x=x;
        this.y=y;
    }
    Diem d = new Diem();
    public void getPoint(){
        d.GetPoint();
    }
    public void setx(float newx){
        x=newx;
    }
    public float getx(){
        return x;
    }
    public void sety(float newy){
        y=newy;
    }
    public float gety(){
        return y;
    }
    public float Area(){
        return x*y;
    }
    public float Perimeter(){
        return (x+y)*2;
    }
    public void show(float x){
        System.out.println("show: "+x);
    }
}