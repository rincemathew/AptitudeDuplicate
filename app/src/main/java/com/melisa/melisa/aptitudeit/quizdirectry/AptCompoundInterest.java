package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptCompoundInterest {
    private String mQuestions [] = {
            "This is some test",
            "Albert invested an amount of Rs. 8000 in a fixed deposit scheme for 2 years at compound interest rate 5 p.c.p.a. How much amount will Albert get on maturity of the fixed deposit?",
            "Simple interest on a certain sum of money for 3 years at 8% per annum is half the compound interest on Rs. 4000 for 2 years at 10% per annum. The sum placed on simple interest is:",
            "If the simple interest on a sum of money for 2 years at 5% per annum is Rs. 50, what is the compound interest on the same at the same rate and for the same time?",
            "The difference between simple interest and compound on Rs. 1200 for one year at 10% per annum reckoned half-yearly is:",
            "The difference between compound interest and simple interest on an amount of Rs. 15,000 for 2 years is Rs. 96. What is the rate of interest per annum?",
            "The compound interest on a certain sum for 2 years at 10% per annum is Rs. 525. The simple interest on the same sum for double the time at half the rate percent per annum is:",
            "The difference between simple and compound interests compounded annually on a certain sum of money for 2 years at 4% per annum is Re. 1. The sum (in Rs.) is:"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"8600","8620","8820","None of these"},
            {"1550","1650","1750","2000"},
            {"Rs. 51.25","Rs. 52","Rs. 54.25","Rs. 60"},
            {"Rs. 2.50","Rs. 3","Rs. 3.75","Rs. 4"},
            {"8","10","12","Cannot be determined"},
            {"Rs. 400","Rs. 500","Rs. 600","Rs. 800"},
            {"625","630","640","650"}
    };


    private String mHint [] = {
            "Leaves",
            "Amount\t\n" +
                    "= Rs.(8000*(1+5/100)\u00B2) \t\n" +
                    "= Rs.(8000*(21/20)*(21/20))\t\n" +
                    "= Rs. 8820.",
            "C.I.\t\n" +
                    "= Rs.[4000{1+(10/100)}\u00B2-4000]\t\n" +
                    "= Rs.4000*(11/10)*(11*10)-4000\t\n" +
                    "= Rs. 840.\n" +
                    " Sum = Rs.{(420*100)/(3*8)}\t\t= Rs. 1750",
            "Sum = Rs.\t\t{(50*100)/(2*5)}\t\t= Rs. 500.\n" +
                    "Amount\t\n" +
                    "= Rs.[500*(1+5/100)\u00B2]\t\n" +
                    "= Rs.{500*(21/20)*(21/20)}\t\n" +
                    "= Rs. 551.25\n" +
                    " C.I. = Rs. (551.25 - 500) = Rs. 51.25",
            "S.I. = Rs.[(1200*10*1)/100]=Rs.120\n" +
                    "C.I. = Rs.[1200*{1+5/100}\u00B2-1200]=Rs.123\n" +
                    " Difference = Rs. (123 - 120) = Rs. 3.",
            "[15000*{1+(R/100)}\u00B2-15000]-{(15000*R*2)/100}\t\t\t\t= 96\n" +
                    "15000[{1+(R/100)}\u00B2-1-(2R/100)] \t\t= 96\n" +
                    "15000[((100+R)\u00B2-10000-(200*R)/10000]\t\t= 96\n" +
                    " R\u00B2 ={(96*2)/3}=64\n" +
                    " R = 8.\n" +
                    " Rate = 8%.",
            "Let the sum be Rs. P.\n" +
                    "Then,\t\t[P{1+(10/100)}\u00B2-P]= 525\n" +
                    "\t\tP[{11/10}\u00B2-1]= 525\n" +
                    " P =\t\t {(525*100)/21}\t\t= 2500.\n" +
                    " Sum = Rs . 2500.\n" +
                    "So, S.I. = Rs.\t\t{(2500 x 5 x 4)/100}\t\t= Rs. 500\n",
            "C.I. =[x{1+(4/100)}\u00B2-x]={(676/525)*x-x}=(51/625)x\n" +
                    "S.I. ={(x*4*2)/100}=2x/25\n" +
                    "(51x/625)-(2x/25)=1\n" +
                    " x = 625."

    };



    private String mCorrectAnswers[] = {"Leaves","8820","1750","Rs. 51.25","Rs. 3","8","Rs. 500","625"};


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
