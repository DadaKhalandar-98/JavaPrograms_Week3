import java.util.Scanner;

class NumbertoWordsRunner
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        NumbertoWords n = new NumbertoWords();
        String result=n.convert(number);
        System.out.println(result);
    }
}