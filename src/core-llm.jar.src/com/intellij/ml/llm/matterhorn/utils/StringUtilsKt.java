/*   */ package com.intellij.ml.llm.matterhorn.utils;@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\032\n\020\000\032\0020\001*\0020\001¨\006\002"}, d2 = {"normalizeLineEndings", "", "core"})
/*   */ public final class StringUtilsKt { @NotNull
/*   */   public static final String normalizeLineEndings(@NotNull String $this$normalizeLineEndings) {
/* 4 */     Intrinsics.checkNotNullParameter($this$normalizeLineEndings, "<this>"); return StringsKt.replace$default($this$normalizeLineEndings, "\r\n", "\n", false, 4, null);
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhor\\utils\StringUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */