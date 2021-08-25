public class Fizzbuzz {
public String generate(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
        return "fizzbuzz";
    } else if (number % 5 == 0) {
        return "buzz";
    } else if ( number % 3 == 0) {
        return "fizz";
    }
    return String.valueOf(number);
}
    public static void main(String[] args) {
        Fizzbuzz subject = new Fizzbuzz();
        for (int i =0; i < 21; i ++){
            System.out.println(subject.generate(i));
        }

    }
}