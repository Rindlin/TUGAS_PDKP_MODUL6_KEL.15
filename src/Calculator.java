import java.util.ArrayList;

public abstract class Calculator {
    private final ArrayList<Integer> numbers = new ArrayList<>();
    private double result;
    private String show;

    public int getNumbers(int index){
        return this.numbers.get(index);
    }
    public void setNumbers(int numbers){
        this.numbers.add(numbers);
    }
    public float getResult(){
        return (float) result;
    }
    public void setResult(double result){
        this.result = result;
    }
    public String getShow(){
        return show;
    }
    public void setShow(String show){
        this.show = show;
    }

    public void clear(){
        this.numbers.clear();
    }
    public int size(){
        return this.numbers.size();
    }


    abstract void show(String process);

    abstract void squareRoot();

    abstract void exponentiation();

    abstract void factorial();

    abstract void add();

    abstract void substract();

    abstract void multiple();

    abstract void divide();
}
class BasicCalculator extends Calculator{

    void add(){
        double result = getNumbers(0);
        for (int i=1; i<size(); i++){
            result += getNumbers(i);
        }
        setResult(result);
    }
    void substract(){
        double result = getNumbers(0);
        for (int i = 1; i<size(); i++){
            result -= getNumbers(i);
        }
        setResult(result);
    }


    void multiple(){
        double result = getNumbers(0);
        for (int i = 1; i< size(); i++){
            result *= getNumbers(i);
        }
        setResult(result);
    }
    void divide(){
        double result = getNumbers(0);
        for (int i=1; i<size(); i++){
            result /= getNumbers(i);
        }
        setResult(result);
    }
    @Override
    void show(String process){
        String show = "";
        for (int i=0; i<size(); i++){
            if (i+1==size()){
                show += (Integer.toString(getNumbers(i)));
            }else {
                show += (getNumbers(i)+" "+process+" ");
            }
        }
        setShow(show);
    }
    @Override
    void squareRoot(){}
    @Override
    void exponentiation(){}
    @Override
    void factorial(){}

}
class ScientificCalculator extends Calculator{

    @Override
    void squareRoot(){
        double result = Math.sqrt(getNumbers(0));
        setResult(result);
    }
    @Override
    void exponentiation(){
        double result = Math.pow(getNumbers(0), getNumbers(1));
        setResult(result);
    }
    @Override
    void factorial(){
        int result = 1;
        if (getNumbers(0)==0||getNumbers(0)==1){
            result = result;
        }else {
            for (int i=1; i<=getNumbers(0); i++){
                result *= i;
            }
        }
        setResult(result);
    }
    @Override
    void show(String process){
        String show = "";
        for (int i=0; i<size(); i++){
            if (i+1==size()){
                show += (Integer.toString(getNumbers(i)));
            }else {
                show += (getNumbers(i)+" "+process+" ");
            }
        }
        setShow(show);
    }
    @Override
    void add(){}
    @Override
    void substract(){}
    @Override
    void multiple(){}
    @Override
    void divide(){}
}
