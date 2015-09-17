import jline.console.ConsoleReader;

public class JLineTest
{
    public static void main(String... args)
    throws Exception
    {
        ConsoleReader r = new ConsoleReader();

        while (true)
        {
            r.println("Good morning");
            r.flush();

            String input = r.readLine("prompt>");

            if ("clear".equals(input))
                r.clearScreen();
            else if ("exit".equals(input))
                return;
            else
                System.out.println("You typed '" + input + "'.");

        }
    }
}