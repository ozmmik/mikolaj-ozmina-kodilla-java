package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public  static void afterAllTests(){
        System.out.println("All test are finished.");
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddFigure() {
        //Given
            Circle circle = new Circle(4);
            ShapeCollector shapeCollector = new ShapeCollector();

        //When
            shapeCollector.addFigure(circle);
            System.out.println("Testing addFigure");

        //Then
            Assert.assertEquals(1, shapeCollector.getShapeListSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
            Triangle triangle = new Triangle(4, 5.4);
            Circle circle = new Circle(4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);

        //When
            boolean result = shapeCollector.removeFigure(triangle);
            System.out.println("Testing removeFigure");

        //Then
            Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        //Given
            Square square = new Square(4);
            Circle circle = new Circle(3);
            Triangle triangle = new Triangle(3,4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);

        //When
            Shape result = shapeCollector.getFigure(1);
            System.out.println("Testing getFigure");

        //Then
            Assert.assertEquals(circle, result);
    }
    @Test
    public void testGetShapeList(){
        //Givem
            Square square = new Square(4);
            Circle circle = new Circle(3);
            Triangle triangle = new Triangle(3,4);
            ShapeCollector shapeCollector = new ShapeCollector();

        //When
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            System.out.println("Testing getShapeListSize");

        //Then
            int result = shapeCollector.getShapeListSize();
            Assert.assertEquals(3,result);
    }
}
