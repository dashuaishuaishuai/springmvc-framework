/**   
 * @Title: PublicKeyMap.java 
 * @Package: com.sitech.prm.iease.framework.util 
 * @CopyRright (c)2008-2020: si-tech 
 * @Project: 易企算 iease-base Maven Webapp
 * @Description: NEIL(用一句话描述该文件做什么) 
 * @author 华安 mashuai_bj@si-tech.com.cn
 * @date 2016-11-30 下午1:46:35 
 * @version V2.0   
 */
package com.yida.framework.utils;

/**
 * @Title: PublicKeyMap
 * @Description: NEIL(用一句话描述这个类的作用)
 * @author 华安 mashuai_bj@si-tech.com.cn
 */
public class PublicKeyMap {

	private String modulus;
	private String exponent;

	public String getModulus() {
		return modulus;
	}

	public void setModulus(String modulus) {
		this.modulus = modulus;
	}

	public String getExponent() {
		return exponent;
	}

	public void setExponent(String exponent) {
		this.exponent = exponent;
	}

	@Override
	public String toString() {
		return "PublicKeyMap [modulus=" + modulus + ", exponent=" + exponent
				+ "]";
	}
}
