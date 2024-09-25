public class Feeder {

    //Attribute to show the current amount of food in the Feeder
    private int currentFood;

    //Behaviour to simulate one day of the Feeder
    public void simulateOneDay(int numBirds)
    {
        if (Math.random() < 0.05) currentFood = 0; 
        else
        {
            int eaten = (int)(Math.random() * 41) + 10;
            currentFood -= eaten * numBirds;
            if(currentFood < 0) currentFood = 0;
        }
    }

    //Behaviour to simulate multiple days of the Feeder
    public int simulateManyDays(int numBirds, int numDays) 
    {
        int days = 0;
        while(numDays > 0)
        {
            if(currentFood == 0) return days;
            simulateOneDay(numBirds);
            numDays--;
            days++;
        }
        return days;
    }

    //Behavior to return the current amount of food in the Feeder
    public int getCurrentFood()
    {
        return currentFood;
    }

    //Behviour to set currentFood to the integer c
    public Feeder(int c)
    {
        currentFood = c;
    }

    //Default Feeder constructor     
    public Feeder() {}

    //Behaviour to print the currentFood object
    public String toString()
        {
            return "Current Food: " + currentFood;
        }

}
