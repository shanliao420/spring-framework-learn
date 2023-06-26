/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 01:04:1:04
 */
package work.tangthinker;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.bean.Cat;
import work.tangthinker.bean.Person;

/**
 * @author shanliao
 * @since 2023/6/27 1:04
 * ClassPath: work.tangthinker.QuickstartInjectBySetXmlApplication
 * Description:
 */
public class QuickstartInjectBySetXmlApplication {

    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");

        Person person = beanFactory.getBean(Person.class);
        Cat cat = beanFactory.getBean(Cat.class);

        System.out.println(person);
        System.out.println(cat);


    }


}
