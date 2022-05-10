package chapterFour;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String option;
        int extrovert = 0;
        int introvert = 0;
        int sensitive = 0;
        int intuition = 0;
        int thinker = 0;
        int feeler = 0;
        int judging = 0;
        int perceptive = 0;

        for (int i = 0; i <= 20; i++){
        System.out.println("choose among the available option 'A' or 'B'");
        switch (i) {
            case 1:
                System.out.println("""
                        1.
                        A.Expanded energy, Enjoy groups
                        B. Conserve energy, enjoy one-on-one
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A")) extrovert++;
                else introvert++;
                break;
            case 2:
                System.out.println("""
                        2. 
                        A. interpret literally
                        B. look for meaning and possibilities
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))sensitive++;
                else  intuition++;

                break;
            case 3:
                System.out.println("""
                        3.
                        A. Logical, Thinking, Questioning 
                        B. Empathetic, feeling, Accommodating 
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))thinker++;
                else feeler++;

                break;
            case 4:
                System.out.println("""
                        4. 
                        A. Organised, Orderly
                        B. Flexible, Adaptable
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))judging++;
                else perceptive++;
                break;
            case 5:
                System.out.println("""
                        5.
                        A. More outgoing, think out loud
                        B. More reserved, Think to yourself
                        """);

                option = input.next();
                if(option.equalsIgnoreCase("A")) extrovert++;
                else System.out.println("introvert");
                break;
            case 6:
                System.out.println("""
                        6.
                        A. Practical, Realistic, Experimental
                        B. Imaginative, Innovative, Theoretical
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))sensitive++;
                else  intuition++;
                break;
            case 7:
                System.out.println("""
                        7.
                        A. Candid, Straight forward, Frank
                        B. Tactful, King, Encouraging 
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))thinker++;
                else feeler++;
            case 8:
                System.out.println("""
                        8. 
                        A. Plan, Schedule
                        B. Unplanned Spontaneous
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))judging++;
                else perceptive++;
                break;
            case 9:
                System.out.println("""
                        9.
                        A. Seek many tasks, Public activities, Interaction with others
                        B. Seek private, solitary activities with quiet to concentrate
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A")) extrovert++;
                else introvert++;
                break;
            case 10:
                System.out.println("""
                        10.
                        A. Standard, Usual, Conventional
                        B. Different, novel, Unique
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))sensitive++;
                else  intuition++;
                break;
            case 11:
                System.out.println("""
                        11.
                        A. Firm, tend to criticize, hold the line
                        B. gentle, tend to appreciate, conciliate
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))thinker++;
                else feeler++;
                break;
            case 12:
                System.out.println("""
                        12.
                        A. Regulated structure
                        B. easygoing, "live" and "let live"
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))judging++;
                else perceptive++;
                break;
            case 13:
                System.out.println("""
                        13.
                        A. external, communicative, express yourself
                        B. internal, reticent, keep to yourself
                        """);

                option = input.next();
                if(option.equalsIgnoreCase("A")) extrovert++;
                else introvert++;
                break;
            case 14:
                System.out.println("""
                        14.
                        A. focus on here-and-now
                        B. look to the future,global perspective,"big picture"
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))sensitive++;
                else  intuition++;
                break;
            case 15:
                System.out.println("""
                        15.
                        A. 12 - mind, just
                        B. Tender hearted
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))thinker++;
                else feeler++;
                break;
            case 16:
                System.out.println("""
                        16.
                        A. Preparation plan ahead
                        B. Go with the flow, adapt as you mgo
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))judging++;
                else perceptive++;
                break;
            case 17:
                System.out.println("""
                        17.
                        A. Active, initiate
                        B. reflective, Deliberate 
                        """);

                option = input.next();
                if(option.equalsIgnoreCase("A")) extrovert++;
                else introvert++;
                break;
            case 18:
                System.out.println("""
                        18.
                        A. Fact, things, "What is"
                        B. Ideas, dreams, "What could be", philosophical
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))sensitive++;
                else  intuition++;
                break;
            case 19:
                System.out.println("""
                        19.
                        A. Matter of fact, issue- oriented
                        B. sensitive, people oriented, Compassionate.
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))thinker++;
                else feeler++;
                break;
            case 20:
                System.out.println("""
                        20.
                        A. Control, govern
                        B. Latitude, freedom
                        """);
                option = input.next();
                if(option.equalsIgnoreCase("A"))judging++;
                else perceptive++;
                break;
        }
    }


        System.out.println("extrovert " +extrovert);
        System.out.println("introvert " +introvert);
        System.out.println("sensitive " +sensitive);
        System.out.println("intuition " +intuition);
        System.out.println("feeler " +feeler);
        System.out.println("thinker " +thinker);
        System.out.println("judging " +judging);
        System.out.println("perceptive " +perceptive);


    }


}
