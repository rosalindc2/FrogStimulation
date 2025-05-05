public class Main 
{
    public static void main(String[] args)
    {
        FrogSimulation sim = new FrogSimulation(24,5);
        System.out.println(sim.simulate());
        FrogSimulation simTwo = new FrogSimulation(25,4);
        System.out.println(simTwo.simulate());
        FrogSimulation simThree = new FrogSimulation(31,3);
        System.out.println(simThree.simulate());
        FrogSimulation simFour = new FrogSimulation(-2,3);
        System.out.println(simFour.simulate());
        FrogSimulation simFive = new FrogSimulation(18,3);
        System.out.println(simFive.simulate());

        System.out.println(sim.runSimulations(4));
    }
}