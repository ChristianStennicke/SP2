public class EletricCar extends ACar {

    int batteryCapacityKWh;
    int maxRangeKm;


    public EletricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm) {
        super(registrationNumber,make,model,numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;

    }

    public int getWhPrKm()
    {
        return (getBatteryCapacityKWh()*1000) / getMaxRangeKm();
    }

   public int getBatteryCapacityKWh()
    {
        return batteryCapacityKWh;
    }

   public int getMaxRangeKm()
    {
        return maxRangeKm;
    }

   @Override
   public int getRegistrationFee()
   {
       int kmPrLitre = Math.round(100/(getWhPrKm() / 91.25f));
       int fee = 0;

       if(kmPrLitre > 20 && kmPrLitre < 50)
       {
           fee = 330;
       }
       else if (kmPrLitre > 15 && kmPrLitre < 20)
       {
           fee = 1050;
       }
       else if ( kmPrLitre > 10 && kmPrLitre < 15)
       {
           fee = 2340;
       }
       else if (kmPrLitre > 5 && kmPrLitre < 10)
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
   public String toString()
    {
        String str = super.toString();

        str += " Get wh pr km = " + getWhPrKm() +
                "\n Battery capacity = " + batteryCapacityKWh +
                "\n Max range = " + maxRangeKm+
                "\n Registration fee = " + getRegistrationFee() + "\n";
        return str;
    }


}
