public class Main {

    static class Parent {

        String field = "Field from Parent";



        String getField() {

            return this.field;

        }

    }



    static class Child extends Parent {

        String field = "Field from Child";



        @Override

        String getField() {

            return super.getField();

        }

    }



    public static void main(String[] args) {

        Parent obj = new Child();





        System.out.println(obj.getField());

    }

}

