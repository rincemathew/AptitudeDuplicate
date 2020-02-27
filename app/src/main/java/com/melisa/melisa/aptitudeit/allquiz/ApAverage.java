package com.melisa.melisa.aptitudeit.allquiz;

public class ApAverage {
    private String mQuestions [] = {
            "In the first 10 overs of a cricket game, the run rate was only 3.2. What should be the run rate in the remaining 40 overs to reach the target of 282 runs?",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };



    private String mChoices [][] = {
            {"6.25","6.5","6.75","7"},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""}
    };

    private String mCorrectAnswers[] = {"6.25","","","","","","",""};

    private String mHint [] = {
            "Required run rate = ((282-(3.2/10))/40)" +
                    "=(282-32)/40" +
                    "250/40" +
                    "=6.25",
            "",
            "",
            "",
            "",
            "",
            "",
            ""

    };






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
