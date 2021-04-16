package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DocumentedActivity extends Activity {

    private NormalActivity activity;
    private List<Question> questions;

    public DocumentedActivity(String name, String state, Iteration iteration, NormalActivity activity) {
        super(name, state, iteration);
        this.activity = activity;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    @Override
    public Duration getDuration() throws SabanaResearchException {
        if (questions.size()<=0){
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_DOCUMENTED_ACTIVITY);
        }
        if(activity ==null){
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_DOCUMENTED_ACTIVITY_WITHOUT_NORMAL_QUESTION);
        }

        if(activity.getSteps().size() <= 0){
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_NORMAL_ACTIVITY);
        }


        return Duration.ofDays(0);
    }
    public Duration getDedication(){
        for( Question q: questions){
            q.getDedication();
        }
        return Duration.ofDays(0);
    }
}


