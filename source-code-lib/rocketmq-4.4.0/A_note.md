#### idea启动rocketmq增加配置

- nameserv启动添加
  - 环境参数(environment variables)添加`ROCKETMQ_HOME=distribution`
- broker-master启动
  - 环境参数(environment variables)添加`NAMESRV_ADDR=127.0.0.1:9876;ROCKETMQ_HOME=distribution`
  - args参数(program args)添加`-c distribution/conf/2m-2s-async/broker-a.properties`
- borker-slave启动 
  - 环境参数(environment variables)添加`NAMESRV_ADDR=127.0.0.1:9876;ROCKETMQ_HOME=distribution`
  - args参数(program args)添加`-c distribution/conf/2m-2s-async/broker-a-s.properties`
  - vm参数添加`-Duser.home=G:\github-project\project-data`
- consumer、producer启动
  - 环境参数(environment variables)添加`NAMESRV_ADDR=127.0.0.1:9876`