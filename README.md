<h1>23种设计模式</h1>

https://www.runoob.com/design-pattern/composite-pattern.html

# mode1 单例模式 Singleton
􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼􏰎􏰃􏰄􏰅􏰆􏱐􏲎􏴂􏱆􏴃􏰇􏰐􏰑􏰒􏰌􏴄􏰃􏰋􏰅􏰆􏰼单例模式是设计模式中最简单的模式之一，主要解决的问题是：避免一个类被频繁的创建和销毁，提升整体代码的性能。
单例对象的类必须保证只有一个实例存在，
1、单例类只能有一个实例。
2、单例类必须自己创建自己的唯一实例。
3、单例类必须给所有其他对象提供这一实例。

常见的单例模式：
1. 饿汉式
2. 饱汉式（懒加载）
3. 静态内部类方式
4. 枚举式
5. 可以利用Spring的BeanFactory保持单例

# mode2 策略模式 Strategy
使用策略模式可以代替大量的`ifelse`，使用场景一般是具有同类可替代的行为逻辑算法场景。

Comparable
Comparator
Cat 、Dog
Sorter排序
# mode3 工厂模式 Factory 
任何可以产生对象的方法或类，都可以叫工厂，（单例也是一种工厂）
系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
在一个产品族里面，定义多个产品。
简单工厂
静态工厂
工厂方法
抽象工厂
Spring IOC


# mode4 外观模式/门面模式 Facade
门面模式主要解决的是降低调用方使用接口的复杂逻辑组合，这样调用方与实际的接口提供方提供了一个中间层，用于包装逻辑，提供API
我们使用的MQ消息中间件用的就是门面模式，
隐藏系统的复杂性，并向外部提供API

# mode5 装饰器模式 Decorator

装饰器模式的核心就是在不改变原有类的基础上，新增功能
不改变原有类可以通过继承、切面等方式实现，但是使用装饰器模式思路更加灵活，可以避免继承导致子类过多，切面带来复杂性。

# mode6 责任链模式  ChainOfResponsibility
责任链模式的核心是解决一组服务中的先后执行处理关系

# mode7 观察者模式 Observe
事件处理模型
观察者模式：当一个行为发生时，传递信息给另外一个用户接收作出响应的处理，两者之间没有直接的耦合关联；
同样是我们经常用到的MQ消息中间件，也使用了观察者模式进行时间监听。
通常有三个角色：被观察者、观察者、事件Event
# mode8 组合模式 Composite
组合模式（树状结构专用模式），可以优化处理递归或分级数据结构。有许多关于分级数据结构的例子，使得组合模式非常有用武之地。

# mode9 享元模式 Flyweight
享元模式：重复利用对象（共享元数据），主要用于减少创建对象的数量，以减少内存占用和提高性能。
应用场景：
1. JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面；
2. 数据库的数据池
3. Java线程池
# mode10 代理模式 Proxy
静态代理：直接手动创建被代理对象的代理类
动态代理：
    JDK动态代理：只能面向接口
    CGLIB动态代理：不需要接口，生成被代理对象的子类作为代理，所以无法代理final修饰的类
    spring AOP代理
底层都是通过asm完成的；
asm:动态操作class文件

# mode11 迭代器模式 iterator
容器遍历

# mode12 访问者模式 Visitor
访问者模式是为了解决在一个稳定数据结构下的，增加易变的业务访问逻辑：同一个事务不同角度下访问的信息不同

# mode13 建造者模式/构建器模式 Builder
构建复杂对象，可以更加灵活


# mode14 适配器模式 Adapter 
适配器：接口转换器
适配器的主要作用就是把原本不兼容的接口，通过适配修改做到统一，
在生活中例如：万能充电器、Mac笔记本转换头
# mode 15 桥接模式 bridge
分离抽象和具体

# mode 16 command 命令模式
封装命令
结合cor实现undo

# mode 17 prototype 原型模式
Java自带
Object.clone()
实现原型模式需要实现标记性接口Cloneable，里面没有任何方法
一般用于一个对象属性已经确定，需要产生很多相同对象的时候
需要区分深克隆和浅客隆
# mode 18 memoto 备忘录模式
记录快照 （瞬时状态）
备忘录模式是恢复/回滚 配置 版本 悔棋 为核心功能 的模式，属于行为模式。
在功能上是以不破坏原对象为基础，增加备忘录操作类记录原对象的行为从而实现备忘录模式。
例如：编辑和撤销、游戏存档等


# mode 19 模板方法 TemplateMethod
钩子函数、回调函数
模板方法的核心设计思路是通过在抽象类中定义抽象方法的执行顺序，并将抽象方法设定为只有子类实现，但是不设计独立访问的方法。
# mode 20 State 状态模式
根据状态确定行为。
状态模式描述的是一个行为下的多种状态变更。
例如：一个网站的页面，登录和不登录展示的内容是不同的，即通过改变状态（登录状态）而让整个行为发生了改变。
有限状态机

# mode 21 intepreter 解释器模式 
解释脚本语言