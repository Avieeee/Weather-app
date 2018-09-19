package md5f15a4a710efbbf681793b69e000b94be;


public abstract class BaseSelectableRecyclerAdapter_2
	extends md5f15a4a710efbbf681793b69e000b94be.BaseRecyclerAdapter_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBindViewHolder:(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroid_support_v7_widget_RecyclerView_ViewHolder_IHandler\n" +
			"";
		mono.android.Runtime.register ("XWeather.Droid.BaseSelectableRecyclerAdapter`2, XWeather.Droid", BaseSelectableRecyclerAdapter_2.class, __md_methods);
	}


	public BaseSelectableRecyclerAdapter_2 ()
	{
		super ();
		if (getClass () == BaseSelectableRecyclerAdapter_2.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.BaseSelectableRecyclerAdapter`2, XWeather.Droid", "", this, new java.lang.Object[] {  });
	}

	public BaseSelectableRecyclerAdapter_2 (int p0)
	{
		super ();
		if (getClass () == BaseSelectableRecyclerAdapter_2.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.BaseSelectableRecyclerAdapter`2, XWeather.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1);

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
