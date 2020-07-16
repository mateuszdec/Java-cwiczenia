package zadania.porównywanieOsób;

import java.util.Objects;

class Address {
    private String city;
    private String postalCode;
    private String homeNo;
    private String flatNo;

    public Address(String city, String postalCode, String homeNo, String flatNo) {
        this.city = city;
        this.postalCode = postalCode;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(postalCode, address.postalCode) &&
                Objects.equals(homeNo, address.homeNo) &&
                Objects.equals(flatNo, address.flatNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, postalCode, homeNo, flatNo);
    }

    @Override
    public String toString() {
        return "Adres: " + city + ", " + postalCode + ", " + homeNo + "/" + flatNo;
    }
}
