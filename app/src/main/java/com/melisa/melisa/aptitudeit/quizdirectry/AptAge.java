package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptAge {
    private String mQuestions [] = {
            "This is some test",
            "What is John’s present age, if after 10 years his age will be 5 times his age 5 years back.",
            "5 years ago, sister’s age was 5 times the age of her brother and the sum of present ages of sister and brother is 34 years. What will be the age of her brother after 6 years?",
            "Father is four times the age of his daughter. If after 5 years, he would be threee times of daughter’s age, then further after 5 years, how many times he would be of his daughter’s age?",
            "Ten years ago, the age of mother was three times the age of her son. After ten years, mother’s age will be twice that of his son. Find the ratio of their present ages.",
            "Rahul is 15 years elder than Rohan. If 5 years ago, Rahul was 3 times as old as Rohan, then find Rahul's present age.",
            "A man said to his son, \"I was one-third of your present age when you were born\". If the present age of the man is 48 years, find the present age of the son.",
            "Age of mother 10 years ago was 3 times the age of her son. After 10 years, mother’s age will be twice that of his son. Find the ratio of their present ages."

    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"6.2 years", "7.7 years", "8.7 years","10 years"},
            {"12 years", "13.5 years", "15 years","20 years"},
            {"1.5 times", "2 times", "2.5 times","3 times"},
            {"11 : 7", "9 : 5", "7 : 4","7 : 3"},
            {"32.5 years", "27.5 years", "25 years","24.9 years "},
            {"25.7 years", "28 years", "29.3 years","36 years"},
            {"11 : 7", "9 : 5", "7 : 4","7 : 3"}
    };


    private String mHint [] = {
            "Leaves",
            "Let John’s present age be x\n" +
                    "John’s age before 5 years = (x - 5) \n" +
                    "John’s age after 10 years = (x + 10)\n" +
                    "We are given that, John’s age after 10 years (x + 10) is 5 times his age 5 years back (x – 5)\n" +
                    "Therefore, \n" +
                    "(x + 10) = 5 (x – 5) \n" +
                    "Solving the equation, we get \n" +
                    "x + 10 = 5x – 25 \n" +
                    "4x = 35 \n" +
                    "x = 8.7 years",
            "Let present age of brother be x and sister’s age be 34 – x.\n" +
                    "5 years ago sister’s age was 5 times the age of her brother. \n" +
                    "Therefore,\n" +
                    "(34 – x) – 5 = 5 (x – 5) \n" +
                    "34 – x – 5 = 5x – 25 \n" +
                    "5x + x = 34 – 5 +25 \n" +
                    "6x = 54\n" +
                    "x = 9 \n" +
                    "Future age (after 6 yrs) = (x + 6) = (9 + 6) = 15 years",
            "Let the daughter's age be x and father's age be 4x.\n" +
                    "So as per question, 4x + 5 = 3(x + 5). So x = 10.\n" +
                    "Hence present age of daughter is 10 years and present age of father is 40 years.\n" +
                    "So after 5 + 5 = 10 years, daughter age would be 20 years and father’s age would be 50 years.\n" +
                    "Hence father would be 50/20 = 2.5 times of daughter’s age.",
            "10 years ago, age of mother was three times the age of her son. Say, the age of son was x and mother's age was 3x.\n" +
                    "At present: Mother's age is (3x + 10) and son’s age is (x + 10)\n" +
                    "After ten years: Mother's age will be (3x + 10) +10 and son’s age will be (x + 10) + 10. Given that, mother’s age is twice that of son after ten years.\n" +
                    "(3x + 10) +10 = 2 [(x + 10) + 10]\n" +
                    "(3x + 20) = 2[x + 20]\n" +
                    "Solving the equation, we get x = 20\n" +
                    "(3x + 10): (x + 10) = 70: 30 = 7: 3.",
            "Let age of Rohan be y\n" +
                    "Rahul is 15 years elder than Rohan = (y + 15). So Rahul’s age 5 years ago = (y + 15 – 5)\n" +
                    "Rohan’s age before 5 years = (y – 5) \n" +
                    "5 years ago, Rahul is 3 times as old as Rohan \n" +
                    "(y + 15 – 5) = 3 (y – 5) \n" +
                    "(y + 10) = (3y – 15) \n" +
                    "2y = 25 \n" +
                    "y = 12.5 \n" +
                    "Rohan’s age = 12.5 years\n" +
                    "Rahul’s age = (y + 15) = (12.5 + 15) = 27.5 years",
            "Present age of the son be x, he was born x years ago.\n" +
                    "The age of the man was: (48 - x).\n" +
                    "His age when the son was born should be equal to 1/3 of x.\n" +
                    "(48 - x) =1/3x \n" +
                    " x = 36",
            "Age of mother 10 years ago was 3 times the age of her son\n" +
                    "So, let age of son be x and as mother’s age is 3 times the age of her son, let it be 3x, three years ago. \n" +
                    "At present: Mother’s age will be (3x + 10) and son’s age will be (x + 10)\n" +
                    "After 10 years: Mother’s age will be (3x + 10) +10 and son’s age will be (x + 10) + 10 \n" +
                    "Mother’s age is twice that of son \n" +
                    "(3x + 10) +10 = 2 [(x + 10) + 10] \n" +
                    "(3x + 20) = 2[x + 20] \n" +
                    "Solving the equation, we get x = 20\n" +
                    "We are asked to find the present ratio.\n" +
                    "(3x + 10) : (x + 10) = 70 : 30 = 7 : 3"

    };



    private String mCorrectAnswers[] = {"Leaves", "8.7 years", "15 years", "2.5 times","7 : 3","27.5 years","36 years","7 : 3"};


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
