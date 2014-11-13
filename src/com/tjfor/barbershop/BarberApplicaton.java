package com.tjfor.barbershop;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.tjfor.lib.BaseApplication;
import com.tjfor.lib.utils.RequestManager;

public class BarberApplicaton extends BaseApplication {
	private RequestQueue mQueue; 

	@Override
	public void onCreate() {
		super.onCreate();
	}

	
	public static BarberApplicaton getInstance(){
		return (BarberApplicaton) instance;
	}

}
