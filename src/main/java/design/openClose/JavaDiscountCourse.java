package design.openClose;

public class JavaDiscountCourse extends javaCoure {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }
}