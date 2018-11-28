本项目记录一下我自己的学习

《图解设计模式》.结城浩 著.杨文轩 译
  2018.11.26 
    JAVA设计模式
    工厂模式        ->com.pattern.sample.factory        Tips:产品-创建者-具体产品-具体创建者
        Point:解依赖 低耦合 also means framework donot import concrete package,then it can re-use
    原型模式        ->com.pattern.sample.prototype      Tips:原型-具体原型-使用者
    单例模式        ->com.pattern.sample.singleton      Tips:private constructor
    Builder模式     ->com.pattern.sample.builder        Tips:建造者-具体建造者-监工-使用者
        Point:保持知道于不知道 可替换性 framework keep unknow to the concrete actor
  
《JUnit实战》.Petar Tahchiev etc 著.王奎 译.EIDTION 2
  2018.10.01
    Jetty轻量级服务器 内嵌stub测试        ->com.server.sample.jetty
