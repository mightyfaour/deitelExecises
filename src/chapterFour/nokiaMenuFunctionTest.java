package chapterFour;

import java.util.Scanner;

public class nokiaMenuFunctionTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:

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
                            }

                        break;
                    case 9:
                        System.out.println("Speed dial");
                        break;
                    case 10:
                        System.out.println("Sending a voice tag");
                        break;
                }
                break;
            case 2:
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
                break;
            case 3:
                System.out.println("Chat");
                System.out.println("Chatting will cost you N10 to activate and N1 per messages: ");
                userInput = input.nextInt();
                    switch (userInput){
                        case 1:
                            System.out.println("""
                                    1. Proceed
                                    2. Declone
                                    """);
                            break;
            }

                break;
            case 4:
                System.out.println("Call register");
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dailled number
                        4. Erase recent calls' duration
                        5. Show call duration
                        6. Show call cost
                        7. Call cost settings
                        8. prepaid credit
                        """);

                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1:
                                System.out.println("Missed calls");
                                System.out.println("""
                                        1. 08186082057
                                        2. 08063335239
                                        3. 08124567345
                                        """);
                                break;
                            case 2:
                                System.out.println("Received calls");
                                System.out.println("""
                                        1. 08186082057
                                        2. 08063335239
                                        3. 08124567345
                                        """);
                                break;
                            case 3:
                                System.out.println("Dialled Calls");
                                System.out.println("""
                                        1. 08186082057
                                        2. 08063335239
                                        3. 08124567345
                                        """);
                                break;
                            case 4:
                                System.out.println("Erase recent call list: ");
                                System.out.println("""
                                        1. 08186082057
                                        2. 08063335239
                                        3. 08124567345
                                        """);
                            case 5:
                                System.out.println("Show call duration:");
                                System.out.println("""
                                        1. Last call duration
                                        2. All calls' duration
                                        3. Received calls' duration
                                        4. Dialled calls' duration
                                        5. Clear timers
                                        """);

                                break;
                            case 6:
                                System.out.println("Show call costs:");
                                System.out.println("""
                                        1. Last call cost
                                        2. All calls' cost
                                        3. Clear counter
                                        """);
                                break;
                            case 7:
                                System.out.println("Call cost settings:");
                                System.out.println("""
                                        1. Call cost limit
                                        2. Show costs in
                                        """);
                                break;
                            case 8:
                                System.out.println("Prepaid credit");
                                System.out.println("Your prepaid credit is N1002");
                                break;
                        }

                break;

            case 5:
                System.out.println("Tone");
                System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tone
                        7. Warning and game tone
                        8. Vibrating alert
                        9. Screen saver
                        """);
                break;
            case 6:
                System.out.println("Settings");
                System.out.println("""
                        1. Call settings 
                        2. Phone setting
                        3. Security settings
                        4. Restore factory settings
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Call settings");
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialling 
                                3. Call waiting option
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """);
                        break;
                    case 2:
                        System.out.println("Phone Settings");
                        System.out.println("""
                                1. Language 
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service action
                                """);
                        break;
                    case 3:
                        System.out.println("Security settings: ");
                        System.out.println("""
                                1. PIN code request
                                2. Call barring services
                                3. Fixed dialling 
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """);
                        break;
                    case 4:
                        System.out.println("Restor factory settings");
                        System.out.println("""
                                1. Proceed
                                2. Decline
                                """);
                        break;

                }
                break;

            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminder");
                break;
            case 11:
                System.out.println("Clock");
                System.out.println("""
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown
                        6. Auto update of date and time
                        """);
                break;
            case 12:
                System.out.println("Profile");
                break;
            case 13:
                System.out.println("SIM Service");
                break;
        }

        }


    }



