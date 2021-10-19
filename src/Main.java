/**
 * @author Ivan Hernandez, nº 62448
 * Demo for the Git lab on Software Engineering
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Let's hear it from the pets");
        Animal dog = new Dog("Jesus");
        Animal cat = new Cat("Damian");
        System.out.println(dog.getName() + " says " + dog.speak());
        System.out.println(cat.getName() + " says " + cat.speak());
    }
}