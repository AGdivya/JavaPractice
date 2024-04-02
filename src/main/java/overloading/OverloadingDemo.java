package overloading;

public class OverloadingDemo {
    public static void main(String[] args)
    {
        //here we are calling add method different times for different number of arguments
        AdditionWithoutOverloading awo =  new AdditionWithoutOverloading();
        awo.addTwoNo(4,5);              //9
        awo.addThreeNo(56,45,34);    //135
        awo.addFourNo(3,0,4,6);   //13

        //here we are calling add method using overloading concept
        AdditionWithOverloading aw =  new AdditionWithOverloading();
        aw.add(4,5);        //9
        aw.add(4,7,9);   //20
        aw.add(10.0, 4);    //14.0
        aw.add(3,56.0);     //59.0

        //if we have same datatype only number of argument increases then we can use var args
        AdditionUsingVarArgs awv = new AdditionUsingVarArgs();
        awv.add(4,5,6,6,7);
        awv.add(2,3);
        awv.add(2.00,3,4,5);
    }

}
