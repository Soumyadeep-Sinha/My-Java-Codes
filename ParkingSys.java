public class ParkingSys {
    int big, medium, small;
    public void ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        while(big > 0 || medium > 0 || small > 0){
            if(carType == 1){
                big--;
                return true;
            }
            if(carType == 2){
                medium--;
                return true;
            }
            if(carType == 3){
                small--;
                return true;
            }
        }
        return false;
    }
}
