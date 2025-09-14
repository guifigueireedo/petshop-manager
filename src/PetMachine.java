public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    public boolean isClean() {
        return clean;
    }

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para começar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade máxima de água foi atingida.");
            return;
        }

        this.water += 2;
        System.out.println("Mais 2 litros de água foram adicionados! Litros na máquina: " + this.water);
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade máxima de shampoo foi atingida.");
            return;
        }

        this.shampoo += 2;
        System.out.println("Mais 2 litros de shampoo foram adicionados! Litros na máquina: " + this.shampoo);
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina!");
        }
        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado!");
        this.pet = null;
    }

    public void cleanMachine() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa!");
    }

}
