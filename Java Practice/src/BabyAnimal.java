public class BabyAnimal extends Animal implements IAnimal {

    int legs;
    public BabyAnimal(int legs){
        this.legs = legs;
    }
    public void common(){
        System.out.println("This is common method");
    }
    @Override
    public void name() {
        System.out.println("This is interface method");
    }

    public static void main(String[] args) {
        IAnimal animal = new BabyAnimal(4);

        animal.name();
    }
}
