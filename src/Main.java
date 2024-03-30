public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\ntask 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\ntask 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\ntask 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println("\ntask 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println("\ntask 6");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var summaryFightersWeight = secondFighterWeight + firstFighterWeight;
        var diffFightersWeight = secondFighterWeight - firstFighterWeight;
        System.out.println("Общая масса - " + summaryFightersWeight);
        System.out.println("Разница в массе - " + diffFightersWeight);

        System.out.println("\ntask 7");
        var remFightersWeight = secondFighterWeight % firstFighterWeight;
        System.out.println("Остаток от деления масс - " + remFightersWeight);

        System.out.println("\ntask 8");
        var allWorkTime = 640;
        var workPerWorker = 8;
        var allWorkersAmount = allWorkTime / workPerWorker;
        System.out.printf("«Всего работников в компании — %s человек»\n",allWorkersAmount);
        var newWorkersAmount = allWorkersAmount + 94;
        var newWorkPerWorkerTime = allWorkTime / newWorkersAmount;
        System.out.printf("«Если в компании работает %s человек, то всего %s часов работы может быть поделено между сотрудниками»",
                newWorkersAmount,newWorkPerWorkerTime);
    }
}
