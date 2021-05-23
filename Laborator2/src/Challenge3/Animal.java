package Challenge3;

public class Animal {
    protected int legs;

    protected Animal(int legsnumber){
        legs = legsnumber;
    }
    public void eat(){}
    public void walk(){
        System.out.print("Animalul are " + legs + " picioare si se misca ");
        if(legs==0)
            System.out.println("tarandu-se");
        else
            System.out.println("mergand");
    }
}
