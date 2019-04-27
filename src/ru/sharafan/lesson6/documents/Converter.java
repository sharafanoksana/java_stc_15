package ru.sharafan.lesson6.documents;

public class Converter {
    private static Contract source;

    public Converter(Contract currentContract)
    {
        source = currentContract;
    }

    public static Act doConvert()
    {
        Act destinationAct = new Act();
        destinationAct.setCompleteWorkList(source.getProductList());
        destinationAct.setCustomer(source.getCustomer());
        destinationAct.setExecutor(source.getExecutor());
        return destinationAct;
    }
}
