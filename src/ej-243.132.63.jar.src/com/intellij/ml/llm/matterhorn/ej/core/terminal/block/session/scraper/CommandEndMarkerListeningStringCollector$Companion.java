/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\020\f\n\002\020\013\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J*\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\022\020\t\032\016\022\004\022\0020\013\022\004\022\0020\f0\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/CommandEndMarkerListeningStringCollector$Companion;", "", "<init>", "()V", "indexOfSuffix", "", "text", "", "suffix", "ignoredCharacters", "Lkotlin/Function1;", "", "", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   public final int indexOfSuffix(@NotNull String text, @NotNull String suffix, @NotNull Function1 ignoredCharacters) {
/* 53 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(suffix, "suffix"); Intrinsics.checkNotNullParameter(ignoredCharacters, "ignoredCharacters"); if (!((((CharSequence)suffix).length() > 0) ? 1 : 0)) { String str = "Check failed."; throw new IllegalStateException(str.toString()); }
/* 54 */      if (text.length() < suffix.length()) return -1; 
/* 55 */     int textInd = text.length();
/* 56 */     for (int suffixInd = suffix.length() - 1; -1 < suffixInd; suffixInd--) {
/* 57 */       textInd--;
/* 58 */       while (textInd >= 0 && ((Boolean)ignoredCharacters.invoke(Character.valueOf(text.charAt(textInd)))).booleanValue()) {
/* 59 */         textInd--;
/*    */       }
/* 61 */       if (textInd < 0 || text.charAt(textInd) != suffix.charAt(suffixInd)) {
/* 62 */         return -1;
/*    */       }
/*    */     } 
/* 65 */     return textInd;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\CommandEndMarkerListeningStringCollector$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */