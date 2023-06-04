    

class Datatypes{
    public static void main(String args[]){ //a variable declaration shows error if not used any where for longer period of time
        byte b1=-128, b2=127; //lowest and highest
        short shrt=32767;  // this is highest
        int intgr=200;  //int is limited
        long l=9223372036854775807l; //this is the highest
        float floating=2990987.9909090F,f1=124098789/5839840f; //a fraction can be given to float variable with the "f or F" in the end 
        double d=30.98078907089880D;
        boolean boo=true, faa=false; //only true or false
        char ca='s', ca1=32899;  //ca1 is approximate 

        String str="cherry";

        System.out.print(b1);
        System.out.print(b2);
        System.out.print("Long"+l);
        System.out.println(shrt);
        System.out.print(intgr);
        System.out.print(floating);
        System.out.print(str);
        System.out.print("fa");
        System.out.println("boo");
        System.out.println(ca);
        System.out.println(ca1);
        System.out.println(faa);
        System.out.println(boo);
        System.out.println(d);
        System.out.println(f1);
}
}