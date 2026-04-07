package com.thinkworks.tech.runner;

import com.thinkworks.tech.external.Entity;
import com.thinkworks.tech.internal.*;

public class MainRunner {
    public static void main(String[] args) {

        Entity e1 = new Developer("1", "Alice");
        Entity e2 = new Tester("99", "Bob");
        Entity e3 = new Manager("3", "Charlie");
        Entity e4 = new DevOps("4", "Diana");
        Entity e5 = new Intern("5", "Eve");
        Entity e6 = new Designer("6", "Frank");
        Entity e7 = new DataEngineer("7", "Grace");
        Entity e8 = new AIEngineer("8", "Hank");
        Entity e9 = new SecurityEngineer("9", "Ivy");
        Entity e10 = new CloudEngineering("10", "Jack");
        Entity e11 = new SupportEngineer("11", "Kate");
        Entity e12 = new HR("12", "Leo");
        Entity e13 = new Recruiter("13", "Mona");
        Entity e14 = new ProductManager("14", "Nina");
        Entity e15 = new BusinessAnalyst("15", "Oscar");
        Entity e16 = new SystemAdmin("16", "Paul");
        Entity e17 = new NetworkEngineer("17", "Quinn");
        Entity e18 = new QAEngineer("18", "Rita");
        Entity e19 = new AutomatonEngineer("19", "Sam");
        Entity e20 = new MobileDeveloper("20", "Tina");
        Entity e21 = new BackendDeveloper("21", "Uma");
        Entity e22 = new FrontendDeveloper("22", "Victor");
        Entity e23 = new FullStackDeveloper("23", "Wendy");
        Entity e24 = new TechnicalWriter("24", "Xavier");
        Entity e25 = new Consultant("25", "Yara");

        processEntity(e1);
        processEntity(e2);
        processEntity(e3);
        processEntity(e4);
        processEntity(e5);
        processEntity(e6);
        processEntity(e7);
        processEntity(e8);
        processEntity(e9);
        processEntity(e10);
        processEntity(e11);
        processEntity(e12);
        processEntity(e13);
        processEntity(e14);
        processEntity(e15);
        processEntity(e16);
        processEntity(e17);
        processEntity(e18);
        processEntity(e19);
        processEntity(e20);
        processEntity(e21);
        processEntity(e22);
        processEntity(e23);
        processEntity(e24);
        processEntity(e25);
    }


    public static void processEntity(Entity entity) {
        if (entity == null) {
            System.out.println("Skipping null entity.");
            return;
        }

        entity.displayInfo();

        if (entity instanceof Developer) {
            ((Developer)entity).writeCode();
        } else if (entity instanceof Tester) {
            ((Tester)entity).testSoftware(entity);
        } else if (entity instanceof Manager) {
            ((Manager)entity).manageTeam(entity);
        } else if (entity instanceof DevOps) {
            ((DevOps)entity).deployPipeline(entity);
        } else if (entity instanceof Intern) {
            ((Intern)entity).learnSkills(entity);
        } else if (entity instanceof Designer) {
            ((Designer)entity).designUI(entity);
        } else if (entity instanceof DataEngineer) {
            ((DataEngineer)entity).buildDataPipeline(entity);
        } else if (entity instanceof AIEngineer) {
            ((AIEngineer)entity).trainModel(entity);
        } else if (entity instanceof SecurityEngineer) {
            ((SecurityEngineer)entity).performAudit(entity);
        } else if (entity instanceof CloudEngineering) {
            ((CloudEngineering)entity).manageCloud(entity);
        } else if (entity instanceof SupportEngineer) {
            ((SupportEngineer)entity).resolveTickets(entity);
        } else if (entity instanceof HR) {
            ((HR)entity).conductInterview(entity);
        } else if (entity instanceof Recruiter) {
            ((Recruiter)entity).hireTalent(entity);
        } else if (entity instanceof ProductManager) {
            ((ProductManager)entity).defineRoadmap(entity);
        } else if (entity instanceof BusinessAnalyst) {
            ((BusinessAnalyst)entity).gatherRequirements(entity);
        } else if (entity instanceof SystemAdmin) {
            ((SystemAdmin)entity).maintainServers(entity);
        } else if (entity instanceof NetworkEngineer) {
            ((NetworkEngineer)entity).configureNetwork(entity);
        } else if (entity instanceof QAEngineer) {
            ((QAEngineer)entity).performQA(entity);
        } else if (entity instanceof AutomatonEngineer) {
            ((AutomatonEngineer)entity).automateTests(entity);
        } else if (entity instanceof MobileDeveloper) {
            ((MobileDeveloper)entity).buildApp(entity);
        } else if (entity instanceof BackendDeveloper) {
            ((BackendDeveloper)entity).buildAPI(entity);
        } else if (entity instanceof FrontendDeveloper) {
            ((FrontendDeveloper)entity).buildUI(entity);
        } else if (entity instanceof FullStackDeveloper) {
            ((FullStackDeveloper)entity).integrateSystems(entity);
        } else if (entity instanceof TechnicalWriter) {
            ((TechnicalWriter)entity).writeDocs(entity);
        } else if (entity instanceof Consultant) {
            ((Consultant)entity).adviseClients(entity);
        }
    }
}
