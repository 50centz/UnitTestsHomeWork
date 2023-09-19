package numbers;

public class MainHW {

    public boolean evenOddNumber(int n){
        return n % 2 == 0;
    }

    public boolean numberInInterval(int n){
        if (n > 24 && n < 100){
            return true;
        }
        return false;
    }
}
