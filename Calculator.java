/**
 * Класс реализует калькулятор
 */
 
 public class Calculator {
	 //Результат вычисления
	 private int result;
	 
	 /*
	 * Суммируем аргументы.
	 * @param params Аргументы суммирования
	 */
	 public void add(int ... params){
		 for (Integer param : params){
			this.result += param;
		 }
	 }
	 
	 /*
	 * Вычитаем аргументы.
	 * @param params Аргументы разницы
	 */
	 public void sub(int ... params){
		 for (Integer param : params){
			this.result -= param;
		 }
	 }
	 
	 /*
	 * Умножаем аргументы.
	 * @param params Аргументы умножения
	 */
	 public void mult(int ... params){
		 for (Integer param : params){
			this.result *= param;
		 }
	 }
	 
	 /*
	 * Делим аргументы.
	 * @param params Аргументы деления
	 */
	 public void div(int ... params){
		 for (Integer param : params){
			this.result /= param;
		 }
	 }
	 
	  /*
	 * Находим степень аргумента.
	 * @param params Аргументы суммирования
	 */
	 public void exp(int ... params){
		 for (Integer param : params){
			this.result ^= param;
		 }
	 }
	 
	 /*Получить результат.
	 * @return результат вычисления.
	 */
	 public int getResult(){
		return this.result;
	 }
	 
	 /*Очистить результат вычисления.
	 * @return результат вычисления.
	 */
	 public void cleanResult(){
		this.result = 0;
	 }
 }
