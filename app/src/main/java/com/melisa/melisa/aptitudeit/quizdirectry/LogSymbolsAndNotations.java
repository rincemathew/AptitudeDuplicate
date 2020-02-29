package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogSymbolsAndNotations {
    private String mQuestions [] = {
            "This is some test",
            " If - means *, * means +, + means / and / means -, then 40 * 12 + 3 - 6 / 60 = ?",
            "If + means /, * means -, / means * and - means +, then 8 + 6 * 4 / 3 - 4 = ?",
            "In a certain code language, '+' means '*', '*' means '-', '-' means '/' and '/' means '+'. 9 + 4 - 6 * 6 / 8",
            "In a certain code language, '+' means '/', '/' means '*', '*' means '-', '-' means '+'.5 * 10 - 15 / 20 + 25 / 30",
            "In a certain code language, '+' means '*', '*' means '-', '-' means '/' and '/' means '+'.10 + 10 * 10 - 10 / 10",
            "In a certain code language, '+' means '/', '/' means '*', '*' means '-', '-' means '+'.(10 - 5) / 50 * (25 * 5) / 40",
            " In a certain code language, '+' means '*', '*' means '-', '-' means '/' and '/' means '+'.16 * 4 / 4 + 14 - 2"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"9","16","44","None of these"},
            {"-12","12","-20 / 3","20 / 3"},
            {"8.5","0","8","10.7"},
            {"210","240","355","245"},
            {"109","10","19","11"},
            {"-550","50","-50","550"},
            {"56","28","40","112"}
    };


    private String mHint [] = {
            "Leaves",
            "",
            "",
            "",
            "",
            "",
            "",
            ""

    };



    private String mCorrectAnswers[] = {"Leaves","None of these","-20 / 3","8","355","109","-50","40"};


    public int getLength()  {return mQuestions.length;}




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 =mChoices[a][3];
        return choice3;
    }

    public String getHint(int a){
        String hint =mHint[a];
        return hint;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
