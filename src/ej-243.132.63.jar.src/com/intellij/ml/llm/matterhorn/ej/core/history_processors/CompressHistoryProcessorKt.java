/*    */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\b\003\n\002\020$\n\000\032\024\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001H\002\032\024\020\003\032\0020\001*\0020\0012\006\020\002\032\0020\001H\002\032\032\020\004\032\004\030\0010\001*\016\022\004\022\0020\001\022\004\022\0020\0010\005H\002¨\006\006"}, d2 = {"substringFrom", "", "marker", "substringTo", "toFormatedOutput", "", "ej-core"})
/*    */ public final class CompressHistoryProcessorKt
/*    */ {
/*    */   private static final String substringFrom(String $this$substringFrom, String marker) {
/* 25 */     int index = StringsKt.indexOf$default($this$substringFrom, marker, 0, false, 6, null);
/* 26 */     Intrinsics.checkNotNullExpressionValue($this$substringFrom.substring(index), "substring(...)"); return (index >= 0) ? $this$substringFrom.substring(index) : $this$substringFrom;
/*    */   }
/*    */   
/*    */   private static final String substringTo(String $this$substringTo, String marker) {
/* 30 */     int index = StringsKt.indexOf$default($this$substringTo, marker, 0, false, 6, null);
/* 31 */     Intrinsics.checkNotNullExpressionValue($this$substringTo.substring(0, index), "substring(...)"); return (index >= 0) ? $this$substringTo.substring(0, index) : $this$substringTo;
/*    */   }
/*    */   
/*    */   private static final String toFormatedOutput(Map $this$toFormatedOutput) {
/* 35 */     if ($this$toFormatedOutput.isEmpty()) return null; 
/* 36 */     return CollectionsKt.joinToString$default($this$toFormatedOutput.entrySet(), "\n", null, null, 0, null, CompressHistoryProcessorKt::toFormatedOutput$lambda$0, 30, null); } private static final CharSequence toFormatedOutput$lambda$0(Map.Entry paramEntry) { Intrinsics.checkNotNullParameter(paramEntry, "<destruct>"); String key = (String)paramEntry.getKey(), value = (String)paramEntry.getValue(); return "`" + key + "`: " + value; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\CompressHistoryProcessorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */