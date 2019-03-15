package lazy;

/**
 * @author gege  懒加载模式来实现基本的单例
 * @Description 静态内部类实现单例模式巧妙的运用了 静态内部类只有在该类被调用的时候才会加载，这个时候才开始实例化单例对象
 * @date 2019/3/15 15:04
 */
public class SimpleLazySingleton3 {
    private SimpleLazySingleton3(){
        if(InnerClass.SINGLETONINSTANCE!=null)
            throw new RuntimeException("单例已被破坏");
    }

    public static SimpleLazySingleton3 getInstance(){
        return InnerClass.SINGLETONINSTANCE;
    }

    private static class InnerClass{
        private final static SimpleLazySingleton3 SINGLETONINSTANCE = new  SimpleLazySingleton3();
    }
}
