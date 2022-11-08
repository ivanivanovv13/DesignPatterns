import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        GamingComputer gamingComputer = new GamingComputer();
        gamingComputer.setProcessor("Intel Core I7");
        gamingComputer.setVideoCard("Nvidia RTX 3060 TI");

        computers.add(gamingComputer);
        computers.add(gamingComputer.clone());

        if (computers.get(0) != computers.get(1))
            System.out.println("The Computers are different objects ");
        else
            System.out.println("The Computers are the same objects ");

        if (computers.get(0).getProcessor() == computers.get(1).getProcessor() &&
                computers.get(0).getVideoCard() == computers.get(1).getVideoCard())
            System.out.println("The Computers have the same properties ");
        else
            System.out.println("The Computers don't have the same properties ");
    }
}