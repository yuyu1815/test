/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/cloud/RequestID;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<RequestID, String> {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   public final String invoke(RequestID it) {
/* 15 */     Intrinsics.checkNotNullParameter(it, "it"); return it.getId().getText();
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\RequestID$Companion$Serializer$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */