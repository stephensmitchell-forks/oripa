package oripa.viewsetting.main.uipanel;

import oripa.viewsetting.ChangeViewSetting;

public class ChangeOnOtherCommandButtonSelected implements ChangeViewSetting {

	@Override
	public void changeViewSetting() {
		UIPanelSettingDB setting = UIPanelSettingDB.getInstance();

		setting.setByValuePanelVisible(false);

		setting.setAlterLineTypePanelVisible(false);

		setting.setMountainButtonEnabled(false);
		setting.setValleyButtonEnabled(false);
		setting.setAuxButtonEnabled(false);

	}

}
