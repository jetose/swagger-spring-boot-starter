package com.github.jetose.spring.boot.starter.swagger.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(SwaggerProperties.prefix)
public class SwaggerProperties {

    public static final String prefix = "swagger";

    /**
     * 是否启用
     */
    private boolean enable;

    /**
     * 项目名称
     */
    private String title = "";

    /**
     * 描述信息
     */
    private String description = "";

    /**
     * 版本编号
     */
    private String version = "";

    /**
     * 联络方式
     */
    private Contact contact = new Contact();

    /**
     * 解析路径
     */
    private String basePackage = "";

    @Data
    public static class Contact {

        /**
         * 人员名称
         */
        private String name;

        /**
         * 联系地址
         */
        private String url;

        /**
         * 电子邮件
         */
        private String email;

    }

}
