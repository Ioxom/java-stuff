package ca.ioxom.part8.hashmap;

import java.util.HashMap;

public class IOU {
    public HashMap<String, Double> hashMap;
    public IOU() {
        this.hashMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.hashMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (this.hashMap.get(toWhom) == null) return 0;
        return this.hashMap.get(toWhom);
    }

    public static void main(String[] arrgs) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
