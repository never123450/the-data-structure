package design.openClose;

public class javaCoure implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public javaCoure(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    public Double getDiscountPrice(){
        return this.price*0.8;
    }
}