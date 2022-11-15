public class Main {
    public static void main(String[] args) {
        QualificationSystem qualificationSystem = new CompetitorAdapter();
        qualificationSystem.giveTotal();
        System.out.println("The competitor is qualified: " + qualificationSystem.isQualified());
    }
}