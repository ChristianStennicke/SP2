public class GasolineCar extends AFuelCar{



    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public int getRegistrationFee()
    {
        int fee = 0;
        if(kmPrLitre > 20 && kmPrLitre  < 50)
        {
            fee = 330;
        }
        else if (kmPrLitre > 15 && kmPrLitre < 20)
        {
            fee = 1050;
        }
        else if (kmPrLitre > 10 && kmPrLitre < 15)
        {
            fee = 2340;
        } else if (kmPrLitre > 5 && kmPrLitre < 10)
        {
            fee = 5500;
        }
        else
        {
            fee = 10470;
        }
        return fee;
    }

    @Override
    public String getFuelType() {
        return "gasoline";
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " Fuel type = " + getFuelType() + "\n" + "Registration fee = " + getRegistrationFee() + "\n";
        return str;
    }

}