package ru.sharafan.lesson6.documents;

public class Converter {
    private Contract source;

    public Converter(Contract currentContract)
    {
        this.source = currentContract;
    }

    public Act doConvert()
    {
        Act destinationAct = new Act();
        destinationAct.setCompleteWorkList(this.source.getProductList());
        destinationAct.setCustomer(this.source.getCustomer());
        destinationAct.setExecutor(this.source.getExecutor());
        return destinationAct;

    }
}
