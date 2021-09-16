package com.company;

import java.util.Scanner;

public class HumansTest {
    public static void testPerson() {
        System.out.println("\nТестирование классов Client, Employer, Person: \n");
        Scanner scanner = new Scanner(System.in);

        AbstractPerson person = new AbstractPerson() {
            @Override
            public String toString() {
                return
                        "Человек:" + System.lineSeparator()
                        + "\tВозраст: " + age + System.lineSeparator()
                        + "\tРост: " + height + System.lineSeparator()
                        + "\tИмя: " + name + System.lineSeparator()
                        + "\tГендер: " + gender + System.lineSeparator();
            }
        };

        System.out.println("Person:");
        test(scanner, person);

        AbstractPerson client = new Client(123);

        System.out.println("Client:");
        test(scanner, client);

        AbstractPerson employer = new Employer(1337);

        System.out.println("Employer:");
        test(scanner,employer);

        System.out.println("\nТестирование прошло успешно");
    }

    private static void test(Scanner scanner, AbstractPerson human) {
        try {
            System.out.print("\tВведите возраст: ");
            human.setAge(scanner.nextInt());

            System.out.print("\tВведите рост: ");
            human.setHeight(scanner.nextInt());

            System.out.print("\tВведите имя: ");
            human.setName(scanner.next());

            System.out.print("\tВведите гендер(м/ж/в/д): ");
            String gender = scanner.next();
            switch (gender) {
                case "м" -> human.setGender(Gender.MALE);
                case "ж" -> human.setGender(Gender.FEMALE);
                case "в" -> human.setGender(Gender.GENDERFLUID_HELISEXUAL);
                default -> human.setGender(Gender.OTHERS);
            }
        }
        catch (Exception exception) {
            System.out.println(exception);
            System.exit(0);
        }
        System.out.println(human);
    }
}
