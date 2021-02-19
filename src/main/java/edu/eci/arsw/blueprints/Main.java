package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String a[]) throws BlueprintNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices bs = ac.getBean(BlueprintsServices.class);
        System.out.println(bs.getBlueprint("_authorname_","_bpname_").toString());
    }

}
