
public class Ninja {
    private String name;
    private String family;
    private String[] jutsus;

    public Ninja(String name, String family){
        this.name = name;
        this.family = family;
        jutsus = new String[5];
    }

    public void train(){
        System.out.println("Hoho!");
    }

}