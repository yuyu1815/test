/*   */ package org.jetbrains.jewel.bridge.icon;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\bÁ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026¨\006\006"}, d2 = {"Lorg/jetbrains/jewel/bridge/icon/BridgeNewUiChecker;", "Lorg/jetbrains/jewel/ui/icon/NewUiChecker;", "<init>", "()V", "isNewUi", "", "ide-laf-bridge"})
/*   */ @StabilityInferred(parameters = 1)
/*   */ public final class BridgeNewUiChecker implements NewUiChecker {
/*   */   public boolean isNewUi() {
/* 7 */     return BridgeUtilsKt.isNewUiTheme();
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static final BridgeNewUiChecker INSTANCE = new BridgeNewUiChecker();
/*   */   public static final int $stable;
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\icon\BridgeNewUiChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */