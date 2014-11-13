package com.tjfor.barbershop.interactor;

import org.json.JSONException;

import com.tjfor.barbershop.entity.UserInfo;
import com.tjfor.barbershop.presenter.OnLoginFinishLisenter;

public interface LoginInteractor {
	public void login(UserInfo user,OnLoginFinishLisenter onLoginFinishLisenter)throws JSONException;
}
