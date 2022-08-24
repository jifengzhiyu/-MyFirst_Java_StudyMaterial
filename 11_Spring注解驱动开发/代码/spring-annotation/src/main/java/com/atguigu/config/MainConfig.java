package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;

import com.atguigu.bean.Person;

//??????==???????
@Configuration  //????Spring?????????????

@ComponentScans(
		value = {
				@ComponentScan(value="com.atguigu",includeFilters = {
/*						@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
						@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
				},useDefaultFilters = false)	
		}
		)
//@ComponentScan  value:?????????
//excludeFilters = Filter[] ?????????????????????????Щ???
//includeFilters = Filter[] ??????????????????????Щ???
//FilterType.ANNOTATION?????????
//FilterType.ASSIGNABLE_TYPE????????????????
//FilterType.ASPECTJ?????ASPECTJ????
//FilterType.REGEX????????????
//FilterType.CUSTOM?????????????
public class MainConfig {
	
	//??????????????Bean;?????????????????id??????÷????????id
	@Bean("person")
	public Person person01(){
		return new Person("lisi", 20);
	}

}
