package Baiscs;

public class intOverflow
{
    public static void main(String[] args)
    {
        int overflowInt = 2147483647;
        overflowInt++;
        System.out.println(overflowInt);
        //2147483647 ist der max wert und bei einem overflow springt er wieder auf das Minimum, WEIL: das linke bit ist das sogennante Vorzeichen Bit und ist somit reserviert wenn bei 2147483647 +1 gemacht wird, wird das vorzeichen Bit beschrieben und alle anderen Bits werden somit auf 0 zurückm gesetzt und da das Vorzeichen bit jetzt auf 1 steht(neg)
        //zählt der jtzt vom minimalwert hoch bis -1.
        //Nachrechnen kann man das mit Binärdasrstellung addition im 2er komplement.
    }
    
  
}