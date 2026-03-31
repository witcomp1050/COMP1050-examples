package interfaces;

public class Vet {
    public static void main(String[] args) {
        Pet myDog = new Dog("Spot", "1234");
        Pet myCat = new Cat("Mittens", "5432", true);

        System.out.println(myDog.getName() + " says " + myDog.makeSound()); // Spot says Woof!
        System.out.println(myCat.getName() + " says " + myCat.makeSound()); // Mittens says Meow!
    }
}
