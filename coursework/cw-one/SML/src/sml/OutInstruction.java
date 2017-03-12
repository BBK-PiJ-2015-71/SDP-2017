package sml;

/**
 * Created by User on 12/03/2017.
 */

public class OutInstruction extends Instruction {
    private int result;


    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int result) {
        this(label, "out");
        this.result = result;
    }

    @Override
    public void execute(Machine m) {
        int result = m.getRegisters().getRegister(this.result);
        System.out.println("Value of "+this.result +" is "+ result);
    }

    @Override
    public String toString() {
        return super.toString() + " " + result + " print to java console ";
    }
}
