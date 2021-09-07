import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        /*Animal a1 = new Animal();
        a1.name = "Alex";
        a1.color = "белый";
        a1.weight = 5;
        a1.age = 8;
        System.out.println(a1);
        Animal a2 = new Animal("Барсик",1,20,"рыжий");
                System.out.println(a2);*/


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------------\n");
            System.out.println("выберите действие");
            System.out.println("-------------------------\n");
            System.out.println("add-добавить животное");
            System.out.println("list-вывести список животных");
            System.out.println("exit - выход из приложения");
            String selection = input.nextLine().trim();
            try {
                Command c = Command.valueOf(selection.toUpperCase());
                if (c == Command.ADD) {
                    add();
                } else if (c == Command.LIST) {
                    System.out.println("-------------------------\n");
                    for (int i = 0; i < animals.size(); i++) {
                        Animal animal = animals.get(i);
                        System.out.println(animal.toString());
                    }
                } else if (c == Command.EXIT) {
                    return;
                }
            } catch (Throwable t) {
                t.printStackTrace();
                System.out.println("Такой команды не существует");
            }
        }
    }

    static void add() {
        System.out.println("выберите животное cat/dog/duck");
        String selection = "";
        while (true) {
            Scanner input = new Scanner(System.in);
            selection = input.nextLine().trim();
            try {
                Animal animal; //null
                if (selection.equals("cat")) {
                    animal = new Cat();
                } else if (selection.equals("dog")) {
                    animal = new Dog();
                } else if (selection.equals("duck")) {
                    animal = new Duck();
                } else {
                    System.out.println("Такой команды не существует");
                    continue;
                }
                //Вводим имя
                System.out.println("Введите имя:");
                String name = input.nextLine().trim();
                //Вводим цвет
                System.out.println("Введите цвет:");
                String color = input.nextLine().trim();
                //Вводим возраст
                System.out.println("Введите возраст:");
                int age = input.nextInt();
                //Вводим вес
                System.out.println("Введите вес:");
                int weight = input.nextInt();

                animal.name = name;
                animal.age = age;
                animal.weight = weight;
                animal.color = color;

                animals.add(animal);

                animal.say();
                return;

            } catch (Throwable t) {
                t.printStackTrace();
                System.out.println("Такой команды не существует");
                return;
            }
        }
    }
}
