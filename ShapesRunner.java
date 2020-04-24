import java.util.Scanner;

class ShapesRunner
{
    public static void main(String[] args) {
        System.out.println("Enter the number of sides : ");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Enter the length : ");
        int length=sc.nextInt();
        Shapes shapes=new Shapes();
        shapes.calculateShapeArea(number,length);
    }
}