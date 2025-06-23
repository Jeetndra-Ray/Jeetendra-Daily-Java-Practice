package com.jitu.dailytarget.june23.stirngleetcode;
//https://leetcode.com/problems/defanging-an-ip-address/description/
public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }
}
