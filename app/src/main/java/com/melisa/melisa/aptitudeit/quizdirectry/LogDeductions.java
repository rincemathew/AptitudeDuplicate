package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogDeductions {
    private String mQuestions [] = {
            "This is some test",
            "Statements: All windows are doors. No door is wall.\n" +
                    "Conclusions:\n" +
                    "I.No window is wall.\n" +
                    "II.No wall is door.",
            "Statements: Most teachers are boys. Some boys are students.\n" +
                    "Conclusions:\n" +
                    "I.Some students are boys.\n" +
                    "II.Some teachers are students.",
            "Statements: No man is a donkey. Rahul is a man.\n" +
                    "Conclusions:\n" +
                    "I.Rahul is not a donkey.\n" +
                    "II.All men are not Rahul.",
            "Statements: Some books are pens. No pen is pencil.\n" +
                    "Conclusions:\n" +
                    "I.Some books are pencils.\n" +
                    "II.No book is pencil.",
            "Statements: All men are married. Some men are educated.\n" +
                    "Conclusions:\n" +
                    "I.Some married are educated.\n" +
                    "II.Some educated are married.",
            "Statements: All tubes are handles. All cups are handles.\n" +
                    "Conclusions:\n" +
                    "I.All cups are tubes.\n" +
                    "II.Some handles are not cups.",
            "Statements: No magazine is cap. All caps are cameras.\n" +
                    "Conclusions:\n" +
                    "I.No camera is magazine.\n" +
                    "II.Some cameras are magazines."
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"Only conclusion I follows","Only conclusion II follows","Either I or II follows","Both I and II follow"},
            {"Only conclusion I follows","Only conclusion II follows","Either I or II follows","Both I and II follow"},
            {"Only conclusion I follows","Only conclusion II follows","Either I or II follows","Both I and II follow"},
            {"Only conclusion I follows","Only conclusion II follows","Either I or II follows","Neither I nor II follows"},
            {"Only conclusion I follows","Either I or II follows","Neither I nor II follows","Both I and II follow"},
            {"Only conclusion I follows","Only conclusion II follows","Either I or II follows","Neither I nor II follows"},
            {"Only conclusion I follows","Only conclusion II follows","Either I or II follows","Neither I nor II follows"}
    };


    private String mHint [] = {
            "Leaves",
            "Since both the premises are universal and one premise is negative, the conclusion must be universal negative. Also, the conclusion should not contain the middle term. So, I follows. However, II is the converse of the second premise and thus it also holds,",
            "Since both the premises are particular, no definite conclusion follows. However, I is the converse of the second premise and thus it holds.",
            "Since on premise is negative, the conclusion must be negative. Conclusion II cannot follow as it contains the middle term. So, only I follows.",
            "As discussed above, the conclusion must be particular negative and should not contain the middle term. So, it follows that 'Some books are not pencils'. However, I and II involve only the extreme terms and form a complementary pair. Thus, either I or II follows.",
            "Since one premise is particular, the conclusion must be particular and should not contain the middle term. So, I follows. II is the converse of I and thus it also holds.",
            "Both the premises are A type propositions. So, in either, the middle term 'handles' forming the predicate is not distributed. Since the middle term is not distributed even once in the premises, no definite conclusion follows",
            "As discussed above, the conclusion must be particular negative and should not contain the middle term. So, it follows that 'Some cameras are not magazines'. However, I and II involve only the extreme terms and form a complementary pair. Thus, either I or II follows."

    };



    private String mCorrectAnswers[] = {"Leaves","Both I and II follow","Only conclusion I follows","Only conclusion I follows","Either I or II follows","Both I and II follow","Neither I nor II follows","Either I or II follows"};


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
