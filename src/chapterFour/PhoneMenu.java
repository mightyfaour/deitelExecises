package chapterFour;

import java.util.Scanner;

public class PhoneMenu {
    private Scanner input = new Scanner(System.in);

    public void menu() {
        System.out.println("""
                NOKIA 3310 life is good
                Enter:
                1 -> Phone book
                2 -> Message
                3 -> Chat
                4 -> Call register
                5 -> Tones
                6 -> Settings
                7 -> Call Divert
                8 -> Games
                9 -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profile
                13 -> SIM service
                """);
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        switch (menu) {
            case 1 -> phoneBook();
            case 2 -> Message();
//            case 3 -> phoneBook();
//            case 4 -> phoneBook();
//            case 5 -> phoneBook();
//            case 6 -> phoneBook();
//            case 7 -> phoneBook();
        }
    }

    private void Message() {
        int userInput;
        System.out.println("Message!");
        System.out.println("""
                                1. Write messages
                                2. Inbox
                                3. Outbox
                                4. Picture Messages
                                5. Template
                                6. Smiley
                                7. Message settings
                                8. Info service
                                9. Voice mailbox number
                                10. Service command editor
                                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Write Messages");
                System.out.println("Type in the messages here ");
                break;
            case 2:
                System.out.println("Inbox");
                System.out.println("Click to check message sent to you");
                break;
            case 3:
                System.out.println("Outbox");
                System.out.println("Click to edith and send the messages in this message box");
                break;
            case 4:
                System.out.println("Picture Messages");
                System.out.println("Click on the image to view in large scale");
                break;
            case 5:
                System.out.println("Templates");
                System.out.println("The following list are templates available: ");
                break;
            case 6:
                System.out.println("Smiley");
                System.out.println("Smiley is same as emoji, & can be used to format a message.");
                break;
            case 7:
                System.out.println("Messge Settings: ");
                System.out.println("""
                                1. Set 1
                                2. Common
                                """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Set 1");
                        System.out.println("""
                                        1. Message center number
                                        2. Messages sent as
                                        3. Message validity
                                        """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1:
                                System.out.println("Message center number:");
                                System.out.println("The following are the message center number: 08186082057");
                                break;
                            case 2:
                                System.out.println("Message sent as: ");
                                System.out.println("""
                                                1. SMS (Short Message Services)
                                                2. MMS (Multi Media Messages)
                                                
                                                """);
                                userInput = input.nextInt();
                                switch (userInput) {
                                    case 1:
                                        System.out.println("SMS");
                                        System.out.println("Thanks for checking on this option, check your phone settings for SMS setting. ");
                                        break;
                                    case 2:
                                        System.out.println("MMS");
                                        System.out.println("Thanks for checking on this option, please do check your phone settings for MMS setting. ");
                                }
                                break;
                            case 3:
                                System.out.println("Message validity");
                                System.out.println("It takes not less than one month for this message to be self distruct");
                                break;
                        }
                    case 8:
                        System.out.println("Info service");
                        System.out.println("The following services are not permitted on this device.");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        System.out.println("To activate your voice mailbox, dail *556#");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        System.out.println("Choose the network to activate the following services.");
                        break;
                }

        }
    }

    private void phoneBook() {
        int userInput;
        System.out.println("""

                1. Search
                2. Service Nos.
                3. Add name
                4. Eraser
                5. Edith
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tag
                0. Back to Menu                        
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Type in your search word(s): ");
                break;
            case 2:
                System.out.println("The following are service number: 08186082057");
                break;
            case 3:
                System.out.println("Add name to contacts");
                break;
            case 4:
                System.out.println("Delete a contact");
                break;
            case 5:
                System.out.println("Edith already existing name");
                break;
            case 6:
                System.out.println("Assign a tone to the button");
                break;
            case 7:
                System.out.println("Sending a business card");
                break;
            case 8:
                System.out.println("""
                        1. Type of view
                        2. Memory status
                        3. Back to PhoneBook
                        0. Back to Menu
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Types of view ");
                        userInput = input.radix();
                        switch (userInput) {
                            case 1:
                                System.out.println("Types of view:");
                                System.out.println("""
                                        1. Landscape
                                        2. Portrate 
                                        """);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Internal Memory is: 1024tb");
                        break;
                    case 3:
                        phoneBook();
                        break;
                    case 0:
                        menu();
                        break;
                }

                break;
            case 9:
                System.out.println("Speed dial");
                break;
            case 10:
                System.out.println("Sending a voice tag");
                break;
            case 0:
                menu();
                break;
        }
    }
}


