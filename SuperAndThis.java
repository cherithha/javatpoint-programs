// public class SuperAndThis {
    class Parent{
        Parent(){
            System.out.println("I'm PARENT");
        }
        void met(){
            
        }
    }

    class Child extends Parent{
        Child(){
            System.out.println("I'm CHILD");
        }
    }

    class Gchild extends Child{
        Gchild(){
            System.out.println("I'm GRAND CHILD");
        }
        
    
    public static void main(String[] a) {
        Gchild g = new Gchild();
    }
}
    

