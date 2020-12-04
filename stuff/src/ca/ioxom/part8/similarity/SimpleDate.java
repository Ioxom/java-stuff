package ca.ioxom.part8.similarity;

public class SimpleDate {
    public int day;
    public int month;
    public int year;
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof SimpleDate)) return false;
        
        SimpleDate objectAsDate = (SimpleDate) object;
        return objectAsDate.year == this.year && objectAsDate.month == this.month && objectAsDate.day == this.day;
    }

    public static void main(String[] arrgs) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
