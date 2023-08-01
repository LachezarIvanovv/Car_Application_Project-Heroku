package softuni.Mobilele.model.dto;

import softuni.Mobilele.model.enums.EngineEnum;
import softuni.Mobilele.model.enums.TransmissionEnum;

import java.math.BigDecimal;

public class OfferDetailDTO {

    private Long id;

    private String imageUrl;

    private Integer year;

    private String brand;

    private String model;

    private Integer mileage;

    private BigDecimal price;

    private EngineEnum engine;

    private TransmissionEnum transmission;

    private String sellerFirstName;

    private String sellerLastName;

    public OfferDetailDTO() {
    }

    public Long getId() {
        return id;
    }

    public OfferDetailDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferDetailDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public OfferDetailDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public OfferDetailDTO setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public OfferDetailDTO setModel(String model) {
        this.model = model;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferDetailDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferDetailDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferDetailDTO setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferDetailDTO setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getOfferHighlight(){
        return this.year + " " + this.brand + " " + this.model;
    }

    public String getSellerFirstName() {
        return sellerFirstName;
    }

    public OfferDetailDTO setSellerFirstName(String sellerFirstName) {
        this.sellerFirstName = sellerFirstName;
        return this;
    }

    public String getSellerLastName() {
        return sellerLastName;
    }

    public OfferDetailDTO setSellerLastName(String sellerLastName) {
        this.sellerLastName = sellerLastName;
        return this;
    }

    public String getSellerFullName(){
        return sellerFirstName + " " + sellerLastName;
    }
}
