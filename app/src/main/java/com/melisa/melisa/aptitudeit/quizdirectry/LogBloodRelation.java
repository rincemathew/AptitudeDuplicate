package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogBloodRelation {
    private String mQuestions [] = {
            "This is some test",
            "Introducing a man, a woman said, \"He is the only son of the mother of my mother.\" How is the woman related to the man?",
            "Pointing to Gopi, Nalni says, \"I am the daughter of the only son of his grandfather.\" How Nalni is related to Gopi?",
            "A's son B is married with C whose sister D is married to E the brother of B. How D is related to A?",
            "Pointing to a lady a person said, \"The son of her only brother is the brother of my wife.\" How is the lady related to the person?",
            "If A $ B means A is the brother of B; B * C means B is the son of C; C @ D means C is the wife of D and A # D means A is the son of D, how C is related to A?",
            "Pointing to a girl Sandeep said, \"She is the daughter of the only sister of my father.\" How is sandeep related to the girl?",
            "Pointing to a boy in the photograph Reena said, \"He is the only son of the only child of my grandfather.\" How Reena is related to that boy?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"Mother","Sister","Niece","Maternal aunt"},
            {"Niece","Daughter","Sister","Cannot be determined"},
            {"Sister","Daughter's-in-law","Sister-in-law","Cousin"},
            {"Maternal aunt","Grandmother","Sister of father-in-law","None of these"},
            {"Maternal grandmother","Maternal aunt","Aunt","Mother"},
            {"Uncle","Cousin","Father","Grandfather"},
            {"Mother","Sister","Aunt","Cannot be determined"}
    };


    private String mHint [] = {
            "Leaves",
            "The man is the only son of the mother of the woman. Hence, the man is the maternal uncle of the woman. So, the woman is the niece of the man.",
            "Nalni is the daughter of the only son of Gopi's grandfather. Hence, it's clear that Nalni is the sister of Gopi.",
            "Since E is the brother of B\n" +
                    "Therefore, A is the father of E\n" +
                    "but D is the wife of E.\n" +
                    "Hence, D is the daughter-in-law of A.",
            "Brother of person's wife → brother-in-law of the person. Hence, the son of lady's brother is brother-in-law of the person.\n" +
                    "Therefore, the brother of the lady is the father-in-law of the person. Hence, the lady is the sister of the person's father-in-law.",
            "A $ B → A is the brother of B\n" +
                    "B * C → B is the son of C\n" +
                    "Hence, → A is the son of C\n" +
                    "C @ D → C is the wife of D\n" +
                    "Hence, → C is the mother of A.",
            "The girl is the daughter of the sister of Sandeep's father. Hence, the girl is the cousin or Sandeep is the cousin of the girl.",
            "The boy in the photograph is the only son of Reena's grandfather's only son; i.e., the boy is the only son of Reena's father.\n" +
                    "Hence, the boy is the brother of Reena or Reena is the sister of the boy."

    };



    private String mCorrectAnswers[] = {"Leaves","Niece","Sister","Daughter's-in-law","Sister of father-in-law","Mother","Cousin","Sister"};


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
