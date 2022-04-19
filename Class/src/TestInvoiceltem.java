public class TestInvoiceltem {
    public static void main(String[] args) {
        InvoiceItem I1 = new InvoiceItem("1","Banh Gao",4,30000);
        System.out.println(I1.toString() + "Total = "+I1.getTotal());
        I1.setUnitPrice(45000);
        System.out.println(I1.toString() + "Total 2= "+I1.getTotal());
    }
}
