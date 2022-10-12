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
        System.out.println("Разница между весами бойцов " + weightDifference1 + " кг");
        var weightDifference2 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов " + weightDifference2 + " кг");
        var overweight = weightDifference2 % totalWeight;
        System.out.println("Разница между весами бойцов на " + overweight + " кг!");
        var totalWorkTime = 640;
        var employeeTime1 = 8;
        var headcount1 = totalWorkTime/employeeTime1;
        System.out.println("Всего работников в компании – " + headcount1 + " человек.");
        var headcount2 = headcount1 + 94;
        System.out.println("Всего работников в компании - " + headcount2 + " человека.");
        var totalWorkTime2 = headcount2 * employeeTime1;
        System.out.println("Если в компании работает - " + headcount2 + " человека, то всего " + totalWorkTime2 + " часа работы может быть поделено между сотрудниками.");



























    }
}