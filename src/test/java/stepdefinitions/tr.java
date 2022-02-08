package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class tr {
    public static void main(String[] args) {

        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://demoqa.com/checkbox");

        WebElement expand = Driver.getDriver().findElement(By.xpath("//button[@class=\"rct-option rct-option-expand-all\"]"));
        expand.click();

        String[] array = {"home", "desktop", "notes", "commands", "documents", "workspace", "react", "angular", "veu", "office", "public", "private",
                "classified", "general", "downloads", "wordFile", "excelFile"};
        Random rnd = new Random();
        int rnd1= rnd.nextInt(16);
        int rnd2=rnd.nextInt(16);

        WebElement choice1 = Driver.getDriver().findElement(By.xpath("//label[@for='tree-node-" + array[rnd1] + "']"));
        Driver.clickWithJS(choice1);
        WebElement choice2 = Driver.getDriver().findElement(By.xpath("//label[@for='tree-node-" + array[rnd2] + "']"));
        Driver.clickWithJS(choice2);
        System.out.println(choice1+ " "+choice2);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            WebElement ele = Driver.getDriver().findElement(By.xpath("//input[@id='tree-node-" + word + "']"));
            if (ele.isSelected()) {
                String text = Driver.getDriver().findElement(By.xpath("//input[@id='tree-node-" + word + "']/../span[@class='rct-title']")).getText();

                list.add(text);
            }
        }
        System.out.println(list);

    }
}
