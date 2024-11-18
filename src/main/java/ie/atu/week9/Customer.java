package ie.atu.week9;

public class Customer extends Person{ // inherts from Customer
    private String custNumber;
    private boolean mailingList;

    public Customer() {// default con
        this.custNumber = "";
        this.mailingList = false;
    }

    public Customer(String name, String address, String phone, String custNumber, boolean mailingList) {
        super(name, address, phone); // pasts to the parent jumps tp person class
        this.custNumber = custNumber;
        this.mailingList = mailingList;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString()+ // calls the parent tostring
                " custNumber='" + custNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
