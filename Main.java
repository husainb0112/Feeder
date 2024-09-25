public class Main
{
    public static void main(String[] args)
    {
        //Feeder test
        Feeder f = new Feeder();
        System.out.println(f);
        System.out.println(f.getCurrentFood());

        //Feeder simulation
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood()); 
        g.simulateOneDay(12);

        //Random
        System.out.println(Math.random()); 
        double random = Math.random() * 10;
        System.out.println(random); 

        //Random between 0-10
        int random2 = (int)(Math.random() * 10);
        System.out.println(random2);

        //Random between 10-50
        int random3 = (int)(Math.random() * 41 + 10);
        System.out.println(random3);

        //Bear simulation
        System.out.println(Math.random() < 0.05); 
        
        //Day simulation
        g.simulateOneDay(12); 
        System.out.println(g.getCurrentFood()); 

        //Day simulation
        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());

        //Printing the currentfood Object
        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);

        //Many days simulation
        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));

        //Test simulations
        Feeder a = new Feeder(500);
        a.simulateOneDay(12);
        System.out.println(a.getCurrentFood());

        Feeder b = new Feeder(100);
        b.simulateOneDay(22);
        System.out.println(b.getCurrentFood());

        Feeder c = new Feeder(100);
        c.simulateOneDay(5);
        System.out.println(b.getCurrentFood());

        Feeder k = new Feeder(250);
        System.out.println(k.simulateManyDays(10, 5));
        
        Feeder l = new Feeder(0);
        System.out.println(l.simulateManyDays(5, 10));
      
    }
}
