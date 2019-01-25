装饰者模式
Decorator Pattern
1.定义
Attach additional responsibilities to an object dynamically keeping the same interface.Decorators provide a flexible
alternative to subclass for extending functionality.
动态地给一个对象添加一些额外的之策，就增加功能来说，装饰者模式相比子类更为灵活
装饰模式是对继承的补充，也叫包装（wrapper）模式

2.组成
Component抽象构件
Component是一个接口或者抽象类，是最核心的结构

ConcreteComponent 具体构件
是最核心、最原始、最基本的接口或抽象类的实现，是被装饰者

Decorator 装饰角色
一般是一个抽象类，实现Component方法，属性里面必然有一个private指向Component抽象构件

具体装饰角色
继承抽象装饰者，增加自己的装饰逻辑

3.试用场景
①需要扩展一个类的功能，或给一个雷增加附加功能
②需要动态地给一个对象增加功能，这些功能可以再动态的撤销
③需要为一批的兄弟类进行改装或加装功能，首选装饰模式？？？


例子：
汽车加配饰
基类：外观展示 方法，开走 方法
装饰类：1.真皮 + 喇叭；2.天窗 + 转向灯























