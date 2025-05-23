/*    */ package ai.grazie.nlp.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.sequences.Sequence;
/*    */ import kotlin.sequences.SequencesKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\020\016\n\000\032\020\020\000\032\b\022\004\022\0020\0020\001*\0020\002¨\006\003"}, d2 = {"tokenizeByWhitespace", "Lkotlin/sequences/Sequence;", "", "nlp-common"})
/*    */ public final class UtilsKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Sequence<String> tokenizeByWhitespace(@NotNull String $this$tokenizeByWhitespace) {
/* 44 */     Intrinsics.checkNotNullParameter($this$tokenizeByWhitespace, "<this>"); String[] arrayOfString = new String[1]; arrayOfString[0] = " "; return SequencesKt.filter(StringsKt.splitToSequence$default($this$tokenizeByWhitespace, arrayOfString, false, 0, 6, null), UtilsKt$tokenizeByWhitespace$1.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}) static final class UtilsKt$tokenizeByWhitespace$1 extends Lambda implements Function1<String, Boolean> { public final Boolean invoke(String it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(!StringsKt.isBlank(it)); }
/*    */ 
/*    */     
/*    */     public static final UtilsKt$tokenizeByWhitespace$1 INSTANCE = new UtilsKt$tokenizeByWhitespace$1();
/*    */     
/*    */     UtilsKt$tokenizeByWhitespace$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */