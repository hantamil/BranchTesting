public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Vuf");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
