/**
 * Test the CalcEngine class.
 * 
 * @author Hacker T. Largebrain 
 * @version 1.0
 */
public class CalcEngineTester
{
    // The engine to be tested.
    private CalcEngine engine;

    /**
     * Constructor for objects of class CalcEngineTester
     */
    public CalcEngineTester()
    {
        engine = new CalcEngine();
    }

    /**
     * Test everything.
     */
    public void testAll()
    {
        System.out.println("Testing the addition operation.");
        System.out.println("The result is: " + testPlus());
        System.out.println("Testing the subtraction operation.");
        System.out.println("The result is: " + testMinus());
        System.out.println("All tests passed.");
    }

    /**
     * Test the plus operation of the engine.
     * @return the result of calculating 3+4.
     */
    public int testPlus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the key presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 7.
        return engine.getDisplayValue(); 
    }

    /**
     * Test the plus operation of the engine using parameters.
     * @param n1 first number of the plus operation
     * @param n2 second number of the plus operation
     * @return the result of calculating n1+n2.
     */
    //public int testPlusParameters()
    //{
    // TODO: add the code of this method using the parameters.

    //}

    /**
     * Test the plus operation of the engine (Wrong version).
     * @return the result of calculating 3+5.
     */
    public int testPlusError()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the key presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plusError();
        engine.numberPressed(5);
        engine.equals();
        // Return the result, which should be 7.
        return engine.getDisplayValue(); 
    }

    /**
     * Test the plus operation of the engine.
     * @return the result of calculating 3+4.
     */
    public int testPlusErrorFor()
    {
        int valor = 0;
        //for added to use the "Continue" Debugger option 
        for(int i=0; i<4; i++) {
            // Make sure the engine is in a valid starting state.
            engine.clear();
            // Simulate the key presses: 3 + 4 =
            engine.numberPressed(3);
            engine.plusError();
            engine.numberPressed(4);
            engine.equals();
            valor = engine.getDisplayValue();
        }
        // Return the result, which should be 7.
        return valor;
    }

    /**
     * Test the minus operation of the engine.
     * @return the result of calculating 9 - 4.
     */
    public int testMinus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 9 - 4 =
        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 5.
        return engine.getDisplayValue();
    }
}
