package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogSymbolsAndNotations {
    private String mQuestions [] = {
            "This is some test",
            "symbols and notations",
            "",
            "",
            "",
            "",
            "",
            ""
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""}
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



    private String mCorrectAnswers[] = {"Leaves","","","","","","",""};


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
