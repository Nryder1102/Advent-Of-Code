import java.*;
import java.util.Scanner;
import java.lang.Math;

class Test {
    static void p(Object l){
        System.out.print(l);
        }
    static void pln(Object ln){
        System.out.println(ln);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int flag = 0;
        
        int ans = 0;
        double fuel = 0;
        while(flag != 100){
            int mass = scan.nextInt();
            mass = mass / 3;
            fuel = Math.round(mass) - 2;
            
            ans += fuel;
            flag++;
            if(flag == 100){
                p("\n" + ans);
            }
        }
    
    }


}





