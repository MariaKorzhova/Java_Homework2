// Task 1
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class Task_1 {
    public static void main(String[] args) {
        String s = "cba"; //acb
        int[] index = {2,3,1};
        shuffle(s, index);
    }
    public static void shuffle(String s, int[] index){
        String [] s2 = s.split("");
        String [] s3 = new String [s2.length];
        for (int i = 0; i < s2.length; i++){
            //s3[i]= s2[index[i]-1];
            s3[index[i]-1]= s2[i];
            }
        for (String a : s3){
            System.out.printf(a);
        }
    }
}