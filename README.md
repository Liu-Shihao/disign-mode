<h1>23种设计模式</h1>

# mode1 单例模式 Singleton
􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼单例模式是设计模式中最简单的模式之一，主要解决的问题是：避免一个类被频繁的创建和销毁，提升整体代码的性能。

单例模式：单例对象的类必须保证只有一个实例存在，
1.不允许从外部直接调用构造方法创建；
可以利用Spring的BeanFactory保持单例


常见的单例模式：
1. 饿汉式
2. 饱汉式（懒加载）
3. 静态内部类方式
4. 枚举式

# mode2 策略模式 Strategy
使用策略模式可以代替大量的`ifelse`，使用场景一般是具有同类可替代的行为逻辑算法场景。

Comparable
Comparator
Cat 、Dog
Sorter排序
# mode3 工厂模式 Factory 
任何可以产生对象的方法或类，都可以叫工厂，（单例也是一种工厂）
简单工厂
静态工厂
工厂方法
抽象工厂
Spring IOC


# mode4 外观模式/门面模式 Facade
门面模式主要解决的是降低调用方使用接口的复杂逻辑组合，这样调用方与实际的接口提供方提供了一个中间层，用于包装逻辑，提供API
我们使用的MQ消息中间件用的就是门面模式，

# mode5 装饰器模式 Decorator

装饰器模式的核心就是在不改变原有类的基础上，新增功能
不改变原有类可以通过继承、切面等方式实现，但是使用装饰器模式思路更加灵活，可以避免继承导致子类过多，切面带来复杂性。

# mode6 责任链模式  ChainOfResponsibility
责任链模式的核心是解决一组服务中的先后执行处理关系

# mode7 观察者模式
观察者模式：当一个行为发生时，传递信息给另外一个用户接收作出响应的处理，两者之间没有直接的耦合关联；
同样是我们经常用到的MQ消息中间件，也使用了观察者模式进行时间监听。
# mode8 组合模式

# mode9 享元模式

# mode10 代理模式

# mode11 迭代器模式

# mode12 访问者模式

# mode13 建造者模式/构建器模式 Builder

# mode14 适配器模式



