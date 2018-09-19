package md5f15a4a710efbbf681793b69e000b94be;


public class LocationsSearchRecyclerFragment
	extends android.app.ListFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onListItemClick:(Landroid/widget/ListView;Landroid/view/View;IJ)V:GetOnListItemClick_Landroid_widget_ListView_Landroid_view_View_IJHandler\n" +
			"";
		mono.android.Runtime.register ("XWeather.Droid.LocationsSearchRecyclerFragment, XWeather.Droid", LocationsSearchRecyclerFragment.class, __md_methods);
	}


	public LocationsSearchRecyclerFragment ()
	{
		super ();
		if (getClass () == LocationsSearchRecyclerFragment.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.LocationsSearchRecyclerFragment, XWeather.Droid", "", this, new java.lang.Object[] {  });
	}

	public LocationsSearchRecyclerFragment (android.app.Activity p0)
	{
		super ();
		if (getClass () == LocationsSearchRecyclerFragment.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.LocationsSearchRecyclerFragment, XWeather.Droid", "Android.App.Activity, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onListItemClick (android.widget.ListView p0, android.view.View p1, int p2, long p3)
	{
		n_onListItemClick (p0, p1, p2, p3);
	}

	private native void n_onListItemClick (android.widget.ListView p0, android.view.View p1, int p2, long p3);

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
