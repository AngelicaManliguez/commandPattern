package CommandPattern;

import java.util.Scanner;

public class ViewerApp {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        DevicesControl devicesControl = new DevicesControl();
        Controller controller = new Controller();

        SmartTV tv = new SmartTV();
        Speaker speaker = new Speaker();
        Lights light = new Lights();

        ArrowUp arrowUp = new ArrowUp(devicesControl);
        ArrowDown arrowDown = new ArrowDown(devicesControl);

        ArrowLeft arrowLeft = new ArrowLeft(devicesControl);
        ArrowRight arrowRight = new ArrowRight(devicesControl);

        System.out.println("\n\tWELCOME TO SMART HOME AUTOMATION APP!\n");

        int choice;
        do {
            System.out.println("\t\t↓ DEVICES AVAILABLE ↓");
            System.out.println("\t\t\t[1] SmartTV");
            System.out.println("\t\t\t[2] Speaker");
            System.out.println("\t\t\t[3] Lights");
            System.out.println("\t\t\t[4] Exit");
            System.out.print("\nChoose device: ");
            choice = scan.nextInt();

            switch (choice)
            {
                case 1:
                    controller.setCommand(new TurnOnSmartTv(tv));
                    controller.clickButton();
                    while (true)
                    {
                        System.out.println("\n\t\t↓ COMMANDS FOR SmartTV ↓");
                        System.out.println("\t\t\t[1] Next Channel");
                        System.out.println("\t\t\t[2] Previous Channel");
                        System.out.println("\t\t\t[3] Volume Up");
                        System.out.println("\t\t\t[4] Volume Down");
                        System.out.println("\t\t\t[5] Turn off");

                        System.out.print("Choose command: ");
                        int command = scan.nextInt();

                        if (command == 1)
                        {
                            System.out.print("\n--------Switching to the " + arrowRight.execute() + " channel--------\n");
                        }
                        else if (command == 2)
                        {
                            System.out.print("\n--------Switching to the " + arrowLeft.execute() + " channel--------\n");
                        }
                        else if (command == 3)
                        {
                            System.out.println("\n--------" + arrowUp.execute() + " volume ↑--------");
                        }
                        else if (command == 4)
                        {
                            System.out.println("\n--------" + arrowDown.execute() + " volume ↓--------");
                        }
                        else
                        {
                            controller.setCommand(new TurnOffSmartTv(tv));
                            controller.clickButton();
                            break;
                        }
                    }
                    break;

                case 2:
                    controller.setCommand(new TurnOnSpeaker(speaker));
                    controller.clickButton();
                    while (true)
                    {
                        System.out.println("\n\t\tCOMMANDS FOR SPEAKER");
                        System.out.println("\t\t\t[1] Next Song");
                        System.out.println("\t\t\t[2] Previous Song");
                        System.out.println("\t\t\t[3] Volume Up");
                        System.out.println("\t\t\t[4] Volume Down");
                        System.out.println("\t\t\t[5] Turn off");

                        System.out.print("Choose command: ");
                        int command = scan.nextInt();

                        if (command == 1)
                        {
                            System.out.println("\n--------Listening to the " + arrowRight.execute() + " song--------");
                        }
                        else if (command == 2)
                        {
                            System.out.println("\n--------Listening to the " + arrowLeft.execute() + " song--------");
                        }
                        else if (command == 3)
                        {
                            System.out.println("\n--------" + arrowUp.execute() + " volume ↑--------");
                        }
                        else if (command == 4)
                        {
                            System.out.println("\n--------" + arrowDown.execute() + " volume ↓--------");
                        }
                        else
                        {
                            controller.setCommand(new TurnOffSpeaker(speaker));
                            controller.clickButton();
                            break;
                        }
                    }
                    break;
                case 3:
                    controller.setCommand(new TurnOnLights(light));
                    controller.clickButton();
                    while (true)
                    {

                        System.out.println("\n\t\tCOMMANDS FOR LIGHTS");
                        System.out.println("\t\t\t[1] Cool Light");
                        System.out.println("\t\t\t[2] Warm Light");
                        System.out.println("\t\t\t[3] Increase Brightness");
                        System.out.println("\t\t\t[4] Decrease Brightness");
                        System.out.println("\t\t\t[5] Turn off");

                        System.out.print("Choose command: ");
                        int command = scan.nextInt();

                        if (command == 1)
                        {
                            System.out.println("\n--------Changing to the " + arrowRight.execute() + " color temperature--------");
                        }
                        else if (command == 2)
                        {
                            System.out.println("\n--------Changing to the " + arrowLeft.execute() + " color temperature--------");
                        }
                        else if (command == 3)
                        {
                            System.out.println("\n--------" + arrowUp.execute() + " brightness ↑--------");
                        }
                        else if (command == 4)
                        {
                            System.out.println("\n--------" + arrowDown.execute() + " brightness ↓--------");
                        }
                        else
                        {
                            controller.setCommand(new TurnOffLights(light));
                            controller.clickButton();
                            break;
                        }
                    }
                    break;
            }
        }while(choice < 4);
        System.out.println("\nTHANK YOU FOR USING SMART HOME AUTOMATION APP!");
    }
}
