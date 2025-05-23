/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\005J\f\020\b\032\b\022\004\022\0020\0050\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats$Companion;", "", "<init>", "()V", "maxOf", "Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;", "x", "y", "serializer", "Lkotlinx/serialization/KSerializer;", "matterhorn"})
/*    */ @SourceDebugExtension({"SMAP\nKinetoLlmResponseStats.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KinetoLlmResponseStats.kt\ncom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats$Companion\n+ 2 KinetoLlmResponseStats.kt\ncom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats\n*L\n1#1,19:1\n18#2:20\n*S KotlinDebug\n*F\n+ 1 KinetoLlmResponseStats.kt\ncom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats$Companion\n*L\n9#1:20\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*  8 */   public final KSerializer<KinetoLlmResponseStats> serializer() { return (KSerializer<KinetoLlmResponseStats>)KinetoLlmResponseStats.$serializer.INSTANCE; } private Companion() {} @NotNull
/*  9 */   public final KinetoLlmResponseStats maxOf(@NotNull KinetoLlmResponseStats x, @NotNull KinetoLlmResponseStats y) { Intrinsics.checkNotNullParameter(x, "x"); Intrinsics.checkNotNullParameter(y, "y"); KinetoLlmResponseStats this_$iv = x; int $i$f$combineTokens = 0;
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
/* 20 */     long l2 = y.getInputTokens(), l4 = this_$iv.getInputTokens(), l6 = this_$iv.getTime(); String str1 = this_$iv.getLlmName(); long l5 = this_$iv.getTimestamp(); int $i$a$-combineTokens-KinetoLlmResponseStats$Companion$maxOf$1 = 0; long l7 = Math.max(l4, l2); long l1 = y.getOutputTokens(), l3 = this_$iv.getOutputTokens(); l7 = l7; l6 = l6; str1 = str1; l5 = l5; $i$a$-combineTokens-KinetoLlmResponseStats$Companion$maxOf$1 = 0; long l8 = Math.max(l3, l1); l1 = y.getCacheCreateInputTokens(); l3 = this_$iv.getCacheCreateInputTokens(); l8 = l8; l7 = l7; l6 = l6; str1 = str1; l5 = l5; $i$a$-combineTokens-KinetoLlmResponseStats$Companion$maxOf$1 = 0; long l9 = Math.max(l3, l1); l1 = y.getCacheInputTokens(); l3 = this_$iv.getCacheInputTokens(); l9 = l9; l8 = l8; l7 = l7; l6 = l6; str1 = str1; l5 = l5; $i$a$-combineTokens-KinetoLlmResponseStats$Companion$maxOf$1 = 0; long l10 = Math.max(l3, l1); DefaultConstructorMarker defaultConstructorMarker = null; char c = 'Ā'; String str2 = null; boolean bool = this_$iv.getCached(); long l11 = l10, l12 = l9, l13 = l8, l14 = l7, l15 = l6; String str3 = str1; long l16 = l5; return new KinetoLlmResponseStats(l16, str3, l15, l14, l13, l12, l11, bool, str2, c, defaultConstructorMarker); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\KinetoLlmResponseStats$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */