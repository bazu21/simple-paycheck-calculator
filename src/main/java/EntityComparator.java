import java.util.Comparator;

public class EntityComparator implements Comparator<Entity> {


    // 1  //cand salariul ii mai mare
    // 0 = 0   cand salariul ii egal
    // -1 =   cand salariul ii mai mic

    @Override
    public int compare(Entity entity1, Entity entity2) {

        if (entity1.amountReceived() == entity2.amountReceived()) {
            return 0;
        } else if (entity1.amountReceived() > entity2.amountReceived()) {
            return 1;
        } else {
            return -1;
        }

        //var mai simpla

        //Double. - clasa wraper
        //double  - primitiva

        //  return Double.compare(entity1.amountReceived(),entity2.amountReceived());
    }
}
