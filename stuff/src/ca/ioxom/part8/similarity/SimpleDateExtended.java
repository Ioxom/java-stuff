package ca.ioxom.part8.similarity;

public class SimpleDateExtended {
    public int day;
    public int month;
    public int year;
    public SimpleDateExtended(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof SimpleDateExtended)) return false;

        SimpleDateExtended objectAsDate = (SimpleDateExtended) object;
        return objectAsDate.year == this.year && objectAsDate.month == this.month && objectAsDate.day == this.day;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt("" + this.year + this.month + this.day);
    }
}
