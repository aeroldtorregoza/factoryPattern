import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = (Pet) new Dog();
                    System.out.println("Dog's breed: Golden Retriever");
                    break;
                case 2:
                    pet = (Pet) new Cat();
                    System.out.println("Cat has 9 lives.");
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

        }
    }
}