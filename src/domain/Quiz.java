package domain;

import services.BeerService;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Quiz {
    private Deque<Question> questions;
    private int score;
    //TODO: create counting algorithm to determinate top 3 flavors (vikings)


    public Quiz() {
    }

    public Quiz(Deque<Question> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int amount) {
        score+=amount;
    }

    public void addQuestion(Question question){
        if (questions == null)
            questions = new ArrayDeque<Question>();

        questions.offerLast(question);
    }

    public Question getNextQuestion(){
        return questions.pollFirst(); // returns and removes first question, no gaps in deque
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question: questions
             ) {

            System.out.println(question.getText());


            int i=1;
            for (Answer answer: question.getAnswers()
                 ) {
                System.out.println(i + ") " + answer.getText());
                i++;

            }

            int answer = scanner.nextInt();
            addToScore(question.getAnswers().get(answer-1).getValue());
        }
    }

    public Viking getViking() {
        return BeerService.getVikingByScore(getScore());
    }
}
