public class Fraction {
    private int numerator, denominator;
    public void setNumerator(int newNumerator){
        numerator = newNumerator;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int newDenominator){
        denominator = newDenominator;
    }
    public int getDenominator(){
        return denominator;
    }
    
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void show(){
        System.out.println(numerator+"/"+denominator);
    }
    public void rotate(){
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
        getNumerator();
        getDenominator();
        System.out.println(numerator+"/"+denominator);
    }
    public void SumFraction(Fraction f){
        int sumNumerator = numerator*f.getDenominator() + f.getNumerator()*denominator;
        int sumDenominator = denominator*f.getDenominator();
        System.out.println(sumNumerator+"/"+sumDenominator);
    }


}
