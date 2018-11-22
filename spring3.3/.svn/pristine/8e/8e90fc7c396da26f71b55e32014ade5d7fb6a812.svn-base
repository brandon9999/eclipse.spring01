* dispatcher서블릿 설정 가이드	
--> 아래는 WEB-INF/web.xml에서 *.html로 들어오는 클라이언트 요청을 DispatcherServlet이 처리하도록 하였다.
--> DispatcherServlet은 WEB-INF/[servlet-name]-servlet.xml파일을 스프링 설정파일로 사용하게 된다.
    (* 아래에서는 WEB-INF/shopping3-3-servlet.xml파일이 된다.)
         이 파일에서는 Controller, ViewResolver, View등의 Bean설정을 하게된다. 
	
=========================================================
# web.xml
---------------------------------------------------------	
...<생략>...	

	<servlet>
		<servlet-name>shopping3-3</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		
<-- DispatcherServlet을 별도파일로 설정할 때는 아래와 같이 설정을 추가하면 된다. -->
//		<init-param>
//			<param-name>contextConfigLocation</param-name>
//            <param-value>/WEB-INF/dispatcher_servlet.xml</param-value>
//        </init-param>		
	
<-- DispatcherServlet을 별도파일로 2개를  설정할 때는 아래와 같이 설정을 추가하면 된다. -->

//		<init-param>
//			<param-name>contextConfigLocation</param-name>
//            <param-value>/WEB-INF/dispatcher_servlet.xml,/WEB-INF/dispatcher2_servlet.xml</param-value>
//        </init-param>		
		
		<load-on-startup>1</load-on-startup>
	</servlet>

	<servlet-mapping>
		<servlet-name>shopping3-3</servlet-name>
		<url-pattern>*.html</url-pattern>
	</servlet-mapping>

...<생략>...	
	
---------------------------------------------------------	
	
	
=========================================================
# shopping3-3-servlet.xml
---------------------------------------------------------	
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

	<!-- HandlerMapping -->
	<bean id="handlerMapping"
		class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
		<property name="mappings">
			<value>
				/login.html=loginFormController
			</value>
		</property>
	</bean>

	<!-- Controller -->
	<bean id="loginFormController" class="controller.LoginFormController"
		p:shopService-ref="shopService" p:loginValidator-ref="loginValidator">
	</bean>

	<!-- ViewResolver -->
	<bean id="internalResourceViewResolver"
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="viewClass">
			<value>org.springframework.web.servlet.view.JstlView</value>
		</property>
		<property name="prefix">
			<value>WEB-INF/jsp/</value>
		</property>
		<property name="suffix">
			<value>.jsp</value>
		</property>
	</bean>
</beans>
	
---------------------------------------------------------	
		