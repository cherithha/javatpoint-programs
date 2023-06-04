// public class SuperAndThis {
    class Parent{
        int id;
        Parent(int id){
            this.id=id;
            System.out.println("I'm PARENT");
        }
        
        void met(){
            System.out.println("UGFB");
            System.out.println(this.id);
        } 
       public static void main(String[] a) {
        // Parent p = new Parent(2);
        p.met();
       }
    }

//     class Child extends Parent{
//         Child(){
//             System.out.println("I'm CHILD");
//         }
//     }

//     class Gchild extends Child{
//         Gchild(){
//             System.out.println("I'm GRAND CHILD");
//         }
//     }

// class Const{
// public static void main(String[] a) {
//     Gchild g = new Gchild();
// }


// }


