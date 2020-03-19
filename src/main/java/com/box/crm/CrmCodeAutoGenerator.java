package com.box.crm;

import com.box.config.mybatis.CodeAutoGenerator;

public class CrmCodeAutoGenerator {
	public static void main(String[] args) {
		CodeAutoGenerator generator = new CodeAutoGenerator(
    			"sunyizhuo-13439962664","/crm",new String[] {"crm_customer"});
		generator.run();
	}
}
