package services.builders;

import domain.Answer;
import domain.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionBuilder {


    private String text;
    private List<Answer> answers;

    public QuestionBuilder(){
        answers = new ArrayList<>();
    }

    public QuestionBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public QuestionBuilder setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public QuestionBuilder addAnswer(Answer answer) {
        this.answers.add(answer);
        return this;
    }

    public Question createQuestion() {
        return new Question(text, answers);
    }
}
