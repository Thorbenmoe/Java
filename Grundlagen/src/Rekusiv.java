public static int rekusiv(int n) {

    if (n == 1) {
        return n;
    } else {
        return n * rekusiv(n - 1);
    }
}

void main() {
    int n = 10;
    n = rekusiv(n);
    IO.println(n);

}
