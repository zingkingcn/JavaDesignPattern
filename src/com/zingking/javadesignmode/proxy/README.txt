代理模式：
    定义：Provide a surrogate or placeholder for another object to control access to it.
    为其他对象提供一个代理以控制对这个对象的访问。
角色：
    Subject抽象主题角色：
    通用业务类型的定义，可以是抽象类或者接口

    RealSubject具体主题角色：
    真正处理业务逻辑的角色，是被代理的角色

    Proxy代理主题角色：
    代理类，控制对真实主题角色的访问，并且可以在真实角色处理业务逻辑前后增加预处理和善后工作

静态代理：需要实现Subject抽象主题角色
动态代理：不需要实现Subject抽象主题角色，通过jdk的java.lang.reflect.Proxy newProxyInstance(...)方法实现

优点：
1.职责清晰
    ⭐真实角色只需要管具体的业务逻辑，不用关心其他的非本职业务
2.高扩展性
    具体角色可能会发生改变，只要和代理角色实现了同一个接口，代理角色不用修改就可以代理新得真实角色
3.智能化
    ？？？动态代理

动态代理在JVM层面是不知道代理的哪个对象，因为为它关联（组合）的是 Object；而静态代理在JVM层面是知道代理的哪个对象，它关联（组合）的是具体类型，例如：IGamePlayer。
但是二者在代码层面即程序员都是知道代理的哪个，因为在创建代理对象的时候传入的都是具体实例而不是 Object。













