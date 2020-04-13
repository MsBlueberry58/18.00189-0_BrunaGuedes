

public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        MostrarTreino(ninja); 
        Ninja academyStudent = new AcademyStudent("Sasuke", "Uchiha");
        MostrarTreino(academyStudent);
        Chuunin chuunin = new Chuunin("Iruka","Umino", "Treinar XYZ");
        MostrarTreino(chuunin);
        Jounin jounin = new Jounin("Kakashi", "Hatake", "Train Sasuke");
        MostrarTreino(jounin);

    
    }

    static void MostrarTreino(Ninja ninja){
        ninja.train();
       
    }

}