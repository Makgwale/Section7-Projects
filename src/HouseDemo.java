public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House(2, 7, "White");
        House yourHouse = new House(3,10,"Red") ;

        printHouseData(myHouse);
        System.out.println();
        printHouseData(yourHouse);

    }

    public static void printHouseData(House theHouse){
        //theHouse = new House(4,6,"Purple");
        System.out.println("The house is " + theHouse.getColor() +
                " and has " + theHouse.getNumStories() +
                " stories and " + theHouse.getNumWindows() + " windows");
    }
}
