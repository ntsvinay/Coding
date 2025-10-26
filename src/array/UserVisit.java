package array;

import com.sun.jdi.InterfaceType;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UserVisit {

    public void getUserVisit()
    {
        List<String> visits = List.of(
                "user1,2023-04-10T08:30:00",
                "user2,2023-04-10T09:00:00",
                "user1,2023-04-10T09:30:00",
                "user3,2023-04-10T10:00:00",
                "user2,2023-04-10T11:00:00",
                "user4,2023-04-10T11:30:00"
        );



        Map<String,Long> hashMap=  visits.stream().map(a->a.split(",")[0]).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(hashMap);

        List<Map.Entry<String, Long>> list1=
                hashMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).limit(2).collect(Collectors.toList());


        Map<String,Integer> hm=new HashMap<>();
        for(String visit:visits)
        {
            String[] str=visit.split(",");

            if(hm.containsKey(str[0]))
            {
                int count=hm.get(str[0]);
                count++;
                hm.put(str[0],count);
            }
            else{
                hm.put(str[0],1);
            }
        }

        System.out.print(hm);
        List<String> empList=new ArrayList<>();

        System.out.println();
        List<Map.Entry<String, Integer>> list=
                hm.entrySet().stream().
                        sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(2).collect(Collectors.toList());

        for(Map.Entry mp:list)
        {
            System.out.println(mp.getKey());
        }

    }

    public static void main(String[] args) {
        new UserVisit().getUserVisit();
    }
}
