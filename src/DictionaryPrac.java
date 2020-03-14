import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryPrac {
    public static void main(String[] args) {
//        //Initialize dictionary
//        Map<String, String> engIndDic = new HashMap<String, String>();
//        // Input things to dictionary dict(keySet, values)
//        engIndDic.put("Sunday", "Minggu");
//        engIndDic.put("Monday", "Senin");
//        engIndDic.put("Tuesday", "Selasa");
//        engIndDic.put("Wednesday", "Rabu");
//        engIndDic.put("Thurday", "Kamis");
//        engIndDic.put("Friday", "Jumat");
//        engIndDic.put("Saturday", "Sabtu");
//        System.out.println();
//        System.out.println(engIndDic.get("Sunday"));
//        System.out.println(engIndDic.get("Monday"));
//        System.out.println(engIndDic.get("Tuesday"));
//        System.out.println(engIndDic.get("Nothing"));
//        System.out.println();
//        //Print Keyset
//        System.out.println(engIndDic.keySet());
//        System.out.println(engIndDic.values());
//        Print size
//        System.out.println(engIndDic.size);
//        //Print all to string
//        System.out.println(engIndDic.toString());
          //Remove keyset / values
//        System.out.println(engIndDic.remove("Sunday));

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            } else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}