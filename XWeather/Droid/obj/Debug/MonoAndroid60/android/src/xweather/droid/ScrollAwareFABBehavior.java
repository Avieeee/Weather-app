package xweather.droid;


public class ScrollAwareFABBehavior
	extends android.support.design.widget.CoordinatorLayout.Behavior
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStartNestedScroll:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z:GetOnStartNestedScroll_Landroid_support_design_widget_CoordinatorLayout_Landroid_view_View_Landroid_view_View_Landroid_view_View_IHandler\n" +
			"n_onNestedScroll:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIII)V:GetOnNestedScroll_Landroid_support_design_widget_CoordinatorLayout_Landroid_view_View_Landroid_view_View_IIIIHandler\n" +
			"";
		mono.android.Runtime.register ("XWeather.Droid.ScrollAwareFABBehavior, XWeather.Droid", ScrollAwareFABBehavior.class, __md_methods);
	}


	public ScrollAwareFABBehavior ()
	{
		super ();
		if (getClass () == ScrollAwareFABBehavior.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.ScrollAwareFABBehavior, XWeather.Droid", "", this, new java.lang.Object[] {  });
	}


	public ScrollAwareFABBehavior (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ScrollAwareFABBehavior.class)
			mono.android.TypeManager.Activate ("XWeather.Droid.ScrollAwareFABBehavior, XWeather.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onStartNestedScroll (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, android.view.View p3, int p4)
	{
		return n_onStartNestedScroll (p0, p1, p2, p3, p4);
	}

	private native boolean n_onStartNestedScroll (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, android.view.View p3, int p4);


	public void onNestedScroll (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, int p3, int p4, int p5, int p6)
	{
		n_onNestedScroll (p0, p1, p2, p3, p4, p5, p6);
	}

	private native void n_onNestedScroll (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, int p3, int p4, int p5, int p6);

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
