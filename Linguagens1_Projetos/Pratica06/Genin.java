
public class Genin extends RankedNinja {
   
    public Genin(String name, String family, String mission) {
        super(name, family, mission);
    }

    public void mudarMissao(){
        
        mission = "Ola mundo!"; // Classes filhas nao conseguem mexer no
        // que é privado do pai; protecteded deixa aberto para a cadeia de herança
        // Mas tem q tomar cuidado com o acoplamento de classes.
    }

}