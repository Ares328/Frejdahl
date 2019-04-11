package services.repositories.questions;

import domain.Answer;
import domain.Question;
import services.builders.QuestionBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionData {

    public static List<Question> questions = new ArrayList<>(Arrays.asList(
            new QuestionBuilder()
                    .setText("Whats your origin?")
                    .addAnswer(new Answer("Norway", 20))
                    .addAnswer(new Answer("Denmark", 10))
                    .addAnswer(new Answer("Sweden", 50))
                    .addAnswer(new Answer("Other", 5))
                    .createQuestion(),
            new QuestionBuilder()
                    .setText("Do you get seasick?")
                    .addAnswer(new Answer("Yes", 0))
                    .addAnswer(new Answer("No",20))
                    .addAnswer(new Answer("I dont know", 10))
                    .createQuestion(),
            new QuestionBuilder()
                    .setText("What word do you like the most")
                    .addAnswer(new Answer("Snekker", 10))
                    .addAnswer(new Answer("Knarr", 20))
                    .addAnswer(new Answer("Drakkars", 30))
                    .createQuestion(),
            new QuestionBuilder()
                    .setText("Do you like meat or fish more?")
                    .addAnswer(new Answer("I like meat", 30))
                    .addAnswer(new Answer("I like fish", 20))
                    .addAnswer(new Answer("None of the above", 0))
                    .createQuestion(),
            new QuestionBuilder()
                    .setText("How do you like your meat?")
                    .addAnswer(new Answer("Well done", 20))
                    .addAnswer(new Answer("Rare", 5))
                    .addAnswer(new Answer("Medium", 10))
                    .createQuestion(),
            new QuestionBuilder()
                    .setText("What kind of drink do you prefer?")
                    .addAnswer(new Answer("Wine", 10))
                    .addAnswer(new Answer("Water", 5))
                    .addAnswer(new Answer("Beer", 20))
                    .createQuestion()
    ));


}