class Transport {
    String name;
    int capacity;

    Transport() {
        this.name = "Not Given";
        this.capacity = 25;
    }

    Transport(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void display() {
        System.out.println(">>Transport Name : "+ name);
        System.out.println(">>Capacity       : "+ capacity);
    }
} // Transport class ends here


class Bus extends Transport {
    int numberOfSeats;
    String route;

    Bus() {
        super();
        this.numberOfSeats = 40;
        this.route = "City Route";
        System.out.println("Bus Default Constructor");
    }

    Bus(String name, int capacity, int numberOfSeats, String route) {
        super(name, capacity);
        this.numberOfSeats = numberOfSeats;
        this.route = route;
        System.out.println("Bus Parameterized Constructor");
    }

    int getNumberOfSeats() {
        return numberOfSeats;
    }

    void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    String getRoute() {
        return route;
    }

    void setRoute(String route) {
        this.route = route;
    }

    void display() {
        super.display();
        System.out.println("Number of Seats: " +numberOfSeats);
        System.out.println("Route          : " +route);
    }
} // class Bus ends here


class Train extends Transport {
    int numberOfCoaches;
    String trainType;

    Train() {
        super();
        this.numberOfCoaches = 10;
        this.trainType = "Express";
        System.out.println("Train Default Constructor");
    }

    Train(String name, int capacity, int numberOfCoaches, String trainType) {
        super(name, capacity);
        this.numberOfCoaches = numberOfCoaches;
        this.trainType = trainType;
        System.out.println("Train Parameterized Constructor");
    }

    int getNumberOfCoaches() {
        return numberOfCoaches;
    }

    void setNumberOfCoaches(int numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }

    String getTrainType() {
        return trainType;
    }

    void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    void display() {
        super.display();
        System.out.println("Number of Coaches: "+numberOfCoaches);
        System.out.println("Train Type       : "+trainType);
    }
} //class Train ends here


class TestTransport {
    public static void main(String[] args) {
        Transport t1 = new Transport();
        t1.display();
        System.out.println();

        Bus b1 = new Bus("City Bus", 50, 45, "Downtown Route");
        b1.display();
        System.out.println();

        Train tr1 = new Train("Rajdhani Express", 800, 12, "Superfast");
        tr1.display();
        System.out.println();
    }
}
