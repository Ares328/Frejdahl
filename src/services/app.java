package services;

import domain.Answer;
import domain.Question;
import domain.Quiz;
import services.builders.QuestionBuilder;

import java.util.*;

public class app {

    public static void main(String[] args) {

        /*
        final String ENTER = "\r\n";

        System.out.println("***All beers sorted by alcoholpercentage" + ENTER);

        BeerService.getAllBeers().stream().sorted(new Comparator<Beer>() {
            @Override
            public int compare(Beer o1, Beer o2) {
                return (int) (o1.getAlcoholPercentage()*100 - o2.getAlcoholPercentage()*100);
            }
        }).forEach(b -> System.out.println(b));
        */

        Question firstQuestion =
                new QuestionBuilder().setText("How do you like your meat?").setAnswers(Arrays.asList(
                        new Answer("Well done", 20),
                        new Answer("Rare", 5),
                        new Answer("Medium", 10)
                )).createQuestion();

        Question secondQuestion =
                new QuestionBuilder().setText("What kind of drink do you prefer?").setAnswers(Arrays.asList(
                        new Answer("Wine", 10),
                        new Answer("Water", 5),
                        new Answer("Beer", 20)
                )).createQuestion();

        Deque<Question>allQuestions = new ArrayDeque<>();

        allQuestions.add(firstQuestion);
        allQuestions.add(secondQuestion);

        Quiz quiz = new Quiz(allQuestions);
        quiz.start();

    }
}
