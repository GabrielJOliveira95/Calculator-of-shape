
package forms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainShape {

   
    public static void main(String[] args) {
      
        Scanner keyboard =  new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        
        System.out.println("Enter the kind of shape that you want to calculate: Cicle(C)/Rectangle(R)");
        char shapeChoosen = keyboard.next().charAt(0);
        
        if (shapeChoosen == 'R'){
           
            System.out.println("Enter the rectangle's color");
            Color choseenColor = Color.valueOf(keyboard.next());
            System.out.println("Enter the width:");
            double width = keyboard.nextDouble();
            System.out.println("Enter the height: ");
            double height = keyboard.nextDouble();
            list.add(new Rectangle(choseenColor, width, height));
          
            } else{
             
            System.out.println("Enter the circle's color");
            Color choseenColor = Color.valueOf(keyboard.next());
            System.out.println("Enter the radius: ");
            double radius = keyboard.nextDouble();
            list.add(new Circle(choseenColor, radius));
        
        }
        
        
        for(Shape shape: list){
           
            System.out.println(shape.area());
            System.out.println(shape.getColor());
        }
        
        
        
        
        
    }
    
}
