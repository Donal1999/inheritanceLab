package ie.atu.week9;

public class PreferredCustomer extends Customer {
    private Integer loyaltyPoints;
    private Integer discount;

    public PreferredCustomer() { //default consturctor
            this.loyaltyPoints = 0;
            this.discount = 0;
    }

    public PreferredCustomer(String name, String address, String phone, String custNumber, boolean mailingList, Integer loyaltyPoints, Integer discount) {
        super(name, address, phone, custNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discount = discount;
    }

    public Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        setDiscount();
    }

    public Integer getdiscount() {
        return discount;
    }

    public void setdiscount(Integer discount) {
        this.discount = discount;
    }


    public void setDiscount() {
        if (loyaltyPoints > 500){
            discount = 1;
            System.out.println("5% discount in future purchases");
        }

        if (loyaltyPoints > 1000 &loyaltyPoints < 1500){
            discount = 2;
            System.out.println("6% discount in future purchases");
        }
        if (loyaltyPoints > 1500 & loyaltyPoints <2000){
            discount = 3;
            System.out.println("7% discount in future purchases");
        }
        if (loyaltyPoints > 2000){
            discount = 4;
            System.out.println("10% discount in future purchases");
        }
    }

    @Override
    public String toString() {
        return super. toString() +
                " loyaltyPoints='" + loyaltyPoints + '\'' +
                ", discount='" + discount;
    }
}
