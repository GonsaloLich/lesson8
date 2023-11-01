public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastname = "Ivanovich";
        String fullName = firstName + middleName + lastname;
        System.out.println(fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета " + fullName.toUpperCase());

    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullName2  =  fullName.replace('ё', 'е');
        System.out.println(fullName2);

    }

}