package candidate;

public class Manager {
    public static void check(String text) {
        if (Main.candidateAge < 35) {
            String managerText = text + "\n-Manager: Следуйте за мной, " +
                    Main.candidateName + ".";
            Interviewer.check(managerText);
        } else {
            Main.print("-Manager: " + Main.candidateName + ", мне кажется вы не сможете влиться в наш " +
                    "молодой коллектив. Прощайте.");
        }
    }
}
