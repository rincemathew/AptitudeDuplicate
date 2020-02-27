package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogCalendars {
    private String mQuestions [] = {
            "This is some test",
            "The calendar for the year 2007 will be the same for the year:",
            "Which of the following is not a leap year?",
            "On 8th Dec, 2007 Saturday falls. What day of the week was it on 8th Dec, 2006?",
            "January 1, 2008 is Tuesday. What day of the week lies on Jan 1, 2009?",
            "January 1, 2007 was Monday. What day of the week lies on Jan. 1, 2008?",
            "If 6th March, 2005 is Monday, what was the day of the week on 6th March, 2004?",
            "On what dates of April, 2001 did Wednesday fall?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"2014","2016","2017","2018"},
            {"700","800","1200","2000"},
            {"Sunday","Thursday","Tuesday","Friday"},
            {"Monday","Wednesday","Thursday","Sunday"},
            {"Monday","Tuesday","Wednesday","Sunday"},
            {"Sunday","Saturday","Tuesday","Wednesday"},
            {"1st, 8th, 15th, 22nd, 29th","2nd, 9th, 16th, 23rd, 30th","3rd, 10th, 17th, 24th","4th, 11th, 18th, 25th"}
    };


    private String mHint [] = {
            "Leaves",
            "Calendar for the year 2018 will be the same as for the year 2007",
            "The century divisible by 400 is a leap year.\n" +
                    " The year 700 is not a leap year.",
            "The year 2006 is an ordinary year. So, it has 1 odd day.\n" +
                    "So, the day on 8th Dec, 2007 will be 1 day beyond the day on 8th Dec, 2006.\n" +
                    "But, 8th Dec, 2007 is Saturday.\n" +
                    " 8th Dec, 2006 is Friday.",
            "The year 2008 is a leap year. So, it has 2 odd days.\n" +
                    "1st day of the year 2008 is Tuesday (Given)\n" +
                    "So, 1st day of the year 2009 is 2 days beyond Tuesday.\n" +
                    "Hence, it will be Thursday.",
            "The year 2007 is an ordinary year. So, it has 1 odd day.\n" +
                    "1st day of the year 2007 was Monday.\n" +
                    "1st day of the year 2008 will be 1 day beyond Monday.\n" +
                    "Hence, it will be Tuesday.",
            "The year 2004 is a leap year. So, it has 2 odd days.\n" +
                    "But, Feb 2004 not included because we are calculating from March 2004 to March 2005. So it has 1 odd day only.\n" +
                    " The day on 6th March, 2005 will be 1 day beyond the day on 6th March, 2004.\n" +
                    "Given that, 6th March, 2005 is Monday.\n" +
                    " 6th March, 2004 is Sunday (1 day before to 6th March, 2005).",
            "We shall find the day on 1st April, 2001.\n" +
                    "1st April, 2001 = (2000 years + Period from 1.1.2001 to 1.4.2001)\n" +
                    "Odd days in 1600 years = 0\n" +
                    "Odd days in 400 years = 0\n" +
                    "Jan. Feb. March April\n" +
                    "(31 + 28 + 31 + 1)     = 91 days  0 odd days.\n" +
                    "Total number of odd days = (0 + 0 + 0) = 0\n" +
                    "On 1st April, 2001 it was Sunday.\n" +
                    "In April, 2001 Wednesday falls on 4th, 11th, 18th and 25th."

    };



    private String mCorrectAnswers[] = {"Leaves","2018","700","Friday","Thursday","Tuesday","Sunday","4th, 11th, 18th, 25th"};


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
