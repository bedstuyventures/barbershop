package com.tjfor.barbershop.view;

public interface LoginView {
	
	public static final int SUCCESS = 100;	
	public static final int CLIENT_ERR = 101;
	public static final int USER_ERR = 102;
	public static final int PASSWORD_ERR = 103;
	
	public void init();
	
	public void loadHead();
	
	public void navigateToHome();
	
	public void setProgress();
	
	public void hideProgress();
	
	public void showStoreErr();
	
	public void showUserErr();
	
	public void showPasswordErr();
	

}
