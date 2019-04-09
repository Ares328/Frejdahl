package domain;

import java.util.List;

public class Question {
    private String text;
    private List<Answer> answers;

    public Question() {
    }

    public Question(String text, List<Answer> answers) {
        this.text = text;
        this.answers = answers;
    }
}
