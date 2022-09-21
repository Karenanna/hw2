public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog -3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper -7639;
        System.out.println(paper);
        var friend =19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 =78.2;
        var boxer2 =82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("общий вес боксеров" + totalWeight);
        var overWeight = (boxer2 - boxer1);
        System.out.println("разница между весами бойцов составляет" + overWeight + "кг!");
        var weightDistinctionBoxer = boxer2 % boxer1;
        System.out.println("отличие между боксерами" + weightDistinctionBoxer + "кг!");
        var totalTime = 640;
        var employersTime = 8;
        var totalEmployees = totalTime / employersTime;
        System.out.println("всего работников в компании - чел." + totalTime / employersTime);
        totalEmployees = totalEmployees + 94;
        totalTime = totalEmployees * totalTime;
        System.out.println("Если в компании работает  " + totalEmployees +   "человек, то всего"  + totalTime +   "часов работы можно поделено между сотрудниками" );















    }
}