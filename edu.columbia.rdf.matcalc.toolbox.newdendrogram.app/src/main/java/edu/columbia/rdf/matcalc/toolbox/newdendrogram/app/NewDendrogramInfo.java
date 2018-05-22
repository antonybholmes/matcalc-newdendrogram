package edu.columbia.rdf.matcalc.toolbox.newdendrogram.app;

import org.jebtk.core.AppVersion;
import org.jebtk.modern.AssetService;
import org.jebtk.modern.help.GuiAppInfo;

public class NewDendrogramInfo extends GuiAppInfo {

  public NewDendrogramInfo() {
    super("NewDendrogram", new AppVersion(2),
        "Copyright (C) 2016-2016 Antony Holmes",
        AssetService.getInstance().loadIcon(NewDendrogramIcon.class, 32),
        AssetService.getInstance().loadIcon(NewDendrogramIcon.class, 128));
  }

  // UIService.getInstance().loadIcon("newdendrogram", 32)

}
