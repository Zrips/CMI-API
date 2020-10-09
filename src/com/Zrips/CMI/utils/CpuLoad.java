package com.Zrips.CMI.utils;

import java.lang.management.ManagementFactory;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public class CpuLoad {
    public static double getProcessCpuLoad() throws Exception {
	MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
	ObjectName name = ObjectName.getInstance("java.lang:type=OperatingSystem");
	AttributeList list = mbs.getAttributes(name, new String[] { "ProcessCpuLoad" });
	if (list.isEmpty())
	    return 0.0;
	Attribute att = (Attribute) list.get(0);
	Double value = (Double) att.getValue();
	if (value == -1.0)
	    return 0.0;
	return ((int) (value * 10000) / 100.0);
    }
}
