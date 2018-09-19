using System;

using Android.App;
using Android.Runtime;

using XWeather.Constants;

namespace XWeather.Droid
{
	
	[Application (Icon = "@mipmap/icon", Label = "XWeather", Theme = "@style/WeatherTheme", AllowBackup = true
#if DEBUG
				  , Debuggable = true
#endif
				 )]
	[MetaData ("com.google.android.geo.API_KEY", Value = PrivateKeys.GoogleMapsApiKey)]
	public class XWeatherApp : Application
	{
		
		/// <param name="handle"></param>
		/// <param name="transfer"></param>
		public XWeatherApp (IntPtr handle, JniHandleOwnership transfer)
			: base (handle, transfer)
		{
		}


		public override void OnCreate ()
		{
			base.OnCreate ();

			//Bootstrap.Run (Context, this);
		}
	}
}