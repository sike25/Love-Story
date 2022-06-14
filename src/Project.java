//OSASIKEMWEN OGIEVA
//FINAL PROJECT

//CREDITS:
//Conversation includes rephrased text, and intellectual property from:
      //Interstellar (2014)
      //All The Light We Can Not See, by Anthony Doerr.
//Images
      //profile.jpg : The New York Times
      //wallpaper.jpg: Kevin Nalty on Unsplash
      //notreally.jpg: Dorrell Tibbs on Unsplash
      //believer.jpg : Debby Hudson on Unsplash
      //absolutely.jpg: Fadi XD on Unsplash
//Music
      //

import java.awt.Font;

public class Project {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(800, 800);

        Preliminary();

        SetUp();
        ConversationOne();
        StdDraw.clear();

        IntermissionOne();
        StdDraw.clear();

        SetUp();
        ConversationTwo();
        StdDraw.clear();

        SetUp();
        ConversationThree();
        StdDraw.clear();

        IntermissionTwo();
        StdDraw.clear();

        SetUp();
        ConversationFour();
        StdDraw.clear();

        System.out.println("Thank you for coming along on our love story");
    }

    public static void Preliminary(){
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);

        StdDraw.setPenColor(255, 255, 255);
        Font font = new Font("Garamond", Font.PLAIN, 20);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.65, "This is a story.");
        StdDraw.pause(1000);
        StdDraw.text(0.5, 0.6, "Be patient with it.");
        StdDraw.pause(2000);
        StdDraw.text(0.5, 0.55, "The pauses are part of the ride.");
        StdDraw.pause(1000);
        StdDraw.text(0.5, 0.5, "The characters are typing.");
        StdDraw.pause(1000);
        StdDraw.text(0.5, 0.45, "They are thinking.");
        StdDraw.pause(800);
        StdDraw.text(0.5, 0.4, "Hesitating.");
        StdDraw.pause(1000);
        StdDraw.text(0.5, 0.35, "This is a story.");
        StdDraw.pause(3000);
    }

    public static void SetUp() {

        StdDraw.picture(0.5, 0.5, "wallpaper.jpg");

        StdDraw.setPenColor(0, 200, 0);
        StdDraw.filledRectangle(0.5, 0.95, 0.4, 0.05);

        StdDraw.picture(0.18, 0.95, "profile.jpg", 0.08, 0.07);

        StdDraw.setPenRadius(0.15);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.line(0.05, 0, 0.05, 1);
        StdDraw.line(0.95, 0, 0.95, 1);

        StdDraw.setPenColor(255, 255, 255);
        Font font = new Font("Calibri", Font.BOLD, 16);
        StdDraw.setFont(font);
        StdDraw.text(0.3, 0.95, "Ikemefuna");

        StdDraw.show();
        StdDraw.pause(10);
    }

    public static void ConversationOne() {
        ChatBoxRec(0.2, 0.85, 0.04, 0.02, "Hey.");
        StdDraw.pause(2000);
        ChatBoxMe(0.8, 0.79, 0.04, 0.02, "Hello.");
        StdDraw.pause(2000);
        ChatBoxRec(0.3, 0.73, 0.14, 0.02, "I know we've never met, but...");
        StdDraw.pause(1500);
        ChatBoxMe(0.74, 0.67, 0.1, 0.02, "It feels like we have.");
        StdDraw.pause(1000);
        ChatBoxRec(0.2, 0.61, 0.04, 0.02, "Yes.");
        StdDraw.pause(1000);
        ChatBoxRec(0.21, 0.55, 0.05, 0.02, "It does.");
        StdDraw.pause(1000);
        ChatBoxRec(0.2, 0.49, 0.04, 0.02, "\\(^v^ )/");
        StdDraw.pause(2700);
    }

    public static void ConversationTwo() {
        ChatBoxRec(0.25, 0.85, 0.1, 0.02, "Why do we love?");
        StdDraw.pause(2000);
        ChatBoxMe(0.65, 0.79, 0.2, 0.02, "Why does the wind not move the light?");
        StdDraw.pause(2000);
        ChatBoxRec(0.21, 0.73, 0.06, 0.02, "Nanya...");
        StdDraw.pause(1000);
        ChatBoxMe(0.78, 0.67, 0.06, 0.02, "Lol. Ok.");
        StdDraw.pause(2000);
        ChatBoxMe(0.62, 0.61, 0.22, 0.02, "It is how we survive. Man found early in his story");
        StdDraw.pause(3000);
        ChatBoxMe(0.64, 0.55, 0.2, 0.02, "That community protects and strengthens");
        StdDraw.pause(3000);
        ChatBoxMe(0.62, 0.49, 0.22, 0.02, "That we would go mad without companionship");
        StdDraw.pause(3000);
        ChatBoxMe(0.64, 0.43, 0.2, 0.02, "Love is how we know better than to be alone");
        StdDraw.pause(3000);
        ChatBoxMe(0.67, 0.37, 0.16, 0.02, "It allows our species to persist");
        StdDraw.pause(3000);
        ChatBoxRec(0.33, 0.3, 0.18, 0.02, "Then, what is the evolutionary benefit,");
        StdDraw.pause(2000);
        ChatBoxRec(0.23, 0.24, 0.08, 0.02, "the social utility");
        StdDraw.pause(3000);
        ChatBoxRec(0.3, 0.18, 0.15, 0.02, "in loving those who have died?");
        StdDraw.pause(2700);
    }

    public static void ConversationThree() {
        ChatBoxMe(0.65, 0.85, 0.19, 0.02, "We don't hear rain fall. We hear it land.");
        StdDraw.pause(2000);
        ChatBoxMe(0.59, 0.79, 0.25, 0.02, "If it never touched the ground, it would be a silenter thing.");
        StdDraw.pause(2000);
        ChatBoxRec(0.25, 0.73, 0.1, 0.02, "What? Is rain falling?");
        StdDraw.pause(1000);
        ChatBoxMe(0.8, 0.67, 0.04, 0.02, "Yes");
        StdDraw.pause(2000);
        ChatBoxRec(0.35, 0.61, 0.2, 0.02, "In Kaduna, in the middle of November???");
        StdDraw.pause(3000);
        ChatBoxMe(0.77, 0.55, 0.07, 0.02, "I am in Lagos.");
        StdDraw.pause(3000);
        ChatBoxRec(0.19, 0.49, 0.04, 0.02, "Oh.");
        StdDraw.pause(2000);
        ChatBoxMe(0.76, 0.43, 0.08, 0.02, "We should meet");
        StdDraw.pause(2000);
        ChatBoxRec(0.2, 0.37, 0.04, 0.02, "....");
        StdDraw.pause(3500);
        ChatBoxMe(0.67, 0.3, 0.19, 0.02, "All your life, you wait... and then it comes,");
        StdDraw.pause(2000);
        ChatBoxMe(0.75, 0.24, 0.1, 0.02, "But are you ready?");
        StdDraw.pause(2700);
    }

    public static void ConversationFour() {
        ChatBoxRec(0.25, 0.85, 0.1, 0.02, "I am ready.");
        StdDraw.show();
        StdDraw.pause(2000);
        ChatBoxMe(0.75, 0.8, 0.1, 0.02, "I love you.");
        StdDraw.show();
        StdDraw.pause(2000);
        ChatBoxRec(0.2, 0.73, 0.04, 0.02, "Lol.");
        StdDraw.show();
        StdDraw.pause(1000);
        ChatBoxRec(0.2, 0.67, 0.04, 0.02, "I know.");
        StdDraw.show();
        StdDraw.pause(1800);
        ChatBoxRec(0.24, 0.61, 0.08, 0.02, "I love you more.");
        StdDraw.show();
        StdDraw.pause(1000);
        ChatBoxRec(0.2, 0.53, 0.04, 0.04, "(•ᴗ•)");
        StdDraw.show();
    }


    public static void ChatBoxRec(double XPosit, double YPosit, double HalfWidth, double HalfHeight, String Txt) {
        StdDraw.setPenColor(255, 255, 255);
        StdDraw.filledRectangle(XPosit, YPosit, HalfWidth, HalfHeight);
        double[] A = {XPosit - HalfWidth, XPosit - HalfWidth, XPosit - 0.02 - HalfWidth};
        double[] B = {YPosit + HalfHeight, YPosit + 0.01, YPosit + HalfHeight};
        Triangle(A, B);
        StdDraw.setPenColor(0, 0, 0);
        Font font = new Font("Calibri", Font.PLAIN, 15);
        StdDraw.setFont(font);
        StdDraw.text(XPosit, YPosit, Txt);
    }

    public static void ChatBoxMe(double XPosit, double YPosit, double HalfWidth, double HalfHeight, String Txt) {
        StdDraw.setPenColor(201, 255, 229);
        StdDraw.filledRectangle(XPosit, YPosit, HalfWidth, HalfHeight);
        double[] A = {XPosit + HalfWidth, XPosit + HalfWidth, XPosit + 0.02 + HalfWidth};
        double[] B = {YPosit + HalfHeight, YPosit + 0.01, YPosit + HalfHeight};
        Triangle(A, B);
        StdDraw.setPenColor(0, 0, 0);
        Font font = new Font("Calibri", Font.PLAIN, 15);
        StdDraw.setFont(font);
        StdDraw.text(XPosit, YPosit, Txt);
    }

    public static void Triangle(double[] A, double[] B) {
        StdDraw.filledPolygon(A, B);
    }

    public static void IntermissionOne() {
        Font font = new Font("Garamond", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.85, "DO YOU BELIEVE IN LOVE?");
        StdDraw.text(0.5, 0.8, "Move the cursor over one of the buttons.");

        StdDraw.setPenColor(0, 210, 0);
        StdDraw.filledRectangle(0.2, 0.5, 0.12, 0.06);
        Font font2 = new Font("Garamond", Font.PLAIN, 25);
        StdDraw.setFont(font2);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.text(0.2, 0.5, "ABSOLUTELY");

        StdDraw.setPenColor(190, 0, 210);
        StdDraw.filledRectangle(0.8, 0.5, 0.12, 0.06);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.text(0.8, 0.5, "NOT REALLY");

        int wait = 0;
        while (wait < 1) {
            if ((StdDraw.mouseX() >= 0.08) && (StdDraw.mouseX() <= 0.33)) { //absolutely
                if ((StdDraw.mouseY() >= 0.44) && (StdDraw.mouseY() <= 0.56)) {
                    StdDraw.pause(700);
                    Absolutely();
                    wait++;
                }
            }

            if ((StdDraw.mouseX() >= 0.68) && (StdDraw.mouseX() <= 0.98)) { //not really
                if ((StdDraw.mouseY() >= 0.44) && (StdDraw.mouseY() <= 0.56)) {
                    StdDraw.pause(700);
                    Not_Really();
                    wait++;
                }
            }
        }
    }


    public static void IntermissionTwo() {

        double Me = 1.0;
        double Rec = 0.0;

        while (Me >= 0.5) {
            StdDraw.enableDoubleBuffering();

            StdDraw.setPenColor(0, 0, 0);
            StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5); //background

            Font font = new Font("Garamond", Font.PLAIN, 30);
            StdDraw.setFont(font);
            StdDraw.setPenColor(255, 255, 255);
            StdDraw.text(0.5, 0.85, "Nanya is the green ball. Ikemefuna the white (chatbox colors)");
            StdDraw.text(0.5, 0.8, "Keep the cursor on the canvas, and click the mouse...");
            StdDraw.text(0.5, 0.75, "Until they meet");

            StdDraw.setPenRadius(0.0005);
            StdDraw.setPenColor(255, 255, 255);
            StdDraw.line(0, 0.5, 1, 0.5);//white line

            StdDraw.setPenColor(201, 255, 229);
            StdDraw.filledCircle(Me, 0.5, 0.03);//green circle

            StdDraw.setPenColor(255, 255, 255);
            StdDraw.filledCircle(Rec, 0.5, 0.03);//white circle

            StdDraw.show();

            if (StdDraw.isMousePressed()) {
                Rec = Rec + 0.005;
                Me = Me - 0.005;
            }
        }
    }

    public static void Absolutely() {
        StdDraw.picture(0.5, 0.5, "absolutely.jpg", 1, 1);

        StdDraw.setPenColor(0, 0, 0);
        StdDraw.filledRectangle(0.5, 0.525, 0.27, 0.13);

        Font font = new Font("Garamond", Font.PLAIN, 40);
        StdDraw.setFont(font);
        StdDraw.setPenColor(255, 255, 255);
        StdDraw.text(0.5, 0.6, "We are glad.");
        StdDraw.text(0.5, 0.55, "");
        StdDraw.pause(1500);
        Font font1 = new Font("Garamond", Font.PLAIN, 35);
        StdDraw.setFont(font1);
        StdDraw.text(0.5, 0.5, "May you find it, and then...");
        StdDraw.pause(1000);
        StdDraw.text(0.5, 0.45, " find the courage to keep it.");

        StdDraw.pause(2500);
    }

    public static void Not_Really() {
        StdDraw.picture(0.5, 0.75, "notreally.jpg", 1, 0.65);

        StdDraw.setPenColor(0, 0, 0);
        StdDraw.filledRectangle(0.5, 0.325, 0.4, 0.15);

        Font font = new Font("Garamond", Font.BOLD, 40);
        StdDraw.setFont(font);
        StdDraw.setPenColor(255, 255, 255);
        StdDraw.text(0.5, 0.4, "Look here, you little...");
        StdDraw.text(0.5, 0.35, "");
        Font font1 = new Font("Garamond", Font.PLAIN, 35);
        StdDraw.setFont(font1);
        StdDraw.pause(1000);
        StdDraw.text(0.5, 0.3, "We are taking you back and this time,");
        StdDraw.text(0.5, 0.25, "you have to say YES!");

        StdDraw.pause(3000);
        StdDraw.clear();

        IntermissionOne();
    }
}