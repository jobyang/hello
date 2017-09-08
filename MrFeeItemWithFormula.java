package com.cnfantasia.server.api.meterReading.entity;

import java.util.ArrayList;
import java.util.List;

import com.cnfantasia.server.domainbase.mrFeeItem.entity.MrFeeItem;
import com.cnfantasia.server.domainbase.mrFeeItemFormula.entity.MrFeeItemFormula;

public class MrFeeItemWithFormula extends MrFeeItem {
	List<MrFeeItemFormula> mfifList = new ArrayList<MrFeeItemFormula>();

	public List<MrFeeItemFormula> getMfifList() {
		return mfifList;
	}

	public void setMfifList(List<MrFeeItemFormula> mfifList) {
		this.mfifList = mfifList;
	}
}
