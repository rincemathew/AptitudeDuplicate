package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptSimplification {
    private String mQuestions [] = {
            "This is some test",
            "In a regular week, there are 5 working days and for each day, the working hours are 8. A man gets Rs. 2.40 per hour for regular work and Rs. 3.20 per hours for overtime. If he earns Rs. 432 in 4 weeks, then how many hours does he work for ?",
            "Free notebooks were distributed equally among children of a class. The number of notebooks each child got was one-eighth of the number of children. Had the number of children been half, each child would have got 16 notebooks. Total how many notebooks were distributed ?",
            "A man has some hens and cows. If the number of heads be 48 and the number of feet equals 140, then the number of hens will be:",
            "David gets on the elevator at the 11th floor of a building and rides up at the rate of 57 floors per minute. At the same time, Albert gets on an elevator at the 51st floor of the same building and rides down at the rate of 63 floors per minute. If they continue travelling at these rates, then at which floor will their paths cross ?" ,
            "One-third of Rahul's savings in National Savings Certificate is equal to one-half of his savings in Public Provident Fund. If he has Rs. 1,50,000 as total savings, how much has he saved in Public Provident Fund ?",
            "A fires 5 shots to B's 3 but A kills only once in 3 shots while B kills once in 2 shots. When B has missed 27 times, A has killed:",
            "To fill a tank, 25 buckets of water is required. How many buckets of water will be required to fill the same tank if the capacity of the bucket is reduced to two-fifth of its present "
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"160","175","180","195"},
            {"256","432","512","None of these"},
            {"23","24","25","26"},
            {"30","31","32","33"},
            {"Rs. 30,000","Rs. 50,000","Rs. 60,000","Rs. 70,000"},
            {"30 birds","60 birds","72 birds","90 birds"},
            {"10","35","62.5","Cannot be determined"}
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



    private String mCorrectAnswers[] = {"Leaves","175","512","26","30","Rs. 60,000","30 birds","62.5"};


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
