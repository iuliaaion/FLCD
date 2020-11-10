import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FA
{
    private List<String> set_of_States = new ArrayList<>();
    private HashSet<String> alphabet = new HashSet<>();
    private List<Transition> transitions = new ArrayList<>();
    private  String initial_State;
    private List<String> final_State = new ArrayList<>();

    public FA() {}

    /** read from file*/
    public FA(String filename) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename)))
        {
            String[] line;

            // read set of States
            line = bufferedReader.readLine().split(" ");
            Collections.addAll(set_of_States, line);

            // read the type of each element of the alphabet
            List<Integer> types = new ArrayList<>();
            line = bufferedReader.readLine().split(" ");
            for(String type : line)
            {
                types.add(Integer.parseInt(type));
            }

            //set the begin State and the destination State
            for(int i=0; i< set_of_States.size(); i++)
            {
                if(types.get(i) == 1)
                { initial_State = set_of_States.get(i); }

                if(types.get(i) == 2)
                { final_State.add(set_of_States.get(i)); }
            }

            //read transitions
            int no_of_Transactions = Integer.parseInt(bufferedReader.readLine());
            for(int i=0; i < no_of_Transactions; i++) {
                line = bufferedReader.readLine().split(" ");
                transitions.add(new Transition(line[2], line[0], line[1]));
                alphabet.add(line[2]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** constructor for Finite Automata class */
    public FA(List<String> set_of_States, HashSet<String> alphabet, List<Transition> transitions, String initial_State, List<String> final_State)
    {
        this.set_of_States = set_of_States;
        this.alphabet = alphabet;
        this.transitions = transitions;
        this.initial_State = initial_State;
        this.final_State = final_State;
    }

    public List<String> getSet_of_States()
    { return set_of_States; }

    public HashSet<String> getAlphabet()
    { return alphabet; }

    public List<Transition> getTransitions()
    { return transitions; }

    public String getInitial_State()
    { return initial_State; }

    public List<String> getFinal_State()
    { return final_State;}

}
