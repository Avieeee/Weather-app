package md5f15a4a710efbbf681793b69e000b94be;


public class DetailsViewHolder
	extends md5f15a4a710efbbf681793b69e000b94be.ViewHolder_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("XWeather.Droid.DetailsViewHolder, XWeather.Droid", DetailsViewHolder.class, __md_methods);
	}


	public DetailsViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == DetailsViewHolder.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.DetailsViewHolder, XWeather.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
