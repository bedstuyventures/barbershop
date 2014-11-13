package com.tjfor.barbershop.presenter.impl;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;

import com.tjfor.barbershop.entity.UserInfo;
import com.tjfor.barbershop.interactor.LoginInteractor;
import com.tjfor.barbershop.interactor.impl.LoginInteractorImpl;
import com.tjfor.barbershop.presenter.LoginPresenter;
import com.tjfor.barbershop.presenter.OnLoginFinishLisenter;
import com.tjfor.barbershop.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter,OnLoginFinishLisenter{

	private LoginView loginView;
	private LoginInteractor loginInteractor;

	public LoginPresenterImpl(LoginView loginView) {
		this.loginView = loginView;
		this.loginInteractor = new LoginInteractorImpl();
	}

	@Override
	public void validateCredentials(String store, String username, String pwd) {
		if (StringUtils.isEmpty(store)) {
			loginView.showStoreErr();
			return ;
		}else if (StringUtils.isEmpty(username) ) {
			loginView.showUserErr();
			return ;
		}else if (StringUtils.isEmpty(pwd)) {
			loginView.showPasswordErr();
			return ;
		}
		
		UserInfo user = new UserInfo();
		user.setClientName("上海理发店");
		user.setUsername("汤杰");
		user.setPassword(pwd);
		
		try {
			loginInteractor.login(user, this);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onStoreNameErr() {
	}

	@Override
	public void onPasswordErr() {
	}

	@Override
	public void onSuccess() {
	}
}
