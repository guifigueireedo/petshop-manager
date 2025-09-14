import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("=== PETSHOP ===");
            System.out.println("===============");
            System.out.println("1 - Banho no Pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina ");
            System.out.println("6 - Verificar se há Pet no banho");
            System.out.println("7 - Colocar Pet na máquina");
            System.out.println("8 - Retirar Pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Encerrar sistema");
            System.out.print("Escolha uma das opções: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.cleanMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }

        } while (true);
    }

    private static void verifyWater() {
        var amountWater = petMachine.getWater();
        System.out.println("A máquina tem " + amountWater + " litro(s) de água.");
    }

    private static void verifyShampoo() {
        var amountShampoo = petMachine.getShampoo();
        System.out.println("A máquina tem " + amountShampoo + " litro(s) de shampoo.");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.print("Insira o nome do pet: ");
            name = sc.next();
        }
        if (!petMachine.isClean()) {
            System.out.println("A máquina está suja, limpe para colocar o pet!");
        } else {
            var pet = new Pet(name);
            petMachine.setPet(pet);
            System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
        }

    }
}