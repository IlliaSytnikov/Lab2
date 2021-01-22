package pplab2;

public class Customer {

    private int id;
    private String name;
    private String surname;
    private String middlename;
    private String adress;
    private long cardnum;
    private int balance;

    public void setId (int id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setSurname (String surname) {
        this.surname = surname;
    }
    public void setMiddleName (String middlename) {
        this.middlename = middlename;
    }
    public void setAdress (String adress) {
        this.adress = adress;
    }
    public void setCardnum (long cardnum) {
        this.cardnum = cardnum;
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getMiddlename() {
        return middlename;
    }
    public String getAdress() {
        return adress;
    }
    public long getCardnum() {
        return cardnum;
    }
    public int getBalance() {
        return balance;
    }

    public String toString () {
        return surname + " " + name + " " + middlename + ", " + adress + ", id = " + id + ", card number = "
                + cardnum + ", balance = " + balance;
    }
}



/*
    public Сustomer() {
    }

    public Сustomer(String surname, String name, String middlename) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
    }

    public Сustomer(int id, String name, String surname, String middlename, String adress, long cardnum, int balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.adress = adress;
        this.cardnum = cardnum;
        this.balance = balance;
    }
**/