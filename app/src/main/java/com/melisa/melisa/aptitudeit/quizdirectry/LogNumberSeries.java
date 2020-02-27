package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogNumberSeries {
    private String mQuestions [] = {
            "This is some test",
            "Find the missing number in the following series\n5,10,13,26,29,58,61,___",
            "Find the missing number in the following series\n1,8,27,64,125,216,___",
            "Find the missing number in the following series\n8,14,12,36,18,54,___",
            "Find the missing number in the following series\n9,18,54,108,324,___",
            "Find the missing number in the following series\n3,8,15,24,35,48,___",
            "Find the missing number in the following series\n71,76,69,74,67,72,___",
            "Find the missing number in the following series\n9,12,11,14,13,___,15"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"64","122","67","124"},
            {"340","343","356","366"},
            {"15","27","135","162"},
            {"972","288","648","162"},
            {"59","61","63","65"},
            {"77","75","67","65"},
            {"16","15","14","13"}
    };


    private String mHint [] = {
            "Leaves",
            "Numbers are alternately multiplied by 2 and incresed by 3.\nSo, 61 * 2 = 122",
            "Numbers are 1\u00B3,2\u00B3,3\u00B3,4\u00B3,5\u00B3,6\u00B3.\n So, the missing number is 7\u00B3=343",
            "Numbers are alternately multiplied by 3 and divided by 2\n So, ",
            "The next number is obtained by multiplying the previous number by 2\nSo 324 * 2 = 648",
            "The difference between consecutive terms are respectively 5,7,9,11,13 and 15\n So, 48 + 15 = 63",
            "Numbers are alternately added by 5 and subtracted by 7.\nSo, 72 - 7 = 65",
            "Numbers are alternately added by 3 and subtracted by 1.\nSo, 13 +3 = 16"

    };



    private String mCorrectAnswers[] = {"Leaves","122","343","27","648","63","65","16"};


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
