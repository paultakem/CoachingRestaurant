import java.util.Scanner;

public class Main {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    String age;



    public static void main(String[] args) {


        System.out.println("Hello World");
        while (true) {
            System.out.println("------------------Menu-------------------");
            System.out.println("1. Print name and age");
            System.out.println("2. Exit");
            System.out.println("------------------------------------------");

            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();

            if(answer.equals("2")){
                break;
            }


        }
    }


}
