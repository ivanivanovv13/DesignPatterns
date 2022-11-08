public abstract class Computer {
    private String VideoCard;
    private String Processor;

    public Computer() {
    }

    public Computer(Computer computer) {
        VideoCard = computer.getVideoCard();
        Processor = computer.getProcessor();
    }

    public String getVideoCard() {
        return VideoCard;
    }

    public void setVideoCard(String videoCard) {
        VideoCard = videoCard;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public abstract Computer clone();
}
