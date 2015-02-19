package net.intentmedia.internal.pizzaintent.dataobject;

import org.testng.annotations.DataProvider;

public class IntentPizzaData {

		private String _email;
		private String _password;
		private String _pizzaName;
		private String _pizzaSize;

		
		public String getPizzaSize(){
			return _pizzaName;
		}
		
		public void setPizzaSize(String pizzaSize){
			this._pizzaName=pizzaSize;
		}
		
		public String getPizzaName(){
			return _pizzaName;
		}
		
		public void setPizzaName(String pizzaName){
			this._pizzaName=pizzaName;
		}
		
		
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
					
				{"leondria.barbee@gmail.com","pizza","http://intent-pizza.internal.intentmedia.net:8080/"}
			};
		}


}
