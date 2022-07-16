package Candidate;

public class Interviewer {
    public static void check(String text) {
        if (Main.kotlinSkills) {
            String interviewerText = text + "\n-Interviewer: " + Main.candidateName +
                    ", привет! Давай обсудим некоторые моменты." +
                    "\n*TWO HOURS LATER*" +
                    "\n-Interviewer: " + Main.candidateName + ", спасибо. " +
                    "Отправляйтесь к кадровому специалисту.";
            Hr.offer(interviewerText);
        } else {
            Main.print("-Interviewer: " + Main.candidateName + ", вы что не знаете Kotlin!? Извините, вы нам не подходите.");
        }
    }
}
