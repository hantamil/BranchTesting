public class Cat extends Animal{
    public void makeSound(){
        System.out.println("miaw");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
