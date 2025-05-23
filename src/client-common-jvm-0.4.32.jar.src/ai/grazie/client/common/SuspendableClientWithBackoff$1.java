/*    */ package ai.grazie.client.common;
/*    */ 
/*    */ import ai.grazie.model.cloud.exceptions.HTTPStatusException;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\003\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Throwable, Boolean>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final Boolean invoke(Throwable it) {
/* 26 */     Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf((it instanceof HTTPStatusException && (((HTTPStatusException)it).isServerError() || it instanceof HTTPStatusException.TooManyRequests)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableClientWithBackoff$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */