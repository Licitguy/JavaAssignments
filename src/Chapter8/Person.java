package Chapter8;

import java.util.List;

public class Person {
    private List<Problem> problems;

    public void add(Problem problem){
        problems.add(problem);
    }


    public void tellProblem(){
        for (Problem problem: problems){
            if(!problem.isSolved()) System.out.println(problem);
    }
}
}
