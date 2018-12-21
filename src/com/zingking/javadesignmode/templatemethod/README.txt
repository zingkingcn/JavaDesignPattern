1.定义：
Define th skeleton of an algorithm in an operation,deferring some steps to subclasses.Template Method lets subclasses
redefine certain steps of algorithm without changing the algorithm's structure.
定义一个操作中的算法框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

应用：在工作中贵州大数据页面上报就使用了该模式。页面上报中页面加载完成是只有具体的每个页面才知道且每个页面必须有的，所以
在基类中增加模板方法bigDataReportPageLoaded(),子类在判断加载完成时直接调用该方法，上报细节由父类处理。

钩子方法(Hook Method)：定义一个方法，父类根据改方法的返回值做不同的操作，从而实现了由子类控制公用方法中的某些步骤。例子
见 com.zingking.javadesignmode.templatemethod.car