package com.tjfor.barbershop.interactor.impl;

import org.apache.http.Header;
import org.json.JSONException;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.tjfor.barbershop.entity.UserInfo;
import com.tjfor.barbershop.interactor.LoginInteractor;
import com.tjfor.barbershop.interactor.SController;
import com.tjfor.barbershop.interactor.URLConst;
import com.tjfor.barbershop.presenter.OnLoginFinishLisenter;
import com.tjfor.barbershop.utils.HttpUtil;
import com.tjfor.barbershop.utils.JsonUtil;

public class LoginInteractorImpl extends SController implements LoginInteractor {

	@Override
	public void login(UserInfo user, OnLoginFinishLisenter onLoginFinishLisenter)
			throws JSONException {
		RequestParams params = new RequestParams();
		params.put("clientUser", JsonUtil.toJson(user));
		params.put("version", "1.0");
		params.put("platform", "1");
		
		HttpUtil.post(URLConst.URL_CLINET_LOGIN, params, new AsyncHttpResponseHandler() {
			
			@Override
			public void onSuccess(int arg0, Header[] arg1, byte[] arg2) {
				System.out.println(new String(arg2));
			}
			
			@Override
			public void onFailure(int arg0, Header[] arg1, byte[] arg2, Throwable arg3) {
				System.err.println("=====>"+arg3.getMessage());
			}
		});
	}
}
