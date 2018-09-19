package md5f15a4a710efbbf681793b69e000b94be;


public abstract class BaseHeadRecyclerAdapter_4
	extends md5f15a4a710efbbf681793b69e000b94be.BaseRecyclerAdapter_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;:GetOnCreateViewHolder_Landroid_view_ViewGroup_IHandler\n" +
			"n_onBindViewHolder:(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroid_support_v7_widget_RecyclerView_ViewHolder_IHandler\n" +
			"n_getItemCount:()I:GetGetItemCountHandler\n" +
			"n_getItemViewType:(I)I:GetGetItemViewType_IHandler\n" +
			"";
		mono.android.Runtime.register ("XWeather.Droid.BaseHeadRecyclerAdapter`4, XWeather.Droid", BaseHeadRecyclerAdapter_4.class, __md_methods);
	}


	public BaseHeadRecyclerAdapter_4 ()
	{
		super ();
		if (getClass () == BaseHeadRecyclerAdapter_4.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.BaseHeadRecyclerAdapter`4, XWeather.Droid", "", this, new java.lang.Object[] {  });
	}

	public BaseHeadRecyclerAdapter_4 (int p0)
	{
		super ();
		if (getClass () == BaseHeadRecyclerAdapter_4.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.BaseHeadRecyclerAdapter`4, XWeather.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder (android.view.ViewGroup p0, int p1)
	{
		return n_onCreateViewHolder (p0, p1);
	}

	private native android.support.v7.widget.RecyclerView.ViewHolder n_onCreateViewHolder (android.view.ViewGroup p0, int p1);


	public void onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1);


	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();


	public int getItemViewType (int p0)
	{
		return n_getItemViewType (p0);
	}

	private native int n_getItemViewType (int p0);

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
