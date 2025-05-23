/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Regex;
/*    */ import kotlin.text.StringsKt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\030\002\n\000\032\n\020\006\032\0020\007*\0020\b\"\033\020\000\032\0020\0018BX\002¢\006\f\n\004\b\004\020\005\032\004\b\002\020\003¨\006\t"}, d2 = {"NEEDS_ESCAPE", "Lkotlin/text/Regex;", "getNEEDS_ESCAPE", "()Lkotlin/text/Regex;", "NEEDS_ESCAPE$delegate", "Lkotlin/Lazy;", "safePathForBash", "", "Ljava/nio/file/Path;", "ej-core"})
/*    */ public final class ExecutionEnvironmentKt
/*    */ {
/*    */   @NotNull
/* 32 */   private static final Lazy NEEDS_ESCAPE$delegate = LazyKt.lazy(ExecutionEnvironmentKt::NEEDS_ESCAPE_delegate$lambda$0); private static final Regex getNEEDS_ESCAPE() { Lazy lazy = NEEDS_ESCAPE$delegate; return (Regex)lazy.getValue(); } private static final Regex NEEDS_ESCAPE_delegate$lambda$0() { return new Regex("[ &|;<>()$`*?\\[\\]{}'\"!~#]"); }
/*    */    @NotNull
/*    */   public static final String safePathForBash(@NotNull Path $this$safePathForBash) {
/* 35 */     Intrinsics.checkNotNullParameter($this$safePathForBash, "<this>");
/* 36 */     CharSequence charSequence = $this$safePathForBash.toString();
/* 37 */     byte b = 34; String str = $this$safePathForBash.toString(); return !getNEEDS_ESCAPE().containsMatchIn(charSequence) ? $this$safePathForBash.toString() : (!StringsKt.contains$default($this$safePathForBash.toString(), '"', false, 2, null) ? (b + str + "\"") : (
/* 38 */       !StringsKt.contains$default($this$safePathForBash.toString(), '\'', false, 2, null) ? ("'" + $this$safePathForBash.toString() + "'") : 
/* 39 */       $this$safePathForBash.toString()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionEnvironmentKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */