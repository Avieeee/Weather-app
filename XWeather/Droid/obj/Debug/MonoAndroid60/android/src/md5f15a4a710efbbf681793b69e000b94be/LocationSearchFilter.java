package md5f15a4a710efbbf681793b69e000b94be;


public class LocationSearchFilter
	extends android.widget.Filter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_performFiltering:(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;:GetPerformFiltering_Ljava_lang_CharSequence_Handler\n" +
			"n_publishResults:(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V:GetPublishResults_Ljava_lang_CharSequence_Landroid_widget_Filter_FilterResults_Handler\n" +
			"";
		mono.android.Runtime.register ("XWeather.Droid.LocationSearchFilter, XWeather.Droid", LocationSearchFilter.class, __md_methods);
	}


	public LocationSearchFilter ()
	{
		super ();
		if (getClass () == LocationSearchFilter.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.LocationSearchFilter, XWeather.Droid", "", this, new java.lang.Object[] {  });
	}

	public LocationSearchFilter (android.app.Activity p0, md5f15a4a710efbbf681793b69e000b94be.LocationSearchRecyclerAdapter p1)
	{
		super ();
		if (getClass () == LocationSearchFilter.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.LocationSearchFilter, XWeather.Droid", "Android.App.Activity, Mono.Android:XWeather.Droid.LocationSearchRecyclerAdapter, XWeather.Droid", this, new java.lang.Object[] { p0, p1 });
	}


	public android.widget.Filter.FilterResults performFiltering (java.lang.CharSequence p0)
	{
		return n_performFiltering (p0);
	}

	private native android.widget.Filter.FilterResults n_performFiltering (java.lang.CharSequence p0);


	public void publishResults (java.lang.CharSequence p0, android.widget.Filter.FilterResults p1)
	{
		n_publishResults (p0, p1);
	}

	private native void n_publishResults (java.lang.CharSequence p0, android.widget.Filter.FilterResults p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
