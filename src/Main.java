public class Main {
    public static void main(String[] args) {
    // Задание 1
    System.out.println("Задание 1");
int One = 3;
    System.out.println("Значение переменной One с типом int равно " + One);
byte Two = 120;
        System.out.println("Значение переменной Two с типом byte равно " + Two);
short Three = 12345;
        System.out.println("Значение переменной Three с типом short равно " + Three);
long Four = 12345678;
        System.out.println("Значение переменной Four с типом long равно " + Four);
float Five = 1.23F;
        System.out.println("Значение переменной Five с типом float равно " + Five);
double Six = -1.123456789d;
        System.out.println("Значение переменной Six с типом double равно " + Six);
        // Задание 2
        System.out.println("Задание 2");
float x = 27.12F;
        System.out.println("Значение переменной x с типом float равно " + x);
long y = 987678965549L;
        System.out.println("Значение переменной y с типом long равно " + y);
double z = 2.786;
        System.out.println("Значение переменной z с типом double равно " +z);
boolean q = y < z;
        System.out.println("Значение переменной q с типом boolean равно " +q);
short w = 569;
        System.out.println("Значение переменной w с типом short равно " +w);
int r = -159;
        System.out.println("Значение переменной r с типом int равно " +r);
char t = 27897;
        System.out.println("Значение переменной t с типом char равно " +t);
byte b = 67;
        System.out.println("Значение переменной b с типом byte равно " +b);
        // Задание 3
        System.out.println("Задание 3");
byte Lp = 23;
        System.out.println("У Людмилы Павловны " + Lp + " учеников");
byte As = 27;
        System.out.println("У Анны Сергеевны " + As + " учеников");
byte Ea = 30;
        System.out.println("У Екатерины Андреевны " + Ea + " учеников");
int Result = Lp + As + Ea;
        System.out.println("В трёх классах детей  " +Result);
short l = 480;
        System.out.println("Всего листов куплено  " +l);
int Rs = l / Result;
        System.out.println("На каждого ученика рассчитано " + Rs + " листов бумаги");
        // Задание 4
        System.out.println("Задание 4");
byte Pm = 16;
        System.out.println(Pm + "бутылок производительность машины");
byte Pv = 2;
        System.out.println(Pv + " минуты производительность " + Pm + " Бутылок");
int P = Pm / Pv;
        System.out.println("Значит за одну минуту машины производят " + P + " Бутылок");
byte but = 20;
int one = P * but;
        System.out.println("За " + but + " минут машины произвела бутылок " + one + " штук");
int day = 60 * 24;
        System.out.println("В одних сутках " + day + " часов");
int two = P * 60 * 24;
        System.out.println("За " + day + " минут машины произвела бутылок " + two + " штук");
byte day3 = 3;
int three = two * day3;
        System.out.println("За " + day3 + " дня произвела бутылок " + three + " штук");
byte day1 = 1;
int four = three * 10;
        System.out.println("За " + day1 + " месяц произвела бутылок " + four + " штук");
        // Задание 5
        System.out.println("Задание 5");
byte jar = 120;
        System.out.println(jar + " Банок краски нужно школе");
byte jarWhite = 2;
        System.out.println(jarWhite + " Банок белой краски уходит на один класс");
byte jarBrown = 4;
        System.out.println(jarBrown + " Банок коричневой краски уходит на один класс");
int group = jar / (jarWhite + jarBrown);
        System.out.println(group + " классов в школе");
int jarWhite1 = jarWhite * group;
int jarBrown1 = jarBrown * group;
        System.out.println("В школе, где " + group + " классов, нужно " + jarWhite1 + " банок белой краски и " + jarBrown1 + " банок коричневой краски");
        // Задание 6
        System.out.println("Задание 6");
byte banana = 5;
byte banana1 = 80;
int banana2 = banana * banana1;
short milk = 200;
float milk1 = 1.05f;
float milk2 = (milk * milk1);
byte iceCream = 2;
byte iceCream1 = 100;
int iceCream2 = iceCream * iceCream1;
byte egg = 4;
byte egg1 = 70;
int egg2 = egg * egg1;
float breakfast = banana2 + milk2 + iceCream2 + egg2;
        System.out.println("Вес завтрака в граммах равен " + breakfast);
double breakfast1 = breakfast * 0.001;
        System.out.println("Вес завтрака в килограммах равен " + breakfast1);
        // Задание 7
        System.out.println("Задание 7");
short weight = 7000;
short loss1 = 250;
short loss2 = 500;
int option1 = weight / loss1;
        System.out.println(option1+ " Дней уйдёт на похудение если худеть на "+ loss1);
int option2 = weight / loss2;
        System.out.println(option2+ " Дней уйдёт на похудение если худеть на "+ loss2);
float option3 = weight / ((loss1 + loss2)/2);
        System.out.println(option3+ " Дней уйдёт на похудение в среднем");
        // Задание 8
        System.out.println("Задание 8");
int Masha = 67760;
int Denis = 83690;
int Kristina = 76230;
int Masha1 = 67760 / 100 * 110;
        System.out.println("Новая ЗП в рублях " + Masha1);
int Denis1 = 83690 / 100 * 110;;
        System.out.println("Новая ЗП в рублях " + Denis1);
int Kristina1 = 76230 / 100 * 110;;
        System.out.println("Новая ЗП в рублях " + Kristina1);
int Masha2 = Masha1 * 12 - Masha *12;
        System.out.println("Годавая разница ЗП в рублях  " + Masha2);
int Denis2 = Denis1 * 12 - Denis *12;
        System.out.println("Годавая разница ЗП в рублях  " + Denis2);
int Kristina2 = Kristina1 * 12 - Kristina *12;
        System.out.println("Годавая разница ЗП в рублях  " + Kristina2);
    }
}