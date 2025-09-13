public class lab2aq1 {


    public static boolean isOccupied(boolean logic){
        if(logic == true){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        roomA.setRoomNo(200);
        roomA.setRoomType("Single");

        roomB.setRoomNo(201);
        roomB.setRoomType("Double");

        roomA.setRate(100);
        roomA.setState(true);

        roomB.setRate(80);
        roomB.setState(false);


        int roomNoA = roomA.getRoomNo();
        int roomNoB = roomB.getRoomNo();
        String roomNameA = roomA.getRoomType();
        String roomNameB = roomB.getRoomType();
        double roomRateA = roomA.getRate();
        double roomRateB = roomB.getRate();
        boolean roomStateA = roomA.getState();
        boolean roomStateB = roomB.getState();

        boolean stateResultA = isOccupied(roomStateA);
        boolean stateResultB = isOccupied(roomStateB);

        System.out.println("Room Number is " + roomNoA + ", type is " + roomNameA + " nightly rate is " + roomRateA + " and it is " + stateResultA);
        System.out.println("Room Number is " + roomNoB + ", type is " + roomNameB + " nightly rate is " + roomRateB + " and it is " + stateResultB);

        HotelRoom roomC = new HotelRoom(202,"Single",false,90);
        System.out.println(roomC.toString());

        
    }
}
