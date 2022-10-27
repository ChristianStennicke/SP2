public class Main {
    public static void main(String[] args)
    {
        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(new EletricCar("CE 30779","Nissan","Leaf",5,62,250));
        fleet.addCar(new EletricCar("CU 35490","Hyuandai","Kona",5,70,420));
        fleet.addCar(new EletricCar("CS 12030","Porsche","Taycan 4GS",5,93,480));

        fleet.addCar(new GasolineCar("PI 55555","BMW","X5",5,5));
        fleet.addCar(new GasolineCar("DA 54755","VW","Golf",5,15));
        fleet.addCar(new GasolineCar("YD 54195","Toyota","Aygo",5,23));

        fleet.addCar(new DieselCar("JO 32232","Citroën","Berlingo",5,20, true));
        fleet.addCar(new DieselCar("DB 69779","Hyuandai","I10",5,22, true));
        fleet.addCar(new DieselCar("DB 10203","Hyuandai","I20",5,19, false));


        System.out.println(fleet);

        System.out.println("Total registration fee = " + fleet.getTotalRegistrationFeeForFleet());


    }
}