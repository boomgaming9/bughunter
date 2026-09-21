/* Find fejlen i koden */

void main() {
    int[] numbers = {4, 8, 15, 16, 23, 42};
    final int TARGET = 15;

    for (int number : numbers) {
        IO.println(number == TARGET ? "Found" : "Not found");
        }
}
