package HW6;

public class Cat {
    
    int month;
    int year;
    String catName;
    holder holder;
    char catMale;

    public Cat(String catName, holder holder) {
        this.catName = catName;
        this.holder = holder;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя = '" + catName + '\'' +
                ", Владелец = " + holder +
                ", Пол = " + catMale +
                '}';
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYearBirth(int year) {
        this.year = year;
    }

    public String getNameCat() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public holder getHolder() {
        return holder;
    }

    public void setHolder(holder holder) {
        this.holder = holder;
    }

    public char getCatMale() {
        return catMale;
    }

    public void setCatMale(char catMale) {
        this.catMale = catMale;
    }

    public boolean isMail() {
        return this.catMale == 'M';
    }

    public boolean equals(Object someCatObj) { 
        Cat someCat = (Cat) someCatObj;
        return (this.holder.name.equals(someCat.holder.name)) &&
                (this.catMale == someCat.catMale) &&
                (this.catName.equals(someCat.catName)) &&
                (this.month == someCat.month) &&
                (this.year == someCat.year);
    }
    public int hashCode() { 
        return (month + year) * 27;
    }
}

