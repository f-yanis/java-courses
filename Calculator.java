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
        if (params.length == 1){
            for (Integer param : params){
                this.result -= param;
            }
        }else if (params.length == 2){
            this.result = params[0] - params[1];
        }
    }

    /*
    * Умножаем аргументы.
    * @param params Аргументы умножения
    */
    public void mult(int ... params){
        if (params.length == 1){
            for (Integer param : params){
                this.result *= param;
            }
        }else if(params.length == 2){
            this.result = params[0] * params[1];
        }
    }

    /*
    * Делим аргументы.
    * @param params Аргументы деления
    */
    public void div(int ... params){
        if (params.length == 1){
            for (Integer param : params){
                this.result /= param;
            }
        } else if(params.length == 2){
            this.result = params[0] / params[1];
        }
    }

    /*
   * Находим степень аргумента.
   * @param params Аргументы суммирования
   */
    public void exp(int ... params){
        if (params.length == 1){
            for (Integer param : params){
                this.result ^= param;
            }
        }else if(params.length == 2){
            this.result = params[0] ^ params[1];
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

