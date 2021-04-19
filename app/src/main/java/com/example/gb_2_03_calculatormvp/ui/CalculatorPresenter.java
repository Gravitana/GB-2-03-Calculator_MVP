package com.example.gb_2_03_calculatormvp.ui;

import com.example.gb_2_03_calculatormvp.domain.Calculator;
import com.example.gb_2_03_calculatormvp.domain.Operation;

public class CalculatorPresenter {

    private CalculatorView view;

    private Calculator calculator;

    private double argOne = 0;
    private double argTwo = 0;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onButtonOneClicked() {
        argOne = 1;
    }

    public void onButtonTwoClicked() {
        argTwo = 2;
    }

    public void onButtonPlusClicked() {
        double res = calculator.binaryOperation(argOne, argTwo, Operation.ADD);

        view.showResult(String.valueOf(res));
    }
}
