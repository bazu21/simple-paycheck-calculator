public class Student extends Entity {


    private double scholarship;


    public Student(String city, double scholarship) {
        super(city);


        if (scholarship > 0) {
            this.scholarship = scholarship;


        } else
            throw new InvalidDataException("scholarship not good");
    }

    @Override
    public double amountReceived() {
        return this.scholarship;
    }


}

