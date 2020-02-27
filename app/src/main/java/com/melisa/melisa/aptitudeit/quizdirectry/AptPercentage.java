package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptPercentage {
    private String mQuestions [] = {
            "This is some test",
            "Three candidates contested an election and received 1136, 7636 and 11628 votes respectively. What percentage of the total votes did the winning candidate get?",
            "Two tailors X and Y are paid a total of Rs. 550 per week by their employer. If X is paid 120 percent of the sum paid to Y, how much is Y paid per week?",
            "Gauri went to the stationers and bought things worth Rs. 25, out of which 30 paise went on sales tax on taxable purchases. If the tax rate was 6%, then what was the cost of the tax free items?",
            "In a certain school, 20% of students are below 8 years of age. The number of students above 8 years of age is (2/3) of the number of students of 8 years of age which is 48. What is the total number of students in the school?",
            "In an election between two candidates, one got 55% of the total valid votes, 20% of the votes were invalid. If the total number of votes was 7500, the number of valid votes that the other candidate got, was:",
            "What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?",
            "If A = x% of y and B = y% of x, then which of the following is true?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"57%","60%","65%","90%"},
            {"Rs. 200","Rs. 250","Rs. 300","None of these"},
            {"Rs. 15","Rs. 15.70","Rs. 19.70","Rs. 20"},
            {"80","120","150","100"},
            {"2700","2900","3100","3300"},
            {"1","14","20","21"},
            {"A is smaller than B","A is greater than B","Relationship between A and B cannot be determined","None of these"}
    };


    private String mHint [] = {
            "Leaves",
            "Total number of votes polled = (1136 + 7636 + 11628) = 20400.\n" +
                    "\n" +
                    " Required percentage =((11628/20400)x 100)% = 57%.",
            "Let the sum paid to Y per week be Rs. z.\n" +
                    "\n" +
                    "Then, z + 120% of z = 550.\n" +
                    "\n" +
                    " z +\t(120/100)z = 550\n" +
                    "\t11/5\tz = 550\n" +
                    " z =\t\t((550 x 5)/11)\t  = 250.\n",
            "Let the amount taxable purchases be Rs. x.\n" +
                    "\n" +
                    "Then, 6% of x =\t30/100\n" +
                    " x =\t\t((30/100)\tx\t(100/6)) = 5.\n" +
                    " Cost of tax free items = Rs. [25 - (5 + 0.30)] = Rs. 19.70\n" +
                    "\n",
            "Let the number of students be x. Then,\n" +
                    "\n" +
                    "Number of students above 8 years of age = (100 - 20)% of x = 80% of x.\n" +
                    "\n" +
                    " 80% of x = 48 +\t2/3\tof 48\n" +
                    "\t80/100\tx = 80\n" +
                    " x = 100.",
            "Number of valid votes = 80% of 7500 = 6000.\n" +
                    "\n" +
                    " Valid votes polled by other candidate = 45% of 6000\n" +
                    "\n" +
                    "=\t\t(45/100)\tx 6000\t\t= 2700.\n",
            "Clearly, the numbers which have 1 or 9 in the unit's digit, have squares that end in the digit 1. Such numbers from 1 to 70 are 1, 9, 11, 19, 21, 29, 31, 39, 41, 49, 51, 59, 61, 69.\n" +
                    "\n" +
                    "Number of such number =14\n" +
                    "\n" +
                    " Required percentage =\t\t((14/70)\tx 100)\t% = 20%.\n",
            "x% of y =\t\t((x/100)\tx y)\t\t=\t\t((y/100)\tx x)\t\t= y% of x\n" +
                    " A = B."

    };



    private String mCorrectAnswers[] = {"Leaves","57%","Rs. 250","Rs. 19.70","100","2700","20","None of these"};


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
