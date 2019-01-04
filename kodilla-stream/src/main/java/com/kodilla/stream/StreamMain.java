package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExcutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        /*ExpressionExcutor expressionExcutor = new ExpressionExcutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExcutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExcutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExcutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExcutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExcutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExcutor.executeExpression(3,4,FunctionalCalculator::addAToB);
        expressionExcutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExcutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Book", text -> "|| " + text + " ||");
        poemBeautifier.beautify("Pencil", text -> "// " + text + " \\");
        poemBeautifier.beautify("Glass", text -> text.toUpperCase());
        poemBeautifier.beautify("Lamp", text -> text.replace('p','P'));
    }
}
