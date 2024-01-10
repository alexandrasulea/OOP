import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> cars=new ArrayList<String>();

        cars.add("Dacia");
        cars.add("Renault");
        cars.add("Toyota");
//        for(int i=0; i<cars.size();i++)
//        {
//           if (cars.get(i).equals("Dacia"))
//            {
//                cars.set(i, "Logan");
//            }
//        }
        ListIterator<String>carsIt=cars.listIterator();
        while(carsIt.hasNext())
            {
                String car = carsIt.next();
                if (car.equals("Dacia"))
                    carsIt.set("Logan");
            }

        System.out.println(cars);
        System.out.println(cars);

        String[]chat={"Buna","Buna","ce","mai","faci"};
        Map<String,Integer>myHash=new HashMap<String,Integer>();

                for(int i=0;i< chat.length;i++)
                {
                    if(!myHash.containsKey(chat[i]))
                    {
                        myHash.put(chat[i],1);
                    }
                    else
                    {
                        int n=myHash.get(chat[i]);
                        myHash.put(chat[i],n+1);

                    }
                }
        for(Map.Entry<String,Integer>entry: myHash.entrySet())
        {
            System.out.println(entry.getKey()+ " "+ entry.getValue());

        }
    }
}