## JVM垃圾回收和内存分配学习总结及代码

包含：

### 一、学习总结（doc）
1. Java内存区域  
    1.1 运行时数据区域    
    1.2 对象的创建  
    1.3 对象的内存布局  
2. JVM参数
3. 垃圾收集器及内存分配策略  
    3.1 判断对象是否存活  
    3.2 垃圾收集算法   
    3.3 垃圾收集器  
    3.4 内存分配与回收策略   
    3.5 垃圾回收和GC实战  
4. JVM性能监控命令及工具   
    4.1 JDK的命令行工具     
    4.2 JDK的可视化工具  
      
### 二、学习代码（src）
1. FillHeapTest：堆内存填充，gc状况观察
2. HeapOOM：堆内存溢出
3. JavaVMStackSOF：栈溢出
4. PretenureSizeThresholdTest：大对象直接进入老年代
5. RuntimeConstantPoolOOM：运行时常量池溢出
6. YGCTest：YGC测试代码
