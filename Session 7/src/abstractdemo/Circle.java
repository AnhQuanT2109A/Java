package abstractdemo;

 class Circle extends Shape {
     float area;
     @Override
         void calculate(float rad) {
             area = getPI()*rad*rad;
             System.out.println("Area of circle is: "+area);
         }
     }

     class Rectangle extends Shape {
        float perimeter;
        float length = 10;
         void caculate(float width) {
            perimeter = 2*(length*width);
            System.out.println("ERR");
        }
     }





