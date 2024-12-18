package FactoryPattern;

//Factory method is used when all the object creation and its bussiness logic we need to keep at one place

public class MainClass {
    public static void main(String[] args) {
        
        ShapeFactory factoryObj = new ShapeFactory();
        Shape circleObj = factoryObj.getShape("Circle");
        circleObj.draw();

        Shape rectangleObj = factoryObj.getShape("Rectangle");
        rectangleObj.draw();

    }
}
