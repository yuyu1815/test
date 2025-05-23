/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\n\020\000\032\004\030\0010\001H\000¨\006\002"}, d2 = {"currentUiThemeOrNull", "Lcom/intellij/ide/ui/laf/UIThemeLookAndFeelInfo;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nUiThemeExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiThemeExtensions.kt\norg/jetbrains/jewel/bridge/UiThemeExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,9:1\n1#2:10\n*E\n"})
/*    */ public final class UiThemeExtensionsKt {
/*    */   @Nullable
/*    */   public static final UIThemeLookAndFeelInfo currentUiThemeOrNull() {
/*  8 */     UIThemeLookAndFeelInfo uIThemeLookAndFeelInfo1 = LafManager.getInstance().getCurrentUIThemeLookAndFeel(), it = uIThemeLookAndFeelInfo1;
/*    */     
/* 10 */     int $i$a$-takeIf-UiThemeExtensionsKt$currentUiThemeOrNull$1 = 0;
/*    */     LafManager.getInstance().getCurrentUIThemeLookAndFeel();
/*    */     return (LafManager.getInstance().getCurrentUIThemeLookAndFeel() != null) ? (it.isInitialized() ? uIThemeLookAndFeelInfo1 : null) : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\UiThemeExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */