import java.net.SocketOption;
/*
//Davaleba1
// 1 example
public class Main {
    public static void main(String[] args){
 String name= "Dog";
    String name2 = "Cat";
    String name3 = "Lion";
    String name4 = "Pig";
    if (name.equals("Dog")) {
        System.out.println("I am the dog");
    }  if (name2.equals("Cat")) {
            System.out.println("I am the cat");
 if (name3.equals("Lion")) {
    System.out.println("I am the lion");
     if (name4.equals("Pig")) {
         System.out.println("I am the pig");
     }else {
        System.out.println("I am an Animal");
            }
          }
       }
     }
}
*/
/*
//example 2
public class Main {
    public static void main(String[] args) {
        String name= "Dog";
        String name2 = "Cat";
        String name3 = "Lion";
        String name4 = "Pig";
        switch (name){
            case "Dog":
                System.out.println("I am the dog");
                case "cat":
                    System.out.println("I am the cat");
                    case "Lion":
                        System.out.println("I am the lion");
                         case "Pig":
                             System.out.println("I am the pig");
                             break;
                             default:
                                 System.out.println("I Am an Animal");
        }
    }
}

 */
//Davaleba2

public class Main {
    public static void main(String[] args) {
        numberChecker(9);
    }
    static void numberChecker ( int start){
        while (start>0){
            System.out.println(start);
            start*=3;
            break;
        }
    }
}
