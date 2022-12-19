public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var sumWeigt = boxerWeight1 + boxerWeight2;
        System.out.println("общий вес двух бойцов " + sumWeigt + " кг");
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("разницу между весами бойцов " + differenceWeight  + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var differenceWeight = boxerWeight2 - boxerWeight1;
        var liftingCapacity = boxerWeight2 % boxerWeight1;
        System.out.println("разницу между весами бойцов 1 способ " + differenceWeight + " кг");
        System.out.println("разницу между весами бойцов 2 способ " + liftingCapacity  + " кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalTime = 640;
        var totalWorker = totalTime / 8;
        System.out.println("Всего работников в компании —  " + totalWorker  + " человек");
        var newTotalWorker = totalWorker + 94;
        var newTimeForOneWorker = totalTime / newTotalWorker;
        System.out.println("Если в компании работает " + newTotalWorker + " человек, то всего " + newTimeForOneWorker + " часа работы может быть поделено между сотрудниками»" );

    }


}
