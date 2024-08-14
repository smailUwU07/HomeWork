import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> maleNames = new ArrayList<>(); //Список А
        for (int i = 0; i < 5; i++) {
            maleNames.add(scanner.nextLine());
        }
        System.out.println(maleNames);
        ArrayList<String> femaleNames = new ArrayList<>(); //Список В
        for (int i = 0; i < 5; i++) {
            femaleNames.add(scanner.nextLine());
        }
        System.out.println(femaleNames);
        ArrayList<String> names = new ArrayList<>(); //Список С
        Collections.reverse(femaleNames);
        for (int i = 0; i < maleNames.size(); i++) {
            names.add(maleNames.get(i));
            names.add(femaleNames.get(i));
        }
        System.out.println(names);
        Collections.sort(names);
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        Collections.sort(names, lengthComparator);
        System.out.println(names);


        User user = new User();

        while (true) {
            System.out.println("Введите ваше имя (или 'exit' для завершения):");
            String name = scanner.next();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                user.setName(name);
                System.out.println("Успешно. Ваше имя: " + user.getName());
            } catch (IllegalNameException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Введите возраст (или '-1' для завершения):");
            int age;
            try {
                age = scanner.nextInt();
                if (age == -1) {
                    break;
                }
                user.setAge(age);
                System.out.println("Успешно. Ваш возраст: " + user.getAge());
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите корректное значение возраста.");
                scanner.next(); // Очистка неверного ввода
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            }
        }

    }
}


