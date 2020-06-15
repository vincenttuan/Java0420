
package com.myjava.ocp.lab16;

import com.myjava.ocp.lab16.exchange.ExchangeService;

/**
 *
 * @author teacher
 */
public class ExchangeClient {
    public static void main(String[] args) {
        System.out.printf("NTD $%.2f\n", new ExchangeService().totalBalance());
    }
}
