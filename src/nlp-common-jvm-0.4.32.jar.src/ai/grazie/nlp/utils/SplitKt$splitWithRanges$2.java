/*    */ package ai.grazie.nlp.utils;
/*    */ 
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "char", "", "invoke", "(C)Ljava/lang/Boolean;"})
/*    */ final class SplitKt$splitWithRanges$2
/*    */   extends Lambda
/*    */   implements Function1<Character, Boolean>
/*    */ {
/*    */   SplitKt$splitWithRanges$2(Set<Character> $delimiters) {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final Boolean invoke(char char) {
/* 41 */     return Boolean.valueOf(this.$delimiters.contains(Character.valueOf(char)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\SplitKt$splitWithRanges$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */