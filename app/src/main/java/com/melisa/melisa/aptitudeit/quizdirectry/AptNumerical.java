package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptNumerical {
    private String mQuestions [] = {
            "This is some test",
            "1213+1517+2529+8391+5421=",
            "123+879-545+423-639=",
            "359 * 729 =",
            "117 * 123 =",
            "54.54% of 484 =",
            "458 is what percentage of 917?",
            "?\u00B2 * 625 = (35)\u2074"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"19071","20121","25671","18931"},
            {"351","421","241","281"},
            {"244381","261711","281211","301241"},
            {"12591","15111","14391","15921"},
            {"252","264","270","275"},
            {"42%","43%","48%","50%"},
            {"7","14","23","49"}
    };


    private String mHint [] = {
            "Leaves",
            "5259+13812\n19071",
            "241",
            "261711",
            "14391",
            "(484 * 54.54) ÷ 100\n264",
            "(458 * 100) ÷ 917\n50%",
            "?\u00B2 = (35)\u2074 ÷ 625 \n ?\u00B2 = 1500625 ÷ 625 \n ? = √(2401) \n49"

    };



    private String mCorrectAnswers[] = {"Leaves","19071","241","261711","14391","264","50%","49"};


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
