class Shapes
{
    private int numberOfSides;
    Circle circle = new Circle();
    Triangle triangle= new Triangle();
    Square square = new Square();
    void calculateShapeArea(int numberOfSides,int sideLength)
    {
        this.numberOfSides=numberOfSides;
        switch(numberOfSides)
        {
            case 1 : circle.calculateArea(sideLength);break;
            case 3 : triangle.calculateArea(sideLength);break;
            case 4 : square.calculateArea(sideLength);break;
            default :  System.out.println("No Shapes Present");break;
        }
    }

}