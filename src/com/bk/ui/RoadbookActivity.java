package com.bk.ui;

import org.json.JSONObject;
import org.json.JSONTokener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bk.cc.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

public class RoadbookActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_roadbook);

		GetMyRoadbookList();
	}

	private void GetMyRoadbookList() {

		AsyncHttpClient asynchttpclient = new AsyncHttpClient();
		asynchttpclient
				.get("http://10.0.2.2/ci/index.php/api/example/user/id/1/format/json",
						new JsonHttpResponseHandler() {
							@Override
							public void onStart() {

								super.onStart();
								// TODO 这是发出网络请求时的动作处理
							}

							@Override
							public void onSuccess(int arg0, JSONObject arg1) {

								super.onSuccess(arg0, arg1);

								try {
									JSONTokener jsonParser = new JSONTokener(
											arg1.toString());
									JSONObject person = (JSONObject) jsonParser
											.nextValue();
									System.out.println(person.getString("fact"));
								} catch (Exception e) {

								}

							}

						});
	}

	/***
	 * 这是路书道页的路书列表用的自定义适配器
	 * 
	 * @author Administrator
	 * 
	 */
	private class Roadbooklist extends BaseAdapter {

		@Override
		public int getCount() {

			return 0;
		}

		@Override
		public Object getItem(int position) {

			return null;
		}

		@Override
		public long getItemId(int position) {

			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			return null;
		}

	}
}
