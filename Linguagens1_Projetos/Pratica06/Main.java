

public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        ninja.train();
        AcademyStudent academyStudent = new AcademyStudent("Sasuke", "Uchiha");
        academyStudent.train();
        Chuunin chuunin = new Chuunin("Iruka","Umino", "Treinar XYZ");
        chuunin.train();
        chuunin.goToMission();
        Jounin jounin = new Jounin("Kakashi", "Hatake", "Train Sasuke");
        jounin.goToMission();
    }

}