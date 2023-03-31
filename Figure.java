/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author ener2
 */
 
import java.util.Scanner;

class Figure {
    public double calculatePerimeter() {
        return 0;
    }
    
    public double calculateArea() {
        return 0;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the square side: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);

        double perimeter = square.calculatePerimeter();
        double area = square.calculateArea();

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}

class Square extends Figure {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
    
}


