package it.eng.spagobi.meta.cwm.jmi.spagobi.meta.softwaredeployment;

import it.eng.spagobi.meta.cwm.jmi.spagobi.meta.core.VisibilityKind;
import javax.jmi.reflect.RefClass;

public abstract interface CwmSoftwareSystemClass
  extends RefClass
{
  public abstract CwmSoftwareSystem createCwmSoftwareSystem();
  
  public abstract CwmSoftwareSystem createCwmSoftwareSystem(String paramString1, VisibilityKind paramVisibilityKind, boolean paramBoolean, String paramString2, String paramString3, String paramString4, String paramString5);
}
