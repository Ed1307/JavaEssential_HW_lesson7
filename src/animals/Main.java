package animals;

public class Main {
    public static void main(String[] args) {
        Animals dog = Animals.Dog;
        dog.setAge(10);
        System.out.println(dog.toString());

        Animals cat = Animals.Cat;
        cat.setAge(8);
        System.out.println(cat.toString());

        Animals cow = Animals.Cow;
        cow.setAge(5);
        System.out.println(cow.toString());
    }
}
