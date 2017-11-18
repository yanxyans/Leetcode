package solution;

public class TwoKeys {
    public int minSteps(int n) {
    	if (n < 1) return -1;
    	else if (n == 1) return 0;
        return 1 + minStepsHelp(n, 1, 1);
    }
    
    private int minStepsHelp(int n, int step, int copy) {
    	int nextStep = step + copy;
    	if (nextStep > n) return -1;
    	else if (nextStep == n) return 1;
    	
    	int minStepsCopy = minStepsHelp(n, nextStep, nextStep);
    	int minStepsPaste = minStepsHelp(n, nextStep, copy);
    	if (minStepsCopy < 0 && minStepsPaste < 0) return -1;
    	else if (minStepsCopy < 0) return 1 + minStepsPaste;
    	else if (minStepsPaste < 0) return 2 + minStepsCopy;
    	return 1 + Math.min(1 + minStepsCopy, minStepsPaste);
    }
}
