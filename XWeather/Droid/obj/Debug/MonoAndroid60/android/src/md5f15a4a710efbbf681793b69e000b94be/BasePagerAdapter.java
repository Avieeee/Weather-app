package md5f15a4a710efbbf681793b69e000b94be;


public abstract class BasePagerAdapter
	extends android.support.v4.app.FragmentPagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_ViewGroup_IHandler\n" +
			"";
		mono.android.Runtime.register ("XWeather.Droid.BasePagerAdapter, XWeather.Droid", BasePagerAdapter.class, __md_methods);
	}


	public BasePagerAdapter (android.support.v4.app.FragmentManager p0)
	{
		super (p0);
		if (getClass () == BasePagerAdapter.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.BasePagerAdapter, XWeather.Droid", "Android.Support.V4.App.FragmentManager, Xamarin.Android.Support.Fragment", this, new java.lang.Object[] { p0 });
	}


	public java.lang.Object instantiateItem (android.view.ViewGroup p0, int p1)
	{
		return n_instantiateItem (p0, p1);
	}

	private native java.lang.Object n_instantiateItem (android.view.ViewGroup p0, int p1);

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
