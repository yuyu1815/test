/*   */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032\017\020\000\032\0020\001*\0020\002¢\006\002\020\003¨\006\004"}, d2 = {"toHttpHeaders", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "Lai/grazie/model/cloud/HeaderCollection;", "(Lai/grazie/model/cloud/HeaderCollection;)Ljava/util/Map;", "data.impl.grazie"})
/*   */ public final class GrazieHeaderCollectionUtilKt {
/*   */   @NotNull
/*   */   public static final Map<String, ? extends String> toHttpHeaders(@NotNull HeaderCollection $this$toHttpHeaders) {
/* 7 */     Intrinsics.checkNotNullParameter($this$toHttpHeaders, "<this>"); return SimpleHttpHeaders.Companion.fromMap-vDDv_S8(HeaderCollectionKt.toMap($this$toHttpHeaders));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\GrazieHeaderCollectionUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */