public class BodyOfWaterMain {
    //public static void main(String[] args) {
        //BodyOfWater b = new BodyOfWater();
        //System.out.println("here");
   // }

    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Atlantic Ocean", 666, 16.6, true);
        BodyOfWater b1 = new BodyOfWater("Pacific Ocean", 555, 15.5, true );

        b.setName("Atlantic Ocean");
        b.setlargestDiameter(666);
        b.setavgDepth(16.6);
        b.setisSaltWater(true);

        System.out.println(b.getName());
        System.out.println(b1.getName());

        System.out.println(b.getLargestDiameter());
        System.out.println(b1.getLargestDiameter());

        System.out.println(b.getAvgDepth());
        System.out.println(b1.getAvgDepth());

        System.out.println(b.getIsSaltWater());
        System.out.println(b1.getIsSaltWater());
    }
}
