import java.util.*;
class hashhash
{
    public static void main(String ar[])
    {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"deepali");
        hm.put(2,"jaydeep");
        hm.put(3,"others");
        System.out.print(hm);
        if(hm.containsKey(2))
            System.out.println(hm.get(2));
        //hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsValue("jaydeep"));
        System.out.println(hm.values());

        HashSet<Integer> hs = new HashSet<>();
        hs.add(7);
        hs.add(16);
        hs.add(21);
        for(int i:hs)
            System.out.print(i+" ");
        
        Iterator<Integer> i = hs.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");

        
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(16);
        lhs.add(21);
        for(int i1:lhs)
            System.out.print(i1+" ");
    }
}