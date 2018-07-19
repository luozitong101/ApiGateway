package com.hjzgg.apigateway.dubbo.configure;

import com.alibaba.dubbo.config.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author hujunzheng
 * @create 2017-12-25 下午8:49
 **/
@ConfigurationProperties(prefix = "spring.dubbo")
public class DubboConfigurationProperties {
    private ConsumerConfig consumer;

    private ProviderConfig provider;

    private MonitorConfig monitor;

    public ConsumerConfig getConsumer() {
        return consumer;
    }

    public void setConsumer(ConsumerConfig consumer) {
        this.consumer = consumer;
    }

    public ProviderConfig getProvider() {
        return provider;
    }

    public void setProvider(ProviderConfig provider) {
        this.provider = provider;
    }

    public MonitorConfig getMonitor() {
        return monitor;
    }

    public void setMonitor(MonitorConfig monitor) {
        this.monitor = monitor;
    }
}
