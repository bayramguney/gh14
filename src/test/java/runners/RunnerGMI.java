package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",

//<<<<<<< HEAD
//        tags = "@Seda",
//=======
//
//
//      // tags = "@db",
//
//
//
//      tags = "@db",
//>>>>>>> master
//        dryRun = false

        //  tags = "@db",

       // dryRun = true








    //      tags = "@US06",


        //  tags = "@db",




        //  tags = "@db",

      //  dryRun = true


       // dryRun = true


         dryRun = true


)
public class RunnerGMI {


}

