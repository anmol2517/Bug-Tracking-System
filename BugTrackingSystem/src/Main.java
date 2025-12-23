public class Main {
    public static void main(String[] args) {
        BugService service = new BugService();

        service.addBug(1, "Login Issue");
        service.addBug(2, "Page Crash");

        for (Bug b : service.getAllBugs()) {
            System.out.println(b.getId() + " " + b.getTitle() + " " + b.getStatus());
        }

        service.closeBug(1);

        System.out.println("After Closing:");
        for (Bug b : service.getAllBugs()) {
            System.out.println(b.getId() + " " + b.getTitle() + " " + b.getStatus());
        }
    }
}
