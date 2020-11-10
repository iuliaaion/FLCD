import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        FA fa = new FA();
        System.out.println("Finite automata - read from file");
        System.out.println();
        int cmd = new Scanner(System.in).nextInt();

        if(cmd == 1)
        {
            fa = new FA("file.txt");
        }

        System.out.println();
        System.out.println("1. Show set of States");
        System.out.println("2. Show alphabet");
        System.out.println("3. Show transitions");
        System.out.println("4. Show initial state");
        System.out.println("5. Show final states");
        System.out.println("0. Exit");

        while(true)
        {
            System.out.println();
            System.out.println("Give command: ");
            cmd = new Scanner(System.in).nextInt();

            if (cmd == 1)
            {
                System.out.println("Set of states ");
                for(String s : fa.getSet_of_States())
                     {System.out.println(s + " ");}
            }
            else if(cmd == 2)
            {
                System.out.println("Alphabet ");
                for(String a : fa.getAlphabet())
                    { System.out.println(a + " "); }
            }
            else if(cmd == 3)
            {
                System.out.println("Transitions ");
                for(Transition t : fa.getTransitions())
                    { System.out.println(t.getBegin() + "--" + t.getValue() + "-->" + t.getDestination()); }
            }
            else if(cmd == 4)
            {
                System.out.println("Initial state ");
                System.out.println(fa.getInitial_State());
            }
            else if(cmd == 5)
            {
                System.out.println("Final states ");
                for(String fs : fa.getFinal_State())
                { System.out.println(fs); }
            }
            else if(cmd == 0)
            {
                break;
            }
            else
            {
                System.out.println("Invalid command");
            }

            System.out.println();

        }
    }

}
