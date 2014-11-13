package com.tjfor.barbershop.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.tjfor.barbershop.R;
import com.tjfor.barbershop.presenter.LoginPresenter;
import com.tjfor.barbershop.presenter.impl.LoginPresenterImpl;
import com.tjfor.barbershop.utils.ImageHelper;
import com.tjfor.barbershop.view.LoginView;
import com.tjfor.lib.ui.BaseActivity;
import com.tjfor.lib.utils.ViewUtils;
import com.tjfor.lib.view.annotation.ContentView;
import com.tjfor.lib.view.annotation.ViewInject;

@ContentView(R.layout.login)
public class LoginAcitivity extends BaseActivity implements LoginView, OnClickListener{

	@ViewInject(R.id.head)
	private ImageView img_head;
	
	@ViewInject(R.id.edit_store)
	private EditText _estore;
	
	@ViewInject(R.id.edit_user)
	private EditText _euser;
	
	@ViewInject(R.id.edit_pwd)
	private EditText _epwd;
	
	@ViewInject(R.id.btn_login)
	private Button btnLogin;
	
	private LoginPresenter loginPresenter;
	
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		ViewUtils.inject(this);
		loadHead();
		init();
	}

	@Override
	public void loadHead() {
		Resources res = getResources();
		Bitmap bmp = BitmapFactory.decodeResource(res, R.drawable.personal_center_photo);
		img_head.setImageBitmap(ImageHelper.toRoundBitmap(bmp));
	}


	@Override
	public void navigateToHome() {
		
	}
	

	@Override
	public void setProgress() {
	}

	@Override
	public void hideProgress() {
	}

	@Override
	public void init() {
		loginPresenter= new LoginPresenterImpl(this);
		btnLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		loginPresenter.validateCredentials(_euser.getText().toString().trim(),
				_euser.getText().toString().trim(), 
				_epwd.getText().toString().trim());
	}

	@Override
	public void showStoreErr() {
        _estore.setError(getString(R.string.store_name_err));		
	}

	@Override
	public void showUserErr() {
		_euser.setError(getString(R.string.user_name_err));
	}

	@Override
	public void showPasswordErr() {
		_epwd.setError(getString(R.string.password_err));
	}

}
