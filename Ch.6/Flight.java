public class Flight {

    String name = "Juniper";
    int missionNum = 29;
    String origin = "Orlando, Florida";
    String cargo = "Medical supplies and Staff";
    int passengers = 22;

    public Flight(String n, int m, String o, String c, int p){
        name = n;
        missionNum = m;
        origin = o;
        cargo = c;
        passengers = p;
    }

    public void setMission(int newNum){
        missionNum = newNum;
    }

    public int getMission(){
        return missionNum;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setOrigin(String newOrigin){
        origin = newOrigin;
    }

    public String getOrigin(){
        return origin;
    }

    public void setCargo(String newCargo){
        cargo = newCargo;
    }

    public String getCargo(){
        return cargo;
    }

    public void setPassengers(int newPassengers){
        passengers = newPassengers;
    }

    public int getPassengers(){
        return passengers;
    }

    public String toString(){

        return "Shuttle Name: " + this.getName() + "\nOrigin: " + this.getOrigin() + "\nMission: " + this.getMission() + "\nPassengers: " + this.getPassengers() + "\nCargo: " + this.getCargo();
    }




    
}
