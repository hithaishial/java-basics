package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Developer extends Entity {

    public Developer(String id, String name){
        super(id, name, "developer");
        System.out.println("const of developer");
    }

    public void writeCode() {

        System.out.println("developer writes code");
    }

    public void displaycode(Entity entity){

           if (entity != null){
               if (entity instanceof Developer) {

                   Developer developer = (Developer) entity;
                   developer.writeCode();
               }

               if (entity instanceof Tester) {

                   Tester tester = (Tester) entity;
                   tester.testSoftware();
               }

               if (entity instanceof Manager) {

                   Manager manager = (Manager) entity;
                   manager.manageTeam();
               }

               if (entity instanceof DevOps) {
                       DevOps devops = (DevOps) entity;
                       devops.deployPipeline();
               }

               if (entity instanceof Intern) {
                   Intern intern = (Intern) entity;
                   intern.learnSkills();
               }

               if (entity instanceof DataEngineer) {
                   DataEngineer de = (DataEngineer) entity;
                   de.buildDataPipeline();
               }

               if (entity instanceof Designer) {
                   Designer designer = (Designer) entity;
                   designer.designUI();
               }

               if (entity instanceof AIEngineer) {
                   AIEngineer ai = (AIEngineer) entity;
                   ai.trainModel();
               }

               if (entity instanceof SecurityEngineer) {
                   SecurityEngineer se = (SecurityEngineer) entity;
                   se.performAudit();
               }

               if (entity instanceof CloudEngineering) {
                   CloudEngineering ce = (CloudEngineering) entity;
                   ce.manageCloud();
               }

               if (entity instanceof SupportEngineer) {
                   SupportEngineer se = (SupportEngineer) entity;
                   se.resolveTickets();
               }

               if (entity instanceof HR) {
                   HR hr = (HR) entity;
                   hr.conductInterview();
               }

               if (entity instanceof Recruiter) {
                   Recruiter r = (Recruiter) entity;
                   r.hireTalent();
               }

               if (entity instanceof ProductManager) {
                   ProductManager pm = (ProductManager) entity;
                   pm.defineRoadmap();
               }

               if (entity instanceof BusinessAnalyst) {
                   BusinessAnalyst ba = (BusinessAnalyst) entity;
                   ba.gatherRequirements();
               }

               if (entity instanceof SystemAdmin) {
                   SystemAdmin sa = (SystemAdmin) entity;
                   sa.maintainServers();
               }

               if (entity instanceof NetworkEngineer) {
                   NetworkEngineer ne = (NetworkEngineer) entity;
                   ne.configureNetwork();

               }

               if (entity instanceof QAEngineer) {
                   QAEngineer qa = (QAEngineer) entity;
                   qa.performQA();
               }

               if (entity instanceof AutomatonEngineer) {
                   AutomatonEngineer ae = (AutomatonEngineer) entity;
                   ae.automateTests();
               }

               if (entity instanceof MobileDeveloper) {
                   MobileDeveloper md = (MobileDeveloper) entity;
                   md.buildApp();
               }

               if (entity instanceof BackendDeveloper) {
                   BackendDeveloper bd = (BackendDeveloper) entity;
                   bd.buildAPI();
               }

               if (entity instanceof FrontendDeveloper) {
                   FrontendDeveloper fd = (FrontendDeveloper) entity;
                   fd.buildUI();
               }

               if (entity instanceof FullStackDeveloper) {
                   FullStackDeveloper fsd = (FullStackDeveloper) entity;
                   fsd.integrateSystems();
               }

               if (entity instanceof TechnicalWriter) {
                   TechnicalWriter tw = (TechnicalWriter) entity;
                   tw.writeDocs();
               }

               if (entity instanceof Consultant) {
                   Consultant c = (Consultant) entity;
                   c.adviseClients();
               }
           }
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performrole in developer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in developer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running report status in developer");
    }
}

