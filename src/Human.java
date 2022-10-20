public class Human {
    int yearOfBirth;
    String name;
    String city;
    String job;

    public static int calculateYearOfBirth(int yearOfBirth) {
        int year = 2022 - yearOfBirth;

        return year;
    }
    void speaks() {
        System.out.println("Привет! Меня зовут "+name+". Я из города "+ city+". Я родился в "+calculateYearOfBirth(yearOfBirth)+" году. Я работаю на должности "+job+". Будем знакомы!");
    }
}
