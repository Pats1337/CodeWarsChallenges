package candidate;

public class Hr {
    public static void check() {
        if (Main.desiredSalary < 100_000) {
            String hrText1 = "-HR: Здравствуйте, " + Main.candidateName + ", Вы успешно " +
                    "справились с тестовым заданием и нас устраивают Ваши требования. " +
                    "Менеджер проводит Вас для прохождения интервью.";
            Manager.check(hrText1);
        } else {
            Main.print("-HR: Извините, " + Main.candidateName + ", у Вас слишком большие запросы.");
        }
    }

    public static void offer(String text) {
        String fullText = text + "\n-HR: " + Main.candidateName + ", Вы успешно прошли интервью " +
                "и мы готовы предоставить Вам job offer" +
                "\n*MISSION COMPLETE, OFFER RECEIVED*";
        Main.print(fullText);
    }
}
