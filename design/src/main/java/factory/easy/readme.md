#### 工厂模式
1. 创建一个 Product 接口类 ，
2. 创建一个 ProductFactory 工厂类，在这个类里可以修改实际调用 哪个实现类。如：new ProductImpl2(); 或者 new ProductImpl1();
3. 调用类 FactoryTest