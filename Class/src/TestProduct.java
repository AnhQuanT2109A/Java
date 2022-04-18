public class TestProduct {
    public static void main(String[] args) {
        Product objPr1 = new Product("Huy", 1);
        System.out.println(objPr1.getName());
        System.out.println(objPr1.getId());

        Product objPr = new Product("Viet",6,3000,34);
        System.out.println(objPr.getName());
        System.out.println(objPr.getId());
        System.out.println(objPr.getPrice());
        System.out.println(objPr.getQti());

        Product objPr2 = new Product();
        System.out.println(objPr2.getName());
        System.out.println(objPr2.getId());
        System.out.println(objPr2.getPrice());
        System.out.println(objPr2.getQti());
    }
}
