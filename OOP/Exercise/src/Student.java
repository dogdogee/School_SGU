import java.util.Scanner;
public class Student {
    private String Student_Number,Name;
    private String SubJect[] = new String[10];
    private float Score[] = new float[10];
    public Student(){
        Student_Number = "";
        Name = "";
        for(int i=0;i<10;i++){
            SubJect[i] = "";
            Score[i] = 0;
        }
    }
    public Student(String Student_Number, String Name){
        this.Student_Number = Student_Number;
        this.Name = Name;
        for(int i=0;i<10;i++){
            SubJect[i] = "";
            Score[i] = 0;
        }
    }
    public Student(String Student_Number, String Name, String SubJect[], float Score[]){
        this.Student_Number = Student_Number;
        this.Name = Name;
        for(int i=0;i<10;i++){
            this.SubJect[i] = SubJect[i];
            this.Score[i] = Score[i];
        }
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Number: ");
        Student_Number = sc.nextLine();
        System.out.println("Enter Name: ");
        Name = sc.nextLine();
        for(int i=0;i<10;i++){
            System.out.println("Enter Subject "+(i+1)+": ");
            SubJect[i] = sc.nextLine();
            System.out.println("Enter Score "+(i+1)+": ");
            Score[i] = Float.parseFloat(sc.nextLine());
        }
    }
    public void Output(){
        System.out.println("Student Number: "+Student_Number);
        System.out.println("Name: "+Name);
        for(int i=0;i<10;i++){
            System.out.println("Subject "+(i+1)+": "+SubJect[i]);
            System.out.println("Score "+(i+1)+": "+Score[i]);
        }
    }
    public void 
}
