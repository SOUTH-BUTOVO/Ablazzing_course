package org.javaacademy.module1.lesson2.homework2.task;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;

public class Homework {
    public static void main(String[] args) {

        //ex2
        String name = "     ПЕтРов  Олег   Иванович     ";
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        stringFamily(name);
        System.out.println("-----------------------------------------");

        //ex3
        //Количество топлива
        double fuel = 11;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;
        carEngine(fuel, isEngineWork, hasErrors, isWheelWork1,
                  isWheelWork2, isWheelWork3, isWheelWork4);
        System.out.println("-----------------------------------------");

        //ex4
        String simply = "this is simply. This is my favorite song.";
        stringSimply(simply);
        System.out.println("-----------------------------------------");

        //ex5
        // Задание сделано, вроде корректно, НО, не до конца понял как работать с BigDecimal
        // т.к. ранее не сталкивался. Как создавать и делать выражения, я разобрался, но
        // BigDecimal поломал мне логику где у меня if, else if. Читал, что даже .equals()
        // отрабатывает не корректно. Поэтому откатил назад и оставил задачу с double.
        hornsAndHoovesCompany();
        System.out.println("-----------------------------------------");

        hornsAndHoovesCompany2();
    }

    private static void stringFamily(String name) {
        // Удаляем все лишние пробелы и даже внутри строки, если больше 1го пробела + переводим
        // строку в верхний регистр.
        String transform = name.trim().replaceAll(" +", " ").toUpperCase();

        // Извлекаем подстроку Фамилия т.к. Имя то же может содержать ов/ова (Яков).
        int familyIndex = transform.indexOf(" ");
        String family = transform.substring(0, familyIndex + 1);
        System.out.println(family);

        // Фамилию сделали отдельной переменной, можно использовать и contains, но лучше endsWith
        if (family.endsWith("ОВА ")) {
            System.out.println("Уважаемая " + '{' + transform + '}');
        } else if (family.endsWith("ОВ ")) {
            System.out.println("Уважаемый " + '{' + transform + '}');
        } else {
            System.out.println("Неизвестное лицо " + '{' + transform + '}');
        }
    }

    private static void carEngine(double fuel, boolean isEngineWork, boolean hasErrors,
                                  boolean isWheelWork1, boolean isWheelWork2,
                                  boolean isWheelWork3, boolean isWheelWork4) {
        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel > 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
            && !hasErrors && isEngineWork) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    private static void stringSimply(String simply) {
        //Заменить в строке 'this is' на 'those are',
        String transform = simply.replaceAll("this is", "those are");
        System.out.println(transform);

        //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
        int index1 = transform.indexOf("o");
        int index2 = transform.indexOf("o", index1 + 1);
        //Распечатать полученный индекс
        System.out.println("Индекс второй буквы \"o\" = " + index2);
    }

    private static void hornsAndHoovesCompany() {
            // Цена колбасы - стоимость(цена) 800 руб
        int sausagePrice = 800;
            // Себестоимость колбасы
        int sausageCost;
            // Произведено и продано колбасы 2000 кг
        int sausageMade = 2000;
            // себестоимость при производстве меньше 1000 кг - 412 руб.
        if (sausageMade < 1000) {
            sausageCost = 412;
            //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        } else if (sausageMade >= 1000 && sausageMade < 2000) {
            sausageCost = 408;
        } else {
            //себестоимость при производстве от 2000 - 404 руб
            sausageCost = 404;
        }

            // Цена ветчины 350 руб
        int hamPrice = 350;
            // Себестоимость ветчины при производстве - 275 руб
        int hamCost = 275;
            // Произведено и продано ветчины 8511 кг
        int hamMade = 8511;

            // Цена шейки 500 руб
        int neckPrice = 500;
            // Себестоимость шейки
        int neckCost;
            // Произведено и продано шейки 6988 кг
        int neckMade = 6988;
            // Себестоимость при производстве меньше 500кг - 311 руб
        if (neckMade < 500) {
            neckCost = 311;
        } else {
            // Себестоимость при производстве больше или равно 500кг - 299 руб
            neckCost = 299;
        }

            // Доход компании считается как умножение стоимости на количество проданных кг
        int incomeSausage = sausagePrice * sausageMade;
        int incomeHam = hamPrice * hamMade;
        int incomeNeck = neckPrice * neckMade;
        int incomeAll = incomeSausage + incomeHam + incomeNeck;
        System.out.println(incomeAll + "   Доход компании");

            // Расход считается как умножение себестоимости на количество проданных кг + миллион рублей
        int expenseSausage = sausageCost * sausageMade;
        int expenseHam = hamCost * hamMade;
        int expenseNeck = neckCost * neckMade;
        int expenseAll = expenseSausage + expenseHam + expenseNeck + 1_000_000;
        System.out.println(expenseAll + "   Расход компании");

            // Прибыль до налогов считается как: доход - расход
        int profitBeforeTax = incomeAll - expenseAll;
        System.out.println(profitBeforeTax + "   Прибыль до налогов");

            // Налоги считаются так:
            // Прибыль до налогов больше 2_000_000, облагается ставкой 13%
            // Прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
            // Прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
        double tax;
        if (profitBeforeTax <= 1_000_000) {
            tax = profitBeforeTax * 0.08;
        } else if (profitBeforeTax > 1000_000 && profitBeforeTax <= 2_000_000) {
            tax = (profitBeforeTax - (1_000_000 * 0.08)) * 0.1;
        } else {
            tax = (profitBeforeTax - (1_000_000 * 0.08 + 1_000_000 * 0.1)) * 0.13;
        }
        System.out.println(tax + " Налоги");

            // Прибыль после налогов: прибыль до налогов - налог.
        double profitAfterTax = profitBeforeTax - tax;
        System.out.println(profitAfterTax + " Прибыль после налогов");
    }

