import java.util.Scanner;

public class CompetitorAdapter extends Weightlifter implements QualificationSystem {
    @Override
    public void giveTotal() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input weightlifter's snatch: ");
        setCleanAndJerk(in.nextDouble());
        System.out.println("Input weightlifter's clean and jerk: ");
        setCleanAndJerk(in.nextDouble());
    }

    @Override
    public boolean isQualified() {
        double total = getCleanAndJerk() + getCleanAndJerk();
        return total >= 203 ? true : false;
    }
}
