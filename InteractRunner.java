import java.util.Scanner;

/*
 * Класс для запуска калькулятора. Поддерживает ввод прользователя.
 */
public class InteractRunner{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "нет";
            while(!exit.equals("да")){
                if (calc.getResult() == 0){
                    System.out.print("Введите первое число: ");
                    String fitst = reader.next();

                    System.out.print("Введите второе число: ");
                    String second = reader.next();

                    System.out.print("Введите знак операции: ");
                    String ariph = reader.next();

                    if (ariph.equals("+")){
                        calc.add(Integer.valueOf(fitst),
                                Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("-")){
                        calc.sub(Integer.valueOf(fitst),
                                Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("*")){
                        calc.mult(Integer.valueOf(fitst),
                                Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("/")){
                        calc.div(Integer.valueOf(fitst),
                                Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("^")){
                        calc.exp(Integer.valueOf(fitst),
                                Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("00")){
                        calc.cleanResult();
                    }
                } else if(calc.getResult() != 0){
                    System.out.println("Введите первое число: " + calc.getResult());

                    System.out.print("Введите второе число: ");
                    String second = reader.next();

                    System.out.print("Введите знак операции: ");
                    String ariph = reader.next();

                    if (ariph.equals("+")){
                        calc.add(Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("-")){
                        calc.sub(Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("*")){
                        calc.mult(Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("/")){
                        calc.div(Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("^")){
                        calc.exp(Integer.valueOf(second));
                        System.out.println("Резултат: " + calc.getResult());
                    } else if (ariph.equals("00")){
                        calc.cleanResult();
                    }
                }

                System.out.println("Выйти?: да/нет");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}
