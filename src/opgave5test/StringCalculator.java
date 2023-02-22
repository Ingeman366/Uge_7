package opgave5test;

public class StringCalculator {
    public int add(String numbers){
        if (numbers == null || numbers.isEmpty()){
            return 0;
        }
        String[] numArray = numbers.split(",");
        int sum = 0;
        for (String num : numArray){
            sum += Integer.parseInt(num);
        }
        return sum;
    }
    public int add(String numbers, String delimiter){
        if (numbers == null || numbers.isEmpty()){
            return 0;
        }
        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        for (String num : numArray){
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
