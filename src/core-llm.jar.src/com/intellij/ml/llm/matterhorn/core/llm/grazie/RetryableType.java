/*   */ package com.intellij.ml.llm.matterhorn.core.llm.grazie;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\007\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/RetryableType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_RETRY", "RETRY_AUTH", "EXPONENTIAL_DELAY_RETRY", "DEFAULT_RETRY", "core-llm"})
/*   */ public enum RetryableType {
/* 4 */   NO_RETRY,
/* 5 */   RETRY_AUTH,
/* 6 */   EXPONENTIAL_DELAY_RETRY,
/* 7 */   DEFAULT_RETRY; @NotNull
/* 8 */   public static EnumEntries<RetryableType> getEntries() { return $ENTRIES; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\RetryableType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */