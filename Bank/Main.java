package Bank;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void kontoAnzeige(Bank konto) {
        System.out.println("************************************");
        System.out.println("Kontonummer:" + konto.kontoNummer);
        System.out.println("Kontostand:" + konto.kontoStand);
        System.out.println("Dispolimit:" + konto.dispoLimit);
        System.out.println("Gepserrt?:" + konto.gesperrt);
        System.out.println("************************************");
    }


    public static double sicheresÜberweisen(double überweisung, Bank konto) {

        konto.kontoStand = konto.kontoStand + überweisung;
        konto.setKontostand(konto.kontoStand);
        return konto.kontoStand;
    }


    public static double sicheresAuszahlen(double auszahlung, Bank konto) {
        konto.kontoStand = konto.kontoStand - auszahlung;
        return konto.kontoStand;
    }


    public static double checkDispoLimit(Bank konto, double überweisung) {
        if (konto.kontoStand <= konto.dispoLimit) {
            System.out.println("Kontostand: " + konto.kontoStand + " \n Dispolimit wurde erreicht! \n Karte wird gesperrt!");
            konto.getGesperrt();
            konto.setGesperrt(true);
        }
        return konto.kontoStand;
    }


    public static void main(String[] args) {
        // Deklaration
        Scanner scanner = new Scanner(System.in);
        int eingabe;
        double überweisung = 0;
        double auszahlung = 0;
        int nummer = 1;
        boolean running = true;
        ArrayList<Bank> konten = new ArrayList<>();
        //
        while (running == true) {

            System.out.println("*****Spsßkasse Haltern am See*****\n");
            System.out.println("Bitte wählen sie: ");
            System.out.println("\n 1. Konto erstellen\n 2. Überweisung\n 3. Einzahlung\n 4. Kontenübersicht \n 5. Programm Beenden\n");
            System.out.println("Eingabe: ");
            eingabe = scanner.nextInt();
            switch (eingabe) {
                case 1: {
                    System.out.println("******Konto wird erstellt.******\n");
                    Bank konto = new Bank(nummer, 0, 0, false, false);
                    konto.setDispoLimit(1000);
                    konto.setKontoNummer(nummer);
                    konten.add(konto);
                    nummer++;
                    kontoAnzeige(konto);
                    System.out.println("**********************************");
                    continue;

                }

                case 2: {
                    System.out.println("Geben sie die Kontonummer ein auf die sie überweisen möchten\n");
                    System.out.println("Eingabe: ");
                    eingabe = scanner.nextInt();
                    for (Bank konto : konten) {
                        if (konto.gesperrt == false) {
                            if (eingabe == konto.kontoNummer) {
                                System.out.println("gefunden");
                                System.out.println("Geben sie die Summe ein die sie Überweisen möchten.\n");
                                System.out.println("Eingabe: ");
                                überweisung = scanner.nextDouble();
                                konto.kontoStand = konto.getKontostand();
                                konto.kontoStand = sicheresÜberweisen(überweisung, konto);
                                System.out.println("Überweisung getätigt!\n");
                                kontoAnzeige(konto);

                            }
                        }
                        if(konto.gesperrt == true) {
                            System.out.println("Konto ist gesperrt, interaktion nicht möglich!");
                            continue;
                        }
                    }

                    System.out.println("Welches Konto soll davon belastet werden?\n");
                    eingabe = scanner.nextInt();
                    for (Bank konto : konten) {
                        if (konto.gesperrt == false) {
                            if (eingabe == konto.kontoNummer) {
                                konto.kontoStand = konto.getKontostand();
                                konto.kontoStand = konto.kontoStand - überweisung;
                                konto.setKontostand(konto.kontoStand);
                                checkDispoLimit(konto, überweisung);
                                kontoAnzeige(konto);
                            }
                        }
                        if(konto.gesperrt == true) {
                            System.out.println("Konto ist gesperrt, interaktion nicht möglich!");
                            continue;
                        }
                        continue;
                    }
                }

                case 3: {
                    System.out.println("Von welchen Konto möchten sie sich Geld auszahlen lassen?\n");
                    System.out.println("Eingabe: ");
                    eingabe = scanner.nextInt();
                    for (Bank konto : konten) {
                        if(konto.gesperrt == false) {
                            if (eingabe == konto.kontoNummer) {
                                System.out.println("\n Geben sie den Betrag ein den sie sich auszahlen lassen möchten.\n");
                                System.out.println("Eingabe: ");
                                auszahlung = scanner.nextDouble();
                                sicheresAuszahlen(auszahlung, konto);
                                kontoAnzeige(konto);

                            }
                        }
                        if(konto.gesperrt == true) {
                            System.out.println("Konto ist gesperrt, interaktion nicht möglich!");
                            continue;
                        }
                    }
                    continue;
                }

                case 4: {
                    System.out.println("*******Kontenübersicht******\n");

                    if (konten.size() == 0) {
                        System.out.println("!!!Kein Konto vorhanden!!!");
                        continue;
                    }
                    for (Bank konto : konten) {

                        kontoAnzeige(konto);
                        continue;


                    }
                    continue;
                }

                case 5: {
                    System.out.println("Programm wird beendet!");
                    running = false;
                    break;
                }

                default: {
                    System.out.println("Programm wird beendet!");
                    break;
                }
            }
        }
    }

}
