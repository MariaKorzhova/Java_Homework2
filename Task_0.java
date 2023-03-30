//  Task 0
 // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”

public class Task_0 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String a = findJewelsInStones(jewels, stones);
        System.out.printf(a);
    }
    public static String findJewelsInStones(String jewels, String stones) {
        int count = 0;
        int count1 = 0;
        String [] jew = jewels.split("");
        String [] ston = stones.split("");
        for (int i = 0; i < ston.length; i++){
            if (ston[i].indexOf(jew[0]) != -1){
                count ++;
            }
            if (ston[i].indexOf(jew[1]) != -1){
                count1 ++;
            }
        }
        //System.out.printf("%s%s%s%s\n", jew[0], count, jew[1], count1);
        String ds = Integer.toString(count); String dss = Integer.toString(count1);
        String result = jew[0].concat(ds).concat(jew[1]).concat(dss);
        return result;
        
    }
    }