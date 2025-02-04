public class Ch7Project {


    enum Slot{
        ORANGE,
        LEMON,
        CHERRY
    }

    private static Slot currentSlot;

    public String toString(){
        return "You rolled a " + currentSlot;
    }

    public void setSlot(int value){
        currentSlot = Slot.values()[value];

    }

    public Slot getSlot(){
        return currentSlot;
    }

    public static Slot spin(){
        currentSlot = Slot.values()[(int)(Math.random() * 3) ];
        return currentSlot;
    }

    public static void main(String[] args) {
        spin();

        System.out.println(currentSlot.toString());

    }
}