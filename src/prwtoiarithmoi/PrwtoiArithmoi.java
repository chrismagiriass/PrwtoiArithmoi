/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prwtoiarithmoi;

import java.util.Scanner;

/**
 *
 * @author Christos
 */
public class PrwtoiArithmoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("dwse mexri poion arithmo thes n vrw prwtous");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        for (int i = 2; i <= n; i++) {
            int k = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    k = k + 1;
                }

            }
            if (k == 0) {
                p = p + 1;
                System.out.print(p + "   ");
                System.out.println(i);

            }
        }

    }

}
