public class Main {
    public static void main(String[] args) {
        System.out.println("TaskOne");
        String firstName = "Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        System.out.println("TaskTwo");
        System.out.println(fullName.toUpperCase());

        System.out.println("TaskThree");
        String myStr = "Иванов Семён Семёнович";

        String my_new_str = my_str.replace("ё", "e");
        System.out.println(my_new_str);

    }
}