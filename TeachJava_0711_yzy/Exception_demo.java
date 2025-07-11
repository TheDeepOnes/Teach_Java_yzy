package TeachJava_0711_yzy;

public class Exception_demo {

    // 利用 try-catch-finally 机制捕获异常
    public static void tryCatchFinallyExample() {
        try {
            int result = 10 / 0;  // 会抛出 ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("捕获异常: " + e);
        } finally {
            System.out.println("这是finally块，总是会执行");
        }
    }
    // 多重 catch
    public static void multipleCatchExample() {
        try {
            int[] numbers = new int[2];
            numbers[5] = 10;  // 会抛出 ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常: " + e);
        } catch (Exception e) {
            System.out.println("捕获了一个通用异常: " + e);
        }
    }

    // throws 关键字
    public static void throwsExample() throws ArithmeticException {
        int result = 10 / 0;
    }
    // throw 关键字
    // throw 用于手动抛出异常
    public static void throwExample() {
        throw new ArithmeticException("手动抛出的异常");
    }

    // throw 和 throws 的区别
    // - throws 声明一个方法可能抛出某个异常（用于方法签名），
    // - throw 用于在方法内部手动抛出一个异常。

    // 自定义异常
    // 创建一个自定义异常类
    static class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);  // 调用父类构造器
        }
    }

    public static void customExceptionExample() throws MyCustomException {
        throw new MyCustomException("这是一个自定义异常");
    }

    public static void main(String[] args) {
        // try-catch-finally
        tryCatchFinallyExample();

        // 多重 catch
        multipleCatchExample();

        // throws 关键字
        try {
            throwsExample();
        } catch (ArithmeticException e) {
            System.out.println("捕获到 throws 声明的异常: " + e);
        }

        // throw 关键字
        try {
            throwExample();
        } catch (ArithmeticException e) {
            System.out.println("捕获到 throw 手动抛出的异常: " + e);
        }

        // 自定义异常
        try {
            customExceptionExample();
        } catch (MyCustomException e) {
            System.out.println("捕获到自定义异常: " + e.getMessage());
        }
    }
}
