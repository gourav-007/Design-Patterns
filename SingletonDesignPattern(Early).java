//Singleton Design Pattern (Early Initialization)

public class TestClass {

    public static void main(String[] args) {

        Balance check = Balance.getInstance();
        System.out.println(check.getBalanceAvailable());

        Balance doubleCheck = Balance.getInstance();
        System.out.println(doubleCheck.getBalanceAvailable());


    }

}

class Balance{

    private double balanceAvailable;
    private static Balance instance = new Balance();


    private Balance() {
        this.balanceAvailable = 7700.00;
    }

    public static Balance getInstance(){
        return instance;
    }

    public double getBalanceAvailable(){
        return balanceAvailable;
    }

    public static double calculate(){
        return 7.7;
    }

}

