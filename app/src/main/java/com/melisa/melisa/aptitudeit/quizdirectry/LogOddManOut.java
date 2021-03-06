package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogOddManOut {
    private String mQuestions [] = {
            "This is some test",
            "Find the odd one:\n3,5,7,12,13",
            "Find the odd one:\n14,16,21,24,26",
            "Find the odd one:\n13,15,17,18,19",
            "Find the odd one:\n36,72,144,196,225",
            "Find the odd one:\nOdour,Fragrance,Sour,Foul",
            "Find the odd one:\nOctober,September,July,March,January",
            "Find the odd one:\nChina:Yuan\nSwitzerland:Peso\nBangladesh:Taka\nIndia:Rupee\nJapan:Yen"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"3","5","7","12"},
            {"16","21","24","26"},
            {"15","17","18","19"},
            {"72","144","196","225"},
            {"Odour","Fragrance","Sour","Foul"},
            {"September","July","March","January"},
            {"China:Yuan","Switzerland:Peso","India:Rupee","Japan:Yen"}
    };


    private String mHint [] = {
            "Leaves",
            "Each of the number except 12, is a prime number",
            "Each of the number except 21, is an even number",
            "Each of the number except 18, is an odd number",
            "Each of the number except 72, is a perfect square",
            "Sour is related to taste. Others are related to smell",
            "In September there is only 30 days. Every other months in the list has 31 days",
            "The currency of Switzerland is Swiss franc(CHF)\nSo Switzerland is the odd one"

    };



    private String mCorrectAnswers[] = {"Leaves","12","21","18","72","Sour","September","Switzerland:Peso"};


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
