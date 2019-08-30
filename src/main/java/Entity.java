public abstract class Entity {


    private String city;

    public Entity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else throw new InvalidDataException("city not be null");}



    public Entity() {
    }


    @Override
    public String toString() {
        return
                "city = " + city + " amount = "+  amountReceived() + "\n"
                ;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public abstract double amountReceived();



}
