package com.premiumminds;

import java.io.Serializable;
import java.util.Date;

public class Pojo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int field1;
	private int field2;

	private String field3;
	private String field4;

	private Integer field5;
	private Long field6;
	private Date field7;

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public int getField2() {
		return field2;
	}

	public void setField2(int field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public Integer getField5() {
		return field5;
	}

	public void setField5(Integer field5) {
		this.field5 = field5;
	}

	public Long getField6() {
		return field6;
	}

	public void setField6(Long field6) {
		this.field6 = field6;
	}

	public Date getField7() {
		return field7;
	}

	public void setField7(Date field7) {
		this.field7 = field7;
	}

	@Override
	public String toString() {
		return "Pojo [field1=" + field1 + ", field2=" + field2 + ", field3="
				+ field3 + ", field4=" + field4 + ", field5=" + field5
				+ ", field6=" + field6 + ", field7=" + field7 + "]";
	}

}
