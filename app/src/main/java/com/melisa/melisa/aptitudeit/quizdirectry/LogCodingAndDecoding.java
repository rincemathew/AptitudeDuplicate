package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogCodingAndDecoding {
    private String mQuestions [] = {
            "This is some test",
            "If  PAINT is coded as 74128 and EXCEL IS CODED AS 93596 then how would you encode ACCEPT? ",
            "Find the missing terms:  FRIEND : FPIBNZ : : MENTOR : _________.",
            "Which code should be replaced in the question mark ? \n" +
                    "MILD:NKOH :: GATE : ?",
            "If Sand is coded as Brick, Brick as House, House as Temple, Temple as Palace then where do you worship?",
            "How many such pairs of letters are there in the word GUARDIAN each of which has as many letters between them in the word as in the English alphabet ?",
            "In a certain code language K is written as 11 and KEEP is written as 37. How will the word DRAFT be written in that code language?",
            "If in code of alphabet AT = 20, BAT = 40 then CAT = ?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"455978","547978","554978","735961"},
            {"MCNOQN","MCNQON","MNCNOQ","CMQNNO"},
            {"IBVJ","HCWI","KDXK","ICWA"},
            {"Palace","Temple","Brick","House"},
            {"One","Two","Three","More than three"},
            {"50","49","48","47"},
            {"34","56","40","60"}
    };


    private String mHint [] = {
            "Leaves",
            "455978",
            "MCNQON",
            "Here, letters are coded by skipping letters in alphabetical order, I.e.., M = N (no skipping) I = (j) K (letters in the bracket are one\\\\'s  skipped)L = (mn) OD = (efg) H The skipping pattern is -1, -2 and -3  Therefore , G A T E will be coded as H C W I.",
            "Palace",
            "Three",
            "K = 11 Position Number in English alphabet\n" +
                    "E= 5 and P = 16\n" +
                    "\n" +
                    "11+5+5+16 = 37\n" +
                    "There fore, DRAFT =4 + 18 + 1 + 6 + 20 = 49",
            "By considering A=1 B=2 ............ T=20 ........ Z = 26\n" +
                    "We can say that\n" +
                    "A × T = 1 × 20 = 20\n" +
                    "B × A × T = 2 × 1 × 20 = 40\n" +
                    "C × A × T = 3 × 1 × 20 = 60"

    };



    private String mCorrectAnswers[] = {"Leaves","455978","MCNQON","HCWI","Palace","Three","49","60"};


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
