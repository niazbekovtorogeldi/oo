
import java.util.Scanner;

class Account {
    String name;
    double balance;

    public double deposit(double c){
        balance+=c;
        return c;
    }
    public double withdrawal(double sum){
        balance-=sum;
        return sum;
    }
    double transfer(){
        double num = 200;
        return num;

    }
}