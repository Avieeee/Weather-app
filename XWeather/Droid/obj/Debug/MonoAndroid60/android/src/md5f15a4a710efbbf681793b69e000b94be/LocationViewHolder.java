package md5f15a4a710efbbf681793b69e000b94be;


public class LocationViewHolder
	extends md5f15a4a710efbbf681793b69e000b94be.SelectableViewHolder_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("XWeather.Droid.LocationViewHolder, XWeather.Droid", LocationViewHolder.class, __md_methods);
	}


	public LocationViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == LocationViewHolder.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.LocationViewHolder, XWeather.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
