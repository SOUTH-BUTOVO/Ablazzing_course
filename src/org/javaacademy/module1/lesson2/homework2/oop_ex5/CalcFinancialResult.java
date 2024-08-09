package org.javaacademy.module1.lesson2.homework2.oop_ex5;

import java.math.BigDecimal;

public class CalcFinancialResult {
    //private BigDecimal costSausage;
    //private BigDecimal costHam;
    //private BigDecimal costNeck;
    private BigDecimal priceSausage;
    private BigDecimal priceHam;
    private BigDecimal priceNeck;

    public CalcFinancialResult(BigDecimal costSausage, BigDecimal costHam, BigDecimal costNeck,
                               BigDecimal priceSausage, BigDecimal priceHam, BigDecimal priceNeck) {
        //this.costSausage = costSausage;
        //this.costHam = costHam;
        //this.costNeck = costNeck;
        this.priceSausage = priceSausage;
        this.priceHam = priceHam;
        this.priceNeck = priceNeck;
    }

    void calculateProfitTax(long countSausage, long countHam, long countNeck) {

    }
}
