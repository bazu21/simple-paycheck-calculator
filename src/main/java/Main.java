import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Entity> entityList = createEntityList();
        List<Entity> rearrangedEntityList = rearrangeEntities(entityList);

        System.out.println(rearrangedEntityList);
        double salaryFromCluj = computeAmountReceivedPerCity(entityList, "Cluj-Napoca");

        System.out.println("salarul din cluj este = " + salaryFromCluj);


    }

    public static List<Entity> createEntityList() {

        //      List<Entity> entities = new ArrayList<>();


        Student student = new Student("Cluj-Napoca", 200);
        Student student1 = new Student("Cluj-Napoca", 180);
        Student student2 = new Student("Cluj-Napoca", 250);
        Student student3 = new Student("Bucuresti", 300);

        Professor professor = new Professor("Huedin", 3200);
        Professor professor1 = new Professor("Zalau", 3400);
        Professor professor2 = new Professor("Oradea", 3000);
        Professor professor3 = new Professor("Maramures", 2800);
//        Professor professor2 = new Professor("gg",-3400);

        List<Entity> entityList = new ArrayList<>();

        entityList.add(student);
        entityList.add(student1);
        entityList.add(student2);
        entityList.add(student3);
        entityList.add(professor);
        entityList.add(professor1);


        return entityList;
    }


    public static List<Entity> rearrangeEntities(List<Entity> entityList) {
        List<Entity> students = new ArrayList<>();
        List<Entity> professor = new ArrayList<>();

        for (Entity e : entityList) {

            if (e instanceof Student) {
                students.add(e);

            } else if (e instanceof Professor) {

                professor.add(e);
            }
        }

        Comparator<Entity> myComparator = new EntityComparator();
        //studentii cresc,
        //profii descresc
        Collections.sort(students, myComparator);
        Collections.sort(professor, myComparator);
        Collections.reverse(professor);

        entityList.clear();
        entityList.addAll(professor);
        entityList.addAll(students);

        return entityList;

    }

    public static double computeAmountReceivedPerCity(List<Entity> entityList, String city) {


        double sum = 0;

        for (Entity e : entityList) {
            if (e.getCity().equals(city)) {
                sum = sum + e.amountReceived();
            }


        }

        return sum;
    }
}





