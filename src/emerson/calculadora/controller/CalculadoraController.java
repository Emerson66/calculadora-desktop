package emerson.calculadora.controller;

import emerson.calculadora.bean.CalculadoraBean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author emerson
 */
public class CalculadoraController {

    public static Float soma(CalculadoraBean c) {
        return c.getN1() + c.getN2();
    }

    ;
    
    public static Float subtracao(CalculadoraBean c) {
        return c.getN1() - c.getN2();
    }

    ;
    public static Float multiplicacao(CalculadoraBean c) {
        return c.getN1() * c.getN2();
    }

    ;
    public static Float divisao(CalculadoraBean c) {
        if (c.getN2() == 0) {
            return 0f;
        }
        return c.getN1() / c.getN2();
    }
;
}
