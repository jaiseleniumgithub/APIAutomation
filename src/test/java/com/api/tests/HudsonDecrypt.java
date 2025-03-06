package com.api.tests;

public class HudsonDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hudson.util.Secret.fromString("AQAAABAAAAAw5o5keo2+pOmeBBTYs5YxHX78x5Dg7md0Bd1HDOh1LneTHfmwddIe6tsozAtzF+cdo+Wb/ghCn62Tga90Qm0pTQ==")
		System.out.println(hudson.util.Secret.decrypt("AQAAABAAAAAw5o5keo2+pOmeBBTYs5YxHX78x5Dg7md0Bd1HDOh1LneTHfmwddIe6tsozAtzF+cdo+Wb/ghCn62Tga90Qm0pTQ=="));
		}
		
	

}
