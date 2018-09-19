package md5db106f382ab9757ec04e577b331746e2;


public class DeepLinkActivity
	extends com.microsoft.azure.mobile.distribute.DeepLinkActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Microsoft.Azure.Mobile.Distribute.DeepLinkActivity, Microsoft.Azure.Mobile.Distribute.Android.Bindings", DeepLinkActivity.class, __md_methods);
	}


	public DeepLinkActivity ()
	{
		super ();
		if (getClass () == DeepLinkActivity.class)
			mono.android.TypeManager.Activate ("Microsoft.Azure.Mobile.Distribute.DeepLinkActivity, Microsoft.Azure.Mobile.Distribute.Android.Bindings", "", this, new java.lang.Object[] {  });
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
