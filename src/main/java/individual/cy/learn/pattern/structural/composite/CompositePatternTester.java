package individual.cy.learn.pattern.structural.composite;

/**
 * @author mystic
 */
public class CompositePatternTester {
    public static void main(String[] args) {
        Employee ceo = new Employee(10000, "Adam", "CEO", 70000);

        Employee headSales = new Employee(20000, "Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee(30000, "Michel", "Head Marketing", 20000);

        Employee salesExecutive1 = new Employee(20001, "Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee(20002, "Rob", "Sales", 10000);

        Employee clerk1 = new Employee(30001, "Laura", "Marketing", 10000);
        Employee clerk2 = new Employee(30002, "Bob", "Marketing", 10000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println("ceo = " + ceo);

        System.out.println();

        // print ceo immediate subordinate
        ceo.getSubordinateList().forEach(System.out::println);

        System.out.println();

        // print ceo immediate subordinate's immediate subordinate
        ceo.getSubordinateList().stream()
                .flatMap(ceoSubordinate -> ceoSubordinate.getSubordinateList().stream())
                .forEach(System.out::println);
    }
}
