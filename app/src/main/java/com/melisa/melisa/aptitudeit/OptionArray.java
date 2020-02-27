package com.melisa.melisa.aptitudeit;

import java.util.ArrayList;
import java.util.List;

public class OptionArray {

    private int questionNumber;
    private List<String> optionArray=new ArrayList<>();

    public OptionArray(int questionNumber)
    {
        this.questionNumber=questionNumber;

        if (questionNumber==0)
        {
            optionArray.add("6.2 years");
            optionArray.add("7.7 years");
            optionArray.add("8.7 years");
            optionArray.add("10 years");
        }
        else if (questionNumber==1)
        {
            optionArray.add("32.5 years");
            optionArray.add("27.5 years");
            optionArray.add("25 years");
            optionArray.add("24.9 years ");
        }
        else if (questionNumber==2)
        {
            optionArray.add("25 years");
            optionArray.add("26 years");
            optionArray.add("31 years");
            optionArray.add("35 years");
        }
        else if (questionNumber==3)
        {
            optionArray.add("11 : 7");
            optionArray.add("9 : 5");
            optionArray.add("7 : 4");
            optionArray.add("7 : 3");
        }
        else if (questionNumber==4)
        {
            optionArray.add("12 years");
            optionArray.add("13.5 years");
            optionArray.add("15 years");
            optionArray.add("20 years");
        }
        else if (questionNumber==5)
        {
            optionArray.add("10 years");
            optionArray.add("15 years");
            optionArray.add("20 years");
            optionArray.add("25 years");
        }
        else if (questionNumber==6)
        {
            optionArray.add("1 : 3");
            optionArray.add("3 : 1");
            optionArray.add("4 : 3");
            optionArray.add("3 : 4");
        }
        else if (questionNumber==7)
        {
            optionArray.add("1 (½) times");
            optionArray.add("2 times");
            optionArray.add("2.5 times");
            optionArray.add("3 times");
        }
        else if (questionNumber==8)
        {
            optionArray.add("1.5 times");
            optionArray.add("2 times");
            optionArray.add("2.5 times");
            optionArray.add("3 times");
        }
        else if (questionNumber==9)
        {
            optionArray.add("11 : 7");
            optionArray.add("9 : 5");
            optionArray.add("7 : 4");
            optionArray.add("7 : 3");
        }
        else if (questionNumber==10)
        {
            optionArray.add("25.7 years");
            optionArray.add("28 years");
            optionArray.add("29.3 years");
            optionArray.add("36 years");
        }
        else if (questionNumber==11)
        {
            optionArray.add("6.2 years");
            optionArray.add("7.7 years");
            optionArray.add("13.3 years");
            optionArray.add("10 years");
        }
        else if (questionNumber==12)
        {
            optionArray.add("32.5 years");
            optionArray.add("27.5 years");
            optionArray.add("25 years");
            optionArray.add("24.9 years");
        }
        else if (questionNumber==13)
        {
            optionArray.add("5 years");
            optionArray.add("25 years");
            optionArray.add("10 years");
            optionArray.add("15 years");
        }
        else if (questionNumber==14)
        {
            optionArray.add("20 years");
            optionArray.add("30 years");
            optionArray.add("40 years");
            optionArray.add("25 years");
        }
        else if (questionNumber==15)
        {
            optionArray.add("40, 50");
            optionArray.add("18, 25");
            optionArray.add("40, 60");
            optionArray.add("20, 25");
        }
        else if (questionNumber==16)
        {
            optionArray.add("36 years");
            optionArray.add("23years");
            optionArray.add("29 years");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==17)
        {
            optionArray.add("1 : 3");
            optionArray.add("3 : 1");
            optionArray.add("4 : 3");
            optionArray.add("3 : 4");
        }
        else if (questionNumber==18)
        {
            optionArray.add("2 times");
            optionArray.add("2(1/2) times");
            optionArray.add("2(1/4) times");
            optionArray.add("3 times");
        }
        else if (questionNumber==19)
        {
            optionArray.add("4 years");
            optionArray.add("5 years");
            optionArray.add("8 years");
            optionArray.add("10 years");
        }
        else if (questionNumber==20)
        {
            optionArray.add("14 years");
            optionArray.add("19 years");
            optionArray.add("33 years");
            optionArray.add("38 years");
        }
        else if (questionNumber==21)
        {
            optionArray.add("8");
            optionArray.add("9");
            optionArray.add("11");
            optionArray.add("10");
        }
        else if (questionNumber==22)
        {
            optionArray.add("24");
            optionArray.add("32");
            optionArray.add("40");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==23)
        {
            optionArray.add("14 years");
            optionArray.add("18 years");
            optionArray.add("20 years");
            optionArray.add("22 years");
        }
        else if (questionNumber==24)
        {
            optionArray.add("14 years");
            optionArray.add("16 years");
            optionArray.add("17 years");
            optionArray.add("18 years");
        }
        else if (questionNumber==25)
        {
            optionArray.add("14 years");
            optionArray.add("16 years");
            optionArray.add("18 years");
            optionArray.add("20 years");
        }
        else if (questionNumber==26)
        {
            optionArray.add("17 years");
            optionArray.add("14 years");
            optionArray.add("15 years");
            optionArray.add("19 years");
        }
        else if (questionNumber==27)
        {
            optionArray.add("25 years");
            optionArray.add("23.5 years");
            optionArray.add("24 years");
            optionArray.add("24.5 years");
        }
        else if (questionNumber==28)
        {
            optionArray.add("8, 20, 28");
            optionArray.add("16, 28, 36");
            optionArray.add("20, 35, 45");
            optionArray.add("None of these");
        }
        else if (questionNumber==29)
        {
            optionArray.add("2 years");
            optionArray.add("4 years");
            optionArray.add("6 years");
            optionArray.add("8 years");
        }
        else if (questionNumber==30)
        {
            optionArray.add("30 years");
            optionArray.add("34 years");
            optionArray.add("40 years");
            optionArray.add("48 years");
        }
        else if (questionNumber==31)
        {
            optionArray.add("5 : 2");
            optionArray.add("7 : 3");
            optionArray.add("9 : 2");
            optionArray.add("13 : 4");
        }
        else if (questionNumber==32)
        {
            optionArray.add("6.25");
            optionArray.add("6.5");
            optionArray.add("6.75");
            optionArray.add("7");
        }
        else if (questionNumber==33)
        {
            optionArray.add("4991");
            optionArray.add("5991");
            optionArray.add("6001");
            optionArray.add("6991");
        }
        else if (questionNumber==34)
        {
            optionArray.add("0");
            optionArray.add("1");
            optionArray.add("10");
            optionArray.add("19");
        }
        else if (questionNumber==35)
        {
            optionArray.add("65 kg");
            optionArray.add("75 kg");
            optionArray.add("76 kg");
            optionArray.add("85 kg");
        }
        else if (questionNumber==36)
        {
            optionArray.add("23 years");
            optionArray.add("24 years");
            optionArray.add("25 years");
            optionArray.add("None of these");
        }
        else if (questionNumber==37)
        {
            optionArray.add("3000");
            optionArray.add("3050");
            optionArray.add("4000");
            optionArray.add("4050");
        }
        else if (questionNumber==38)
        {
            optionArray.add("30 years");
            optionArray.add("40 years");
            optionArray.add("50 years");
            optionArray.add("None of these");
        }
        else if (questionNumber==39)
        {
            optionArray.add("7.98");
            optionArray.add("8");
            optionArray.add("8.50");
            optionArray.add("9");
        }
        else if (questionNumber==40)
        {
            optionArray.add("67 kg");
            optionArray.add("68 kg");
            optionArray.add("69 kg");
            optionArray.add("None of these");
        }
        else if (questionNumber==41)
        {
            optionArray.add("24 kg");
            optionArray.add("26 kg");
            optionArray.add("30 kg");
            optionArray.add("31 kg");
        }
        else if (questionNumber==42)
        {
            optionArray.add("47.55 kg");
            optionArray.add("48 kg");
            optionArray.add("48.55 kg");
            optionArray.add("49.25 kg");
        }
        else if (questionNumber==43)
        {
            optionArray.add("250");
            optionArray.add("276");
            optionArray.add("280");
            optionArray.add("285");
        }
        else if (questionNumber==44)
        {
            optionArray.add("52.45");
            optionArray.add("53.33");
            optionArray.add("54.68");
            optionArray.add("None of these");
        }
        else if (questionNumber==45)
        {
            optionArray.add("10");
            optionArray.add("65");
            optionArray.add("37");
            optionArray.add("40");
        }
        else if (questionNumber==46)
        {
            optionArray.add("2 hours");
            optionArray.add("3 hours");
            optionArray.add("4 hours");
            optionArray.add("5 hours");
        }
        else if (questionNumber==47)
        {
            optionArray.add("8 km/hr");
            optionArray.add("8.5 km/hr");
            optionArray.add("10 km/hr");
            optionArray.add("12.5 km/hr");
        }
        else if (questionNumber==48)
        {
            optionArray.add("2 : 1");
            optionArray.add("3 : 2");
            optionArray.add("8 : 3");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==49)
        {
            optionArray.add("4");
            optionArray.add("5");
            optionArray.add("6");
            optionArray.add("10");
        }
        else if (questionNumber==50)
        {
            optionArray.add("3 km/hr");
            optionArray.add("4 km/hr");
            optionArray.add("8 km/hr");
            optionArray.add("9 km/hr");
        }
        else if (questionNumber==51)
        {
            optionArray.add("4 km/hr");
            optionArray.add("6 km/hr");
            optionArray.add("7 km/hr");
            optionArray.add("8 km/hr");
        }
        else if (questionNumber==52)
        {
            optionArray.add("1.2 km");
            optionArray.add("1.8 km");
            optionArray.add("2.4 km");
            optionArray.add("3.6 km");
        }
        else if (questionNumber==53)
        {
            optionArray.add("2 mph");
            optionArray.add("2.5 mph");
            optionArray.add("3 mph");
            optionArray.add("4 mph");
        }
        else if (questionNumber==54)
        {
            optionArray.add("2.4 km");
            optionArray.add("2.5 km");
            optionArray.add("3 km");
            optionArray.add("3.6 km");
        }
        else if (questionNumber==55)
        {
            optionArray.add("12 kmph");
            optionArray.add("13 kmph");
            optionArray.add("14 kmph");
            optionArray.add("15 kmph");
        }
        else if (questionNumber==56)
        {
            optionArray.add("40 minutes");
            optionArray.add("1 hour");
            optionArray.add("1 hr 15 min");
            optionArray.add("1 hr 30 min");
        }
        else if (questionNumber==57)
        {
            optionArray.add("16 hours");
            optionArray.add("18 hours");
            optionArray.add("20 hours");
            optionArray.add("24 hours");
        }
        else if (questionNumber==58)
        {
            optionArray.add("2 : 1");
            optionArray.add("3 : 1");
            optionArray.add("3 : 2");
            optionArray.add("4 : 3");
        }
        else if (questionNumber==59)
        {
            optionArray.add("1 km/hr");
            optionArray.add("1.5 km/hr");
            optionArray.add("2 km/hr");
            optionArray.add("2.5 km/hr");
        }
        else if (questionNumber==60)
        {
            optionArray.add("564");
            optionArray.add("645");
            optionArray.add("735");
            optionArray.add("756");
        }
        else if (questionNumber==61)
        {
            optionArray.add("360");
            optionArray.add("480");
            optionArray.add("720");
            optionArray.add("5040");
        }
        else if (questionNumber==62)
        {
            optionArray.add("810");
            optionArray.add("1440");
            optionArray.add("2880");
            optionArray.add("50400");
        }
        else if (questionNumber==63)
        {
            optionArray.add("210");
            optionArray.add("1050");
            optionArray.add("25200");
            optionArray.add("21400");
        }
        else if (questionNumber==64)
        {
            optionArray.add("72");
            optionArray.add("144");
            optionArray.add("360");
            optionArray.add("720");
        }
        else if (questionNumber==65)
        {
            optionArray.add("159");
            optionArray.add("194");
            optionArray.add("205");
            optionArray.add("209");
        }
        else if (questionNumber==66)
        {
            optionArray.add("5");
            optionArray.add("10");
            optionArray.add("15");
            optionArray.add("20");
        }
        else if (questionNumber==67)
        {
            optionArray.add("266");
            optionArray.add("5040");
            optionArray.add("11760");
            optionArray.add("86400");
        }
        else if (questionNumber==68)
        {
            optionArray.add("32");
            optionArray.add("48");
            optionArray.add("64");
            optionArray.add("96");
        }
        else if (questionNumber==69)
        {
            optionArray.add("32");
            optionArray.add("48");
            optionArray.add("36");
            optionArray.add("60");
        }
        else if (questionNumber==70)
        {
            optionArray.add("63");
            optionArray.add("90");
            optionArray.add("126");
            optionArray.add("135");
        }
        else if (questionNumber==71)
        {
            optionArray.add("40");
            optionArray.add("400");
            optionArray.add("5040");
            optionArray.add("2520");
        }
        else if (questionNumber==72)
        {
            optionArray.add("10080");
            optionArray.add("4989600");
            optionArray.add("120960");
            optionArray.add("None of these");
        }
        else if (questionNumber==73)
        {
            optionArray.add("120");
            optionArray.add("4320");
            optionArray.add("720");
            optionArray.add("None of these");
        }
        else if (questionNumber==74)
        {
            optionArray.add("119");
            optionArray.add("120");
            optionArray.add("121");
            optionArray.add("122");
        }
        else if (questionNumber==75)
        {
            optionArray.add("625");
            optionArray.add("630");
            optionArray.add("635");
            optionArray.add("640");
        }
        else if (questionNumber==76)
        {
            optionArray.add("Rs. 2160");
            optionArray.add("Rs. 3120");
            optionArray.add("Rs. 3972");
            optionArray.add("Rs. 6340");
        }
        else if (questionNumber==77)
        {
            optionArray.add("2");
            optionArray.add("3");
            optionArray.add("2(1/2)");
            optionArray.add("4");
        }
        else if (questionNumber==78)
        {
            optionArray.add("Rs. 1000.30");
            optionArray.add("Rs. 9720");
            optionArray.add("Rs. 10123.20");
            optionArray.add("Rs. 10483.20");
        }
        else if (questionNumber==79)
        {
            optionArray.add("6%");
            optionArray.add("6.5%");
            optionArray.add("7%");
            optionArray.add("7.5%");
        }
        else if (questionNumber==80)
        {
            optionArray.add("3");
            optionArray.add("4");
            optionArray.add("5");
            optionArray.add("6");
        }
        else if (questionNumber==81)
        {
            optionArray.add("Rs. 8600");
            optionArray.add("Rs. 8620");
            optionArray.add("Rs. 8820");
            optionArray.add("None of these");
        }
        else if (questionNumber==82)
        {
            optionArray.add("6.06%");
            optionArray.add("6.07%");
            optionArray.add("6.08%");
            optionArray.add("6.09%");
        }
        else if (questionNumber==83)
        {
            optionArray.add("Rs. 1550");
            optionArray.add("Rs. 1650");
            optionArray.add("Rs. 1750");
            optionArray.add("Rs. 1850");
        }
        else if (questionNumber==84)
        {
            optionArray.add("Rs. 51.25");
            optionArray.add("Rs. 52");
            optionArray.add("Rs. 54.25");
            optionArray.add("Rs. 56.30");
        }
        else if (questionNumber==85)
        {
            optionArray.add("Rs. 2.50");
            optionArray.add("Rs. 3");
            optionArray.add("Rs. 3.75");
            optionArray.add("Rs. 4");
        }
        else if (questionNumber==86)
        {
            optionArray.add("8");
            optionArray.add("10");
            optionArray.add("12");
            optionArray.add("14");
        }
        else if (questionNumber==87)
        {
            optionArray.add("Rs. 400");
            optionArray.add("Rs. 500");
            optionArray.add("Rs. 600");
            optionArray.add("Rs. 700");
        }
        else if (questionNumber==88)
        {
            optionArray.add("4");
            optionArray.add("6");
            optionArray.add("8");
            optionArray.add("9");
        }
        else if (questionNumber==89)
        {
            optionArray.add("276");
            optionArray.add("299");
            optionArray.add("322");
            optionArray.add("345");
        }
        else if (questionNumber==90)
        {
            optionArray.add("4");
            optionArray.add("10");
            optionArray.add("15");
            optionArray.add("16");
        }
        else if (questionNumber==91)
        {
            optionArray.add("4");
            optionArray.add("5");
            optionArray.add("6");
            optionArray.add("8");
        }
        else if (questionNumber==92)
        {
            optionArray.add("9000");
            optionArray.add("9400");
            optionArray.add("9600");
            optionArray.add("9800");
        }
        else if (questionNumber==93)
        {
            optionArray.add("101");
            optionArray.add("107");
            optionArray.add("111");
            optionArray.add("186");
        }
        else if (questionNumber==94)
        {
            optionArray.add("40");
            optionArray.add("80");
            optionArray.add("120");
            optionArray.add("200");
        }
        else if (questionNumber==95)
        {
            optionArray.add("0.03");
            optionArray.add("0.9");
            optionArray.add("0.18");
            optionArray.add("0.108");
        }
        else if (questionNumber==96)
        {
            optionArray.add("1");
            optionArray.add("2");
            optionArray.add("3");
            optionArray.add("4");
        }
        else if (questionNumber==97)
        {
            optionArray.add("74");
            optionArray.add("94");
            optionArray.add("184");
            optionArray.add("364");
        }
        else if (questionNumber==98)
        {
            optionArray.add("120");
            optionArray.add("240");
            optionArray.add("360");
            optionArray.add("480");
        }
        else if (questionNumber==99)
        {
            optionArray.add("3");
            optionArray.add("23");
            optionArray.add("13");
            optionArray.add("33");
        }
        else if (questionNumber==100)
        {
            optionArray.add("1677");
            optionArray.add("1683");
            optionArray.add("2523");
            optionArray.add("3363");
        }
        else if (questionNumber==101)
        {
            optionArray.add("26 minutes and 18 seconds");
            optionArray.add("42 minutes and 36 seconds");
            optionArray.add("45 minutes");
            optionArray.add("46 minutes and 12 seconds");
        }
        else if (questionNumber==102)
        {
            optionArray.add("279");
            optionArray.add("283");
            optionArray.add("308");
            optionArray.add("318");
        }
        else if (questionNumber==103)
        {
            optionArray.add("196");
            optionArray.add("630");
            optionArray.add("1260");
            optionArray.add("2520");
        }
        else if (questionNumber==104)
        {
            optionArray.add("12");
            optionArray.add("16");
            optionArray.add("24");
            optionArray.add("48");
        }
        else if (questionNumber==105)
        {
            optionArray.add("1008");
            optionArray.add("1015");
            optionArray.add("1022");
            optionArray.add("1032");
        }
        else if (questionNumber==106)
        {
            optionArray.add("2 x 2 x 3 x 3 x 7");
            optionArray.add("2 x 2 x 2 x 3 x 7");
            optionArray.add("3 x 3 x 3 x 3 x 7");
            optionArray.add("2 x 3 x 3 x 3 x 7");
        }
        else if (questionNumber==107)
        {
            optionArray.add("15 cm");
            optionArray.add("25 cm");
            optionArray.add("35 cm");
            optionArray.add("42 cm");
        }
        else if (questionNumber==108)
        {
            optionArray.add("75");
            optionArray.add("81");
            optionArray.add("85");
            optionArray.add("89");
        }
        else if (questionNumber==109)
        {
            optionArray.add("4");
            optionArray.add("6");
            optionArray.add("12");
            optionArray.add("18");
        }
        else if (questionNumber==110)
        {
            optionArray.add("504");
            optionArray.add("536");
            optionArray.add("544");
            optionArray.add("548");
        }
        else if (questionNumber==111)
        {
            optionArray.add("123");
            optionArray.add("127");
            optionArray.add("235");
            optionArray.add("305");
        }
        else if (questionNumber==112)
        {
            optionArray.add("99");
            optionArray.add("101");
            optionArray.add("176");
            optionArray.add("182");
        }
        else if (questionNumber==113)
        {
            optionArray.add("28");
            optionArray.add("32");
            optionArray.add("40");
            optionArray.add("64");
        }
        else if (questionNumber==114)
        {
            optionArray.add("Rs. 1425");
            optionArray.add("Rs. 1500");
            optionArray.add("Rs. 1537.50");
            optionArray.add("Rs. 1576");
        }
        else if (questionNumber==115)
        {
            optionArray.add("Rs. 1900");
            optionArray.add("Rs. 2660");
            optionArray.add("Rs. 2800");
            optionArray.add("Rs. 2840");
        }
        else if (questionNumber==116)
        {
            optionArray.add("Rs. 8400");
            optionArray.add("Rs. 11,900");
            optionArray.add("Rs. 13,600");
            optionArray.add("Rs. 14,700");
        }
        else if (questionNumber==117)
        {
            optionArray.add("5 : 7 : 8");
            optionArray.add("20 : 49 : 64");
            optionArray.add("38 : 28 : 21");
            optionArray.add("None of these");
        }
        else if (questionNumber==118)
        {
            optionArray.add("Rs. 7500");
            optionArray.add("Rs. 8000");
            optionArray.add("Rs. 8500");
            optionArray.add("Rs. 9000");
        }
        else if (questionNumber==119)
        {
            optionArray.add("3 : 5 : 2");
            optionArray.add("3 : 5 : 5");
            optionArray.add("6 : 10 : 5");
            optionArray.add("Data inadequate");
        }
        else if (questionNumber==120)
        {
            optionArray.add("Rs. 45");
            optionArray.add("Rs. 50");
            optionArray.add("Rs. 55");
            optionArray.add("Rs. 60");
        }
        else if (questionNumber==121)
        {
            optionArray.add("Rs. 7500");
            optionArray.add("Rs. 9000");
            optionArray.add("Rs. 9500");
            optionArray.add("Rs. 10,000");
        }
        else if (questionNumber==122)
        {
            optionArray.add("4 months");
            optionArray.add("5 months");
            optionArray.add("6 months");
            optionArray.add("8 months");
        }
        else if (questionNumber==123)
        {
            optionArray.add("7 : 6 : 10");
            optionArray.add("12 : 15 : 16");
            optionArray.add("42 : 45 : 56");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==124)
        {
            optionArray.add("Rs. 890");
            optionArray.add("Rs. 1335");
            optionArray.add("Rs. 1602");
            optionArray.add("Rs. 1780");
        }
        else if (questionNumber==125)
        {
            optionArray.add("Rs. 9,423");
            optionArray.add("Rs. 10,250");
            optionArray.add("Rs. 12,500");
            optionArray.add("Rs. 10,500");
        }
        else if (questionNumber==126)
        {
            optionArray.add("39, 30");
            optionArray.add("41, 32");
            optionArray.add("42, 33");
            optionArray.add("43, 34");
        }
        else if (questionNumber==127)
        {
            optionArray.add("588 apples");
            optionArray.add("600 apples");
            optionArray.add("672 apples");
            optionArray.add("700 apples");
        }
        else if (questionNumber==128)
        {
            optionArray.add("1");
            optionArray.add("14");
            optionArray.add("20");
            optionArray.add("21");
        }
        else if (questionNumber==129)
        {
            optionArray.add("A equals to B");
            optionArray.add("A is smaller than B.");
            optionArray.add("A is greater than B");
            optionArray.add("None of these");
        }
        else if (questionNumber==130)
        {
            optionArray.add("4% of a");
            optionArray.add("5% of a");
            optionArray.add("20% of a");
            optionArray.add("None of these");
        }
        else if (questionNumber==131)
        {
            optionArray.add("2 : 3");
            optionArray.add("1 : 1");
            optionArray.add("3 : 4");
            optionArray.add("4 : 3");
        }
        else if (questionNumber==132)
        {
            optionArray.add("2700");
            optionArray.add("2900");
            optionArray.add("3000");
            optionArray.add("3100");
        }
        else if (questionNumber==133)
        {
            optionArray.add("57%");
            optionArray.add("60%");
            optionArray.add("65%");
            optionArray.add("90%");
        }
        else if (questionNumber==134)
        {
            optionArray.add("Rs. 200");
            optionArray.add("Rs. 250");
            optionArray.add("Rs. 300");
            optionArray.add("None of these");
        }
        else if (questionNumber==135)
        {
            optionArray.add("Rs. 15");
            optionArray.add("Rs. 15.70");
            optionArray.add("Rs. 19.70");
            optionArray.add("Rs. 20");
        }
        else if (questionNumber==136)
        {
            optionArray.add("Rs. 6876.10");
            optionArray.add("Rs. 6999.20");
            optionArray.add("Rs. 6654");
            optionArray.add("Rs. 7000");
        }
        else if (questionNumber==137)
        {
            optionArray.add("4.37%");
            optionArray.add("5%");
            optionArray.add("6%");
            optionArray.add("8.75%");
        }
        else if (questionNumber==138)
        {
            optionArray.add("4\u2153 hour");
            optionArray.add("7 hours");
            optionArray.add("8 hours");
            optionArray.add("14 hours");
        }
        else if (questionNumber==139)
        {
            optionArray.add("5 min");
            optionArray.add("9 min");
            optionArray.add("10 min");
            optionArray.add("15 min");
        }
        else if (questionNumber==140)
        {
            optionArray.add("6 hours");
            optionArray.add("10 hours");
            optionArray.add("15 hours");
            optionArray.add("30 hours");
        }
        else if (questionNumber==141)
        {
            optionArray.add("60 gallons");
            optionArray.add("100 gallons");
            optionArray.add("120 gallons");
            optionArray.add("180 gallons");
        }
        else if (questionNumber==142)
        {
            optionArray.add("20 hours");
            optionArray.add("25 hours");
            optionArray.add("35 hours");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==143)
        {
            optionArray.add("1 hour");
            optionArray.add("2 hours");
            optionArray.add("6 hours");
            optionArray.add("8 hours");
        }
        else if (questionNumber==144)
        {
            optionArray.add("12 min");
            optionArray.add("15 min");
            optionArray.add("25 min");
            optionArray.add("50 min");
        }
        else if (questionNumber==145)
        {
            optionArray.add("10 min. 20 sec");
            optionArray.add("11 min. 45 sec");
            optionArray.add("12 min. 30 sec");
            optionArray.add("14 min. 40 sec");
        }
        else if (questionNumber==146)
        {
            optionArray.add("81 min");
            optionArray.add("108 min");
            optionArray.add("144 min");
            optionArray.add("192 min");
        }
        else if (questionNumber==147)
        {
            optionArray.add("15 min");
            optionArray.add("20 min");
            optionArray.add("27.5 min");
            optionArray.add("30 min");
        }
        else if (questionNumber==148)
        {
            optionArray.add("3 hrs 15 min");
            optionArray.add("3 hrs 45 min");
            optionArray.add("4 hrs");
            optionArray.add("4 hrs 15 min");
        }
        else if (questionNumber==149)
        {
            optionArray.add("6\u2154 hours");
            optionArray.add("6 hours");
            optionArray.add("7 hours");
            optionArray.add("7\u00BD hours");
        }
        else if (questionNumber==150)
        {
            optionArray.add("10");
            optionArray.add("12");
            optionArray.add("14");
            optionArray.add("16");
        }
        else if (questionNumber==151)
        {
            optionArray.add("15");
            optionArray.add("16");
            optionArray.add("18");
            optionArray.add("25");
        }
        else if (questionNumber==152)
        {
            optionArray.add("66\u2154");
            optionArray.add("100");
            optionArray.add("105\u2153");
            optionArray.add("120");
        }
        else if (questionNumber==153)
        {
            optionArray.add("30%");
            optionArray.add("70%");
            optionArray.add("100%");
            optionArray.add("250%");
        }
        else if (questionNumber==154)
        {
            optionArray.add("3");
            optionArray.add("4");
            optionArray.add("5");
            optionArray.add("6");
        }
        else if (questionNumber==155)
        {
            optionArray.add("Rs. 2000");
            optionArray.add("Rs. 2200");
            optionArray.add("Rs. 2400");
            optionArray.add("Data inadequate");
        }
        else if (questionNumber==156)
        {
            optionArray.add("Rs. 18.20");
            optionArray.add("Rs. 70");
            optionArray.add("Rs. 72");
            optionArray.add("Rs. 88.25");
        }
        else if (questionNumber==157)
        {
            optionArray.add("Rs. 1090");
            optionArray.add("Rs. 1160");
            optionArray.add("Rs. 1190");
            optionArray.add("Rs. 1202");
        }
        else if (questionNumber==158)
        {
            optionArray.add("3.5");
            optionArray.add("4.5");
            optionArray.add("5.6");
            optionArray.add("6.5");
        }
        else if (questionNumber==159)
        {
            optionArray.add("30%");
            optionArray.add("33\u2153%");
            optionArray.add("35%");
            optionArray.add("44%");
        }
        else if (questionNumber==160)
        {
            optionArray.add("Rs. 45");
            optionArray.add("Rs. 50");
            optionArray.add("Rs. 55");
            optionArray.add("Rs. 60");
        }
        else if (questionNumber==161)
        {
            optionArray.add("Rs. 21,000");
            optionArray.add("Rs. 22,500");
            optionArray.add("Rs. 25,300");
            optionArray.add("Rs. 25,800");
        }
        else if (questionNumber==162)
        {
            optionArray.add("No profit, no loss");
            optionArray.add("5%");
            optionArray.add("8%");
            optionArray.add("10%");
        }
        else if (questionNumber==163)
        {
            optionArray.add("2 : 5");
            optionArray.add("3 : 5");
            optionArray.add("4 : 5");
            optionArray.add("6 : 7");
        }
        else if (questionNumber==164)
        {
            optionArray.add("Rs. 500");
            optionArray.add("Rs. 1500");
            optionArray.add("Rs. 2000");
            optionArray.add("None of these");
        }
        else if (questionNumber==165)
        {
            optionArray.add("2 : 3 : 4");
            optionArray.add("6 : 7 : 8");
            optionArray.add("6 : 8 : 9");
            optionArray.add("None of these");
        }
        else if (questionNumber==166)
        {
            optionArray.add("20 litres");
            optionArray.add("30 litres");
            optionArray.add("40 litres");
            optionArray.add("60 litres");
        }
        else if (questionNumber==167)
        {
            optionArray.add("8 : 9");
            optionArray.add("17 : 18");
            optionArray.add("21 : 22");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==168)
        {
            optionArray.add("Rs. 17,000");
            optionArray.add("Rs. 20,000");
            optionArray.add("Rs. 25,500");
            optionArray.add("Rs. 38,000");
        }
        else if (questionNumber==169)
        {
            optionArray.add("1.12");
            optionArray.add("1.2");
            optionArray.add("1.25");
            optionArray.add("1.30");
        }
        else if (questionNumber==170)
        {
            optionArray.add("20");
            optionArray.add("30");
            optionArray.add("48");
            optionArray.add("58");
        }
        else if (questionNumber==171)
        {
            optionArray.add("Rs. 182");
            optionArray.add("Rs. 190");
            optionArray.add("Rs. 196");
            optionArray.add("Rs. 204");
        }
        else if (questionNumber==172)
        {
            optionArray.add("3 : 3 : 10");
            optionArray.add("10 : 11 : 20");
            optionArray.add("23 : 33 : 60");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==173)
        {
            optionArray.add("2 : 5");
            optionArray.add("3 : 7");
            optionArray.add("5 : 3");
            optionArray.add("7 : 3");
        }
        else if (questionNumber==174)
        {
            optionArray.add("18");
            optionArray.add("24");
            optionArray.add("19");
            optionArray.add("20");
        }
        else if (questionNumber==175)
        {
            optionArray.add("27");
            optionArray.add("33");
            optionArray.add("49");
            optionArray.add("55");
        }
        else if (questionNumber==176)
        {
            optionArray.add("50");
            optionArray.add("100");
            optionArray.add("150");
            optionArray.add("200");
        }
        else if (questionNumber==177)
        {
            optionArray.add("Rs. 650");
            optionArray.add("Rs. 690");
            optionArray.add("Rs. 698");
            optionArray.add("Rs. 700");
        }
        else if (questionNumber==178)
        {
            optionArray.add("Rs. 6400");
            optionArray.add("Rs. 6500");
            optionArray.add("Rs. 7200");
            optionArray.add("Rs. 7500");
        }
        else if (questionNumber==179)
        {
            optionArray.add("Rs. 4462.50");
            optionArray.add("Rs. 8032.50");
            optionArray.add("Rs. 8900");
            optionArray.add("Rs. 8925");
        }
        else if (questionNumber==180)
        {
            optionArray.add("3.5 years");
            optionArray.add("4 years");
            optionArray.add("4.5 years");
            optionArray.add("5 years");
        }
        else if (questionNumber==181)
        {
            optionArray.add("3.6");
            optionArray.add("6");
            optionArray.add("18");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==182)
        {
            optionArray.add("3%");
            optionArray.add("4%");
            optionArray.add("5%");
            optionArray.add("6%");
        }
        else if (questionNumber==183)
        {
            optionArray.add("10%");
            optionArray.add("10.25%");
            optionArray.add("10.5%");
            optionArray.add("None of these");
        }
        else if (questionNumber==184)
        {
            optionArray.add("4.5%");
            optionArray.add("5%");
            optionArray.add("6%");
            optionArray.add("None of these");
        }
        else if (questionNumber==185)
        {
            optionArray.add("Rs. 2000");
            optionArray.add("Rs. 10,000");
            optionArray.add("Rs. 15,000");
            optionArray.add("Rs. 20,000");
        }
        else if (questionNumber==186)
        {
            optionArray.add("5%");
            optionArray.add("8%");
            optionArray.add("12%");
            optionArray.add("15%");
        }
        else if (questionNumber==187)
        {
            optionArray.add("1 : 3");
            optionArray.add("1 : 4");
            optionArray.add("2 : 3");
            optionArray.add("None of these");
        }
        else if (questionNumber==188)
        {
            optionArray.add("Rs. 35");
            optionArray.add("Rs. 245");
            optionArray.add("Rs. 350");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==189)
        {
            optionArray.add("Rs. 112.50");
            optionArray.add("Rs. 125");
            optionArray.add("Rs. 225");
            optionArray.add("Rs. 167.50");
        }
        else if (questionNumber==190)
        {
            optionArray.add("45");
            optionArray.add("60");
            optionArray.add("75");
            optionArray.add("90");
        }
        else if (questionNumber==191)
        {
            optionArray.add("20");
            optionArray.add("80");
            optionArray.add("100");
            optionArray.add("200");
        }
        else if (questionNumber==192)
        {
            optionArray.add("Rs. 3500");
            optionArray.add("Rs. 3750");
            optionArray.add("Rs. 3840");
            optionArray.add("Rs. 3900");
        }
        else if (questionNumber==193)
        {
            optionArray.add("10");
            optionArray.add("12");
            optionArray.add("15");
            optionArray.add("18");
        }
        else if (questionNumber==194)
        {
            optionArray.add("Rs. 1200");
            optionArray.add("Rs. 2400");
            optionArray.add("Rs. 4800");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==195)
        {
            optionArray.add("Rs. 120");
            optionArray.add("Rs. 160");
            optionArray.add("Rs. 240");
            optionArray.add("Rs. 300");
        }
        else if (questionNumber==196)
        {
            optionArray.add("Rs. 30,000");
            optionArray.add("Rs. 50,000");
            optionArray.add("Rs. 60,000");
            optionArray.add("Rs. 90,000");
        }
        else if (questionNumber==197)
        {
            optionArray.add("30 birds");
            optionArray.add("60 birds");
            optionArray.add("72 birds");
            optionArray.add("90 birds");
        }
        else if (questionNumber==198)
        {
            optionArray.add("10");
            optionArray.add("35");
            optionArray.add("62.5");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==199)
        {
            optionArray.add("160");
            optionArray.add("175");
            optionArray.add("180");
            optionArray.add("195");
        }
        else if (questionNumber==200)
        {
            optionArray.add("256");
            optionArray.add("432");
            optionArray.add("512");
            optionArray.add("640");
        }
        else if (questionNumber==201)
        {
            optionArray.add("22");
            optionArray.add("23");
            optionArray.add("24");
            optionArray.add("26");
        }
        else if (questionNumber==202)
        {
            optionArray.add("19");
            optionArray.add("28");
            optionArray.add("30");
            optionArray.add("37");
        }
        else if (questionNumber==203)
        {
            optionArray.add("12 days");
            optionArray.add("15 days");
            optionArray.add("16 days");
            optionArray.add("18 days");
        }
        else if (questionNumber==204)
        {
            optionArray.add("20 days");
            optionArray.add("22\u00BD days");
            optionArray.add("25 days");
            optionArray.add("30 days");
        }
        else if (questionNumber==205)
        {
            optionArray.add("Rs. 375");
            optionArray.add("Rs. 400");
            optionArray.add("Rs. 600");
            optionArray.add("Rs. 800");
        }
        else if (questionNumber==206)
        {
            optionArray.add("4 days");
            optionArray.add("5 days");
            optionArray.add("6 days");
            optionArray.add("7 days");
        }
        else if (questionNumber==207)
        {
            optionArray.add("8 hours");
            optionArray.add("10 hours");
            optionArray.add("12 hours");
            optionArray.add("24 hours");
        }
        else if (questionNumber==208)
        {
            optionArray.add("15 days");
            optionArray.add("20 days");
            optionArray.add("25 days");
            optionArray.add("30 days");
        }
        else if (questionNumber==209)
        {
            optionArray.add("23 days");
            optionArray.add("37 days");
            optionArray.add("37\u00BD");
            optionArray.add("40 days");
        }
        else if (questionNumber==210)
        {
            optionArray.add("11:30 A.M.");
            optionArray.add("12 noon");
            optionArray.add("12:30 P.M.");
            optionArray.add("1:00 P.M.");
        }
        else if (questionNumber==211)
        {
            optionArray.add("4");
            optionArray.add("5");
            optionArray.add("6");
            optionArray.add("7");
        }
        else if (questionNumber==212)
        {
            optionArray.add("35");
            optionArray.add("40");
            optionArray.add("45");
            optionArray.add("50");
        }
        else if (questionNumber==213)
        {
            optionArray.add("40");
            optionArray.add("50");
            optionArray.add("54");
            optionArray.add("60");
        }
        else if (questionNumber==214)
        {
            optionArray.add("3");
            optionArray.add("5");
            optionArray.add("7");
            optionArray.add("Cannot be determined");
        }
        else if (questionNumber==215)
        {
            optionArray.add("6 days");
            optionArray.add("10 days");
            optionArray.add("15 days");
            optionArray.add("19 days");
        }
        else if (questionNumber==216)
        {
            optionArray.add("11 days");
            optionArray.add("13 days");
            optionArray.add("15 days");
            optionArray.add("None of these");
        }
        else if (questionNumber==217)
        {
            optionArray.add("7 hours 30 minutes");
            optionArray.add("8 hours");
            optionArray.add("8 hours 15 minutes");
            optionArray.add("8 hours 25 minutes");
        }
        else if (questionNumber==218)
        {
            optionArray.add("15");
            optionArray.add("16");
            optionArray.add("17");
            optionArray.add("18");
        }
        else if (questionNumber==219)
        {
            optionArray.add("4 days");
            optionArray.add("6 days");
            optionArray.add("8 days");
            optionArray.add("12 days");
        }
        else if (questionNumber==220)
        {
            optionArray.add("8 days");
            optionArray.add("10 days");
            optionArray.add("12 days");
            optionArray.add("15 days");
        }
        else if (questionNumber==221)
        {
            optionArray.add("18 days");
            optionArray.add("24 days");
            optionArray.add("30 days");
            optionArray.add("36 days");
        }
        else if (questionNumber==222)
        {
            optionArray.add("4 days");
            optionArray.add("6 days");
            optionArray.add("8 days");
            optionArray.add("18 days");
        }
        else if (questionNumber==223)
        {
            optionArray.add("3 : 4");
            optionArray.add("4 : 3");
            optionArray.add("5 : 3");
            optionArray.add("Data inadequate");
        }
        else if (questionNumber==224)
        {
            optionArray.add("4 days");
            optionArray.add("6 days");
            optionArray.add("8 days");
            optionArray.add("12 days");
        }
        else if (questionNumber==225)
        {
            optionArray.add("5 days");
            optionArray.add("6 days");
            optionArray.add("10 days");
            optionArray.add("11\u00BD days");
        }
        else if (questionNumber==226)
        {
            optionArray.add("13\u2153 days");
            optionArray.add("15 days");
            optionArray.add("20 days");
            optionArray.add("26 days");
        }
        else if (questionNumber==227)
        {
            optionArray.add("9\u2153 days");
            optionArray.add("11 days");
            optionArray.add("12\u00BC days");
            optionArray.add("16\u2153 days");
        }
        else if (questionNumber==228)
        {
            optionArray.add("30 days");
            optionArray.add("40 days");
            optionArray.add("60 days");
            optionArray.add("70 days");
        }
        else if (questionNumber==229)
        {
            optionArray.add("3.6");
            optionArray.add("7.2");
            optionArray.add("8.4");
            optionArray.add("10");
        }
        else if (questionNumber==230)
        {
            optionArray.add("300 kmph");
            optionArray.add("360 kmph");
            optionArray.add("600 kmph");
            optionArray.add("720 kmph");
        }
        else if (questionNumber==231)
        {
            optionArray.add("50 km");
            optionArray.add("56 km");
            optionArray.add("70 km");
            optionArray.add("80 km");
        }
        else if (questionNumber==232)
        {
            optionArray.add("100 kmph");
            optionArray.add("110 kmph");
            optionArray.add("120 kmph");
            optionArray.add("130 kmph");
        }
        else if (questionNumber==233)
        {
            optionArray.add("9");
            optionArray.add("10");
            optionArray.add("12");
            optionArray.add("20");
        }
        else if (questionNumber==234)
        {
            optionArray.add("1 hour");
            optionArray.add("2 hours");
            optionArray.add("3 hours");
            optionArray.add("4 hours");
        }
        else if (questionNumber==235)
        {
            optionArray.add("220 km");
            optionArray.add("224 km");
            optionArray.add("230 km");
            optionArray.add("234 km");
        }
        else if (questionNumber==236)
        {
            optionArray.add("75 km/hr");
            optionArray.add("70 km/hr");
            optionArray.add("84 km/hr");
            optionArray.add("87.5 km/hr");
        }
        else if (questionNumber==237)
        {
            optionArray.add("35.55 km/hr");
            optionArray.add("36 km/hr");
            optionArray.add("71.11 km/hr");
            optionArray.add("71 km/hr");
        }
        else if (questionNumber==238)
        {
            optionArray.add("5 kmph");
            optionArray.add("6 kmph");
            optionArray.add("6.5 kmph");
            optionArray.add("7 kmph");
        }
        else if (questionNumber==239)
        {
            optionArray.add("8 kmph");
            optionArray.add("11 kmph");
            optionArray.add("12 kmph");
            optionArray.add("14 kmph");
        }
        else if (questionNumber==240)
        {
            optionArray.add("2 : 3");
            optionArray.add("3 : 2");
            optionArray.add("3 : 4");
            optionArray.add("4 : 3");
        }
        else if (questionNumber==241)
        {
            optionArray.add("14 km");
            optionArray.add("15 km");
            optionArray.add("16 km");
            optionArray.add("17 km");
        }
        else if (questionNumber==242)
        {
            optionArray.add("35");
            optionArray.add("36");
            optionArray.add("37");
            optionArray.add("40");
        }
        else if (questionNumber==243)
        {
            optionArray.add("120 metres");
            optionArray.add("180 metres");
            optionArray.add("324 metres");
            optionArray.add("150 metres");
        }
        else if (questionNumber==244)
        {
            optionArray.add("45 km/hr");
            optionArray.add("50 km/hr");
            optionArray.add("54 km/hr");
            optionArray.add("55 km/hr");
        }
        else if (questionNumber==245)
        {
            optionArray.add("200 m");
            optionArray.add("225 m");
            optionArray.add("245 m");
            optionArray.add("250 m");
        }
        else if (questionNumber==246)
        {
            optionArray.add("1 : 3");
            optionArray.add("3 : 2");
            optionArray.add("3 : 4");
            optionArray.add("None of these");
        }
        else if (questionNumber==247)
        {
            optionArray.add("120 m");
            optionArray.add("240 m");
            optionArray.add("300 m");
            optionArray.add("None of these");
        }
        else if (questionNumber==248)
        {
            optionArray.add("65 sec");
            optionArray.add("89 sec");
            optionArray.add("100 sec");
            optionArray.add("150 sec");
        }
        else if (questionNumber==249)
        {
            optionArray.add("50 m");
            optionArray.add("72 m");
            optionArray.add("80 m");
            optionArray.add("82 m");
        }
        else if (questionNumber==250)
        {
            optionArray.add("40 sec");
            optionArray.add("42 sec");
            optionArray.add("45 sec");
            optionArray.add("48 sec");
        }
        else if (questionNumber==251)
        {
            optionArray.add("36");
            optionArray.add("45");
            optionArray.add("48");
            optionArray.add("49");
        }
        else if (questionNumber==252)
        {
            optionArray.add("25 sec");
            optionArray.add("48 sec");
            optionArray.add("36 sec");
            optionArray.add("72 sec");
        }
        else if (questionNumber==253)
        {
            optionArray.add("230 m");
            optionArray.add("240 m");
            optionArray.add("260 m");
            optionArray.add("320 m");
        }
        else if (questionNumber==254)
        {
            optionArray.add("230 m");
            optionArray.add("240 m");
            optionArray.add("260 m");
            optionArray.add("270 m");
        }
        else if (questionNumber==255)
        {
            optionArray.add("30 km/hr");
            optionArray.add("45 km/hr");
            optionArray.add("60 km/hr");
            optionArray.add("75 km/hr");
        }
        else if (questionNumber==256)
        {
            optionArray.add("9");
            optionArray.add("9.6");
            optionArray.add("10");
            optionArray.add("10.8");
        }
        else if (questionNumber==257)
        {
            optionArray.add("5 sec");
            optionArray.add("6 sec");
            optionArray.add("7 sec");
            optionArray.add("10 sec");
        }
        else if (questionNumber==258)
        {
            optionArray.add("2.5 min");
            optionArray.add("3 min");
            optionArray.add("3.2 min");
            optionArray.add("3.5 min");
        }
        else if (questionNumber==259)
        {
            optionArray.add("130");
            optionArray.add("360");
            optionArray.add("500");
            optionArray.add("540");
        }
        else if (questionNumber==260)
        {
            optionArray.add("320 m");
            optionArray.add("350 m");
            optionArray.add("650 m");
            optionArray.add("Data inadequate");
        }
        else if (questionNumber==261)
        {
            optionArray.add("50 m");
            optionArray.add("150 m");
            optionArray.add("200 m");
            optionArray.add("Data inadequate");
        }
        else if (questionNumber==262)
        {
            optionArray.add("69.5 km/hr");
            optionArray.add("70 km/hr");
            optionArray.add("79 km/hr");
            optionArray.add("79.2 km/hr");
        }
        else if (questionNumber==263)
        {
            optionArray.add("25");
            optionArray.add("30");
            optionArray.add("40");
            optionArray.add("45");
        }
        else if (questionNumber==264)
        {
            optionArray.add("24 sec");
            optionArray.add("12 sec");
            optionArray.add("48 sec");
            optionArray.add("60 sec");
        }
        else if (questionNumber==265)
        {
            optionArray.add("10");
            optionArray.add("18");
            optionArray.add("36");
            optionArray.add("72");
        }
        else if (questionNumber==266)
        {
            optionArray.add("10");
            optionArray.add("12");
            optionArray.add("15");
            optionArray.add("20");
        }
        else if (questionNumber==267)
        {
            optionArray.add("48 km/hr");
            optionArray.add("54 km/hr");
            optionArray.add("66 km/hr");
            optionArray.add("82 km/hr");
        }
        else if (questionNumber==268)
        {
            optionArray.add("45 m");
            optionArray.add("50 m");
            optionArray.add("54 m");
            optionArray.add("72 m");
        }
        else if (questionNumber==269)
        {
            optionArray.add("66 km/hr");
            optionArray.add("72 km/hr");
            optionArray.add("78 km/hr");
            optionArray.add("81 km/hr");
        }
        else if (questionNumber==270)
        {
            optionArray.add("400 m");
            optionArray.add("450 m");
            optionArray.add("550 m");
            optionArray.add("600 m");
        }
        else if (questionNumber==271)
        {
            optionArray.add("9 a.m.");
            optionArray.add("10 a.m.");
            optionArray.add("10.30 a.m.");
            optionArray.add("11 a.m.");
        }
        else if (questionNumber==272)
        {
            optionArray.add("2 : 3");
            optionArray.add("4 : 3");
            optionArray.add("6 : 7");
            optionArray.add("9 : 16");
        }
        else if (questionNumber==273)
        {
            optionArray.add("6.25");
            optionArray.add("6.5");
            optionArray.add("6.75");
            optionArray.add("7");
        }
        else if (questionNumber==274)
        {
            optionArray.add("Rs. 4991");
            optionArray.add("Rs. 5991");
            optionArray.add("Rs. 6001");
            optionArray.add("Rs. 6991");
        }
        else if (questionNumber==275)
        {
            optionArray.add("0");
            optionArray.add("1");
            optionArray.add("10");
            optionArray.add("19");
        }
        else if (questionNumber==276)
        {
            optionArray.add("76 kg");
            optionArray.add("76.5 kg");
            optionArray.add("85 kg");
            optionArray.add("Data inadequate");
        }
        else if (questionNumber==277)
        {
            optionArray.add("23 years");
            optionArray.add("24 years");
            optionArray.add("25 years");
            optionArray.add("26 years");
        }
        else if (questionNumber==278)
        {
            optionArray.add("3500");
            optionArray.add("4000");
            optionArray.add("4050");
            optionArray.add("4500");
        }
        else if (questionNumber==279)
        {
            optionArray.add("35 years");
            optionArray.add("40 years");
            optionArray.add("50 years");
            optionArray.add("None of these");
        }
        else if (questionNumber==280)
        {
            optionArray.add("Rs. 7.98");
            optionArray.add("Rs. 8");
            optionArray.add("Rs. 8.50");
            optionArray.add("Rs. 9");
        }
        else if (questionNumber==281)
        {
            optionArray.add("67 kg");
            optionArray.add("68 kg");
            optionArray.add("69 kg");
            optionArray.add("None of these");
        }
        else if (questionNumber==282)
        {
            optionArray.add("17 kg");
            optionArray.add("20 kg");
            optionArray.add("26 kg");
            optionArray.add("31 kg");
        }
        else if (questionNumber==283)
        {
            optionArray.add("47.55 kg");
            optionArray.add("47 kg");
            optionArray.add("48.55 kg");
            optionArray.add("49.25 kg");
        }
        else if (questionNumber==284)
        {
            optionArray.add("250");
            optionArray.add("276");
            optionArray.add("280");
            optionArray.add("285");
        }
        else if (questionNumber==285)
        {
            optionArray.add("53.33");
            optionArray.add("54.68");
            optionArray.add("55");
            optionArray.add("None of these");
        }
        else if (questionNumber==286)
        {
            optionArray.add("10");
            optionArray.add("20");
            optionArray.add("40");
            optionArray.add("73");
        }
        else if (questionNumber==287)
        {
            optionArray.add("31");
            optionArray.add("61");
            optionArray.add("71");
            optionArray.add("91");
        }
        else if (questionNumber==288)
        {
            optionArray.add("2");
            optionArray.add("3");
            optionArray.add("18");
            optionArray.add("21");
        }
        else if (questionNumber==289)
        {
            optionArray.add("1951609");
            optionArray.add("1981709");
            optionArray.add("18362619");
            optionArray.add("2031719");
        }
        else if (questionNumber==290)
        {
            optionArray.add("575648125");
            optionArray.add("584638125");
            optionArray.add("584649125");
            optionArray.add("585628125");
        }
        else if (questionNumber==291)
        {
            optionArray.add("9944");
            optionArray.add("9768");
            optionArray.add("9988");
            optionArray.add("8888");
        }
        else if (questionNumber==292)
        {
            optionArray.add("33");
            optionArray.add("81");
            optionArray.add("93");
            optionArray.add("97");
        }
        else if (questionNumber==293)
        {
            optionArray.add("273258");
            optionArray.add("273268");
            optionArray.add("273348");
            optionArray.add("273358");
        }
        else if (questionNumber==294)
        {
            optionArray.add("11");
            optionArray.add("18");
            optionArray.add("26");
            optionArray.add("28");
        }
        else if (questionNumber==295)
        {
            optionArray.add("240");
            optionArray.add("270");
            optionArray.add("295");
            optionArray.add("360");
        }
        else if (questionNumber==296)
        {
            optionArray.add("725117481");
            optionArray.add("674217481");
            optionArray.add("685126481");
            optionArray.add("696217481");
        }
        else if (questionNumber==297)
        {
            optionArray.add("101");
            optionArray.add("103");
            optionArray.add("109");
            optionArray.add("111");
        }
        else if (questionNumber==298)
        {
            optionArray.add("235641");
            optionArray.add("245642");
            optionArray.add("315624");
            optionArray.add("415624");
        }
        else if (questionNumber==299)
        {
            optionArray.add("63650");
            optionArray.add("53760");
            optionArray.add("59640");
            optionArray.add("61560");
        }
        else if (questionNumber==300)
        {
            optionArray.add("1035");
            optionArray.add("1280");
            optionArray.add("2070");
            optionArray.add("2140");
        }

    }

    public List<String> getOptionArray() {
        return optionArray;
    }
}

