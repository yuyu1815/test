/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.codeInsight.completion.PrefixMatcher;
/*    */ import com.intellij.psi.codeStyle.NameUtil;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\021\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\t\032\0020\n2\006\020\013\032\0020\003H\026J<\020\f\032\0020\r\"\004\b\000\020\016*\n\022\006\b\001\022\002H\0160\0072\006\020\017\032\0020\r2\022\020\020\032\016\022\004\022\002H\016\022\004\022\0020\n0\021H\b¢\006\002\020\022J\020\020\023\032\0020\0012\006\020\002\032\0020\003H\026R\026\020\006\032\b\022\004\022\0020\0030\007X\004¢\006\004\n\002\020\b¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPrefixMatcher;", "Lcom/intellij/codeInsight/completion/PrefixMatcher;", "prefix", "", "<init>", "(Ljava/lang/String;)V", "patternWords", "", "[Ljava/lang/String;", "prefixMatches", "", "name", "indexOfFirstFrom", "", "T", "fromIndex", "predicate", "Lkotlin/Function1;", "([Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)I", "cloneWithPrefix", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nCommandHistoryUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandHistoryUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPrefixMatcher\n*L\n1#1,64:1\n50#1,8:65\n*S KotlinDebug\n*F\n+ 1 CommandHistoryUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPrefixMatcher\n*L\n38#1:65,8\n*E\n"})
/*    */ final class CommandHistoryPrefixMatcher
/*    */   extends PrefixMatcher
/*    */ {
/*    */   @NotNull
/*    */   private final String[] patternWords;
/*    */   
/*    */   public CommandHistoryPrefixMatcher(@NotNull String prefix) {
/* 27 */     super(prefix);
/* 28 */     Intrinsics.checkNotNullExpressionValue(NameUtil.nameToWords(prefix), "nameToWords(...)"); this.patternWords = NameUtil.nameToWords(prefix);
/*    */   }
/*    */   public boolean prefixMatches(@NotNull String name) {
/* 31 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullExpressionValue(NameUtil.nameToWords(name), "nameToWords(...)"); String[] nameWords = NameUtil.nameToWords(name);
/* 32 */     int patternIndex = 0;
/* 33 */     int wordIndex = 0;
/*    */     
/*    */     while (true) {
/* 36 */       if ((0 <= patternIndex) ? ((patternIndex < this.patternWords.length)) : false) if ((0 <= wordIndex) ? ((wordIndex < nameWords.length)) : false) {
/* 37 */           String pattern = this.patternWords[patternIndex];
/* 38 */           CommandHistoryPrefixMatcher commandHistoryPrefixMatcher = this; String[] arrayOfString = nameWords; int $i$f$indexOfFirstFrom = 0;
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
/* 65 */           int index$iv = wordIndex; while (true) {
/* 66 */             if ((0 <= index$iv) ? ((index$iv < arrayOfString.length)) : false) {
/* 67 */               String it = arrayOfString[index$iv]; int $i$a$-indexOfFirstFrom-CommandHistoryPrefixMatcher$prefixMatches$1 = 0;
/*    */               
/*    */               Intrinsics.checkNotNull(it);
/*    */             } 
/*    */             
/* 72 */             wordIndex = -1;
/*    */             if (wordIndex == -1)
/*    */               return false; 
/*    */             break;
/*    */           } 
/*    */           wordIndex++;
/*    */           patternIndex++;
/*    */           continue;
/*    */         }  
/*    */       break;
/*    */     } 
/*    */     return (patternIndex == this.patternWords.length);
/*    */   }
/*    */   
/*    */   private final <T> int indexOfFirstFrom(Object[] $this$indexOfFirstFrom, int fromIndex, Function1 predicate) {
/*    */     int $i$f$indexOfFirstFrom = 0, index = fromIndex;
/*    */     while (true) {
/*    */       if ((0 <= index) ? ((index < $this$indexOfFirstFrom.length)) : false) {
/*    */         if (((Boolean)predicate.invoke($this$indexOfFirstFrom[index])).booleanValue())
/*    */           return index; 
/*    */         index++;
/*    */         continue;
/*    */       } 
/*    */       break;
/*    */     } 
/*    */     return -1;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PrefixMatcher cloneWithPrefix(@NotNull String prefix) {
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     return new CommandHistoryPrefixMatcher(prefix);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandHistoryPrefixMatcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */