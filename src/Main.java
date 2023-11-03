import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> todo = new ArrayList<String>();
        todo.add("Breakfast");
        todo.add("Feed the cat");
        todo.add("Work");
        todo.add("Sleep");
        System.out.println("What have you to do today");
        System.out.println(todo);


        List<String> val = new ArrayList<String>();
        val.add("toad");
        val.add("salamander");
        val.add("axolotl");
        val.add("serpent");
        val.add("salamander");
        val.add("axolotl");
        System.out.println("Original List" + val);
        Set<String> dubl = new HashSet<String>(val);
        System.out.println("Lista noua=>" + dubl);


        Map<String, String> translate = new HashMap<>();
        translate.put("T-shirt", "Tricou");
        translate.put("Sweater", "Pulover");
        translate.put("Pants", "Pantaloni");
        translate.put("Jeans", "Blugi");
        translate.put("Coat", "Palton");
        translate.put("Dress", "Rochie");
        translate.put("Shirt", "Camasa");
        translate.put("Suit", "Costum");
        translate.put("Jacket", "Sacou");
        translate.put("Blouse", "Bluza");
        for (Map.Entry<String, String> entry : translate.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Introdu o haina");
        String s = in.nextLine();
        boolean f=true;
        for (Map.Entry<String, String> m : translate.entrySet()) {
            if (m.getValue().equals(s)) {
                System.out.println(m.getKey() + ":" + m.getValue());
            } else System.out.println("Nu este in dictionar");
        }
    }
}