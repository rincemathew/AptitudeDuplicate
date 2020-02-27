package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogClock {
    private String mQuestions [] = {
            "This is some test",
            "How many times are the hands of a clock at right angle in a day?",
            "The angle between the minute hand and the hour hand of a clock when the time is 8.30, is:",
            "How many times in a day, are the hands of a clock in straight line but opposite in direction?",
            "At what time between 4 and 5 o'clock will the hands of a watch point in opposite directions?",
            "How many times do the hands of a clock coincide in a day?",
            "How many times in a day, the hands of a clock are straight?",
            "A watch which gains uniformly is 2 minutes low at noon on Monday and is 4 min. 48 sec fast at 2 p.m. on the following Monday. When was it correct?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"22","24","44","48"},
            {"80°","75°","60°","105°"},
            {"20","22","24","48"},
            {"45 min. past 4","40 min. past 4","50(4/11)min. past 4","54(6/11)min. past 4"},
            {"20","21","22","24"},
            {"22","24","44","28"},
            {"2 p.m. on Tuesday","2 p.m. on Wednesday","3 p.m. on Thursday","1 p.m. on Friday"}
    };


    private String mHint [] = {
            "Leaves",
            "In 12 hours, they are at right angles 22 times.\n" +
                    " In 24 hours, they are at right angles 44 times.",
            "Angle traced by hour hand in\t17/2\thrs =\t\t((360/12)\tx\t(17/2)\t\t)°\t= 255°.\n" +
                    "Angle traced by min. hand in 30 min. =\t\t((360/60)\tx 30\t\t)°\t= 180°.\n" +
                    " Required angle = (255 - 180)° = 75°.",
            "The hands of a clock point in opposite directions (in the same straight line) 11 times in every 12 hours. (Because between 5 and 7 they point in opposite directions at 6 o'clcok only).\n" +
                    "So, in a day, the hands point in the opposite directions 22 times.",
            "At 4 o'clock, the hands of the watch are 20 min. spaces apart.\n" +
                    "To be in opposite directions, they must be 30 min. spaces apart.\n" +
                    " Minute hand will have to gain 50 min. spaces.\n" +
                    "55 min. spaces are gained in 60 min.\n" +
                    "50 min. spaces are gained in\t\t(60/55)\tx 50\tmin. or 54\t(6/11)\tmin.\n" +
                    " Required time = 54\t(6/11)\tmin. past 4.\n",
            "The hands of a clock coincide 11 times in every 12 hours (Since between 11 and 1, they coincide only once, i.e., at 12 o'clock)." +
                    "The hands overlap about every 65 minutes, not every 60 minutes.\n" +
                    " The hands coincide 22 times in a day.",
            "In 12 hours, the hands coincide or are in opposite direction 22 times.\n" +
                    " In 24 hours, the hands coincide or are in opposite direction 44 times a day.",
            "Time from 12 p.m. on Monday to 2 p.m. on the following Monday = 7 days 2 hours = 170 hours.\n" +
                    " The watch gains\t\t2 + 4\t(4/5)\tmin.\tor\t34/5\tmin. in 170 hrs.\n" +
                    "Now,\t34/5\tmin. are gained in 170 hrs.\n" +
                    " 2 min. are gained in\t\t170 x\t(5/34)\tx 2\thrs\t= 50 hrs.\n" +
                    " Watch is correct 2 days 2 hrs. after 12 p.m. on Monday i.e., it will be correct at 2 p.m. on Wednesday."

    };



    private String mCorrectAnswers[] = {"Leaves","44","75°","22","54(6/11)min. past 4","22","44","2 p.m. on Wednesday"};


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
