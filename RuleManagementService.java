package com.example.drool.demo;

import com.myspace.testproject.carrot;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class RuleManagementService {


    public static void dispalyRules() {

        carrot c = new carrot();
        c.setHotelId("111");

        carrot c1 = new carrot();
        c1.setHotelId("123");

        carrot c2 = new carrot();
        c2.setHotelId("234");

        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.newKieContainer(ks.newReleaseId("com.myspace", "TestProject", "LATEST"));
        KieScanner kieScanner = ks.newKieScanner(kieContainer);
        // Scan every 100ms
        kieScanner.start(100);

        KieSession kieSession = kieContainer.newKieSession();
        //kieSession.insert(c);
        kieSession.insert(c1);
        kieSession.insert(c2);
        //kieSession.insert(c3);

        boolean flag = true;
        while (flag) {
            try {
                Thread.sleep(3000);
            }
            catch (Exception e) {

            }
            kieSession.fireAllRules();

            //System.out.println(c);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("*************************************");
            //System.out.println(c3);
        }
    }
}

