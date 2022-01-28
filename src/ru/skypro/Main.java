package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        System.out.println("Первое задание. Объявдяем переменные и инициализируем их");
        char charVariable;
        charVariable = 'A';
        boolean boolVariable;
        boolVariable = false;
        boolean boolVariable1 = 10>1;
        byte byteVariable = -1; //Дальше инициализирую переменные сразу, а то очень длинно получается
        short shortVariable = 1000;
        int intVariable = 3200000;
        long longVariable = 32000000L;
        float floatVariable = 5.45f;
        double doubleVariable = 3.1315926;
        var varVariable = 45;
        System.out.println("char: "+charVariable+" boolean: "+ boolVariable+" еще boolean: "+ boolVariable1);
        System.out.println("byte: "+byteVariable+" short: "+shortVariable+" int: "+intVariable
        +" long: "+longVariable);
        System.out.println("С плавающей точкой: float: "+floatVariable+" double: "+doubleVariable);
        System.out.println("И тип var: var: "+varVariable);
     //Задание 2
        System.out.println("Второе задание. Два бойца");
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float commonWeight = boxerWeight1+boxerWeight2;
        float differenceWeight = boxerWeight2-boxerWeight1;
        System.out.println("Вес первого боксёра - "+boxerWeight1+"кг, вес второго боксёра - "+boxerWeight2+"кг");
        System.out.println("Общий вес боксёров - "+commonWeight+"кг, разница в весе - "+differenceWeight+"кг");
        //Третье задание
        System.out.println("Третье задание. Завтрак");
        short bananaWeight = 80;//Вес я бы положил в переменную float, так как он не точный,+-
        short milkWeight = 105; //но, наверное, по условиям задачи надо в целочисленную
        short milkVolume = 200;
        short etalonMilkVolume = 100;
        short iceCreamWeight = 100;
        short eggWeight = 70;
        short quantityBanana = 5;
        short quantityIceCream = 2;
        short quantityEggs = 4;
        int breakfastWeight = bananaWeight*quantityBanana+milkVolume/etalonMilkVolume*milkWeight+
                iceCreamWeight*quantityIceCream+eggWeight*quantityEggs;
        float KG = 1000f;/*Не очень красиво заносить во float целое число граммов.
        Объявлю переменную "килограмм" как float, чтобы получить килогаммы с дробной частью*/
        float weightInKg = breakfastWeight/KG;
        System.out.println("Общий вес завтрака в граммах - "+breakfastWeight+"г");
        System.out.println("Общий вес завтрака в килограммах - "+weightInKg+"кг");
        //Задание 4
        System.out.println("Четвёртое задание. Сброс веса");
         short reduceWeight = 7;
         short minDaylyWeight = 250;
         short maxDaylyWeight = 500;
         int minQuantityDays = reduceWeight*1000/maxDaylyWeight;
         int maxQuantityDays = reduceWeight*1000/minDaylyWeight;
         System.out.println("Если спортсмен будет терять 250 гр в день, он будет худеть "+maxQuantityDays+" дней");
        System.out.println("Если спортсмен будет терять 500 гр в день, он будет худеть "+minQuantityDays+" дней");
        /*Идея формулы: среднее количество дней для похудания = килограммы/на среднюю потерю веса за день.
           Вычисляем это среднее значение. Если получается дробное число, то дней должно быть на 1 больше целой части
           (невозможно вычислить 0,3333 или 0,666 дня). Поэтому к получившемуся числу прибавляем
           (остаток от деления+среднее-1 (т.к. максимальный остаток 374(в данном случае), а минимальный 0)
           и делим на среднее. В случае остатка 0 и получается 0, а в любом другом - 1*/
         int averageWeight = (maxDaylyWeight+minDaylyWeight)/2;
         int averageQuantityDays = reduceWeight*1000/averageWeight +
                 (averageWeight-1+reduceWeight*1000%averageWeight)/averageWeight;
         System.out.println("В среднем спортсмен будет худеть "+averageQuantityDays+" дней");
         //Задание 5
        System.out.println("Пятое задание. Повышение зарплаты");
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        short year = 12;
        int MashaSalaryYear = MashaSalary*year;
        int DenisSalaryYear = DenisSalary*year;
        int KristinaSalaryYear = KristinaSalary*year;
        MashaSalary*=1.1;
        DenisSalary*=1.1;
        KristinaSalary*=1.1;
        int newMashaSalaryYear = MashaSalary*year;
        int newDenisSalaryYear = DenisSalary*year;
        int newKristinaSalaryYear = KristinaSalary*year;
        int MashaDiffernce = newMashaSalaryYear-MashaSalaryYear;
        int DenisDifference = newDenisSalaryYear-DenisSalaryYear;
        int KristinaDifference = newKristinaSalaryYear-KristinaSalaryYear;
        System.out.println("Маша теперь получает "+MashaSalary+" рублей. Годовой доход вырос на "+MashaDiffernce+" рублей");
        System.out.println("Денис теперь получает "+DenisSalary+" рублей. Годовой доход вырос на "+DenisDifference+" рублей");
        System.out.println("Маша теперь получает "+KristinaSalary+" рублей. Годовой доход вырос на "+KristinaDifference+" рублей");



    }
}
