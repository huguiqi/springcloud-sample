# 7天学会springcloud


[7天学会springcloud(一)](http://www.huguiqi.com/2018/04/06/7%E5%A4%A9%E5%AD%A6%E4%BC%9A%E4%BD%BF%E7%94%A8springcloud/)

[7天学会springcloud(二)](http://www.huguiqi.com/2018/04/30/7%E5%A4%A9%E5%AD%A6%E4%BC%9A%E4%BD%BF%E7%94%A8springcloud-%E4%BA%8C/)

[7天学会springcloud(三)](http://www.huguiqi.com/2018/04/30/7%E5%A4%A9%E5%AD%A6%E4%BC%9A%E4%BD%BF%E7%94%A8springcloud-%E4%BA%8C/)

[7天学会springcloud(四)](http://www.huguiqi.com/2018/05/12/7%E5%A4%A9%E5%AD%A6%E4%BC%9A%E4%BD%BF%E7%94%A8springcloud-%E5%9B%9B/)

[7天学会springcloud(五)](http://www.huguiqi.com/2018/05/27/7%E5%A4%A9%E5%AD%A6%E4%BC%9A%E4%BD%BF%E7%94%A8springcloud-%E4%BA%94/)

[7天学会springcloud(六)](http://www.huguiqi.com/2018/11/26/7%E5%A4%A9%E5%AD%A6%E4%BC%9A%E4%BD%BF%E7%94%A8springcloud-%E5%85%AD/)

[7天学会springcloud(七)](http://www.huguiqi.com/2018/11/26/7%E5%A4%A9%E5%AD%A6%E4%BC%9A%E4%BD%BF%E7%94%A8springcloud-%E5%85%AD/)


# eureka,生产者消费者分区调用

1. 将eureka分成两个区：zone-dev,zone-test
2. 将gateway（consumer）设置成优先使用zone-test分区
3. 配置两个services，分别设置分区分别为zone-test和zone-dev
想把这个作为开发环境与测试环境的一个隔离访问
