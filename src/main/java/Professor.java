public class Professor extends Entity {

    private double salary;


    public Professor(String city, double salary) {
        super(city);


        if (salary > 0) {
            this.salary = salary;


        } else

            throw new InvalidDataException("salary not good");
    }

    @Override
    public double amountReceived() {
        return this.salary;
    }
}
