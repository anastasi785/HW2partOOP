public class Main {
    public static void main(String[] args) {
        Human max=new Human();
        max.name="Максим";
        max.city="Минск";
        max.yearOfBirth=35;
        max.job="бренд-менеджер";
        max.speaks();

        Human anya=new Human();
        anya.name="Аня";
        anya.city="Москва";
        anya.yearOfBirth=29;
        anya.job="методист образовательных программ";
        anya.speaks();

        Human kat=new Human();
        kat.name="Катя";
        kat.city="Калининград";
        kat.yearOfBirth=28;
        kat.job="продакт-менеджер";
        kat.speaks();

        Human artem=new Human();
        artem.name="Артём";
        artem.city="Москва";
        artem.yearOfBirth=27;
        artem.job="директор по развитию бизнеса";
        artem.speaks();
    }
}