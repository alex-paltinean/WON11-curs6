package org.fasttrackit.exceptions;


public class CustomExceptionMain {

    public static void main(String[] args) throws MyException, MySecondException {
//        try (FileReader reader = new FileReader("")) {
        try {
            usingMyException(-10);
            System.out.println("i know it worked");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("Method doesn't accept number lower than " + e.getMinValue());
            System.out.println("I know it failed");
            usingMyException(e.getMinValue());
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
        } catch (MySecondException e) {
            System.out.println(e.getMessage());
            System.out.println("I know it failed");
        } finally {
            System.out.println("fie ca e bine, fie ca e rau");
        }
    }

    private static int usingMyException(int i) throws MyException, MySecondException {
        if (i < 0) {
            throw new MyException("nu-mi plac numerele negative", 1);
        }
        if (i == 0) {
            throw new MySecondException();
        }
        System.out.println("SUCCESS!!!!!!");
        return i * 2;
    }

    private static int usingMyException2(int i) throws MyException {
        if (i < 10) {
            throw new MyException("nu-mi plac numerele mici", 11);
        }
        if (i == 10) {
            throw new MyRuntimeException();
        }
        return i * 2;
    }
}
