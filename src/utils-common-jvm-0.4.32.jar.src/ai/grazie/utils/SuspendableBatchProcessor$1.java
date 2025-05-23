/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\003\n\002\020 \n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\f\020\004\032\b\022\004\022\002H\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "T", "Result", "parameters", "", "invoke", "(Ljava/util/List;)Ljava/lang/Integer;"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<List<? extends T>, Integer>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final Integer invoke(List parameters) {
/* 30 */     Intrinsics.checkNotNullParameter(parameters, "parameters"); return Integer.valueOf(parameters.size());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */