
public class SlotMachine {


    private static Ch7Project.Slot slot1, slot2, slot3;

    public SlotMachine(Ch7Project.Slot s1, Ch7Project.Slot s2, Ch7Project.Slot s3){
        slot1 = s1;
        slot2 = s2;
        slot3 = s3;
        
    }
    
    public static void spinSlots(){
        slot1 = Ch7Project.spin();
        slot2 = Ch7Project.spin();
        slot3 = Ch7Project.spin();
    }



    public static void main(String[] args) {
        System.out.println(slot1 + " " + slot2 + " " + slot3);
        spinSlots();
        System.out.println(slot1 + " " + slot2 + " " + slot3);

    }
}
