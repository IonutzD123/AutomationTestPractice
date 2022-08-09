package src;

public class UIMap {

    public static String webPageURL = "https://www.airbnb.com/";

    public static String anywhereButton = "//*[text() = 'Anywhere']/parent::*";

    public static String staysButton = "search-block-tab-STAYS";

    public static String whereToField = "//*[text()='Where']/following-sibling::*";

    public static String selectDropDownSpain = "//*[@id='bigsearch-query-location-suggestion-1']";

    public static String date17Aug = "//*[@data-testid='calendar-day-08/17/2022']";

    public static String date21Aug = "//*[@data-testid='calendar-day-08/21/2022']";

    public static String imFlexibleButton = "tab--tabs--1";

    public static String weekendButton = "flexible_trip_lengths-weekend_trip";

    public static String anyWeekendText = "//*[@data-testid='structured-search-input-field-flex-dates']/*/*[2]";

    public static String chooseDatesButton = "tab--tabs--0";

    public static String searchButton ="//*[@data-testid='structured-search-input-search-button']";

    public static String firstImage = "(//*[@aria-label='Image 1'])[1]";

    public static String highlightedElement = "(//*[contains(@class, 't5u4927')])[1]/parent::*/parent::*/following-sibling::*";

    public static String highlightedElementButton=  "(//*[contains(@class, 't5u4927')])[1]/parent::*/parent::*/parent::*/parent::*";

    public static String cardLocationName = "(//*[contains(@class,'gkzpgws')]/*)[1]";

    public static String cardLocationPrice = "(//*[contains(@class,'gkzpgws')]/*)[3]";

    public static String getCardLocationRaiting ="(//*[contains(@class,'gkzpgws')]/*)[1]";

    public static String closeCardButton = "(//*[@aria-label='Close'])[1]";

    public static String filterButton = "//*[contains(@class, 'v4b1g6f')]";

    public static String entirePlaceCheckBox = "//*[@name='Entire place']";

    public static  String japaneseCheckBox = "//*[@name='Japanese']";

    public static String showStaysButton = "//*[contains(@class, '_1ku51f04')]";

    public static String numberOfStays = "//*[contains(@class,'to8eev7')]";
}
