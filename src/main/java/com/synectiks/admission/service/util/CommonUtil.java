package com.synectiks.admission.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

public class CommonUtil {
	private static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);
	private static final String OS = System.getProperty("os.name").toLowerCase();
	
	public static <T> T createCopyProperties(Object src, Class<T> cls) {
		T instance = null;
		if (!isNull(src)) {
			try {
				instance = cls.newInstance();
				BeanUtils.copyProperties(src, instance);
			} catch (InstantiationException | IllegalAccessException e) {
				logger.error("Failed to instantiate class: " + cls.getName(), e);
			} catch (BeansException be) {
				logger.error("Failed to fill bean: " + cls.getName(), be);
			}
		}
		return instance;
	}
	
	public static boolean isNull(Object object) {
		return null == object;
	}

	/**
	 * Method check if object is null or empty
	 * @param object
	 * @return
	 */
	public static boolean isNullOrEmpty(String object) {
		if (!isNull(object) && !object.trim().isEmpty()) {
			return false;
		}
		return true;
	}
	
}
