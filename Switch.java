public class Switch {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        a+=6;
        

    switch (a-1) {
        case 5:
            System.out.println("10");
            break;
        case 10:
            System.out.println("15");
            System.out.println(((a%2==0) ? "-even-" : "-odd-"));
            break;

        default:
        System.out.println(a%2);
            break;
    }
        
    }
    
}
