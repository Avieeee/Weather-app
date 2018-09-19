package md5f15a4a710efbbf681793b69e000b94be;


public abstract class BaseRecyclerAdapter_2
	extends android.support.v7.widget.RecyclerView.Adapter
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
			"";
		mono.android.Runtime.register ("XWeather.Droid.BaseRecyclerAdapter`2, XWeather.Droid", BaseRecyclerAdapter_2.class, __md_methods);
	}


	public BaseRecyclerAdapter_2 ()
	{
		super ();
		if (getClass () == BaseRecyclerAdapter_2.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.BaseRecyclerAdapter`2, XWeather.Droid", "", this, new java.lang.Object[] {  });
	}

	public BaseRecyclerAdapter_2 (int p0)
	{
		super ();
		if (getClass () == BaseRecyclerAdapter_2.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.BaseRecyclerAdapter`2, XWeather.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
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
