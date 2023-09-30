/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FPTShop
 */
import Controller.CoefficientsController;
import Model.CoefficientModel;
import View.CoefficientsView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class CoefficientsMain {
    public static void main(String[] args) {
        CoefficientModel model = new CoefficientModel();
        CoefficientsView view = new CoefficientsView();
        CoefficientsController controller = new CoefficientsController(model, view);

        controller.processCoefficients();
    }
}