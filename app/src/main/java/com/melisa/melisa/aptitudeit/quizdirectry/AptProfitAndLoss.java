package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptProfitAndLoss {
    private String mQuestions [] = {
            "This is some test",
            "On selling 17 balls at Rs. 720, there is a loss equal to the cost price of 5 balls. The cost price of a ball is:",
            "When a plot is sold for Rs. 18,700, the owner loses 15%. At what price must that plot be sold in order to gain 15%?",
            "A trader mixes 26 kg of rice at Rs. 20 per kg with 30 kg of rice of other variety at Rs. 36 per kg and sells the mixture at Rs. 30 per kg. His profit percent is:",
            "The percentage profit earned by selling an article for Rs. 1920 is equal to the percentage loss incurred by selling the same article for Rs. 1280. At what price should the article be sold to make 25% profit?",
            "A shopkeeper expects a gain of 22.5% on his cost price. If in a week, his sale was of Rs. 392, what was his profit?",
            "A man buys a cycle for Rs. 1400 and sells it at a loss of 15%. What is the selling price of the cycle?",
            "Sam purchased 20 dozens of toys at the rate of Rs. 375 per dozen. He sold each one of them at the rate of Rs. 33. What was his percentage profit?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"Rs. 45","Rs. 50","Rs. 55","Rs. 60"},
            {"Rs. 21,000","Rs. 22,500","Rs. 25,300","Rs. 25,800"},
            {"No profit, no loss","5%","8%","10%"},
            {"Rs. 2000","Rs. 2200","Rs. 2400","Data inadequate"},
            {"Rs. 18.20","Rs. 70","Rs. 72","Rs. 88.25"},
            {"Rs. 1090","Rs. 1160","Rs. 1190","Rs. 1202"},
            {"3.5","4.5","5.6","6.5"}
    };


    private String mHint [] = {
            "Leaves",
            "(C.P. of 17 balls) - (S.P. of 17 balls) = (C.P. of 5 balls)\n" +
                    " C.P. of 12 balls = S.P. of 17 balls = Rs.720.\n" +
                    " C.P. of 1 ball = Rs.\t\t(720/12)\t\t= Rs. 60.\n",
            "85 : 18700 = 115 : x\n" +
                    " x =\t\t((18700 x 115)/85\t\t= 25300.\n" +
                    "Hence, S.P. = Rs. 25,300.",
            "C.P. of 56 kg rice = Rs. (26 x 20 + 30 x 36) = Rs. (520 + 1080) = Rs. 1600.\n" +
                    "S.P. of 56 kg rice = Rs. (56 x 30) = Rs. 1680.\n" +
                    " Gain =\t\t((80/1600)\tx 100)\t% = 5%.",
            "Let C.P. be Rs. x.\n" +
                    "\n" +
                    "Then,\t(1920 - x)/x\tx 100 =\t(x - 1280)/x\tx 100\n" +
                    " 1920 - x = x - 1280\n" +
                    " 2x = 3200\n" +
                    " x = 1600\n" +
                    " Required S.P. = 125% of Rs. 1600 = Rs.\t\t((125/100)\tx 1600)\t\t= Rs 2000.",
            "C.P. = Rs.\t\t((100/122.5)\tx 392)\t\t= Rs.\t\t((1000/1225)\tx 392)\t\t= Rs. 320\n" +
                    " Profit = Rs. (392 - 320) = Rs. 72.",
            "S.P. = 85% of Rs. 1400 = Rs.\t\t((85/100)\tx 1400)\t\t= Rs. 1190",
            "Cost Price of 1 toy = Rs.\t\t(375/12)\t\t= Rs. 31.25\n" +
                    "Selling Price of 1 toy = Rs. 33\n" +
                    "So, Gain = Rs. (33 - 31.25) = Rs. 1.75\n" +
                    " Profit % =\t\t((1.75/31.25)\tx 100)\t%\t=\t28/5\t% = 5.6%\n"

    };



    private String mCorrectAnswers[] = {"Leaves","Rs. 60","Rs. 25,300","5%","Rs. 2000","Rs. 72","Rs. 1190","5.6"};


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
