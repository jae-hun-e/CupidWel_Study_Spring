package com.company.design.decorator;

public class AudiDecorator implements Icar{

    protected Icar audi;
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(Icar audi, String modelName, int modelPrice){
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
//        System.out.println(audi.getPrice());
//        System.out.println(audi.getPrice()+modelPrice);
        return audi.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + "의 가격은 "+ getPrice() + " 원 입니다.");
    }
}
