package ss17_io_text_binary.model;

import ss17_io_text_binary.utils.SortByName;

import java.io.Serializable;
import java.util.Objects;

public class Spending implements Comparable<Spending>, Serializable {
    private String spendingCode;
    private String spendingName;
    private int spendingDate;
    private float amountOfMoney;
    private String moreDescription;

    public Spending() {
    }

    public Spending(String spendingCode, String spendingName, int spendingDate, float amountOfMoney, String moreDescription) {
        this.spendingCode = spendingCode;
        this.spendingName = spendingName;
        this.spendingDate = spendingDate;
        this.amountOfMoney = amountOfMoney;
        this.moreDescription = moreDescription;
    }

    public String getSpendingCode() {
        return spendingCode;
    }

    public void setSpendingCode(String spendingCode) {
        this.spendingCode = spendingCode;
    }

    public String getSpendingName() {
        return spendingName;
    }

    public void setSpendingName(String spendingName) {
        this.spendingName = spendingName;
    }

    public int getSpendingDate() {
        return spendingDate;
    }

    public void setSpendingDate(int spendingDate) {
        this.spendingDate = spendingDate;
    }

    public float getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(float amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getMoreDescription() {
        return moreDescription;
    }

    public void setMoreDescription(String moreDescription) {
        this.moreDescription = moreDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spending spending = (Spending) o;
        return Objects.equals(spendingCode, spending.spendingCode) && Objects.equals(spendingName, spending.spendingName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spendingCode, spendingName);
    }

    @Override
    public String toString() {
        return "Spending{" +
                "spendingCode='" + spendingCode +
                ", spendingName='" + spendingName + '\'' +
                ", spendingDate=" + spendingDate +
                ", amountOfMoney=" + amountOfMoney +
                ", moreDescription='" + moreDescription + '\'' +
                '}';
    }

    @Override
    public int compareTo(Spending spending) {
        if(this.amountOfMoney-spending.amountOfMoney<0){
            return -1;
        }else if (this.amountOfMoney-spending.amountOfMoney>0){
            return 1;
        }else {
            return this.spendingName.compareTo(spending.getSpendingName());
        }
    }
}
