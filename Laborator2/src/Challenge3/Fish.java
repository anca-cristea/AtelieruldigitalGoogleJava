package Challenge3;

public class Fish  extends Animal implements Pet{
    String name;
    public Fish(){
        super(0);
        name="Nu are nume";
    }
    @Override
    public void walk() {
        System.out.println("Pestii nu au picioare si nu not merge");
    }
    public void play(){
        System.out.println("Glu glu");
    }
    public void setName(String nume){
        name = nume;
    }
    public String getName(){
        return name;
    }
}
