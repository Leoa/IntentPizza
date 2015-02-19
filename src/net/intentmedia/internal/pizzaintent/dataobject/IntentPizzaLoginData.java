package net.intentmedia.internal.pizzaintent.dataobject;

import org.testng.annotations.DataProvider;

public class IntentPizzaLoginData {

		private String _email;
		private String _password;

		public String getEmail(){
			return _email;
		}
		
		public void setEmail(String email){
			this._email=email;
		}
		
		public String getPassword(){
			return _password;
		}
		public void setPassword(String password){
			this._password=password;
		}
		
		@DataProvider(name = "regData")
		public static Object[][] getLoginData(){
			return new Object[][]{
					
					{"leondria.barbee@gmail.com","pizza1122"}};
		}


}
