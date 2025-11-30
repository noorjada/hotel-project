/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import com.mycompany.noor.welcome;

/**
 *
 * @author Dream4net
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new welcome().setVisible(true);
        }
    }
}
