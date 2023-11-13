public class Animal {
    private String name;

    public abstract class makeSound{
        private String sound;

        public makeSound(String sound){
            this.sound = sound;
        }

        public String getSound(){
            return sound;
        }
    }

    public abstract class eat{
        public boolean eat(String foodType){
            return true;
        }
    }
}
