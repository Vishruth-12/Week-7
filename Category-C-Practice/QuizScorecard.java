public class QuizScorecard {
    private final boolean[] results;
    private int recorded;

    public QuizScorecard(int questionCount) {
        if (questionCount < 0) throw new IllegalArgumentException("Question count cannot be negative");
        results = new boolean[questionCount];
        recorded = 0;
    }

    public void recordAnswer(boolean correct) {
        if (recorded >= results.length) {
            System.out.println("Cannot record more answers than the question count");
            return;
        }
        results[recorded++] = correct;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < recorded; i++) {
            if (results[i]) score++;
        }
        return score;
    }

    public static void main(String[] args) {
        QuizScorecard sc = new QuizScorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println(sc.getScore());
    }
}
