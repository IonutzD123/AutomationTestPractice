package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class TestPractice {

    public static void main(String[] args) throws InterruptedException {

        // Open the Browser
        Driver.openBrowser();

        //Maximize the browser window
        Driver.initialize.manage().window().maximize();

        // Navigate to web page
        Driver.initialize.navigate().to(UIMap.webPageURL);

        //Wait for Button
        Thread.sleep(4000);

        // Click on Anywhere
        Driver.initialize.findElement(By.xpath(UIMap.anywhereButton)).click();

        // Verify id stays is selected
        if(Driver.initialize.findElement(By.id(UIMap.staysButton)).getAttribute("aria-selected").equals("true")){
            assert true;
            System.out.println("Stays is selected");
        } else {
            assert false;
            System.out.println("Stays is not selected");
        }

        //Write SPAIN in the where to field
        Driver.initialize.findElement(By.xpath(UIMap.whereToField)).sendKeys("Spain");

        //Select Spain and dates
        String elements [] = new String [3];

        elements[0] = UIMap.selectDropDownSpain;
        elements[1] = UIMap.date17Aug;
        elements[2] = UIMap.date21Aug;

        for (String e:elements) {
            Thread.sleep(1000);
            Driver.initialize.findElement(By.xpath(e)).click();
        };

        //Check dates are selected
        if(Driver.initialize.findElement(By.xpath(UIMap.date17Aug)).getAttribute("data-is-day-blocked").equals("false")
                && Driver.initialize.findElement(By.xpath(UIMap.date21Aug)).getAttribute("data-is-day-blocked").equals("false")) {
            assert true;
            System.out.println("Dates are selected");
        } else {
            assert false;
            System.out.println("Dates are not selected");
        }

        // Select from IM FLEXIBLE, weekend option
        List<String> moreElements = new ArrayList<String>();

        moreElements.add(UIMap.imFlexibleButton);
        moreElements.add(UIMap.weekendButton);

        for (String e:moreElements){
            Thread.sleep(1000);
            Driver.initialize.findElement(By.id(e)).click();
        }

      // Verify Any Weekend text
        if(Driver.initialize.findElement(By.xpath(UIMap.anyWeekendText)).getText().equals("Any weekend")){
            assert true;
            System.out.println("TEXT present is 'Any weekend'");
        } else {
            assert false;
            System.out.println("TEXT present is not 'Any weekend'");
        }

        //GO back to choose dates
        Driver.initialize.findElement(By.id(UIMap.chooseDatesButton)).click();

        //Check dates remain selected
        if(Driver.initialize.findElement(By.xpath(UIMap.date17Aug)).getAttribute("data-is-day-blocked").equals("false")
                && Driver.initialize.findElement(By.xpath(UIMap.date21Aug)).getAttribute("data-is-day-blocked").equals("false")) {
            assert true;
            System.out.println("Dates remain selected");
        } else {
            assert false;
            System.out.println("Dates are no longer selected");
        }

        //Click on search
        Driver.initialize.findElement(By.xpath(UIMap.searchButton)).click();
        Thread.sleep(4000);

        //Hover over first image
        Actions actions = new Actions(Driver.initialize);
        actions.moveToElement(Driver.initialize.findElement(By.xpath(UIMap.firstImage))).build().perform();
        Thread.sleep(2000);

        //Check that the price is highlighted
        if(Driver.initialize.findElements(By.xpath(UIMap.highlightedElement)).size() == 1){
            assert true;
            System.out.println("Price is highlighted");
        } else {
            assert false;
            System.out.println("Price is not highlighted");
        }

        //Click the price
        Driver.initialize.findElement(By.xpath(UIMap.highlightedElementButton)).click();

        Thread.sleep(4000);


        //Verify name,price, rating are present
        int i1=0;
        int i2=1;
        int i3=2;
        int i = i1+i2+i3;

        String cardElements [] = new String[i];
        cardElements[i1] = UIMap.cardLocationName;
        cardElements[i2] = UIMap.cardLocationPrice;
        cardElements[i3] = UIMap.getCardLocationRaiting;


        for (String e:cardElements){
           if(Driver.initialize.findElements(By.xpath(e)).size() == 1){
               assert true;
               System.out.println("Location " + i2++ + " on card is present");
            } else {
               assert false;
               System.out.println("location " + i2++ + " on card is not present");
           }
        }

        //Close the card and open filters...etc.
        ArrayList<String> clickElements = new ArrayList<String>();

        clickElements.add(UIMap.closeCardButton);
        clickElements.add(UIMap.filterButton);
        clickElements.add(UIMap.entirePlaceCheckBox);
        clickElements.add(UIMap.japaneseCheckBox);
        clickElements.add(UIMap.showStaysButton);

        int n = 0;

        for (String e:clickElements) {
            n++;
            if (n==4){
                JavascriptExecutor jse = (JavascriptExecutor)Driver.initialize;
                jse.executeScript("window.scrollBy(0,250)");
                actions.moveToElement(Driver.initialize.findElement(By.xpath(e))).click().build().perform();
            } else {
                Driver.initialize.findElement(By.xpath(e)).click();
            }
            Thread.sleep(1000);
            if(n==2){
                Thread.sleep(4000);
            }
        }

        // Verify the number of stays
        if(Driver.initialize.findElement(By.xpath(UIMap.numberOfStays)).getText().substring(0,1).equals("1")){
            assert true;
            System.out.println("Number of stays appears");
        } else {
            assert false;
            System.out.println("Number of stays DOESN'T appear");
        }

        //Close the Browser
        Driver.closeBrowser();

    }




}
