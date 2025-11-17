public class Main {

    public static void main(String[] args) {
        Pokemon Glumanda = new Pokemon("Glumanda", "Feuer", 60, 8, "Großbrand", "Glut");
        Pokemon Schiggy = new Pokemon("Schiggy", "Wasser", 50, 6, "Sturzbach", "Aquaknarre");
        Glumanda.faehigkeiten();
        Glumanda.entwicklung = 16;
        Glumanda.entwickeln("Glumanda", false);
        Schiggy.faehigkeiten();
        Schiggy.entwicklung = 16;
        Schiggy.entwickeln("Schiggy", false);
    }
}
