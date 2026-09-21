/* Find fejlen i koden */

void main() {
    int[] numbers = {4, 8, 15, 16, 23, 42};
    int target = 15;

    for (int number : numbers) {
        IO.println(number == target ? "Found" : "Not found");
        }
}
