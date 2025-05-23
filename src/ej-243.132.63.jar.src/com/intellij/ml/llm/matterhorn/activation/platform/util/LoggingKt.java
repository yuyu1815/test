/*   */ package com.intellij.ml.llm.matterhorn.activation.platform.util;@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\002\020\000\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"toRedactedString", "", "", "platform"})
/*   */ public final class LoggingKt { @NotNull
/*   */   public static final String toRedactedString(@NotNull Object $this$toRedactedString) {
/* 4 */     Intrinsics.checkNotNullParameter($this$toRedactedString, "<this>"); String s = $this$toRedactedString.toString();
/* 5 */     int nrNonRedacted = 4;
/* 6 */     return StringsKt.take(s, nrNonRedacted) + StringsKt.take(s, nrNonRedacted);
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\LoggingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */