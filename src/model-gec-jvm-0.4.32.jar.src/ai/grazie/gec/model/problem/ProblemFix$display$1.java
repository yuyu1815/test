/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.utils.BlankSymbols;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "invoke"})
/*    */ final class ProblemFix$display$1
/*    */   extends Lambda
/*    */   implements Function1<ProblemFix.Part, CharSequence>
/*    */ {
/*    */   public final CharSequence invoke(ProblemFix.Part it) {
/* 35 */     Intrinsics.checkNotNullParameter(it, "it"); return (this.$withBlankSymbolsVisualized && StringsKt.isBlank(it.getDisplay())) ? BlankSymbols.INSTANCE.visualize(it.getDisplay()) : it.getDisplay();
/*    */   }
/*    */   
/*    */   ProblemFix$display$1(boolean $withBlankSymbolsVisualized) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemFix$display$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */