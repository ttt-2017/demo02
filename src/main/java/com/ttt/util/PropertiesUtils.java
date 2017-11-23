package com.ttt.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Properties;

/**
 * 配置文件工具类
 * Created by fanzhe on 2017/11/23.
 */
public class PropertiesUtils {

    private final static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

    /**
     * 从系统属性文件中获取相应的值
     *
     * @param key key
     * @return 返回value
     */
    public static String getValue(String key) {
        return System.getProperty(key);
    }


    /**
     * @param classpath 属性文件 （classpath）
     * @return
     */
    public static Properties loadProperties(String classpath) {
        Properties properties = new Properties();
        try {
            InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream(classpath);
            properties.load(new InputStreamReader(in, "UTF-8"));
            return properties;
        } catch (IOException e) {
            logger.error("加载属性文件出错:" + e.getMessage());
            return null;
        }
    }

    /**
     * 根据Key读取Value
     *
     * @param classPath 属性文件 （classpath）
     * @param key       需要读取的属性
     */
    public static String getValue(String classPath, String key) {
        try {
            Properties properties = loadProperties(classPath);
            return properties.getProperty(key);
        } catch (Exception e) {
            logger.error("获取属性出错:" + e.getMessage());
            return null;
        }
    }

    /**
     * 根据Key读取Value
     *
     * @param classPath    属性文件 （classpath）
     * @param key          需要读取的属性
     * @param defaultValue 属性为null或空时返回默认值
     * @returned 属性值
     */
    public static String getValue(String classPath, String key, String defaultValue) {
        try {
            Properties properties = loadProperties(classPath);
            String value = properties.getProperty(key);

            if ("".replaceAll(" ", "").equals(value)) {
                value = defaultValue;
            }
            return value;
        } catch (Exception e) {
            return defaultValue;
        }
    }


    private static LinkedHashMap<String, String> loadProperties(InputStream in) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Properties properties = new Properties();
        try {
            properties.load(new InputStreamReader(in, "UTF-8"));
        } catch (IOException e) {
            logger.error("属性文件加载出错:" + e.getMessage());
            return null;
        }
        Enumeration en = properties.propertyNames();
        while (en.hasMoreElements()) {
            String strKey = (String) en.nextElement();
            String strValue = properties.getProperty(strKey);
            map.put(strKey, strValue);
        }
        return map;
    }

    /**
     * 读取Properties的全部信息
     *
     * @param file 读取的属性文件
     * @return 返回所有的属性 key:value<>key:value
     */
    public static LinkedHashMap<String, String> getProperties(File file) {
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(file));
            return loadProperties(in);
        } catch (IOException e) {
            logger.error("属性文件加载出错:" + e.getMessage());
        }
        return null;
    }

    /**
     * 读取Properties的全部信息
     *
     * @param filePath 属性文件路径（classpath）
     * @return 返回所有的属性 key:value<>key:value
     */
    public static LinkedHashMap<String, String> getProperties(String filePath) {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Properties properties = null;

        try {
            properties = loadProperties(filePath);
        } catch (Exception e) {
            logger.error("属性文件加载出错:" + e.getMessage());
            return null;
        }

        Enumeration en = properties.propertyNames();
        while (en.hasMoreElements()) {
            String strKey = (String) en.nextElement();
            String strValue = properties.getProperty(strKey);
            map.put(strKey, strValue);
        }
        return map;
    }
}

