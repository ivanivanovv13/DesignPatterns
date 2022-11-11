public class Main {
    public static void main(String[] args) {
        Builder cdBuilder = new CDBuilder();
        cdBuilder.setName("Metalica");
        cdBuilder.setType("CD");
        cdBuilder.setPrice(20);
        Director director = new Director(cdBuilder);
        Packing newCD = director.makePacking();
        System.out.println(newCD.toString());


        Builder dvdBuilder = new DVDBuilder();
        dvdBuilder.setName("Iron Maiden");
        dvdBuilder.setType("DVD");
        dvdBuilder.setPrice(30);
        director.changeBuilder(dvdBuilder);
        Packing newDVD = director.makePacking();
        System.out.println(newDVD.toString());
    }
}