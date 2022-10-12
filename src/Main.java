public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        dog = (int) (dog - 3.5);
        System.out.println(dog);
        cat = (int) (cat - 1.6);
        System.out.println(cat);
        paper = (int) (paper - 7639);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = (frog/3.5);
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var weightDifference1 = boxerWeight1 - boxerWeight2;
        System.out.println("Разница в весе бойцов " + weightDifference1 + " кг");
        var weightDifference2 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе бойцов " + weightDifference2 + " кг");
        var overweight = weightDifference2 % totalWeight;
        System.out.println("Разница в весе бойцов на " + overweight + " кг!");
        var totalWorkTime = 640;
        var employeeTime1 = 8;
        var headcount1 = totalWorkTime/employeeTime1;
        System.out.println("Всего работников в компании – " + headcount1 + " человек.");
        var headcount2 = headcount1 + 94;
        System.out.println("Всего работников в компании - " + headcount2 + " человека.");
        var totalWorkTime2 = headcount2 * employeeTime1;
        System.out.println("Если в компании работает - " + headcount2 + " человека, то всего " + totalWorkTime2 + " часа работы может быть поделено между сотрудниками.");
        // Задание 1
        int cow = 7;
        byte sheep = 1;
        short mouse = 3;
        long elephant = 110l;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean cowIsAdult = cow > 18;
        char bar = 35;
        System.out.println(bar);
        System.out.println(cowIsAdult);
        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);
        // Задание 3
        int grPerKg = 1000;
        var Banana1 = 80;
        var Bananas = Banana1 * 5;
        System.out.println("Бананы " + Bananas + " гр.");
        var Milk100 = 105;
        var Milks = Milk100 * 2;
        System.out.println("Молоко " + Milks + " гр.");
        var iceCream1 = 100;
        var iceCream = iceCream1 * 2;
        System.out.println("Мороженное " + iceCream + " гр.");
        var rawEgg1 = 70;
        var rawEggs = rawEgg1 * 4;
        System.out.println("Сырые яйца " + rawEggs + " гр.");
        var weightGr = Bananas + Milks + iceCream + rawEggs;
        System.out.println("Завтрак в граммах " + weightGr + " гр.");
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Завтрак в килограммах " + weightKg + " кг.");
        // Задание 4
        var effectKG = 7;
        var effectGr = effectKG * 1000;
        System.out.println("Планируемый результат похудения спортсмена в граммах " + effectGr + " г.");
        var effectGr250 = 250;
        var effectGr500 = 500;
        var effectDays250 = effectGr/effectGr250;
        System.out.println("Прогнозируемое количество дней для достижения результата, если норма 250 гр. в день - " + effectDays250 + " д.");
        var effectDays500 = effectGr/effectGr500;
        System.out.println("Прогнозируемое количество дней для достижения результата, если норма 500 гр. в день - " + effectDays500 + " д.");
        // Задание 5
        var salaryIncreaseInTheYearInPercent = 10;
        var mashaSalaryPerMonth = 67760;
        var denisSalaryPerMonth = 83690;
        var kristinaSalaryPerMonth = 76230;
        var mashaSalaryIncrease = mashaSalaryPerMonth + (mashaSalaryPerMonth*salaryIncreaseInTheYearInPercent/100);
        System.out.println("Зарплата Маши после её повышения на 10 процентов - " + mashaSalaryIncrease + " р.");
        var denisSalaryIncrease = denisSalaryPerMonth + (denisSalaryPerMonth*salaryIncreaseInTheYearInPercent/100);
        System.out.println("Зарплата Дениса после её повышения на 10 процентов - " + denisSalaryIncrease + " р.");
        var kristinaSalaryIncrease = kristinaSalaryPerMonth + (kristinaSalaryPerMonth*salaryIncreaseInTheYearInPercent/100);
        System.out.println("Зарплата Кристины после её повышения на 10 процентов - " + kristinaSalaryIncrease + " р.");
        var monthsPerYear = 12;
        var mashaYearlyIncomeUntil = mashaSalaryPerMonth * monthsPerYear;
        System.out.println("Годовая зарплата Маши до её повышения на 10 процентов - " + mashaYearlyIncomeUntil + " р.");
        var denisYearlyIncomeUntil = denisSalaryPerMonth * monthsPerYear;
        System.out.println("Годовая зарплата Дениса до её повышения на 10 процентов - " + denisYearlyIncomeUntil + " р.");
        var kristinaYearlyIncomeUntil = kristinaSalaryPerMonth * monthsPerYear;
        System.out.println("Годовая зарплата Кристины до её повышения на 10 процентов - " + kristinaYearlyIncomeUntil + " р.");
        var mashaYearlyIncomeAfter = mashaSalaryIncrease * monthsPerYear;
        System.out.println("Годовая зарплата Маши после её повышения на 10 процентов - " + mashaYearlyIncomeAfter + " р.");
        var denisYearlyIncomeAfter = denisSalaryIncrease * monthsPerYear;
        System.out.println("Годовая зарплата Дениса после её повышения на 10 процентов - " + denisYearlyIncomeAfter + " р.");
        var kristinaYearlyIncomeAfter = kristinaSalaryIncrease * monthsPerYear;
        System.out.println("Годовая зарплата Кристины после её повышения на 10 процентов - " + kristinaYearlyIncomeAfter + " р.");
        var mashaSalaryDifferentials = mashaYearlyIncomeAfter - mashaYearlyIncomeUntil;
        System.out.println("Разница в годовой зарплате Маши до и после её повышения на 10 процентов - " + mashaSalaryDifferentials + " р.");
        var denisSalaryDifferentials = denisYearlyIncomeAfter - denisYearlyIncomeUntil;
        System.out.println("Разница в годовой зарплате Дениса до и после её повышения на 10 процентов - " + denisSalaryDifferentials + " р.");
        var kristinaSalaryDifferentials = kristinaYearlyIncomeAfter - kristinaYearlyIncomeUntil;
        System.out.println("Разница в годовой зарплате Кристины до и после её повышения на 10 процентов - " + kristinaSalaryDifferentials + " р.");



















































    }
}