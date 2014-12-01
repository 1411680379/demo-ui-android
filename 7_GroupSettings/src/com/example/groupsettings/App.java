package com.example.groupsettings;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;
import android.app.Application;
import android.util.Log;

public class App extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		RongIM.getInstance().init(this, Const.APP_KEY, R.drawable.ic_launcher);//ִֻ��һ�Σ��м��ַ�����дprivate Key(����������)
		
		
		String token = Const.TOKEN;//����ҳ���������ֳɵ�token
		
		RongIM.connect(token, new RongIMClient.ConnectCallback()//������ֻ����һ�Σ�������ߣ�������SDK�Զ�������
				{

					@Override
					public void onError(ErrorCode arg0) {
						// TODO Auto-generated method stub
						Log.d("Connect:", "Login Failed "+ arg0.getValue());
					}

					@Override
					public void onSuccess(String arg0) {
						// TODO Auto-generated method stub
						Log.d("Connect:", "Login Success "+arg0);
					}
			
				});
	}
	

}
