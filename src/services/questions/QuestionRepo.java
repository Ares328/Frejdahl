package services.questions;

import domain.Question;

import java.util.List;

public interface QuestionRepo {

    List<Question> getQuestions();
    Question getQuestion(int index);
    Question getNext();

}
