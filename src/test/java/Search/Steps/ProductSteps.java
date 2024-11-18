package Search.Steps;

import Search.base.BaseTest;
import Search.page.CategoryAndCategoryItemButton.CategoryAndCategoryItemButton;
import Search.page.GenderChooseButton.GenderChooseButton;
import Search.page.HomePageButtons.HomePageButtons;
import Search.page.LoginButtons.LoginButtons;
import Search.page.MyPageButton.MyPageButton;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class ProductSteps extends BaseTest {

    private static GenderChooseButton genderChooseButton;
    private static LoginButtons loginButtons;
    private static MyPageButton myPageButton;
    private static HomePageButtons homePageButtons;
    private static CategoryAndCategoryItemButton categoryAndCategoryItemButton;


    @Before
    public static void  setUp() {
        genderChooseButton = new GenderChooseButton();
        loginButtons = new LoginButtons();
        myPageButton = new MyPageButton();
        homePageButtons = new HomePageButtons();
        categoryAndCategoryItemButton = new CategoryAndCategoryItemButton();
    }

    @Given("Kullanıcı cinsiyet seçimini yapar")
    public void kullaniciCinsiyetSeciminiYapar() throws InterruptedException {
        genderChooseButton.GenderButton();
    }
    @When("Kullanıcı hesabım butonuna tıklar")
    public void kullaniciHesabimButonunaTiklar()throws InterruptedException {
        myPageButton.AccountButton();

    }
    @When("Kullanıcı hesabına giriş yapar")
    public void kullaniciHesabinaGirisYapar()throws InterruptedException {
        loginButtons.EmailButton();
        loginButtons.PasswordButton();
        loginButtons.LoginButton();
    }
    @When("Kullanıcı boş alana tıklar")
    public void kullaniciBosAlanaTiklar() throws InterruptedException{
        homePageButtons.EmptyClick();

    }
    @When("Kullanıcı anasayfa butonuna tıklar")
    public void kullanıcıAnasayfabutonunaTiklar() throws InterruptedException{
        homePageButtons.HomePageButton();

    }
    @Then("Ana sayfada bir kategori seçer")
    public void anaSayfadaBirKategoriSecer() throws InterruptedException{
        categoryAndCategoryItemButton.CategoryButton();
        categoryAndCategoryItemButton.CategoryItemButton();
        categoryAndCategoryItemButton.CategoryItem2Button();
        categoryAndCategoryItemButton.AllFeaturesButton();
    }



    public void tearDown() {
        tearDown(); // Test sonrası temizlik işlemleri yapılabilir
    }
}
