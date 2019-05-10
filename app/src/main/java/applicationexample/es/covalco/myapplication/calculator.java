package applicationexample.es.covalco.myapplication;

import applicationexample.es.covalco.myapplication.Icalculator;

public class calculator implements Icalculator {

    private int num1;
    private int num2;


    public calculator(){
    }

    public calculator(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public int add(){
        return num1 + num2;
    }

   @Override
    public int substract() {
        return num1-num2;
    }

    @Override
    public int multiply() {
        return num1*num2;
    }

    @Override
    public int divide() {
        return num1/num2;
    }
}
