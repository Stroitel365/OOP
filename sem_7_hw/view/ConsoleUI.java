package sem_7_hw.view;

import java.util.Scanner;

import sem_7_hw.model.CalculateController;

public class ConsoleUI {

    public void start(){

        while (true){
            String firstRealValue = prompt("Ведите действительную часть первого числа\n");
            while (!checkIfDouble(firstRealValue)) {
                firstRealValue = prompt("Ведите действительную часть первого числа\n");
                checkIfDouble(firstRealValue);  
            }
            String firstImagineryValue = prompt("Ведите мнимую часть первого числа без i\n");
            while (!checkIfDouble(firstImagineryValue)) {
                firstImagineryValue = prompt("Ведите мнимую часть первого числа\n");
                checkIfDouble(firstImagineryValue);  
            }
            String secondRealValue = prompt("Ведите действительную часть второго числа\n");
            while (!checkIfDouble(secondRealValue)) {
                secondRealValue = prompt("Ведите действительную часть второго числа\n");
                checkIfDouble(secondRealValue);  
            }
            String secondImagineryValue = prompt("Ведите мнимую часть второго числа без i\n");
            while (!checkIfDouble(secondImagineryValue)) {
                secondImagineryValue = prompt("Ведите мнимую часть второго числа\n");
                checkIfDouble(secondImagineryValue);
            }
            String operation = prompt("Ведите операцию +, *, /\n");
            String result = CalculateController.Calculate(operation, firstRealValue, firstImagineryValue,secondRealValue,secondImagineryValue);
            System.out.println("Ответ: "+result+"\n");
            break;
        }
        // здесь будет логиа ввода вывода команд на экран и отправки запроса выполнения операции


    }





    private boolean checkIfDouble(String firstRealValue) {
       try { double intValue = Double.parseDouble(firstRealValue);
        return true;
       } catch (Exception e) {
        System.out.println("Неверный ввод. Требуется число.");
        return false;
       }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
