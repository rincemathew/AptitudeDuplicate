package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptMensuration {
    private String mQuestions [] = {
            "This is some test",
            "Find the cube volume whose each side is 7 cm.",
            "Find the surface area of a sphere with radius 6cm",
            "Find the Diameter of a circle with radius 50cm",
            "Find the Volume of a cone with radius 10cm and height 20cm",
            "Find the Circumference of a circle with radius 25cm",
            "Find the Volume of a cylinder with radius 5cm and height 10cm",
            "Find the Area of a circle with radius 10cm"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"213","295","343","512"},
            {"210","314","452","495"},
            {"75","100","125","150"},
            {"1025","1050","1925","2093"},
            {"157","158","159","160"},
            {"157","158","159","160"},
            {"313","314","315","316"}
    };


    private String mHint [] = {
            "Leaves",
            "Side = a = 7 cm\n" +
                    "Volume = a\u00B3 \n" +
                    "= 7\u00B3\n" +
                    "= 7 x 7 x 7\n" +
                    "∴ Volume = 343 cm\u00B3",
            "Surface Area\t= 4 × π × radius\u00B2 \n" +
                    " Surface Area\t= 4 × π × 6\u00B2 \n" +
                    " Surface Area\t= 4 × π × 36\n" +
                    " Surface Area\t= 144 π\n" +
                    " Surface Area\t= 452",
            "Diameter\t= 2 × Radius\n" +
                    " Diameter\t= 2 × 50 \n" +
                    " Diameter\t= 100",
            "Volume\t=  \u2153 π × radius\u00B2 × height\n" +
                    " Volume\t= \u2153 π × 10\u00B2 × 20\n" +
                    " Volume\t= \u2153 π × 2000\n" +
                    " Volume\t= 2093",
            "Circumference\t= 2 × π × Radius\n" +
                    " Circumference\t= 2 × π × 25\n" +
                    " Circumference\t= 50 × π\n" +
                    " Circumference\t=  157",
            "Volume\t= π × radius\u00B2 × height\n" +
                    " Volume\t= π × 5\u00B2 × 10\n" +
                    " Volume\t= 50 π\n" +
                    " Volume\t= 157",
            "Area\t= π × radius\u00B2\n" +
                    " Area\t= π × 10\n" +
                    " Area\t= 3.14159... × (10 × 10)\n" +
                    " Area\t= 314"

    };



    private String mCorrectAnswers[] = {"Leaves","343","452","100","2093","157","157","314"};


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
