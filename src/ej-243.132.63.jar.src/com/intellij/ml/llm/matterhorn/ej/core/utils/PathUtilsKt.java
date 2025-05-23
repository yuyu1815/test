/*   */ package com.intellij.ml.llm.matterhorn.ej.core.utils;
/*   */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\032\016\020\000\032\0020\0012\006\020\002\032\0020\001¨\006\003"}, d2 = {"systemPathOfVirtualFilePath", "", "virtualFilePath", "ej-core"})
/*   */ public final class PathUtilsKt {
/*   */   @NotNull
/*   */   public static final String systemPathOfVirtualFilePath(@NotNull String virtualFilePath) {
/* 6 */     Intrinsics.checkNotNullParameter(virtualFilePath, "virtualFilePath"); return StringsKt.replace$default(virtualFilePath, '/', File.separatorChar, false, 4, null);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\PathUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */