package worksheet02;
import java.lang.Class;
import java.util.Scanner;

/**
 * Created by User on 13/04/2017.
 */
public class InterfaceName {

    public static void main(String[] args){

        // create a scanner so we can read the command-line input
       Scanner scanner = new Scanner(System.in);
        //  prompt for the class name
       System.out.print("Enter class name: ");

        // get the input as a String
        String classname2 = scanner.next();
        Class c4 = classname2.getClass();
       // System.out.println(classname2);

        Class c3 ;
        c3=Foo.class;

        System.out.println(c3.getName());//class name

        for (int i=0;i<c3.getInterfaces().length;i++) {
            System.out.println("interface name: " + c3.getInterfaces()[i]);
        }

        for (int i=0;i<c3.getMethods().length;i++) {
            System.out.println("method name: " + c3.getMethods()[i]);
            if(c3.getMethods()[i].getParameterTypes().length>0){
                for (int j=0;j<c3.getMethods()[i].getParameterTypes().length;j++){
                    System.out.println("  parameter type: " + c3.getMethods()[i].getParameterTypes()[j]);
                }
            }

        }


    }
}
