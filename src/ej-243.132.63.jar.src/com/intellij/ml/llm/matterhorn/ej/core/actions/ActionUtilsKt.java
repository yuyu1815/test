/*   */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*   */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\016\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\032\016\020\000\032\004\030\0010\001*\004\030\0010\002\032\016\020\003\032\004\030\0010\001*\004\030\0010\002\032\023\020\004\032\004\030\0010\005*\004\030\0010\002¢\006\002\020\006¨\006\007"}, d2 = {"tryGetNonEmptyStringValue", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "tryGetStringValue", "tryGetIntValue", "", "(Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/Integer;", "ej-core"})
/*   */ public final class ActionUtilsKt {
/*   */   @Nullable
/* 5 */   public static final String tryGetNonEmptyStringValue(@Nullable ParameterValue $this$tryGetNonEmptyStringValue) { $this$tryGetNonEmptyStringValue.getValue(); return ($this$tryGetNonEmptyStringValue != null && $this$tryGetNonEmptyStringValue.getValue() != null) ? StringUtilKt.nullIfEmpty($this$tryGetNonEmptyStringValue.getValue()) : null; }
/*   */   @Nullable
/* 7 */   public static final String tryGetStringValue(@Nullable ParameterValue $this$tryGetStringValue) { return ($this$tryGetStringValue != null) ? $this$tryGetStringValue.getValue() : null; } @Nullable
/*   */   public static final Integer tryGetIntValue(@Nullable ParameterValue $this$tryGetIntValue) {
/* 9 */     $this$tryGetIntValue.getValue(); return ($this$tryGetIntValue != null && $this$tryGetIntValue.getValue() != null) ? StringsKt.toIntOrNull($this$tryGetIntValue.getValue()) : null;
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ActionUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */