public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("*The Fish swims away...*");
    }

    @Override
    public void hunt() {
        System.out.println("*The Fish hunts...*");
    }
}
