/*   */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\032\f\020\000\032\0020\001*\004\030\0010\001\032\n\020\002\032\0020\001*\0020\001¨\006\003"}, d2 = {"getCommand", "", "normalizeVersion", "ej-core"})
/*   */ public final class StatsUtilsKt { @NotNull
/*   */   public static final String getCommand(@Nullable String $this$getCommand) {
/* 4 */     Intrinsics.checkNotNull($this$getCommand); return CollectionsKt.contains(AbstractEJEventLogger.Companion.getSTEP_TYPES(), $this$getCommand) ? $this$getCommand : 
/* 5 */       "unknown";
/*   */   } @NotNull
/*   */   public static final String normalizeVersion(@NotNull String $this$normalizeVersion) {
/* 8 */     Intrinsics.checkNotNullParameter($this$normalizeVersion, "<this>"); return StringsKt.replace($this$normalizeVersion, "-SNAPSHOT", "", true);
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\StatsUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */