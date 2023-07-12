package com.example.getcaughtintheavalanche;

public class Question_9 {
    private static final String[] questions_9 = {
            "Who won the women's overall World Cup in 2010-11?",
            "How many points did Ivica Kostelic need to win the men's overall World Cup?",
            "Which discipline World Cup did Maria Riesch win at the end of the season?",
            "Which country won the most medals at World Championships?",
            "Which of these skiers won their first World Cup race in the 2010-11 season?",
            "Who won the most races in this season?"
    };


    private static final String[][] answers_9 = {
            {"Lindsey Vonn", "Maria Riesch"},
            {"1009", "1356"},
            {"None", "Downhill"},
            {"Austria", "France"},
            {"Marcel Hirscher", "Viktoria Rebesbur"},
            {"Lindsey Vonn", "Maria Riesch"}
    };

    private static final String[] correctAnswers_9 = {
            "Maria Riesch",
            "1356",
            "None",
            "Austria",
            "Viktoria Rebesburg",
            "Lindsey Vonn"
    };

    static String[] getQuestions_9(){
        return Question_9.questions_9;
    }
    static String[][] getAnswers_9(){
        return Question_9.answers_9;
    }
    static String[] getCorrectAnswers_9(){
        return Question_9.correctAnswers_9;
    }
}