    private static void hornsAndHoovesCompany2() {
        // price - стоимость, count - произведено кг., cost - себестоимость.
        long countSausage = 2000;
        BigDecimal priceSausage = valueOf(800);
        BigDecimal priceHam = valueOf(350);
        BigDecimal costHam = valueOf(275);
        BigDecimal priceNeck = valueOf(500);
        //BigDecimal costNeck = countNeck < 500 ? valueOf(311) : valueOf(299);

        BigDecimal costSausage = countSausage < 1000 ? valueOf(412) :
         countSausage >= 1000 && countSausage < 2000 ? valueOf(408) : valueOf(404);

        long countHam = 8511;

        long countNeck = 6988;

        // Доход компании
        // income - доход
        BigDecimal totalIncomeSausage = priceSausage.multiply(valueOf(countSausage));
        BigDecimal totalIncomeHam = priceHam.multiply(valueOf(countHam));
        BigDecimal totalIncomeNeck = priceNeck.multiply(valueOf(countNeck));
        BigDecimal totalIncome = totalIncomeSausage.add(totalIncomeHam).add(totalIncomeNeck);

        // Расход компании
        // outcome - расход
        BigDecimal totalOutcomeSausage = costSausage.multiply(valueOf(countSausage));
        BigDecimal totalOutcomeHam = costHam.multiply(valueOf(countHam));
        BigDecimal totalOutcomeNeck = costNeck.multiply(valueOf(countNeck));
        // Постоянные расходы компании
        BigDecimal outcomeConstant = valueOf(1_000_000);
        BigDecimal totalOutcome = totalOutcomeSausage.add(totalOutcomeHam)
                                 .add(totalOutcomeNeck).add(outcomeConstant);

        // Прибыль до налога
        BigDecimal profitBeforeTax = totalIncome.subtract(totalOutcome);

        // Налоги
        BigDecimal taxRateBeforeLowLimit = new BigDecimal("0.08");
        BigDecimal lowLimitTax = valueOf(1_000_000);
        BigDecimal taxRateAfterLowLimit = new BigDecimal("0.1");
        BigDecimal highLimitTax = valueOf(2_000_000);
        BigDecimal taxRateAfterHighLimit = new BigDecimal("0.13");

        // Итоговый налог
        BigDecimal totalTax = ZERO;
        // Расчёт для нижнего лимита
        if (profitBeforeTax.compareTo(lowLimitTax) <= 0) {
            BigDecimal taxBeforeLowLimit = taxRateBeforeLowLimit.multiply(profitBeforeTax);
            totalTax = totalTax.add(taxBeforeLowLimit);
        } else {
            BigDecimal taxBeforeLowLimit = taxRateBeforeLowLimit.multiply(lowLimitTax);
            totalTax = totalTax.add(taxBeforeLowLimit);
        }

        // Расчёт для среднего лимита и овер лимита
        if (profitBeforeTax.compareTo(highLimitTax) < 0) {
            BigDecimal taxAfterLowLimit = profitBeforeTax.subtract(lowLimitTax)
                                                         .multiply(taxRateAfterLowLimit);
            totalTax = totalTax.add(taxAfterLowLimit);
        } else {
            BigDecimal taxAfterLowLimit = highLimitTax.subtract(lowLimitTax)
                                                      .multiply(taxRateAfterLowLimit);
            BigDecimal taxAfterHighLimit = profitBeforeTax.subtract(highLimitTax)
                                                          .multiply(taxRateAfterHighLimit);
            totalTax = totalTax.add(taxAfterLowLimit).add(taxAfterHighLimit);
        }
        System.out.println("Налог составил: " + totalTax);

        BigDecimal profitAfterTax = profitBeforeTax.subtract(totalTax);
        System.out.println("Прибыль после налога: " + profitAfterTax);
    }
}
