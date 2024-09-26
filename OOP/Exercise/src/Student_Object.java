import java.util.Scanner;
public class Student_Object {
    private String name,Object;
    private float normalScore,MiddleScore,finalScore;
    public Student_Object(String name, String Object, float normalScore, float MiddleScore, float finalScore){
        this.name = name;
        this.Object = Object;
        this.normalScore = normalScore;
        this.MiddleScore = MiddleScore;
        this.finalScore = finalScore;
    }
    public Student_Object(String name ,String object){
        this.name = name;
        this.Object = object;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter normal score: ");
        normalScore = Float.parseFloat(sc.nextLine());
        System.out.println("Enter Middle score: ");
        MiddleScore = Float.parseFloat(sc.nextLine());
        System.out.println("Enter Final score: ");
        finalScore = Float.parseFloat(sc.nextLine());
    }
    public Student_Object(){
        name = "";
        Object = "";
        normalScore = 0;
        MiddleScore = 0;
        finalScore = 0;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter Object: ");
        Object = sc.nextLine();
        System.out.println("Enter normal score: ");
        normalScore = Float.parseFloat(sc.nextLine());
        System.out.println("Enter Middle score: ");
        MiddleScore = Float.parseFloat(sc.nextLine());
        System.out.println("Enter Final score: ");
        finalScore = Float.parseFloat(sc.nextLine());
    }
    public void Finnal_Score(){
        System.out.println("Final Score: "+(normalScore+MiddleScore*2+finalScore*3)/6);
    }
    public void Output(){
        System.out.println("Name: "+name);
        System.out.println("Object: "+Object);
        System.out.println("Normal Score: "+normalScore);
        System.out.println("Middle Score: "+MiddleScore);
        System.out.println("Final Score: "+finalScore);
        Finnal_Score();
    }
    public void pass(){
        if((normalScore+MiddleScore*2+finalScore*3)/6<5){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }

}
