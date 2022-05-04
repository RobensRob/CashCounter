package de.robsrob;

import de.robsrob.frames.MainFrame;

public class CashCounter {

    public static int cashEuros;
    public static int cashCents;

    public static void main(String[] args) {
        cashEuros = 0;
        cashCents = 0;

        new MainFrame(cashEuros, cashCents);
    }
}
