/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CoefficientModel;
import View.CoefficientsView;

public class CoefficientsController {
    private CoefficientModel model;
    private CoefficientsView view;

    public CoefficientsController(CoefficientModel model, CoefficientsView view) {
        this.model = model;
        this.view = view;
    }

    public void processCoefficients() {
        int choice;
        do {
            choice = view.displayMenu();
            switch (choice) {
                case 1:
                    double[] coefficientsSuperlative = view.inputCoefficients();
                    model.setCoefficients(coefficientsSuperlative[0], coefficientsSuperlative[1], 0);
                    double superlativeSolution = model.calculateSuperlativeSolution();
                    int[] evenOddSquareSuperlative = model.findEvenOddSquareNumbers();
                    String resultSuperlative = "Superlative Equation Solution (x): " + superlativeSolution + "\n" +
                            "Even: " + evenOddSquareSuperlative[0] + ", Odd: " + evenOddSquareSuperlative[1] + ", Square: " + evenOddSquareSuperlative[2];
                    view.displayResult(resultSuperlative);
                    break;
                case 2:
                    double[] coefficientsQuadratic = view.inputCoefficients();
                    model.setCoefficients(coefficientsQuadratic[0], coefficientsQuadratic[1], coefficientsQuadratic[2]);
                    double[] quadraticSolutions = model.calculateQuadraticSolutions();
                    int[] evenOddSquareQuadratic = model.findEvenOddSquareNumbers();
                    String resultQuadratic = "Quadratic Equation Solutions (x1, x2): " + quadraticSolutions[0] + ", " + quadraticSolutions[1] + "\n" +
                            "Even: " + evenOddSquareQuadratic[0] + ", Odd: " + evenOddSquareQuadratic[1] + ", Square: " + evenOddSquareQuadratic[2];
                    view.displayResult(resultQuadratic);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}

