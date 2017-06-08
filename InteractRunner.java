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
				System.out.print("Введите первое число: ");
				String fitst = reader.next();
				System.out.print("Введите второе число: ");
				String second = reader.next();
				calc.add(Integer.valueOf(fitst), 
						 Integer.valueOf(second));
				System.out.println("Резултат: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Выйти?: да/нет");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}
