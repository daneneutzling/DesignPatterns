package Interpreter;

public class Context {
    protected String InputData;
    protected int OutputData;
    public Context(String input) {
        this.InputData = input;
    }
    public String getInputData() {
        return InputData;
    }
    public void setInputData(String inputData) {
        this.InputData = inputData;
    }
    public int getOutputData() {
        return OutputData;
    }
    public void setOutputData(int outputData) {
        this.OutputData = outputData;
    }
}