/* Find fejlen i koden og ret den */

void main() {
    int age = Integer.parseInt(IO.readln("Indtast din alder: "));
    
    IO.println(age > 18 ? "Du er en voksen" : "Du er ikke en voksen.");
}