import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;

/**
 * Created by amey on 4/28/16.
 */
public class AppfuseHomePageTest {

    @Test
    public void shouldGoToLoginPage() {
        //when
        open(Properties.BASE_URL);
        //then
        $("#loginForm").should(Condition.visible);
        
        assertThat(title(), is(equalTo("Login | AppFuse")));
    }
    
    
    @Test
    public void shouldNavigateToNextScreenSuccessfulLoginWithValidCredentialsEnteredAndClickLogin() {
    	
    	//Given : the browser is open and url is hit
    	open(Properties.BASE_URL);
    	
    	//When : I enter valid UserName, Password and Click on Login
    	$(By.name("j_username")).setValue("admin");
    	$(By.id("j_password")).setValue("admin");
    	$(By.name("login")).click();
    	
   
    	// Then : I should be logged in successfully and navigated to next screen.
    	$(By.xpath("//*[@id=\"content\"]/div/h2")).should(Condition.appear);
    	assertThat(title(),Is.is(equalTo("Home | AppFuse")));
    }
    
    
    public void shouldRemainOnLandingScreenOnClickingAppFuse () {
    	
    }
    
    
    public void shouldRemainOnLandingScreenOnClickingLogin () {
    	
    }
    
    
    public void shouldNotLoginSuccessfullyWithOnlyUsernameEnteredAndClickLogin() {
    	
    }
    
    
    public void shouldNotLoginSuccessfullyWithOnlyPasswordEnteredAndClickLogin() {
    	
    }
    
 
    public void shouldNotLoginSuccessfullyWithUsernamePasswordKeptEmptyAndClickLogin() {
 	
    }
    
    
    public void shouldNotLoginSuccessfullyWithValidUsernameInvalidPasswordEnteredAndClickLogin() {
    	
    }
    
    
    public void shouldNotLoginSuccessfullyWithInvalidUsernameValidPasswordEnteredAndClickLogin() {
    	
    }
   
    
    
    public void shouldAutopopulateCredentialsOnFreshLandingWhenRememberMeClicked() {
    	
    }
    
    
    public void shouldOpenFormToSignUpOnClickingSignUpLink() {
    		
    }
    
    public void shouldNavigateToBlankBrowserWhenBackButtonIsHit () {
    	
    }
}
