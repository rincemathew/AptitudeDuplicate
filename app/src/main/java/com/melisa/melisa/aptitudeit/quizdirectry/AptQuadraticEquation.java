package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptQuadraticEquation {
    private String mQuestions [] = {
            "This is some test",
            "I. x\u00B2 - x - 42 = 0,\n" +
                    "II. y\u00B2 - 17y + 72 = 0 to solve both the equations to find the values of x and y?",
            "I. x\u00B2 + 9x + 20 = 0,\n" +
                    "II. y\u00B2 + 5y + 6 = 0 to solve both the equations to find the values of x and y?",
            "Find the roots of quadratic equation: 2x\u00B2 + 5x + 2 = 0?",
            "Find the roots of quadratic equation: x\u00B2 + x - 42 = 0?",
            "Find the roots of quadratic equation: 3x\u00B2 - 7x - 6 = 0?",
            "Find the value of a/b + b/a, if a and b are the roots of the quadratic equation x\u00B2 + 8x + 4 = 0?",
            " A man could buy a certain number of notebooks for Rs.300. If each notebook cost is Rs.5 more, he could have bought 10 notebooks less for the same amount. Find the price of each notebook?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"If x < y","If x > y","If x ≤ y","If x ≥ y"},
            {"If x < y","If x > y","If x ≤ y","If x ≥ y"},
            {"-2, -1/2","4, -1","4, 1","-2, 5/2"},
            {"-6, 7","14, -3","-8, 7","-7, 6"},
            {"-6, 3","3, -2/3","-5, 2","-9, 2"},
            {"15","14","26","24"},
            {"10","8","20","18"}
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



    private String mCorrectAnswers[] = {"Leaves","If x < y","If x < y","-2, -1/2","-7, 6","3, -2/3","14","10"};


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
