public class HotelRoom {

    private int roomNumber;
    private String roomType;
    private boolean roomState; // 0 vacant 1 occupied
    private double rate; // nightly rate for each room

    //Constructor
    public HotelRoom(){

    }

    public HotelRoom(int roomNumber, String roomType, boolean occupied, double rate){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomState = occupied;
        this.rate = rate;
    }

    public void setRoomNo(int no){
        if (no > 0 && no <= 100) {
            this.roomNumber = no;
        }
    }

    public void setRoomType(String roomT){
        this.roomType = roomT;
    }

    public void setRate(double nightRate){
        this.rate = nightRate;
    }

    public void setState(boolean logic){
        this.roomState = logic;
    }

    public int getRoomNo(){
        return roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }

    public double getRate(){
        return rate;
    }

    public boolean getState(){
        return roomState;
    }
}