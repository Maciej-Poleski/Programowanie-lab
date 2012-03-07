package laboratorium04.zadanie3.mypackage;

import laboratorium04.zadanie3.mylittlepackage.IAmProtected;

public class IHaveAccess extends IAmProtected {
	public void invokePrivate()
	{
		protectMe(13);
	}
}
