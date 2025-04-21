public class Animal0 {
  abstract class Animal {
    abstract void makeSound();
  }

  class Cat extends Animal {
    @Override
    void makeSound() {
      System.out.println("Meow!");
    }
  }

  class Dog extends Animal {
    @Override
    void makeSound() {
      System.out.println("Bark!");
    }

    public static void main(String[] args) {
      Animal cat = new Cat();
      Animal dog = new Dog();

      cat.makeSound(); // Meow!
      dog.makeSound(); // Bark!
    }
  }

}
