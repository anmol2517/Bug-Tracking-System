import java.util.*;

public class BugService {
    private List<Bug> bugs = new ArrayList<>();

    public boolean addBug(int id, String title) {
        for (Bug b : bugs) {
            if (b.getId() == id) {
                return false;
            }
        }
        bugs.add(new Bug(id, title));
        return true;
    }

    public List<Bug> getAllBugs() {
        return bugs;
    }

    public boolean closeBug(int id) {
        for (Bug b : bugs) {
            if (b.getId() == id) {
                b.close();
                return true;
            }
        }
        return false;
    }
}
