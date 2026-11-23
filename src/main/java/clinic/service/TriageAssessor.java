package clinic.service;

import clinic.exceptions.InvalidAssessmentException;
import clinic.model.TriageAssessment;
import clinic.model.enums.DegreeOfAid;
import clinic.model.enums.SeverityLevel;

public class TriageAssessor{
    private static final int MIN_SCORE = 0;
    private static final int MAX_SCORE = 10;

    public TriageAssessment createAssessment(int a, int b, int c, int d, int e) throws InvalidAssessmentException {
        checkScore("Airway", a);
        checkScore("Breathing", b);
        checkScore("Circulation", c);
        checkScore("Disability", d);
        checkScore("Exposure", e);

        return new TriageAssessment(a, b, c, d, e);
    }

    public int calculateTotalScore(TriageAssessment assessment) throws InvalidAssessmentException {
        if(assessment == null)
            throw new InvalidAssessmentException("Assessment cannot be null");

        return (assessment.aScore * 3)
             + (assessment.bScore * 3)
             + (assessment.cScore * 2)
             + assessment.dScore
             + assessment.eScore;
    }
    
    public SeverityLevel classify(TriageAssessment assessment) throws InvalidAssessmentException {
        int total = calculateTotalScore(assessment);

        if(assessment.emergency || total >= 60) 
            return SeverityLevel.CRITICAL;
        else if(total >= 45)
            return SeverityLevel.HIGH;
        else if(total >= 30)
            return SeverityLevel.MEDIUM;
        else
            return SeverityLevel.LOW;
    }

    public DegreeOfAid recommendAid(TriageAssessment assessment) throws InvalidAssessmentException {
        SeverityLevel level = classify(assessment);

        return switch(level) {
            case CRITICAL -> DegreeOfAid.TRANSFER;
            case HIGH -> DegreeOfAid.IMMEDIATE_CARE;
            case MEDIUM -> DegreeOfAid.ADVANCED_CARE;
            case LOW -> DegreeOfAid.BASIC_CARE;
        };

    }

    private void checkScore(String s, int score) throws InvalidAssessmentException {
        if(score > MAX_SCORE || score < MIN_SCORE) 
           throw new InvalidAssessmentException(s + " score should be between " + MIN_SCORE + " and " + MAX_SCORE + ", Got: " + score);  
    }
}