package domain;

import java.util.ArrayDeque;
import java.util.Deque;

public class Quiz {
    private Deque<Question> questions;
    //TODO: create counting algorithm to determinate top 3 flavors (vikings)


    public Quiz() {
    }

    public Quiz(Deque<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
        if (questions == null)
            questions = new ArrayDeque<Question>();

        questions.offerLast(question);
    }

    public Question getNextQuestion(){
        return questions.pollFirst(); // returns and removes first question, no gaps in deque
    }


}
