//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package hw_2;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.SimpleFormatter;

public class hw_2_1 {
    public static void main(String args[]) throws IOException{
        Logger logger = Logger.getLogger(hw_2_1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        StringBuilder message = new StringBuilder();
        message.append(" ");
        int[] arr = {1,7,3,4,5,1,3,5,2,1,4};
        int buf = 0;
        int step = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++){
                if (arr[j] > arr[j+1]){
                    buf = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buf;
                    step++;
                    message.delete(0, message.length());
                    message.append("Step #").append(step).append("\n").append("Elem number ").append(j).append(" swapped with number ").append(j+1);
                    logger.info(message.toString());
                }
            }

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
