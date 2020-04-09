package com.github.rtmase.mapper;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by jojoldu@gmail.com on 2017. 6. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

public class EnumMapperFactory {

    private Map<String, List<EnumMapperValue>> factory = new LinkedHashMap();

    public EnumMapperFactory() {}


    public Map<String, List<EnumMapperValue>> getFactory() {
		return factory;
	}


	public void setFactory(Map<String, List<EnumMapperValue>> factory) {
		this.factory = factory;
	}


	public List<EnumMapperValue> get(String key){
        return factory.get(key);
    }


    public Map<String, List<EnumMapperValue>> getAll() {
        return factory;
    }
}
