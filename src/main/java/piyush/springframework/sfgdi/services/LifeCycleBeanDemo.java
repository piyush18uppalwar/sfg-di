package piyush.springframework.sfgdi.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleBeanDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
		ApplicationContextAware, ApplicationArguments {

	@Override
	public String[] getSourceArgs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getOptionNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsOption(String name) {
		System.out.println("");
		return false;
	}

	@Override
	public List<String> getOptionValues(String name) {
		System.out.println("");
		return null;
	}

	@Override
	public List<String> getNonOptionArgs() {
		System.out.println("");
		return null;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## Application context has been set");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("##  setBeanFactory");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## Bean Name : " + name);

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## Life cycle has been terminated");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## afterPropertiesSet");

	}

}
