package com.tjfor.barbershop.interactor;

import com.android.volley.RequestQueue;
import com.tjfor.barbershop.BarberApplicaton;

public abstract class SController {

	public RequestQueue mRequestQueue;
	
    public SController() {
    	mRequestQueue = BarberApplicaton.getInstance().getRequestQueue();
	}
}
