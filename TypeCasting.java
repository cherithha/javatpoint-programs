public class TypeCasting {
    public static void main(String[] args){
        int myInt = 9;
        double myDouble = myInt;// Automatic casting: int to double
        double dob= 30989.0907;
        float flot= 30.22f, flotI= myInt;
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(flot);
    System.out.println(flotI);
    System.out.println(dob);


    double myDoub = 9.78d;
    int myIn = (int) myDoub; // Manual casting: double to int
    char f= (char) myDouble;
    Boolean boo=true;
    String s=(String) ("str");
    char[] c={'c','a','b'};
    double a=Math.random();


    System.out.println(myDoub); 
    System.out.println(myIn);  
    System.out.println(f); 
    System.out.println(boo);
    System.out.println(s);
    System.out.println(c);  
    System.out.println(a);


    }
}
