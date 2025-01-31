public class Main {
    public static void main(String[] args) {

        Flight burgandy = new Flight("Burgandy", 101, "Winnipeg, Manitoba", "Food & entertainment consoles", 9);
        Flight juniper = new Flight("Juniper", 34, "Orlando, Florida", "Medical supplies and Staff", 22);
        Flight grandiose = new Flight("Grandiose", 106, "Dedre Crater, Dark-Side of the Moon ", "Radio Equipment", 5);

        grandiose.setMission(136);
        grandiose.getPassengers();

        System.out.print(burgandy.toString());
        System.out.println(juniper.toString());
        System.out.println(grandiose.toString());


    }
    
}
