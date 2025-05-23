/*    */ package ai.grazie.nlp.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*    */ final class UtilsKt$tokenizeByWhitespace$1
/*    */   extends Lambda
/*    */   implements Function1<String, Boolean>
/*    */ {
/*    */   public static final UtilsKt$tokenizeByWhitespace$1 INSTANCE = new UtilsKt$tokenizeByWhitespace$1();
/*    */   
/*    */   UtilsKt$tokenizeByWhitespace$1() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final Boolean invoke(String it) {
/* 44 */     Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(!StringsKt.isBlank(it));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\UtilsKt$tokenizeByWhitespace$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */