
import java.util.Objects;
import java.util.Scanner;


public class CalculatorApp {
    public static void display1(){
        System.out.print("=== CALCULATOR ==="+
                "\n1. Basic Calculator"+
                "\n2. Scientific Calculator"+
                "\nChoose Arithmatic Operation (x for exit): ");
    }
    public static void display2(){
        System.out.print("*** Basic Calculator ***"+
                "\n1. Addition"+
                "\n2. Subscription"+
                "\n3. Multiplication"+
                "\n4. Division"+
                "\nChoose Arithmatic Operation (x for cancel): ");
    }
    public static void display3(){
        System.out.print("*** Scientific Calculator ***"+
                "\n1. Square Root"+
                "\n2. Eksponantiation"+
                "\n3. Factorial"+
                "\nChoose Scientific Operation (x for cancel): ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator basic = new BasicCalculator();
        Calculator scientific = new ScientificCalculator();

        String choose, calculate, scanNum;

        while (true){
            display1();
            choose = scan.next();
            System.out.println(" ");

            if (Objects.equals(choose, "x")){
                System.out.println("Thank you!!!");
                break;
            }else {
                if (Objects.equals(choose, "1")){
                    while (true){
                        display2();
                        calculate = scan.next();
                        if (Objects.equals(calculate, "x")){
                            System.out.println(" ");
                            break;
                        } else if (Objects.equals(calculate, "1")) {
                            while (true){
                                System.out.print("Input number (x for finish): ");
                                scanNum = scan.next();
                                if (Objects.equals(scanNum, "x")){
                                    basic.add();
                                    basic.show("+");
                                    System.out.println(basic.getShow());
                                    System.out.println("Result = "+ Math.round(basic.getResult())+"\n");
                                    basic.clear();
                                    break;
                                }else {
                                    basic.setNumbers(Integer.parseInt(scanNum));
                                }
                            }

                        } else if (Objects.equals(calculate, "2")) {
                            while(true){
                                System.out.print("Input number (x for finish): ");
                                scanNum = scan.next();
                                if (Objects.equals(scanNum, "x")) {
                                    basic.substract();
                                    basic.show("-");
                                    System.out.println(basic.getShow());
                                    System.out.println("Result = " + Math.round(basic.getResult()) + "\n");
                                    basic.clear();
                                    break;
                                }else {
                                    basic.setNumbers(Integer.parseInt(scanNum));
                                }
                            }
                        }else if (Objects.equals(calculate, "3")) {
                            while (true) {
                                System.out.print("Input number (x for finish): ");
                                scanNum = scan.next();
                                if (Objects.equals(scanNum, "x")) {
                                    basic.multiple();
                                    basic.show("x");
                                    System.out.println(basic.getShow());
                                    System.out.println("Result = " + Math.round(basic.getResult()) + "\n");
                                    basic.clear();
                                    break;
                                } else {
                                    basic.setNumbers(Integer.parseInt(scanNum));
                                }
                            }
                        }else if (Objects.equals(calculate, "4")) {
                            while (true) {
                                System.out.print("Input number (x for finish): ");
                                scanNum = scan.next();
                                if (Objects.equals(scanNum, "x")) {
                                    basic.divide();
                                    basic.show(":");
                                    System.out.println(basic.getShow());
                                    System.out.println("Result = " + Math.round(basic.getResult()) + "\n");
                                    basic.clear();
                                    break;
                                } else {
                                    basic.setNumbers(Integer.parseInt(scanNum));
                                }
                            }
                        }else {
                            System.out.println("Can't Responding");
                        }
                    }
                } else if (Objects.equals(choose, "2")) {
                    while (true){
                        display3();
                        calculate = scan.next();
                        if (Objects.equals(calculate, "x")){
                            System.out.println(" ");
                            break;
                        } else if (Objects.equals(calculate, "1")) {
                            System.out.print("Input number: ");
                            scanNum = scan.next();
                            scientific.setNumbers(Integer.parseInt(scanNum));
                            scientific.squareRoot();
                            scientific.setShow("√"+scientific.getNumbers(0));
                            System.out.println(scientific.getShow());
                            System.out.println("Result ="+ Math.round(scientific.getResult())+"\n");
                            scientific.clear();
                        } else if (Objects.equals(calculate, "2")) {
                            for (int i=0; i<2; i++){
                                System.out.print("Input number : ");
                                scanNum = scan.next();
                                scientific.setNumbers(Integer.parseInt(scanNum));
                            }
                            scientific.exponentiation();
                            scientific.show("^");
                            System.out.println(scientific.getShow());
                            System.out.println("Result = "+ Math.round(scientific.getResult())+"\n");
                            scientific.clear();

                        } else if (Objects.equals(calculate, "3")){
                            System.out.print("Input number: ");
                            scanNum = scan.next();
                            scientific.setNumbers(Integer.parseInt(scanNum));
                            scientific.factorial();
                            scientific.setShow(scientific.getNumbers(0)+"!");
                            System.out.println(scientific.getShow());
                            System.out.println("Result ="+ Math.round(scientific.getResult())+"\n");
                            scientific.clear();
                        }else {
                            System.out.println("Can't Responding");
                        }
                    }
                }else {
                    System.out.println("Can't Understand the request");
                }
            }
        }
    }
}
