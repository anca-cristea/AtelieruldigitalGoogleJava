package Challenge3;

public class Cat extends Animal implements Pet{
    String name;
    public Cat(String nume){
        super(4);
        name = nume;
    }
    public Cat(){
        this("Nu are nume");
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String nume){
        name = nume;
    }

    @Override
    public void play(){
        System.out.println("Miau miau");
    }

    @Override
    public void eat() {
        System.out.println("Pisica mananca mancare");
    }
}
