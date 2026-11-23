package clinic.model;

public class TriageAssessment {
    public final int aScore;
    public final int bScore;
    public final int cScore;
    public final int dScore;
    public final int eScore;
    public final boolean emergency;

    public TriageAssessment(int aScore, int bScore, int cScore, int dScore, int eScore) {
        this.aScore = aScore;
        this.bScore = bScore;
        this.cScore = cScore;
        this.dScore = dScore;
        this.eScore = eScore;

        this.emergency = aScore > 5 || bScore > 5 || cScore > 5 || dScore > 5 || eScore > 5;
    }
}