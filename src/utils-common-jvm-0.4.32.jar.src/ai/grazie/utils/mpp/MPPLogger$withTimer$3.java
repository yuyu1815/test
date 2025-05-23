/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Timer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "T", "invoke"})
/*    */ final class MPPLogger$withTimer$3
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   MPPLogger$withTimer$3(Function0<String> $message, Timer $start) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final String invoke() {
/* 36 */     return "Finish " + this.$message.invoke() + "; Total time " + this.$start.elapsed().getMillis() + "ms.";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\MPPLogger$withTimer$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */