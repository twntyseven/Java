public class Ch7Project {

    enum Slot{
        ORANGE,
        LEMON,
        CHERRY;
    }

    private static Slot currentSlot;

    public String toString(){
        return "You rolled a " + currentSlot;
    }

    public static void setSlot(int value){
        currentSlot = Slot.values()[value];

    }

    public static Slot getSlot(){
        return currentSlot;
    }

    public static Slot spin(){
        Slot[] slot = Slot.values();
        return slot[(int)(Math.random() * 3)];
    }

    public static void main(String[] args) {
        Slot slot = Ch7Project.spin();

        System.out.println(slot);

        System.out.println(currentSlot.toString());

    }
}